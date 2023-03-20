package exercises1and2;

import java.util.HashSet;
import java.util.Set;

public abstract class Employee{

    private String name;
    private int employeeId;
    private int age;
    private boolean active;
    private Set<Skill> skills;
    protected Set<Project> projects;

    public Employee(String name, int employeeId, int age, Set<Skill> skills) {
        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
        this.skills = skills;
        this.active = true;
        this.projects = new HashSet<>();
    }


    public boolean assign(Project project) {
        return this.projects.add(project);
    }

    public boolean leave(Project project) {
        return this.projects.remove(project);
    }

    public abstract String role();

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", age=" + age +
                ", active=" + active +
                ", skills=" + skills +
                ", projects=" + projects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId;
    }

}
