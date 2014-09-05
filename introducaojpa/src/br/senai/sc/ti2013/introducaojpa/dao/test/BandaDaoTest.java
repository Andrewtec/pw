package br.senai.sc.ti2013.introducaojpa.dao.test;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.senai.sc.ti2013.introducaojpa.dao.BandaDao;
import br.senai.sc.ti2013.introducaojpa.entity.Banda;
import br.senai.sc.ti2013.introducaojpa.util.JpaUtil;

public class BandaDaoTest {
public static EntityManager entityManager;

@BeforeClass
public static void init(){
	JpaUtil.initFactory();
}

@AfterClass
public static void finish(){
	JpaUtil.closeFactory();
}

@Before

public void begin(){
	entityManager = JpaUtil.getEntityManager();
	entityManager.getTransaction().begin();
}
@After
public void close(){
	entityManager.getTransaction().commit();
	entityManager.close();
	entityManager = null;
}
@Test
public void testSalvar(){
	Banda banda = new Banda();
	banda.setNome("Banda 456");
	banda.setHistoria("Historia da banda");
	
	BandaDao dao = new BandaDao(entityManager);
	dao.salvar(banda);
}
}
