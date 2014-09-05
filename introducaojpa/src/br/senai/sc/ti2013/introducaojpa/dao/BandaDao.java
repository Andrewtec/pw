package br.senai.sc.ti2013.introducaojpa.dao;

import javax.persistence.EntityManager;

import br.senai.sc.ti2013.introducaojpa.entity.Banda;

public class BandaDao {

	private EntityManager entityManager; 
	
	public BandaDao(EntityManager entityManager){
		this.entityManager=entityManager;
	}
	public void salvar (Banda banda){
		entityManager.persist(banda);
	}
}
