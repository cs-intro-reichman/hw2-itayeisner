// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String crowdinput = args[0];
            String crowdupper = crowdinput.toUpperCase();
            int length = crowdupper.length();
            for (int i=0; i<length; i++){
                System.out.print("Give me ");
                boolean IsAn = false;
                IsAn = (crowdupper.charAt(i) =='A' || crowdupper.charAt(i)=='E' || crowdupper.charAt(i)=='F' || crowdupper.charAt(i)=='H' || crowdupper.charAt(i)=='I' || crowdupper.charAt(i)=='L' || crowdupper.charAt(i)=='M'|| crowdupper.charAt(i)=='N' || crowdupper.charAt(i)=='O' || crowdupper.charAt(i)=='R' || crowdupper.charAt(i)=='S' || crowdupper.charAt(i)=='X') ;
                if (IsAn) {System.out.println("an "+ crowdupper.charAt(i) + ": "+ crowdupper.charAt(i) + "!");}
                else {System.out.println("a  "+ crowdupper.charAt(i) + ": "+ crowdupper.charAt(i) + "!");}
            }
            System.out.println("What does that spell?");
            int times = Integer.parseInt(args[1]);
            for (int i=0;i<times;i++){
                System.out.println(crowdupper + "!!!");
            }
        }
}
