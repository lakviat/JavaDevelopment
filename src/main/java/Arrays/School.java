package Arrays;

import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;

public class School {
    private String name;
    private List<String> courses;
    private int totalStudents;
    private String location;


    public void setBody(String name, String location) {
        this.location = location;
        this.name = name;

    }

    public School() {
        this.courses = new ArrayList();
    }

    public void setTotalStudents(int totalStudents) {
        if (totalStudents < 0) {
            System.out.println("Invalid total students data");
        } else {
            this.totalStudents = totalStudents;
        }
    }

    public void teach() {
        System.out.println("teaching");
    }

    public void teach(String course) {
        System.out.println("teachign course:  " + course);
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

