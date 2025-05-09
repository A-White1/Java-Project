package Task_2;

public class Module {

    private float avgModuleGrade;
    private String moduleID;

    public Module(String moduleID) {

        this.moduleID = moduleID;
    }

    //Constructor

    //Getters/Setters

    public float getAvgModuleGrade() { return avgModuleGrade; }

    public void setAvgModuleGrade(float avgModuleGrade) {
        this.avgModuleGrade = avgModuleGrade;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    //Defining the output

    @Override
    public String toString() {
        return "ModuleID: " + this.moduleID +'|' +
                "Average Module Grade is " + (avgModuleGrade) + "%" + '\'';
    }
}
