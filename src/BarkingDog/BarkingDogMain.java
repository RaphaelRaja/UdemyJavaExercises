package BarkingDog;

public class BarkingDogMain {
    public static void main(String[] args) {
        System.out.println(BarkingDogSolution.shouldWakeUp(true, 1));
        System.out.println(BarkingDogSolution.shouldWakeUp(false, 2));
        System.out.println(BarkingDogSolution.shouldWakeUp(true, 8));
        System.out.println(BarkingDogSolution.shouldWakeUp(true, -1));
    }
}
