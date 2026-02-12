package com.example.petclinic.dao.hibernate;

import com.example.petclinic.dao.PetDao;
import com.example.petclinic.domain.Pet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernatePetDao implements PetDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Pet findByOwnerId(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Pet) session.get(Pet.class, id);
    }

    @Override
    public void save(Pet pet) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(pet);
        transaction.commit();
    }

    @Override
    public void delete(Pet pet) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(pet);
        transaction.commit();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Pet> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Pet").list();
    }
}