package lfe.sample.util;

import lfe.sample.model.Employee;
import lfe.sample.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataUtil {
    public static List getPersonList() {
        Person p1 = new Person("Steve", 40, "US");
        Person p2 = new Person("Martin", 50, "Germany");
        Person p3 = new Person("Marco", 20, "Netherlands");

        List personList = new ArrayList();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        return personList;
    }

    public static Map<Integer, Person> getPersonMap() {
        Person steve = new Person("Steve", 40, "US");
        Person martin = new Person("Martin", 50, "Germany");
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, steve);
        personMap.put(2, martin);
        return personMap;
    }

    public static List<Employee> getEmployeeData() {
        Employee employee1 = new Employee("Steve", "Jobs", "US");
        Employee employee2 = new Employee("David", "Thompson", "Dummy");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        return employeeList;
    }
}
