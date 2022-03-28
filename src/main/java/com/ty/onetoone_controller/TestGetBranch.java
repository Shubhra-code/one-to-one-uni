package com.ty.onetoone_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone_dao.Address;
import com.ty.onetoone_dao.Branch;

public class TestGetBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Branch branch = entityManager.find(Branch.class, 1);
		Address address = branch.getAddress();
		
		System.out.println("Branch Id : "+branch.getId());
		System.out.println("Branch Name : "+branch.getName());
		System.out.println("Branch : "+branch.getPhone());
		System.out.println("Branch Address ");
		System.out.println("Area : "+address.getArea());
		System.out.println("Pin : "+address.getPin());
		System.out.println("State : "+address.getState());
	}

}
