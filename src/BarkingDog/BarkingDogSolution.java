package BarkingDog;

public class BarkingDogSolution {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if((hourOfDay >= 0) && (hourOfDay <= 23)){
            if((barking == true) && ((hourOfDay < 8) || (hourOfDay > 22))){
                return true;
            }
        }
        else{
            return false;
        }
        return false;
    }
}
