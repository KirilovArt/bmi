public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 100;
        int height = 173;
        int bmi = service.calculate(weight, height);
        System.out.println( "Индекс массы тела:" + bmi);
    }
}