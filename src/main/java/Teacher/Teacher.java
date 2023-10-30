package Teacher;

public class Teacher {
    protected String firstName;
    protected String lastName;
    protected int age;


    public Teacher(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    public Teacher() {

    }
    public String getfirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    /*public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }*/


    @Override
    public String toString() {
        return "Teacher: " +
                "Name = " + firstName + '\'' +
                ", Surname = " + lastName + '\'' +
                ", age: " + age;

    }


}