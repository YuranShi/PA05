package lesson19;

import java.util.ArrayList;

public class Doctor extends Person {

	public Doctor(int x, int y, Country country) {
		super(x, y, country);
		// TODO Auto-generated constructor stub
	}

	public Doctor() {
		super();
	}

	void tryToMove() {
		super.tryToMoveRandomly();
		treatment();
	}
	
	/*
	 * the doctor can treat one person around him
	 */
	public void treatment(){
		ArrayList<Person> potentialPatients = new ArrayList<Person>();
		for(int i = -1; i <=1 ; i++) {
			for (int j = -1; j <= 1; j++) {
				if(country.places[x-i][y] != null && country.places[x-1][y].infected == true && !(i==0&&j==0)) {
					potentialPatients.add(country.places[x-i][y]);
				}
			}
		}
		if(potentialPatients != null) {
			int ranNum = (int) (Math.random()*(potentialPatients.size()+1));
			potentialPatients.get(ranNum).recovered = true;
			System.out.println("treated");
		}
			
	}

}
