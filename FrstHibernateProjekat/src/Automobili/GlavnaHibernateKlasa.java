package Automobili;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Controler.HibernateDAO;
import Model.Car;
import Model.User;
import Model.VizitCar;
import Model.VrstaVozila;

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
		
		
		//HibernateDAO dao = new HibernateDAO();
		//18.cas
		/* User user=dao.vratiUseraPoID(1);
		 System.out.println("Zdravo "+user.getUserName());
		 
		 dao.izlistajAutomobile(user);
		 Car auto1=dao.vratiAutoPoID(2);
		 Car auto2=dao.vratiAutoPoID(3);
		 Car auto3=dao.vratiAutoPoID(5);
		 
		 List <Car> ruziniAutomobili=new ArrayList<Car>();
		 ruziniAutomobili.add(auto1);
		 ruziniAutomobili.add(auto2);
		 ruziniAutomobili.add(auto3);
		 
		 
		 
		 
		 if(dao.daLiUserImaDovoljnoParaZaAutomobile(user,ruziniAutomobili)) {
			 dao.spojiUseraIcar(user, ruziniAutomobili);
			 
		 }
*/
		 
		
		
		
		
		//dao.linkujUseraIauto(1, 1);
		
		//15 cas
		//Car car = new Car("maserati", "ghilbi", 2017, 0.18 , true);
		//dao.snimiAutoUBazu(car);
		
		/*Car car = dao.vratiAutoPoID(2);
		dao.updateCarPrice(car.getIdCar(), 180000);
		System.out.println("Uzeo si auto " + car.getMarka() + " " + car.getModel());
		System.out.println("Nova cena je " + car.getCena());*/
		
		//if (dao.delateCar(1)) {
			//System.out.println("Obrisan je auto ");
		//} else {
			//System.out.println("Auto nije obrisan ");
		//}
		
		//16 cas 
		/*Car car = new Car("Lend Rover", "Discoovery", 2018, 39990, false, VrstaVozila.SUV);
		Car car1 = new Car("crysler", "300c", 2019, 35000, false, VrstaVozila.PUTNICKO);
		Car car2 = new Car("dodge", "caliber", 2017, 10000, false, VrstaVozila.PUTNICKO);
		Car car3 = new Car("lexus", "lc500", 2019, 110000, false, VrstaVozila.PUTNICKO);
		Car car4 = new Car("Lada", "niva", 2019, 19000, false, VrstaVozila.TERENEAC);
		
		
		dao.snimiAutoUBazu(car1);
		dao.snimiAutoUBazu(car2);
		dao.snimiAutoUBazu(car3);
		dao.snimiAutoUBazu(car4);
		
		
		
		VizitCar vizitCar1 = new VizitCar();
		vizitCar1.setIme("Ruzica");
		vizitCar1.setEmail("ruza@gmail.com");
		vizitCar1.setBrTelefona("0641234567");
		
		
		VizitCar vizitCar2 = new VizitCar();
		vizitCar2.setIme("Ruzica");
		vizitCar2.setEmail("ruza2@gmail.com");
		vizitCar2.setBrTelefona("0644587624");*/
		
		
		
		/*VizitCar vizitCar = new VizitCar();
		vizitCar.setIme("Ruzica");
		vizitCar.setEmail("ruza@gmail.com");
		vizitCar.setBrTelefona("0641234567");
		
		
		
		User user = new User();
		user.setUserName("Ruza");
		user.setPassword("ruzaprogramer123");
		user.setNovcanik(100000);
		user.setVizitCar(vizitCar);
		
	
		dao.snimiAutoUBazu(car);
		
		dao.snimiUsera(user);
*/		
		
		
		
		
		//20. dvadeseti cas
		HibernateDAO dao = new HibernateDAO();
		//iz baze izvukao dva automobila
		
		Car auto1 = dao.vratiAutoPoID(1);
		Car auto2 = dao.vratiAutoPoID(2);
		
		//dodao u listu dva automobila
		List<Car> ruziniAutici = new ArrayList<Car>();
		ruziniAutici.add(auto1);
		ruziniAutici.add(auto2);
		
		//izvukao usera iz baze
		User user = dao.vratiUseraPoID(1);
		
		//provera da li Ruza ima para
		if(dao.daLiUserImaDovoljnoParaZaAutomobile(user, ruziniAutici)) {
			//ovde spajamo usera i automobile
			dao.spojiUseraIcar(user, ruziniAutici);
		} 
		
		
		
		
	//ovo je sve sto nam je potrebno za ubacivanje u bazu kada je u xml create, 
		//kada ubacimo vrcamo na update i komentarisemo ceo blok, da ne bi ponovo ubacivao u bazu
	/*	Car car = new Car("Lend Rover", "Discoovery", 2018, 39990, false, VrstaVozila.SUV);
		Car car1 = new Car("crysler", "300c", 2019, 35000, false, VrstaVozila.PUTNICKO);
		Car car2 = new Car("dodge", "caliber", 2017, 10000, false, VrstaVozila.PUTNICKO);
		Car car3 = new Car("lexus", "lc500", 2019, 110000, false, VrstaVozila.PUTNICKO);
		Car car4 = new Car("Lada", "niva", 2019, 19000, false, VrstaVozila.TERENEAC);
		
		
		dao.snimiAutoUBazu(car1);
		dao.snimiAutoUBazu(car2);
		dao.snimiAutoUBazu(car3);
		dao.snimiAutoUBazu(car4);

		VizitCar vizitCar1 = new VizitCar();
		vizitCar1.setIme("Ruzica");
		vizitCar1.setEmail("ruza@gmail.com");
		vizitCar1.setBrTelefona("0641234567");

		VizitCar vizitCar2 = new VizitCar();
		vizitCar2.setIme("Ruzica");
		vizitCar2.setEmail("ruza2@gmail.com");
		vizitCar2.setBrTelefona("0644587624");
		
		List<VizitCar> vizitke = new ArrayList<VizitCar>();
		vizitke.add(vizitCar2);
		vizitke.add(vizitCar1);
		
		User user = new User(); 
		
		user.setUserName("Ruza");
		user.setPassword("ruza123");
		user.setNovcanik(200000);
		user.setVizitCars(vizitke);
		
		dao.snimiUsera(user);*/
		
		
		
		
		
		

	}

}
