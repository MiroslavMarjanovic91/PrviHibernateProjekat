package Automobili;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Car;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		
SessionFactory factory = new Configuration().configure().buildSessionFactory();


	Car car = new Car("bugatti", "veyron", 2018, 1.8 , true);
	



//sesija se otvora na openSession(); - ovo aktivira hibernate
Session sesija = factory.openSession();
//svaka sesija zapocinje neku transakciju
	sesija.beginTransaction();
	
	//ako transakcija sve uradi onda ce napraviti commit 
	//ako transakcija ne usepe bice rollback

	try {
		//na ovaj nacin cuvamo ceo objekat u bazi
		sesija.save(car);
		System.out.println("Ubacen objekat u bazu ");
		sesija.getTransaction().commit();
	} catch (Exception e) {
		sesija.getTransaction().rollback();
	}

//sesija se zatvara kao i svaka druga metoda .close();
sesija.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
