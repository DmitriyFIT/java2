import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Key implements Serializable {

    public Key() {
    }

    public Key(int studentId, int courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "course_id")
    private int courseId;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key key)) return false;
        return studentId == key.studentId && courseId == key.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, courseId);
    }
}
