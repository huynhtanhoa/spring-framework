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

        //Student student = new Student("AAA", 40);
        //Person person = new Person("Kevin", "kevin@gmail.com");

        // get
        Person person = entityManager.find(Person.class, 1);
        System.out.println(person);


        // insert student into database
        entityManager.persist(person);
        entityManager.getTransaction().commit();

        // close
        entityManager.close();
        entityManagerFactory.close();
    }
}
