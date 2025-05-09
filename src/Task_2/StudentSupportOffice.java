package Task_2;

import java.util.ArrayList;

public class StudentSupportOffice {

    public static void main(String[] args) {

    ArrayList<Grade> Grades = new ArrayList<>();

    Student stu_1 = new Student("U0000001 ");
    Student stu_2 = new Student("U0000002 ");
    Student stu_3 = new Student("U0000003 ");

    Module mod_1 = new Module("CIM2130 ");
    Module mod_2 = new Module("CIS2360 ");
    Module mod_3 = new Module("CIS2144 ");

    insertModGrade(Grades, mod_1, stu_1, 100);
    insertModGrade(Grades, mod_2, stu_1, 100);
    insertModGrade(Grades, mod_3, stu_1, 100);

    insertModGrade(Grades, mod_1, stu_2, 100);
    insertModGrade(Grades, mod_2, stu_2, 100);
    insertModGrade(Grades, mod_3, stu_2, 100);

    insertModGrade(Grades, mod_1, stu_3, 100);
    insertModGrade(Grades, mod_2, stu_3, 100);
    insertModGrade(Grades, mod_3, stu_3, 100);

    updateModGrade(Grades, mod_1, stu_1, 75);

    System.out.println(stu_1.toString());
    System.out.println(stu_2.toString());
    System.out.println(stu_3.toString());
    System.out.println(mod_1.toString());
    System.out.println(mod_2.toString());
    System.out.println(mod_3.toString());

    deleteGrade(Grades, mod_1, stu_2);
    deleteGrade(Grades, mod_2, stu_2);
    deleteGrade(Grades, mod_3, stu_2);

    System.out.println(stu_2.toString());

    }

    //listFlag is used to check if the list has a student and module before inserting a new one.

    public static boolean listFlag(ArrayList<Grade> Grades, Module module, Student student){
        for (Grade grade : Grades) {
            if (grade.getStudent() == student && grade.getModule() == module) {
                return true;
            }
        }
        return false;
    }

    //Inserts new module and grade

    public static void insertModGrade(ArrayList<Grade> Grades, Module module, Student student, float studentScore){
        if(!listFlag(Grades,module,student)){ // If the list doesn't contain a module and student
            Grade newGrade = new Grade(student, studentScore, module);
            Grades.add(newGrade); //Creates a new student and module and adds it to the list
            studentAverage(Grades, student); // Update student and module average score
            moduleAverage(Grades, module);

        }
    }

    //Updates the grades

    public static void updateModGrade(ArrayList<Grade> Grades, Module module, Student student, float newStudentScore){
        for (Grade grade : Grades) {
            if (grade.getStudent() == student && grade.getModule() == module) {
                grade.setStudentScore(newStudentScore);
            }
        }
        studentAverage(Grades, student); // Update student and module average score
        moduleAverage(Grades, module);
    }

    //Deletes the grades

    public static void deleteGrade(ArrayList<Grade> Grades, Module module, Student student){
        for(int z = 0; z < Grades.size(); z++){
            if(Grades.get(z).getStudent() == student && Grades.get(z).getModule() == module){
                Grades.remove(z); //removes grades if there is a mo
            }
        }
        studentAverage(Grades, student);
        moduleAverage(Grades, module);
    }

    //Gets an average for the grade

    public static void moduleAverage(ArrayList<Grade> Grades, Module module){
        float newScore = 0;
        int i = 0;
        for (Grade grade : Grades) {
            if (grade.getModule() == module) {
                newScore = newScore + grade.getStudentScore();
                i++;
            }
        }
        float moduleAverage = newScore / i;
        module.setAvgModuleGrade(moduleAverage);
    }

    //Gets an average for the students

    public static void studentAverage(ArrayList<Grade> Grades, Student student){
        int i = 0; // counter for incrementing for the amount of modules the student is in
        float newScore = 0; //holding new score
        for (Grade grade : Grades) {
            if (grade.getStudent() == student) {
                newScore = newScore + grade.getStudentScore();
                i++;
            }
        }
        float studentAverage = newScore /i;
        student.setAvgStudentGrade(studentAverage);
    }
}
