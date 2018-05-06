package lesson8.hw8_2;

public class Demo {
        public Student createHighestsParent(String firstName,
                                            String lastName, int group,
                                            Course[] coursesTaken){
            Student student = new Student(firstName, lastName,group,coursesTaken);
          return student;
        }
        public Student createLowestChild(String firstName, String lastName, int group,
                                         Course[] coursesTaken, long secretKey, String email){
            return new SpecialStudent(firstName, lastName, group, coursesTaken,secretKey,email);
    }
}
