package com.ty.onetoone_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone_dao.Address;
import com.ty.onetoone_dao.Branch;
import com.ty.onetoone_dao.Pan;
import com.ty.onetoone_dao.Person;

public class TestGetPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pan pan = entityManager.find(Pan.class, 1);
		Person person = pan.getPerson();
		
		System.out.println("Pan Id : "+pan.getId());
		System.out.println("Pan Number : "+pan.getPanNumber());
		System.out.println("Pan Issued date : "+pan.getDate());
		System.out.println("Pan Country : "+pan.getCountry());
		System.out.println("Person details ");
		System.out.println("Person Name : "+person.getName());
		System.out.println("Person Phone : "+person.getPhone());
		System.out.println("Person Gender : "+person.getGender());

	}

}
