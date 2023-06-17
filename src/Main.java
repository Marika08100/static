
public class Main {
    public static void main(String[] args) {
        // írd meg a person osztályt


        // példányosísd 3 szor a persont
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();


        // kérd le a statikus fieldet
        System.out.println(Person.getCount());

        // példányosísd még 1 szer
        Person person4 = new Person();
        // kérd le a statikus fieldet
        System.out.println(Person.getCount());

        // hívd meg a katasztofa metódust
        person1.disaster();
    }
}


