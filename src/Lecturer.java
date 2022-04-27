import java.util.ArrayList;

public class Lecturer extends Person{
    private ArrayList taughtCourses;

    public Lecturer(ArrayList taughtCourses) {
        super();
        this.taughtCourses = taughtCourses;
    }

 public void gradeStudent(Course course, Student student, Double grade){ //Is this method correct
        student.receiveGrade(course, grade);
 }

}