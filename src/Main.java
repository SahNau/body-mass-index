public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float BodyMass = service.calculate(65.3f,177);
        System.out.println(BodyMass);
    }
}
