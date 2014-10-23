package com.bergit.jpa.test;

import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;

import com.bergit.jpa.model.User;


public class TestJPA {

	private static final Logger logger = Logger.getLogger(TestJPA.class);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		logger.info("---------Invoke test---------");
		 
		try {
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"META-INF/config/datasource-config.xml"});
			JpaTransactionManager tM=(JpaTransactionManager) app.getBean("transactionManager");		
			EntityManagerFactory emf=tM.getEntityManagerFactory();
			EntityManager em = emf.createEntityManager();
			User user1 = new User();
			user1.setId(1);
			User user = em.find(User.class,user1.getId());
			System.out.println("Name "+user.getFirstname());
			assertTrue(true);
			} catch (Exception e) {
			assertTrue(e.getMessage().toString(),false);
			} 
		
		
		
	}

}
