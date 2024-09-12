import java.util.ArrayList;

public class Course {
    private String topic;
    private String instructor;
    private ArrayList<Student> enrolledStudent;

    public String getTopic() {
        return topic;
    }

    public String getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudent() {
        return enrolledStudent;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setEnrolledStudent(ArrayList<Student> enrolledStudent) {
        this.enrolledStudent = enrolledStudent;
    }

    public Course(String topic, String instructor, ArrayList enrolledStudent){
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudent = enrolledStudent;
    }
}
