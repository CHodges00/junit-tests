import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;


public class Student {

    long id;
    String name;
    ArrayList<Integer> Grades = new ArrayList<>();

public Student(){
}


//          TODO
//- `id` should be a `long` number used to represent a "unique user" in our application.
    @Test
public void isIdEnteredCorrectly() {
    long id = setId(4567832);
    if (id == 4567832){
        assertTrue("ID quals", true);
    }else {
        fail("ID doesn't qual");
    }
}

@Test
public void isNameEnteredCorrectly(){
    String name = setName("tom");
if (name.equalsIgnoreCase("Tom")){
    assertTrue("Name quals", true);
} else {
    fail("Name doesn't qual");
}
}

@Test
public void doGradesQualify(){
    ArrayList<Integer> grades = new ArrayList<>();
    grades.add(100);
    grades.add(80);
    grades.add(70);
    grades.add(80);
    grades.add(20);
    Grades.add(100);
    Grades.add(80);
    Grades.add(70);
    Grades.add(80);
    Grades.add(20);
    System.out.println(Grades);
    System.out.println(grades);
    if (grades == Grades){
        assertTrue("Grades qual", true);
    }else {
        fail("Grades don't qual");
    }
}



public long setId(long id){
    this.id = id;
    return id;
}
    // returns the student's id
    public long getId(){
        return id;
    }

    public String setName(String name){
    this.name = name;
        return name;
    }
    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        Grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return Grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double average = 0.0;
        int sum = 0;
        for (int grade : Grades){
            sum += grade;
        }
        average = (double) sum / Grades.size();
        return average;
    }
}
