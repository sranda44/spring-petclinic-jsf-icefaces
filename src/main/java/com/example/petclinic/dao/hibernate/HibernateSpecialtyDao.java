package com.example.petclinic.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.petclinic.dao.SpecialtyDao;
import com.example.petclinic.domain.Specialty;

import java.util.List;

@Repository
public class HibernateSpecialtyDao implements SpecialtyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Specialty findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Specialty) session.get(Specialty.class, id);
    }

    @Override
    public void save(Specialty specialty) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(specialty);
        transaction.commit();
    }

    @Override
    public void delete(Specialty specialty) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(specialty);
        transaction.commit();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Specialty> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Specialty").list();
    }
}