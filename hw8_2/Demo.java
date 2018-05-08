package lesson8.hw8_2;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public Student createHighestParent() {
        Student student1 = new Student("Johnny", "Walker", 01, null);
        //Student student2 = new Student("Ivy", "Briggs", 01, null);
        Student[] group01 = {student1};
        Date date = new Date();
        Course course = new Course(date, "Functional Analysis", 50,
                "mr. Bernstein", group01);
        student1.coursesTaken = new Course[]{course};
        return student1;
    }

    public static Student createLowestChild() {

        Student specialStudent = new SpecialStudent("Andrew", "Smith", 2, null, 123,
                "andrew@gmail.com");
        Date date = new Date();
        Student[] group02 = {specialStudent};
        Course course = new Course(date, "Functional Analysis", 50, "mr. Bernstein", group02);

        specialStudent.coursesTaken = new Course[]{course};

        return specialStudent;

    }

 /*   public static void main(String[] args) {
//        Student student = new Student();
        Student student = createLowestChild();
        student.group.name;
        System.out.println(Arrays.toString(student.coursesTaken));
    }**/
}