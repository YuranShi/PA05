package lesson19;
import java.util.Scanner;
public class AnalyzeSimulation extends RunSimulation{
	public static void main(String[] args) {
		// first we get the simulation parameters
		// from the command line
		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
		int numStayHome = Integer.parseInt(args[2]);
		int numEssential = Integer.parseInt(args[3]);
		int numSkeptic = Integer.parseInt(args[4]);
		int numFlier = Integer.parseInt(args[5]);
		int numDoc = Integer.parseInt(args[6]);
		int repetition=Integer.parseInt(args[7]);
		int sumDays=0;
		int sumInfected=0;
		int peakInfected=0;
		for(int i=0;i<repetition;i++) {
			super.(width,height,numStayHome,numEssential,numSkeptic,numFlier,numDoc,repetition);
					
		}
	}
}