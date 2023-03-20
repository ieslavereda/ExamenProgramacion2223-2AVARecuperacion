package exercises1and2;

import java.util.Set;

public class ScrumMaster extends Employee{
    private int experience;

    public ScrumMaster(String name, int employeeId, int age, Set<Skill> skills, int experience) {
        super(name, employeeId, age, Set.of(Skill.LEADERSHIP, Skill.COMMUNICATION, Skill.CRITICALTHINKING));
        this.experience = experience;
    }

    @Override
    public String role() {
        return "Scrum Master";
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean assign(Project project){
        if (projects.size() > 0)
            return false;
        return projects.add(project);
    }

}
