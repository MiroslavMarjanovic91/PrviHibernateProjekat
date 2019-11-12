package Controler;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Car;
import Model.User;

public class HibernateDAO {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	
	public boolean snimiAutoUBazu(Car car) {
		
		Session sesija = factory.openSession();
			sesija.beginTransaction();
			
			try {
				sesija.save(car);
				sesija.getTransaction().commit();
				System.out.println();
				return true;
			} catch (Exception e) {
				sesija.getTransaction().rollback();
				return false;
			} finally {
				sesija.close();
			}
	}
	
	public Car vratiAutoPoID (int id) {
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		//dodeljujemo vrednost objektu null;
		Car car = null;
		try {
			//ovo pravimo da nam objekat ne bi vratio nall;
			car = sesija.get(Car.class, id);
			sesija.getTransaction().commit();
			System.out.println();
			return car;
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			return null;
			//moze i return car; 
		} finally {
			sesija.close();
		}
	}
	
	public void updateCarPrice (int id, double novaCena) {
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		//dodeljujemo vrednost objektu null;
		Car car = null;
		try {
			//ovo pravimo da nam objekat ne bi vratio nall;
			car = sesija.get(Car.class, id);
			car.setCena(novaCena);
			sesija.update(car);
			sesija.getTransaction().commit();
			System.out.println();
		
		} catch (Exception e) {
			sesija.getTransaction().rollback();
		
		} finally {
			sesija.close();
		}
	}
	
	public boolean delateCar (int id) {
	
	Session sesija = factory.openSession();
	sesija.beginTransaction();
	//dodeljujemo vrednost objektu null;
	Car car = null;
	try {
		car = sesija.get(Car.class, id);
		sesija.delete(car);
		sesija.getTransaction().commit();
		System.out.println();
		return true;
	
	} catch (Exception e) {
		sesija.getTransaction().rollback();
		return false;
		
	} finally {
		sesija.close();
	}
}
	
	
public boolean snimiUsera(User user) {
		
		Session sesija = factory.openSession();
			sesija.beginTransaction();
			
			try {
				sesija.save(user);
				sesija.getTransaction().commit();
				System.out.println();
				return true;
			} catch (Exception e) {
				sesija.getTransaction().rollback();
				return false;
			} finally {
				sesija.close();
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
