package br.senai.sc.ti2013.introducaojpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
private static EntityManagerFactory entityManagerFactory; 
	
public static void initFactory() {
	if (entityManagerFactory!=null) return;
		entityManagerFactory = Persistence.createEntityManagerFactory("introducaojpa_pu");
}
	public static void closeFactory(){
		entityManagerFactory.close();
	}
	public static EntityManager getEntityManager(){
		return entityManagerFactory.createEntityManager();
	}
}

