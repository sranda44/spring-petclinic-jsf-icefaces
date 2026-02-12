package com.example.petclinic.dao.hibernate;

import com.example.petclinic.dao.OwnerDao;
import com.example.petclinic.domain.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateOwnerDao implements OwnerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Owner findById(Long id) {
        Session session = sessionFactory.openSession();
        Owner owner = (Owner) session.get(Owner.class, id);
        session.close();
        return owner;
    }

    @Override
    public void save(Owner owner) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(owner);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Owner owner) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(owner);
        transaction.commit();
        session.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Owner> findAll() {
        Session session = sessionFactory.openSession();
        List<Owner> owners = session.createQuery("from Owner").list();
        session.close();
        return owners;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}