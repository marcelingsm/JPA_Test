package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Client;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		
		
		//Client c2 = em.find(Client.class, 1);
		
		System.out.println();
		em.close();
		emf.close();
		
	}

}
