package Teacher;

public class GetAge extends Teacher{
    public GetAge(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public int getAgeTeacher() {
        return age;
    }

}

