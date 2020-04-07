package lesson19;

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
