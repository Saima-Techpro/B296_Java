package day34lambda;

public class Course {
    /*
    POJO => Plain Old Java Object

     A class that contains
        1) private variables (encapsulation)
        2) parameterized and non-parameterized constructors
        3) getters -To access private variables-
        4) setters -To modify private variables-
        5) toString() method -To return the content of the object in a readable format-

        is called a POJO class.

        courseName, numOfStudents, season, avgScore

     */
    private String courseName;
    private String season;
    private int numOfStudents;
    private int avgScore;

    public Course() {
    }

    public Course(String courseName, String season, int numOfStudents, int avgScore) {
        this.courseName = courseName;
        this.season = season;
        this.numOfStudents = numOfStudents;
        this.avgScore = avgScore;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }


    @Override
    public String toString() {
        return "{" +
                "courseName='" + courseName + '\'' +
                ", season='" + season + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", avgScore=" + avgScore +
                '}';
    }
}
