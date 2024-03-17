package homework03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestEmployeeComparator {
    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("Bob", 21, 35000));
        arrayList.add(new Employee("Carl", 20, 38000));
        arrayList.add(new Employee("John", 23, 34000));
        arrayList.add(new Employee("Gale", 22, 31000));
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println();

        arrayList.sort(new EmployeeSalaryComparator());
        System.out.println(arrayList);
    }
}
