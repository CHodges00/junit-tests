import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {

//          TODO
//        - `id` should be a `long` number used to represent a "unique user" in our application.


        Student Tom = new Student(4567890, "Tom");
        System.out.println("Tom.getId() = " + Tom.getId());
        System.out.println("Tom.getName() = " + Tom.getName());
        System.out.println("Tom.getGrades() = " + Tom.getGrades());
        System.out.println("Tom.getGradeAverage() = " + Tom.getGradeAverage());
        Tom.addGrade(100);
        Tom.addGrade(80);
        Tom.addGrade(70);
        Tom.addGrade(80);
        Tom.addGrade(20);
        System.out.println("Tom.getGrades() = " + Tom.getGrades());
        System.out.println("Tom.getGradeAverage() = " + Tom.getGradeAverage());


    }

}
