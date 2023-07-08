import java.util.Arrays;
public class ergeshov_baistan_hw_3 {
    public static void main(String[] args) {
        double[] numbers = {0.5,0.8,-0.2,0.9,-0.6,-0.1,0.4,-0.8,0.6,-0.3,-0.7,0.2,-0.9,0.7,-0.4};
        double summ = 0;
        int count = 0;
        boolean findLessNumbers = false;
        for (double number: numbers) {
            if(findLessNumbers){
                if(number > 0){
                    summ+=number;
                    count++;
                }
            } else if (number < 0) {
                findLessNumbers = true;
            }
        }
        System.out.println(summ + "/" + count);



        double[] digits = {0.5,0.8,-0.2,0.9,-0.6,-0.1,0.4};
        for (int i = 0; i < digits.length; i++) {
            for (int j = i+1; j < digits.length-1; j++) {
                if(digits[i] > digits[j]){
                    double temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        for (int i = 0; i < digits.length; i++) {
            System.out.println(Arrays.toString(digits));
        }
    }
}