import java.util.ArrayList;

public class Student {

    long id;
    String name;
    ArrayList<Integer> Grades = new ArrayList<>();

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }



    // returns the student's id
    public long getId(){
        return id;
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
