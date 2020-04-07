package lesson19;

import java.util.ArrayList;

public class Doctor extends Person {

	public Doctor(int x, int y, Country country) {
		super(x, y, country);
		// TODO Auto-generated constructor stub
	}

	public Doctor() {
		
	}

	void tryToMove() {
		super.tryToMoveRandomly();
		treatment();
	}
	
	/*
	 * the doctor can treat one person around him
	 */
	public void treatment(){
		int treated = 0;
		while(treated <= 1 && this.infected == false) {
			ArrayList<Person> potentialPatients = new ArrayList<Person>();
			for(int i = -1; i <=1 ; i+=2) {
				if(country.places[x-i][y] != null && country.places[x-1][y].infected == true)
					potentialPatients.add(country.places[x-i][y]);
			}
			for(int i = -1; i <=1 ; i+=2) {
				if(country.places[x][y+i] != null && country.places[x][y+i].infected == true)
					potentialPatients.add(country.places[x-i][y]);
			}
			while(potentialPatients != null) {
				int ranNum = (int) (Math.random()*(potentialPatients.size()+1));
				potentialPatients.get(ranNum).recovered = true;
				treated ++;
				System.out.println("treated");
			}
		
		}
			
	}

}
