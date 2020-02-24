public class Program {
    public static void main(String[] args) {
        Runner runner = new Wolf();
        System.out.println(runner);
        runner = new PolarBear();
        System.out.println(runner);
        runner = new Grizzly();
        System.out.println(runner);
        runner = new Human();
        System.out.println(runner);
        runner = new Human(15);
        System.out.println(runner);
    }
}
