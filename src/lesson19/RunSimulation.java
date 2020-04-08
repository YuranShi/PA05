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

	public static void main(String[] args) {
		// first we get the simulation parameters
		// from the command line

		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
		int numStayHome = Integer.parseInt(args[2]);
		int numEssential = Integer.parseInt(args[3]);
		int numSkeptic = Integer.parseInt(args[4]);
		int numFlier = Integer.parseInt(args[5]);
<<<<<<< HEAD
		int numDoc = Integer.parseInt(args[6]);
=======
		int numDoctor = Integer.parseInt(args[6]);
>>>>>>> e9295ee5f5937a4db47af9741f9de1878a15f482
		

		// next we create the population and the country
		Population population;

		//population = new Population(numPeople);
		//population = new AllStayAtHome(numPeople);
		//int numEssential = numPeople/10;
		//int numOther = numPeople/20;
		//int numStayHome = numPeople - numEssential - numOther;
<<<<<<< HEAD
		population = new MixedPopulation(numStayHome, numEssential, numSkeptic, numFlier,numDoc);
=======
		population = new MixedPopulation(numStayHome, numEssential, numSkeptic, numFlier, numDoctor);
>>>>>>> e9295ee5f5937a4db47af9741f9de1878a15f482
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




}
