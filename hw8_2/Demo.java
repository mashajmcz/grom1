package lesson8.hw8_2;

import java.util.Date;

public class Demo {
        public Student createHighestsParent(){
            Student student1 = new Student("Johnny", "Walker",01,null);
            Student student2 = new Student("Ivy", "Briggs",01,null);
            Student[] group01 = {student1, student2};
            Date date = new Date();
            Course course = new Course(date,"Functional Analysis", 50,
                    "mr. Bernstein",group01);
            return student1;
        }
        public Student createLowestChild(){
            

            return new SpecialStudent("Andrew", "Smith", 01, null, 123,
                    "andrew@gmail.com");
    }
}
