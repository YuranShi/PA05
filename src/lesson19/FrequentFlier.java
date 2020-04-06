package lesson19;

public class FrequentFlier extends Person{


	public FrequentFlier() {
		super();
	}

	public void tryToMove() {
		int dx = random.nextInt(country.places.length);
		int dy = random.nextInt(country.places[dx].length);
		if (isOK(dx, dy,this.country)) {
			this.moveTo(dx, dy);
		}
	}
	
}
