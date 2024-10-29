package org.q19;

public class Course {
    private String name;
    private String code;
    private String startDate;
    private int numberOfStudents;
    private static int count = 0;

    // Default constructor
    public Course() {
        count++;
    }

    // Constructor with parameters
    public Course(String name, String code, String startDate, int numberOfStudents) {
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.numberOfStudents = numberOfStudents;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "[" + code + ", " + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return code.equals(course.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
