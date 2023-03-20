package exercises1and2;

import java.util.Set;

public class ProductManager extends Employee{

    private int clients;

    public ProductManager(String name, int employeeId, int age, Set<Skill> skills, int clients) {
        super(name, employeeId, age, Set.of(Skill.WORKETHIC, Skill.LEADERSHIP, Skill.COMMUNICATION));
        this.clients = clients;
    }

    public int getClients() {
        return clients;
    }

    @Override
    public String role() {
        return "Product Manager";
    }

    @Override
    public boolean leave(Project project){
        if (projects.size() < 2)
            return false;
        return super.leave(project);
    }

}
