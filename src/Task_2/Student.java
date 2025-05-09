package Task_2;

public class Student {

    private String studentID;
    private float avgStudentGrade;

    public Student(String studentID) {
        this.studentID = studentID;

    }
    //Constructor

    //Setter
    public void setAvgStudentGrade(float avgStudentGrade) {
        this.avgStudentGrade = avgStudentGrade;
    }

    //Defining output

    @Override
    public String toString() {
        if (!Float.isNaN(avgStudentGrade)){
            return "StudentID: " + this.studentID + '|'  + "Average Student Grade is " + (avgStudentGrade) + "%" + '\'';
        }
        else{
            return "These are no grades available for this student";
        }
    }
}
