
public class Person {
    private static int count;

    public Person() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void disaster() {
        System.out.println("Katasztrofa! ");
    }
}

