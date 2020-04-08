<<<<<<< HEAD
class AnalyzeSimulation {
	public static void main(String[] args) {
		
	}
=======
package lesson19;
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
>>>>>>> ed60f3fe5c629a3c722fc4af7339489e57965284
}