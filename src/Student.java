import java.util.ArrayList;
import java.util.List;

//Understands student
public class Student extends Person{
    private String major;
    private String status;
    private ArrayList chosenCourses;
    public ArrayList attendedLectures;

    public Student(String major, String status, ArrayList chosenCourses, ArrayList attendedLectures) {
        this.major = major;
        this.status = status;
        this.chosenCourses = chosenCourses;
        this.attendedLectures = attendedLectures;
    }

    public void attendLecture(Lecture lecture) {
        attendedLectures.add(lecture);
    }
}
