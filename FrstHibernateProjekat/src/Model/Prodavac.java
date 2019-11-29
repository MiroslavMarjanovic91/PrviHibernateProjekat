package Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity //novi entitet
@DiscriminatorValue("sales_manager") // ovo u bazi menja Prodavca u sales_mangera
public class Prodavac extends User {
	
	
	private int pib;
	
	

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	} 
	
	
	
	

}
