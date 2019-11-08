package Automobili;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Controler.HibernateDAO;
import Model.Car;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		
//SessionFactory factory = new Configuration().configure().buildSessionFactory();

//sesija se otvora na openSession(); - ovo aktivira hibernate
//Session sesija = factory.openSession();
//svaka sesija zapocinje neku transakciju
	//sesija.beginTransaction();
	
	//ako transakcija sve uradi onda ce napraviti commit 
	//ako transakcija ne usepe bice rollback

	//try {
		//na ovaj nacin cuvamo ceo objekat u bazi
		//sesija.save(car);
		//System.out.println("Ubacen objekat u bazu ");
		//sesija.getTransaction().commit();
	//} catch (Exception e) {
		//sesija.getTransaction().rollback();
	//}

//sesija se zatvara kao i svaka druga metoda .close();
//sesija.close();
		
		
		HibernateDAO dao = new HibernateDAO();
		//Car car = new Car("maserati", "ghilbi", 2017, 0.18 , true);
		//dao.snimiAutoUBazu(car);
		
		/*Car car = dao.vratiAutoPoID(2);
		dao.updateCarPrice(car.getIdCar(), 180000);
		System.out.println("Uzeo si auto " + car.getMarka() + " " + car.getModel());
		System.out.println("Nova cena je " + car.getCena());*/
		
		if (dao.delateCar(1)) {
			System.out.println("Obrisan je auto ");
		} else {
			System.out.println("Auto nije obrisan ");
		}
		
		
		
		
		
		

	}

}
