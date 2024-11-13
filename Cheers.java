// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String crowdinput = args[0];
            String crowdupper = crowdinput.toUpperCase();
            int length = crowdupper.length();
            for (int i=0; i<length; i++){
                System.out.print("Give me ");
                boolean IsAn = (crowdupper.indexOf('A')==i || crowdupper.indexOf('E')==i || crowdupper.indexOf('F')==i || crowdupper.indexOf('H')==i|| crowdupper.indexOf('I')==i || crowdupper.indexOf('L')==i || crowdupper.indexOf('M')==i|| crowdupper.indexOf('N')==i || crowdupper.indexOf('O')==i || crowdupper.indexOf('R')==i || crowdupper.indexOf('S')==i || crowdupper.indexOf('X')==i) ;
                if (IsAn) {System.out.println("an "+ crowdupper.charAt(i) + ": "+ crowdupper.charAt(i) + "!");}
                else {System.out.println("a "+ crowdupper.charAt(i) + ": "+ crowdupper.charAt(i) + "!");}
            }
            System.out.println("What does that spell?");
            int times = Integer.parseInt(args[1]);
            for (int i=0;i<times;i++){
                System.out.println(crowdupper + "!!!");
            }
        }
}
