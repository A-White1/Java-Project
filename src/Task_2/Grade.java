package Task_2;

public class Grade {

    Student student;
    float studentScore;
    Module module;

    public Grade(Student student, float studentScore, Module module) {
        this.student = student;
        this.studentScore = studentScore;
        this.module = module;
    }
    //Constructor

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(float studentScore) {
        this.studentScore = studentScore;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
    //Setter and Getters
}
