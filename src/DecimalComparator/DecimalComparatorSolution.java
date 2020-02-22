package DecimalComparator;

public class DecimalComparatorSolution {
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        float val1 = (float)value1*1000;
        float val2 = (float)value2*1000;

        if((int)val1 == (int)val2){
            return true;
        }
        return false;
    }
}
