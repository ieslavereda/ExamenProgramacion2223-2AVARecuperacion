package exercises1and2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Developer extends Employee{

    private List<String> techs;

    public Developer(String name, int employeeId, int age, Set<Skill> skills) {
        super(name, employeeId, age, Set.of(Skill.TEAMWORK, Skill.POSITIVEATTITUDE));
        techs = new ArrayList<>();
    }

    @Override
    public String role() {
        return "developer";
    }

    public List<String> getTechs() {
        return techs;
    }

    public void setTechs(List<String> techs) {
        this.techs = techs;
    }
}
