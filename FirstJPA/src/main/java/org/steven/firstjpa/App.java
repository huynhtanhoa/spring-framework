package org.steven.firstjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.
                createEntityManagerFactory("FirstJPA");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Student student = new Student("AAA", 40);

        // insert student into database
        entityManager.persist(student);
        entityManager.getTransaction().commit();

        // close
        entityManager.close();
        entityManagerFactory.close();
    }
}
