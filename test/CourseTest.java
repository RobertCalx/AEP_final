import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CourseTest {
    ArrayList studentsInCourse= new ArrayList();
    private HashMap grades = new HashMap();
    @Test
    public void numberOfStudentsInCourseTest(){
        Course aep = new Course("aep", studentsInCourse);
        ArrayList chosenCourses = new ArrayList<>();
        chosenCourses.add(aep);
        Student Jan = new Student("BusinessInformatics", Status.VISITINGSTUDENTRESEARCHER,chosenCourses,null, grades );
        Student Robert = new Student("BusinessInformatics", Status.VISITINGSTUDENTRESEARCHER,chosenCourses,null, grades );
        Student Rae = new Student("BusinessInformatics", Status.FULLTIME,chosenCourses,null, grades );
        aep.addStudentsToCourse(Jan);
        aep.addStudentsToCourse(Robert);
        aep.addStudentsToCourse(Rae);

        assertEquals(3, aep.numberOfStudentsInCourse());
    }
}
