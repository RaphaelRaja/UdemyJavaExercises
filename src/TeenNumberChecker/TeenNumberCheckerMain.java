package TeenNumberChecker;

import EqualSumChecker.EqualSumCheckerSolution;

public class TeenNumberCheckerMain {
    public static void main(String[] args) {
        System.out.println(TeenNumberCheckerSolution.hasTeen(9, 99, 19));
        System.out.println(TeenNumberCheckerSolution.hasTeen(23, 15, 42));
        System.out.println(TeenNumberCheckerSolution.hasTeen(22, 23, 34));

        System.out.println(TeenNumberCheckerSolution.isTeen(9));
        System.out.println(TeenNumberCheckerSolution.isTeen(13));
    }
}
