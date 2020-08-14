package HasanKayman;

public class Students {
    String name;
    int number;
    int grade;
    String gender;
    String teacherName;
    double gpa;

    public void setStudentInfo(String name, int number, int grade, String gender, String teacherName,double gpa) {
        this.name = name;
        this.number = number;
        this.grade = grade;
        this.gender = gender;
        this.teacherName = teacherName;
        this.gpa = gpa;
    }
    public void printStudentInfo() {
        System.out.println("Student Name: " + name + " Student Number: " + number + " Student Grade: "
                + grade + " Teacher Name: " + teacherName + "GPA: " + gpa);
    }
    public void doHomework() {
        if(gender.equals("Male")) {
            System.out.println(name + " is doing his homework");
        } else {
            System.out.println(name + " is doing her homework");
        }
    }

    public void eatLunch(String menu) {

        System.out.println(name + " is eating " + menu + ".");
    }

    public void countDown() throws InterruptedException {
        System.out.print(name + " is counting down");
        Thread.sleep(500);
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.print(" ");
        for (int i = grade; i >= 0; i--) {
            System.out.print(i + " ");
            Thread.sleep(500);
        }
        System.out.println();

        // hasan is counting down... 9 8 7 6 5 4 3 2 1 0
    }



}
