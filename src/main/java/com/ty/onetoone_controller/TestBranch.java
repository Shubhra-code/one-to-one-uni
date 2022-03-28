package com.ty.onetoone_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone_dao.Address;
import com.ty.onetoone_dao.Branch;

public class TestBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Branch branch = new Branch();
		branch.setName("QJspider");
		branch.setPhone(33674);
		
		Address address = new Address();
		address.setArea("HEBBAL");
		address.setPin(500671);
		address.setState("KA");
		
		branch.setAddress(address);
		
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();

	}

}
