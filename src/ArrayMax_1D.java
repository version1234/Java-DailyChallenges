import java.util.Arrays;

public class ArrayMax_1D {
    public static void main(String[] args) {
        double[] maxArray = new double[]{3.6, 2.7, 4.8, 9.5, 7.3, 8, 9.6};
        // System.out.println(Arrays.stream(maxArray).max());

        double maxValue = getMaxOfArray(maxArray);
        System.out.println("Max Value is: " + maxValue);

    }

    public static double getMaxOfArray(double[] list) {
        double maxValue = 0.0;

        if (list == null || list.length == 0) {
            return  maxValue;
        } else {
            for (int i = 0; i < list.length; i++) {
                if (maxValue < list[i]) {
                    maxValue = list[i];
                } else{
                    // Do nothing
                }

            }
        }
        return maxValue;
    }

}
