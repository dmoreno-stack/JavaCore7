package homework_for_lesson11b;

public class Manager extends Person {
    private int kpi;

    public Manager(String name, String lastName, String ocupation, int yearExperience, int kpi) {
        super(name, lastName, ocupation, yearExperience);
        this.kpi = kpi;
    }

    public int getKpi() {
        return kpi;
    }

    public void setKpi(int kpi) {
        this.kpi = kpi;
    }
}
