package Automobili;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Controler.HibernateDAO;
import Model.Car;
import Model.Kupac;
import Model.Prodavac;
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
		//HibernateDAO dao = new HibernateDAO();
/*		//iz baze izvukao dva automobila
		
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
		} */
		
		
		
		
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
		
		
		
		//21. dvadesetprvi cas 
		//HibernateDAO dao = new HibernateDAO();
		
/*		
		User user = new User();
		user.setUserName("Pera");

		Prodavac prodavac = new Prodavac();
		prodavac.setUserName("Elvis");
		prodavac.setPib(1);
		
		Kupac kupac = new Kupac();
		kupac.setUserName("Milica");
		kupac.setJmbg("7845863214789");
		
		
		dao.snimiUsera(user);
		dao.snimiUsera(prodavac);
		dao.snimiUsera(kupac);*/
		
		//22. dvadesetdrugi cas 
		
		HibernateDAO dao = new HibernateDAO();
		
/*		VizitCar vizitCar = new VizitCar();
		vizitCar.setIme("Sone");
		vizitCar.setEmail("nenad@gmail.com");
		vizitCar.setBrTelefona("0647894512");
		
		List<VizitCar> kartice = new ArrayList<VizitCar>();
		kartice.add(vizitCar);
		
		Kupac kupac = new Kupac();
		kupac.setUserName("Nenad");
		kupac.setPassword("nenad123");
		kupac.setNovcanik(3000000);
		kupac.setJmbg("2347854165879");
		
		dao.snimiUsera(kupac);
		
		Car car1 = new Car();
		
		car1.setMarka("Fiat");
		car1.setModel("Punto");
		car1.setGodiste(2005);
		car1.setCena(30000);
		car1.setRegistracija(true);
		car1.setVrstaVozila(VrstaVozila.PUTNICKO); 
		
		
		Car car2 = new Car();
		car2.setMarka("BMW");
		car2.setModel("740");
		car2.setGodiste(2018);
		car2.setCena(50000);
		car2.setRegistracija(true);
		car2.setVrstaVozila(VrstaVozila.PUTNICKO); 
		
		dao.snimiAutoUBazu(car1);
		dao.snimiAutoUBazu(car2);*/
		
/*	User kupac = dao.vratiUseraPoID(4);
		
		Car car1 = dao.vratiAutoPoID(1);
		Car car2 = dao.vratiAutoPoID(2);
		
		car1.setKorisnik(kupac);
		car2.setKorisnik(kupac);
		
		List<Car> nenadoviAutici = new ArrayList<Car>();
		nenadoviAutici.add(car1);
		nenadoviAutici.add(car2);
		
		dao.spojiUseraIcar(kupac, nenadoviAutici);*/
		
		//Hibernate Query Language ili HQL(HAKUEL) - Hajbernetov jezik koji se obraca direkno kasi
		
		//Nikada se ne obracamo tabeli, obracamo se dirkeno klasi - class, zaravo je to proksi objekat
				
		//from User; 
		//Select userName from User; 
				
        //set iz jdbc-a u hajbernetu je Query object.getResultList - ovo uvek vraca Listu onoga sto zelimo
		
		//List<Car> c = dao.dajMiSveAutomobileIzBaze();
		
		List<Car> c = dao.dajMiSveAutomobileIzBazeKojiSuJeftinijiOdZadateCene(2000);
		
		for (Car car: c) {
			System.out.println(car.getMarka() + " " + car.getModel());
		}
		
	}

}
