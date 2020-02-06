public class speedConverter {
    public static void main(String[] args) {
        toMilesPerHour(1);
    }

    public static double toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        else{
            double milesPerHour =  kilometersPerHour / 1.609344;
            System.out.println(milesPerHour);
            return milesPerHour;
        }
    }
}
