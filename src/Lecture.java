import java.time.LocalDate;
import java.time.LocalTime;

public class Lecture {
    private LocalTime startTime;
    private LocalDate localDate;
    private Course course;

    public Lecture(LocalTime startTime, LocalDate localDate, Course course) {
        this.startTime = startTime;
        this.localDate = localDate;
        this.course = course;
    }
}
