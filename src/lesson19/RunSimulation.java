package lesson19;

import java.util.Random;
/**
 *  
 * @author tim
 *
 */

public class RunSimulation {
	// the maximum number of days the simulation will run
	private static int MAX_TICKS=1000;

	private Random random = new Random();
	
	public void run(int width,int height,int numStayHome,int numEssential,int numSkeptic,int numFlier,int numDoc){
		Population population;

		//population = new Population(numPeople);
		//population = new AllStayAtHome(numPeople);
		//int numEssential = numPeople/10;
		//int numOther = numPeople/20;
		//int numStayHome = numPeople - numEssential - numOther;
		population = new MixedPopulation(numStayHome, numEssential, numSkeptic, numFlier,numDoc);
		population.createPeople();

		Country country = new Country(width,height);
		// and add a link to the population in the country
		country.population = population;
		// next we place the people into the country randomly
		population.placePeople(country);

		System.out.println("Initial State of the Country");
		country.printCountry();

		System.out.println("\nTracking the Infection");
		for(int k=0;k<MAX_TICKS; k++) {
			country.simulateOneStep();
			country.printState(k);

			if (country.numInfected==0) {
				break;

			}
		}
		System.out.println("\nFinal State of the Country");
		country.printCountry();
	}
	
	public int[] run(int width,int height,int numStayHome,int numEssential,int numSkeptic,int numFlier,int numDoc,int repetition) {
		// first we get the simulation parameters
		// from the command line

//		int width = Integer.parseInt(args[0]);
//		int height = Integer.parseInt(args[1]);
//		int numStayHome = Integer.parseInt(args[2]);
//		int numEssential = Integer.parseInt(args[3]);
//		int numSkeptic = Integer.parseInt(args[4]);
//		int numFlier = Integer.parseInt(args[5]);
//		int numDoc = Integer.parseInt(args[6]);

		// next we create the population and the country
		Population population;

		//population = new Population(numPeople);
		//population = new AllStayAtHome(numPeople);
		//int numEssential = numPeople/10;
		//int numOther = numPeople/20;
		//int numStayHome = numPeople - numEssential - numOther;

		population = new MixedPopulation(numStayHome, numEssential, numSkeptic, numFlier,numDoc);
		population.createPeople();
		Country country = new Country(width,height);
		// and add a link to the population in the country
		country.population = population;
		// next we place the people into the country randomly
		population.placePeople(country);
		
		int ticks=0;
		int numInfected=0;
		int peakInfected=0;
		for(int k=0;k<MAX_TICKS; k++) {
			country.simulateOneStep();
			if (country.numInfected==0){
				k=1001;
			}
			ticks+=1;
			if(country.getInfected()>peakInfected){
				peakInfected=country.getInfected();
			}
		}
		numInfected=country.getInfected();
			
		
		int[] result= new int[]{ticks,numInfected,peakInfected};
		return result;
	}
}
