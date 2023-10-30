package Teacher;

import java.util.Comparator;

public class teacherComparator<T extends Teacher> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {

        return o1.getfirstName().length() - o2.getfirstName().length();
    }
}
