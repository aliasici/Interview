package HasanKayman;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentList {
    public static void main(String[] args) throws InterruptedException {
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();
        Students student4 = new Students();
        Students student5 = new Students();
        Students student6 = new Students();

        student1.setStudentInfo("Hasan", 111, 9, "Male", "Ali Sen", 3.45);
        student2.setStudentInfo("Ayse", 115, 10, "Female", "Saadet Oz", 3.82); // 2
        student3.setStudentInfo("Ali", 119, 10, "Male", "Ali Sen", 3.56); // 3
        student4.setStudentInfo("Fatma", 123, 10, "Female", "Saadet Oz", 3.99); // 1
        student5.setStudentInfo("Osman", 127, 9, "Male", "Ali Sen", 3.40);
        student6.setStudentInfo("Nesibe", 131, 9, "Female", "Saadet Oz", 3.01);


        ArrayList<Students> studentlist = new ArrayList<>();
        studentlist.addAll(Arrays.asList(student1, student2, student3, student4, student5, student6));

        //number of female students who have gpa higher than 3.20 or male students who have gpa higher than 3.50

        /*studentlist.removeIf(p -> !((p.gpa > 3.20 && p.gender.equals("Female")) || (p.gpa > 3.50 && p.gender.equals("Male"))));  // false && true ==> false
        System.out.println(studentlist.size());*/

        // Name of Student who has highest gpa

        Double max = Double.MIN_VALUE;

        for (Students eachstudent : studentlist) {
            if (eachstudent.gpa > max) {
                max = eachstudent.gpa;
            }
        } //max = 3.99

        System.out.println(max);

        for (Students eachstudent : studentlist) {
            if (max == eachstudent.gpa) {
                System.out.println(eachstudent.name + " " + eachstudent.gpa);
            }

        }

        // Fatma 3.99

        for (Students eachstudent : studentlist) {
            eachstudent.printStudentInfo();
            eachstudent.doHomework();
            eachstudent.eatLunch("Standard menu");
        }

        student2.doHomework();
        System.out.println("========Lunch Menu=================");
        student1.eatLunch("haslama");
        student2.eatLunch("kuru fasulye ve pilav");

        System.out.println("****************************************");

        student1.countDown();


    }
}





