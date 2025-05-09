package Task_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Module {
    String moduleID;
    int size;
    Student[] classList;

    //Constructor
    public Module(String moduleID, int size, Student[] classList) {
        this.moduleID = moduleID;
        this.size = size;
        this.classList = classList;
    }

    //Public integers

    public int x = 0;
    public int z = 0;

    //Getters and Setters

    public String getModuleID() {
        return moduleID;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Student[] getClassList() {
        return classList;
    }

    public void setClassList(Student[] classList) {
        this.classList = classList;
    }

    //Enrolls Students

    public Student[] Enroll(Module inmod, int inSize, int outSize, String[] outData){
        Student[] InClass = inmod.getClassList();

        Student[] newArray = new Student[inSize + outSize]; //Sets array size to fit the number of students

        for (int i = 0; i < inSize; i++) {
            String inCls = InClass[i].toString();
            if (!Arrays.asList(outData).contains(inCls)){

                newArray[x] = new Student(inCls);
                x++;
            }
        }

        for(int y = 0; y < outSize; y++){
            String newData = outData[y];
            newArray[x] = new Student(newData);
            x++;
        }
        swap(newArray);
        System.out.println("Enrolled: " + Arrays.toString(newArray));

        return newArray;
    }

    //Unenrolls Students

    public Student[] UnEnroll(Module inmod, int inSize, int outSize, String[] outData){
        Student[] InClass = inmod.getClassList();

        Student[] newArray = new Student[inSize - outSize];

        for (int i = 0; i < inSize; i++) {    //Goes through the list
            String inCls = InClass[i].toString();
            if (!Arrays.asList(outData).contains(inCls)){
                newArray[z] = new Student(inCls);
                z++;
            }
        }

        swap(newArray);
        System.out.println("UnEnrolled: " +Arrays.toString(newArray));

        return newArray;
    }

    //Sorts the array

    public void swap(Student[] array){
        for(int i = 0; i < array.length -1 ; i++){
            for (int j = 0; j < array.length-i-1; j++){
                if(array[j].compareTo(array[j + 1]) > 0){
                    Student tempNum = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempNum;
                }
            }
        }
    }

    //Defining the output

    @Override
    public String toString() {
        return "Module" +
                moduleID + '\'' +
                size + '\'' +
                Arrays.toString(classList) + '\'';
    }


}
