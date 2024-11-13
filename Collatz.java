// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int N = Integer.parseInt(args[0]);
		String mode = args[1]; 
		int seed = 1 ;
		int NextNum = 0;
		int steps = 1;
		boolean first = true;
		for (int i=0; i<N;i++){
			// V - all of the sequences from 1 to N
			if ( mode.equals("v")){
				System.out.print(seed + " ");
				NextNum = seed;
			while(NextNum!=1 || first){
				if (first) {first = false;}
				if (NextNum%2==0) {NextNum = NextNum/2;}
				else {NextNum = NextNum*3 +1;}
				System.out.print(NextNum + " ");
				steps++;
				}
			System.out.println( "(" + steps + ")");
			steps = 1;
			}
			// C - sum of verified sequences from 1 to N
			if ( mode.equals("c")){
				NextNum = seed;
			while(NextNum!=1 || first){
				if (first) {first = false;}
				if (NextNum%2==0) {NextNum = NextNum/2;}
				else {NextNum = NextNum*3 +1;}
				}
			}
			seed++;
		} 
		System.out.println("Every one of the first "+ N + " sequences reached 1.");

	}
}
