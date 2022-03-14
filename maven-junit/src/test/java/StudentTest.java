import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {



        Student Tom = new Student();
        Tom.setId(45678);
        System.out.println("Tom.getId() = " + Tom.getId());
        Tom.setName("Tom");
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
