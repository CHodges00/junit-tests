import java.util.ArrayList;


public class Student {
    String name;
    long id;
    ArrayList<Integer> grades;



    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }



    public String getName() {
        return name;
    }



    public long getId() {
        return id;
    }



    public ArrayList<Integer> getGrades() {
        return grades;
    }



    public void addGrade(int grade){
        this.grades.add(grade);
    }



    public double getAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }


    public void updateGrade(int grade, int index){
        this.grades.set(index, grade);
    }



    public void deleteGrade(int index){
        this.grades.remove(index);
    }

}
