package Task_1;

import java.util.Arrays;

public class StudentSupportOffice {

    public static void main(String[] args) {

        /** Creates 3 modules and 5 students */

        Student[] array = new Student[5];
        array[0] = new Student("U0000001");
        array[1] = new Student("U0000004");

        Student[] array1 = new Student[5];
        array1[0] = new Student("U0000001");
        array1[1] = new Student("U0000003");
        array1[2] = new Student("U0000005");

        Student[] array2 = new Student[5];
        array2[0] = new Student("U0000003");
        array2[1] = new Student("U0000004");
        array2[2] = new Student("U0000005");

        Module CIS2344 = new Module("CIS2344", 2, array);
        Module CIS2360 = new Module("CIS2360", 3,array1 );
        Module CIM2130 = new Module("CIM2130", 3,array2 );


        /** Enroll students */

        String[] newEnrollees1 = new String[3];
        newEnrollees1[0] = "U0000002";
        newEnrollees1[1] = "U0000003";
        newEnrollees1[2] = "U0000005";
        Student[] newClassList1 = CIS2344.Enroll(CIS2344, 2, 3, newEnrollees1);

        CIS2344.setClassList(newClassList1);
        CIS2344.setSize(newClassList1.length);

        String[] newEnrollees2 = new String[1];
        newEnrollees2[0] = "U0000002";
        Student[] newClassList2 = CIS2360.Enroll(CIS2360, 3, 1, newEnrollees2);

        CIS2360.setClassList(newClassList2);
        CIS2360.setSize(newClassList2.length);

        String[] newEnrollees3 = new String[1];
        newEnrollees3[0] = "U0000001";
        Student[] newClassList3 = CIM2130.Enroll(CIM2130, 3, 1, newEnrollees3);

        CIM2130.setClassList(newClassList3);
        CIM2130.setSize(newClassList3.length);

        /** UnEnroll students */

        String[] newUnEnrollees1 = new String[1];
        newUnEnrollees1[0] = "U0000003";
        Student[] newClassList4 = CIS2360.UnEnroll(CIS2360, 4, 1, newUnEnrollees1);

        CIS2360.setClassList(newClassList4);
        CIS2360.setSize(newClassList4.length);

        String[] newUnEnrollees2 = new String[1];
        newUnEnrollees2[0] = "U0000005";
        Student[] newClassList5 = CIM2130.UnEnroll(CIM2130, 4, 1, newUnEnrollees2);

        CIM2130.setClassList(newClassList5);
        CIM2130.setSize(newClassList5.length);

        System.out.println(CIS2344.getModuleID() + Arrays.toString(CIS2344.classList));
        System.out.println(CIS2360.getModuleID() + Arrays.toString(CIS2360.classList));
        System.out.println(CIM2130.getModuleID() + Arrays.toString(CIM2130.classList));
    }
}
