package Teacher;

public class GetFirstName extends Teacher{
    public GetFirstName(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    public String getFirstName() {
        return firstName;
    }
}

