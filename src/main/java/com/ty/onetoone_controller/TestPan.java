package com.ty.onetoone_controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone_dao.Pan;
import com.ty.onetoone_dao.Person;

public class TestPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("Vishal");
		person.setPhone(883344);
		person.setGender("Male");
		
		
		Pan pan = new Pan();
		pan.setPanNumber("GFRE6759Q");
		pan.setDate(LocalDate.now());
		pan.setCountry("India");

		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
	}

}
