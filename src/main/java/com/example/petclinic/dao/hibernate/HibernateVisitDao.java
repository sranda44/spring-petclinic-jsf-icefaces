package com.example.petclinic.dao.hibernate;

import com.example.petclinic.dao.VisitDao;
import com.example.petclinic.domain.Visit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateVisitDao implements VisitDao {

    private final SessionFactory sessionFactory;

    public HibernateVisitDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Visit findById(Long id) {
        Session session = sessionFactory.openSession();
        Visit visit = (Visit) session.get(Visit.class, id);
        session.close();
        return visit;
    }

    @Override
    public void save(Visit visit) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(visit);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw e;
        }
    }

    @Override
    public void delete(Visit visit) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(visit);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw e;
        }
    }

    @Override
    public List<Visit> findAll() {
        Session session = sessionFactory.openSession();
        List<Visit> visits = session.createQuery("from Visit").list();
        session.close();
        return visits;
    }

    @Override
    public List<Visit> findByPetId(Long petId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPetId'");
    }
}