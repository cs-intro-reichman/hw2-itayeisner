// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		// מקדם הדיוק
		int NumTerms = Integer.parseInt(args[0]);
		int p=1; // מקדם השבר
		//calc Pi
		double AproxPi = 0;
		for(int i=0;i<NumTerms;i++){
			if (i%2==0) AproxPi += (double)1/p;
			else AproxPi -= (double)1/p;
			p+=2;
		}
		AproxPi *= 4;

		System.out.println("Pi according to Java: " + Math.PI);
		System.out.println("Pi, approximated:     " + AproxPi);
	}
}
