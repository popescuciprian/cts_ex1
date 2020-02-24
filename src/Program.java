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
        ((Human)runner).setAge(20);
        System.out.println(runner);
        System.out.println(runner.getSpeed());
    }
}
