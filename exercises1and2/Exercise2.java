package exercises1and2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 implements IManageEmployee{

    private List<Employee> employees;

    public Exercise2(){
        employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public int count() {
        return employees.size();
    }

    @Override
    public void addAll(List<Employee> employees) {
        employees.addAll(employees);
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> devsSorted(){
        return employees.stream().
                filter(employee -> (employee instanceof Developer)).
                sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
    }


    public List<Employee> unassignedEmpl(){
        return employees.stream().filter(Employee::isActive).
                filter(employee -> employee.getProjects().size()==0).collect(Collectors.toList());

    }



}
