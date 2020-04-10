
package lesson19;

import java.util.ArrayList;

public class Doctor extends Person {

	public Doctor() {
		super();
	}
	
	void tryToMove() {
		super.tryToMoveRandomly();
		cure();
//		treatment();
	}
	
	/*
	 * the doctor can treat one random person around him
	 */
//	public void treatment(){
//		int treated = 0;
//		ArrayList<Person> potentialPatients = new ArrayList<Person>();
//		for(int i=this.x-1; i<this.x+1; i+=2) {
//			Person p = country.places[i][this.y];
//			if(inRange(i,this.y,country) && p != null && p.infected)
//				potentialPatients.add(p);
//		}
//		for(int j=this.y-1; j<this.y+1; j+=2) {
//			Person p = country.places[this.x][j];
//			if(inRange(this.x,j,country) && p != null && p.infected)
//				potentialPatients.add(p);
//		}	
//		if(potentialPatients != null) {
//			int ranNum = (int) (Math.random()*(potentialPatients.size()+1));
//			potentialPatients.get(0).recovered = true;
//			System.out.println("treated");
//		}
//		
//	}
	public void cure(){	
		for(int i=this.x-1; i<=this.x+1; i++) {
			for(int j=this.y-1; j<=this.y+1; j++) {
				if (inRange(i,j,country)) {
					Person p = country.places[i][j];
					if (p != null  && p.infected) {
						p.recovered=true;
						i=this.x+1;
					}
				}
			}
		}
	}
}
