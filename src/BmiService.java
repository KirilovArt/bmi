import java.util.concurrent.atomic.AtomicInteger;

public class BmiService {
    public int calculate(int weight, int height) {
        int index = weight * 10000;
        int bmi = index / (height * height);
        return bmi;

    }
}