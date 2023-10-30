package Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        Teacher teachers1 = new Teacher("Ivan", "Petrov", 25);
        Teacher teachers2 = new Teacher("Svetlana", "Ivanova", 34);
        Teacher teachers3 = new Teacher("Nikita", "Korolev", 43);
        Teacher teachers4 = new Teacher("Irina", "Sokolova", 36);


        teachers.add(teachers1);
        teachers.add(teachers2);
        teachers.add(teachers3);
        teachers.add(teachers4);


        teachers.sort(new teacherComparator<Teacher>());
        System.out.println(teachers);

        for (Teacher teach : teachers) {
            System.out.println(teach.getfirstName());
        }

        System.out.println("Added teachers to Teacher Group! ->");
        TeacherGroup list = new TeacherGroup(teachers);
        teacherIterator teacherIterator = list.iterator();
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next());

        }
    }
}

