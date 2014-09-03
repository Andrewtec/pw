package br.senai.sc.ti2013.introducaojpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("introducaojpa_pu");
		entityManagerFactory.close();
		// TODO Auto-generated method stub

	}

}
