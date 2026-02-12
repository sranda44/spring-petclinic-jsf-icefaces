package com.example.petclinic.dao.hibernate;

import com.example.petclinic.dao.VetDao;
import com.example.petclinic.domain.Vet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateVetDao implements VetDao {

    private final SessionFactory sessionFactory;

    public HibernateVetDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Vet findById(Long id) {
        Session session = sessionFactory.openSession();
        Vet vet = (Vet) session.get(Vet.class, id);
        session.close();
        return vet;
    }

    @Override
    public void save(Vet vet) {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(vet);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Vet vet) {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(vet);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Vet> findAll() {
        Session session = sessionFactory.openSession();
        List<Vet> vets = session.createQuery("from Vet").list();
        session.close();
        return vets;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}