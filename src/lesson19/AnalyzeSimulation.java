package lesson19;
<<<<<<< HEAD
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
		RunSimulation r=new RunSimulation();
		for(int i=0;i<repetition;i++) {
			int[] parameter=r.run(width,height,numStayHome,numEssential,numSkeptic,numFlier,numDoc,repetition);		
			sumDays+=parameter[0];
			System.out.println(sumDays);
			sumInfected+=parameter[1];
			System.out.println(sumInfected);
			if (parameter[2]>peakInfected){
				peakInfected=parameter[2];	
			}		
		}
		System.out.println("AvgDays: "+sumDays/repetition);
		System.out.println("AvgInfected: "+sumInfected/repetition);
		System.out.println("PeakInfected: "+peakInfected);
	}
	
=======
import java.util.Scanner;
public class AnalyzeSimulation{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String arg = in.nextLine();
		String[] ar = arg.split(" ");
		int trial = 0;
		while (trial <= 100) {
			RunSimulation.main(ar);
			
		}
	}
>>>>>>> 35cfeeb8eefea7d2f306ad94030028f92f496222
}