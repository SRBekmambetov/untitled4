import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static final Random random = new Random();
    private static int max;
    private static int min;

    private static int randomInRange(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    private static void print (int x, int z) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int tmp;
        for (int i = 0; i < x; i++) {
            tmp = randomInRange(100, 1000);
            sum1 = sum1 + tmp;
            if (i < z) {
                sum2 = sum2 + tmp;
            } else {
                sum3 = sum3 + tmp;
            }
        }
        int avg1 = sum1 / x;
        int avg2 = sum2 / z;
        int avg3 = sum3 / (x - z);
        System.out.println("Среднее значение первоначального списка сотрудников avg1 = " + avg1);
        System.out.println("Среднее значение переведенных сотрудников avg2 = " + avg2);
        System.out.println("Среднее значение оставшихся сотрудников avg3 = " + avg3);
    }

    public static void main(String[] args) {
        print(randomInRange(7, 20), randomInRange(2, 5));
    }
}
