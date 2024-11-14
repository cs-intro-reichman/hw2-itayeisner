public class TimeCalc {
    public static void main(String[] args) {
        // User input
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMin = Integer.parseInt(args[1]);
        int TotalMinutes = hours*60 + minutes + addMin; // calc all min
        int NewHours = (TotalMinutes/60)%24; // calc hours
        int NewMinutes = TotalMinutes - (TotalMinutes/60)*60; // calc min
        //Build output
        String min = "";
        String hr = "";

        if (NewHours<10) hr = "0" + NewHours;
        else hr = "" + NewHours;
        if (NewMinutes<10) min = "0" + NewMinutes;
        else min = "" + NewMinutes;

        System.out.println(hr+":"+min);
    }
}
