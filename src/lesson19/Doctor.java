<<<<<<< HEAD
package lesson19;

import java.util.ArrayList;

public class Doctor extends Person {
	private double cureProb=0.3;
	public Doctor() {
		super();
	}

	public void tryToMove() {
		super.tryToMoveRandomly();
		cure();
	}

	public void cure(){	
		for(int i=this.x-1; i<=this.x+1; i++) {
			for(int j=this.y-1; j<=this.y+1; j++) {
				if (inRange(i,j,country)) {
					Person p = country.places[i][j];
					if (p != null  && p.infected) {
						if (Math.random()<=cureProb) {
							p.infected=false;
						}
						i=this.x+1;
					}
				}
			}
		}

	}
}
=======
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
>>>>>>> ed60f3fe5c629a3c722fc4af7339489e57965284
