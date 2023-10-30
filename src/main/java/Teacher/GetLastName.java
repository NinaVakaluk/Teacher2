package Teacher;

public class GetLastName extends Teacher {
    public GetLastName(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public String getLastName() {
        return lastName;
    }
}

