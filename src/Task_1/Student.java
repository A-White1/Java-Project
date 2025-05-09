package Task_1;

public class Student implements Comparable <Student> {

    String StudentID;

    public Student(String studentID) {
        StudentID = studentID;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    //Constructor and Getters/Setters

    @Override
    public String toString() {
        return StudentID;
    }

    @Override
    public int compareTo(Student i) {
        return this.getStudentID().compareTo(i.getStudentID());
    }
}
