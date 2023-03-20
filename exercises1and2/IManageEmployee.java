package exercises1and2;

import java.util.List;

public interface IManageEmployee {
    List<Employee> getAll();
    int count();
    void addAll(List<Employee> employees);
    void add(Employee employee);
}
