import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void studentTest() {
        Student Me = new Student("Cody", 7890765);
        assertEquals("Cody", Me.getName());
        assertEquals(7890765, Me.getId());
    }

    @Test
    public void gradesTest() {
        Student Me = new Student("Cody", 7890765);
        Me.addGrade(80);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(80);
        assertEquals(Me.getGrades(), grades);
    }

    @Test
    public void averageTest() {
        Student Me = new Student("Cody", 7890765);
        Me.addGrade(80);
        Me.addGrade(100);
        assertEquals(Me.getAverage(), 90, 0);
    }

    @Test
    public void updateGradeTest(){
        Student Me = new Student("Cody", 7890765);
        Me.addGrade(78);
        Me.addGrade(65);
        Me.updateGrade(65, 1);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(78);
        grades.add(65);
        assertEquals(grades, Me.getGrades());
    }

    @Test
    public void deleteGradeTest() {
        Student Me = new Student("Cody", 7890765);
        Me.addGrade(80);
        Me.addGrade(90);
        Me.deleteGrade(1);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(80);
        assertEquals(grades, Me.getGrades());
    }
}
