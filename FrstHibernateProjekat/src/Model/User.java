package Model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//grupa anotacija koja menja u tabeli imena i kolone umesto naziva klase 
//ide iznad klase, a ispod entiteta odnosi se na strukturu
@Table(name = "korisnik")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	
	//primitivni tipovi podataka
	private int idUser;
	//menjamo ime u tabeli 
	@Column(name = "user_name")
	private String userName;
	private String password;
	private double novcanik;
	
	//imoportujemo iz clase VizitCar
	@Embedded //ovo je polje vezuje sa klasom VizitCar 
	private VizitCar VizitCar;
	//veza 1 na 1
	@OneToOne
	private Car auto;
	
	
	
	public Car getAuto() {
		return auto;
	}
	public void setAuto(Car auto) {
		this.auto = auto;
	}
	public VizitCar getVizitCar() {
		return VizitCar;
	}
	public void setVizitCar(VizitCar vizitCar) {
		VizitCar = vizitCar;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getNovcanik() {
		return novcanik;
	}
	public void setNovcanik(double novcanik) {
		this.novcanik = novcanik;
	}
	
	
	
	
	

}
