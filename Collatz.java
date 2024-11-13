// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int N = Integer.parseInt(args[0]);
		String mode = args[1]; 
		int NextNum = 0;
		int steps = 1;
		boolean first = true;
		for (int i=0; i<N;i++){
			NextNum = i+1;
			// V - all of the sequences from 1 to N
			if ( mode.equals("v")) {System.out.print((i+1) + " ");}
			while(NextNum!=1 || first){
				if (first) first = false;
				if (NextNum%2==0) {NextNum = NextNum/2;}
				else {NextNum = NextNum*3 +1;}
				if ( mode.equals("v")) {System.out.print(NextNum + " ");}
				steps++;
				}
				if ( mode.equals("v")) {System.out.println( "(" + steps + ")");}
			steps = 1;
			
			/* C - sum of verified sequences from 1 to N
			if ( mode.equals("c")){
			while(NextNum!=1 || first){
				if (first) first = false;
				if (NextNum%2==0) {NextNum = NextNum/2;}
				else {NextNum = NextNum*3 +1;}
				}
			}*/
		} 
		System.out.println ("Every one of the first "+ N + " hailstone sequences reached 1.");

	}
}
