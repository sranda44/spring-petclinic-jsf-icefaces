package com.example.petclinic.dao.hibernate;

import com.example.petclinic.dao.PetTypeDao;
import com.example.petclinic.domain.PetType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernatePetTypeDao implements PetTypeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public PetType findById(Long id) {
        Session session = sessionFactory.openSession();
        PetType petType = (PetType) session.get(PetType.class, id);
        session.close();
        return petType;
    }

    @Override
    public List<PetType> findAll() {
        Session session = sessionFactory.openSession();
        List<PetType> petTypes = session.createQuery("from PetType").list();
        session.close();
        return petTypes;
    }

    @Override
    public void save(PetType petType) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(petType);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(PetType petType) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(petType);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}