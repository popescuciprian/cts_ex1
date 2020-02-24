public class Human implements Runner {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human() {
        this.age = 0;
    }

    @Override
    public int getSpeed() {
        if (this.age < 50)
                return 10;
        else
            return 7;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }
}
