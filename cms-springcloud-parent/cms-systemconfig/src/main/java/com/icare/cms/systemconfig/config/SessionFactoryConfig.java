package com.icare.cms.systemconfig.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;


@EnableAutoConfiguration
public class SessionFactoryConfig {
	
/*	@Autowired
	@PersistenceContext
	private EntityManager em;*/
	
	
//	 @Bean    //一定要注入这个（划重点）  
//	 public SessionFactory sessionFactory(HibernateEntityManagerFactory entityManagerFactory){      
//		 sessionfactory = entityManagerFactory.getSessionFactory();
//		 return sessionfactory;      
//	 } 
	 
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
	    HibernateJpaSessionFactoryBean fact = new HibernateJpaSessionFactoryBean();
	    fact.setEntityManagerFactory(emf);
	    return fact;
	}
	 
//	 @Bean
//	 public HibernateTemplate hibernateTemplate(){
//		 HibernateTemplate hibernateTemplate = new HibernateTemplate();
//		 hibernateTemplate.setSessionFactory(sessionfactory);
//		 return hibernateTemplate;
//	 }
	 
//	 public JdbcTemplate jdbcTemplate(){
//		 LocalSessionFactoryBean bean = (LocalSessionFactoryBean) sessionfactory;
//	 }
}
