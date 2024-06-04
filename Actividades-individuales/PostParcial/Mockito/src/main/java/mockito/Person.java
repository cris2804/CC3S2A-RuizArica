package mockito;

public class Person {
    private int id;
    private String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public String getFirst() {
        return firstName;
    }
}