package homework03;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return  "[ " + name + ", age = " + age + ", salary = " + salary + " ]";
    }
}
