package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

        // Create course objects

        // String courseName, String season, int numOfStudents, int avgScore
        Course javaCourseEn = new Course("Eng_Java", "Autumn", 75, 98);
        Course javaCourseTr = new Course("Tr_Java", "Winter", 115, 97);
        Course dataSciCourseEn = new Course("Eng_DataScience", "Spring", 95, 94);
        Course dataSciCourseTr = new Course("Tr_DataScience", "Summer", 135, 92);

        System.out.println("javaCourseEn = " + javaCourseEn);


        // What's the pre-requisite to use Lambda expressions?
        // Collections (List)

        List<Course> courseList = new ArrayList<>();
        courseList.add(javaCourseEn);
        courseList.add(javaCourseTr);
        courseList.add(dataSciCourseTr);
        courseList.add(dataSciCourseEn);

        System.out.println("courseList = " + courseList);

        /*
        [{courseName='Eng_Java', season='Autumn', numOfStudents=75, avgScore=98},
         {courseName='Tr_Java', season='Winter', numOfStudents=115, avgScore=97},
         {courseName='Tr_DataScience', season='Summer', numOfStudents=135, avgScore=92},
         {courseName='Eng_DataScience', season='Spring', numOfStudents=95, avgScore=94}]
         */

        // Check if all avgScore is greater than 90
        boolean checkAvgScore = courseList.stream().allMatch(t-> t.getAvgScore() > 90);
        System.out.println("Is AvgScore is greater than 90? " + checkAvgScore); // true


        // Check if all courses have more than 100 students
        boolean checkNumOfSt = courseList.stream().allMatch(t-> t.getNumOfStudents() > 100);

        System.out.println("Is NumOfSt more than 100?  " + checkNumOfSt);// false


        // Check if any course name contains 'En'
        System.out.println(courseList.stream().anyMatch(t -> t.getCourseName().contains("En")));  // true

        // Check that no course should have "Fall"
        System.out.println(courseList.stream().noneMatch(t -> t.getSeason().contains("Fall"))); // true


        /*
        [{courseName='Eng_Java', season='Autumn', numOfStudents=75, avgScore=98},
         {courseName='Tr_Java', season='Winter', numOfStudents=115, avgScore=97},
         {courseName='Tr_DataScience', season='Summer', numOfStudents=135, avgScore=92},
         {courseName='Eng_DataScience', season='Spring', numOfStudents=95, avgScore=94}]
         */

        // Print the name of the course which has the highest avg score
        System.out.println(courseList.stream().max(Comparator.comparing(Course::getAvgScore)).get()); // {courseName='Eng_Java', season='Autumn', numOfStudents=75, avgScore=98}

        System.out.println(courseList.stream().max(Comparator.comparing(Course::getAvgScore)).get().getCourseName()); // Eng_Java


        // Sort all the objects by avgScore and then put them in ascending order
        List<Course> sortedObjectList = courseList.
                                    stream().
                                    sorted(Comparator.comparing(Course::getAvgScore)).
                                    //skip(2).
                                    // limit(1).
                                    toList();
        System.out.println(sortedObjectList);

        /*
        [{courseName='Tr_DataScience', season='Summer', numOfStudents=135, avgScore=92},
        {courseName='Eng_DataScience', season='Spring', numOfStudents=95, avgScore=94},
        {courseName='Tr_Java', season='Winter', numOfStudents=115, avgScore=97},
        {courseName='Eng_Java', season='Autumn', numOfStudents=75, avgScore=98}]

         */

        // Count number of courses that have "Tr"
       long numOfTrCourses =  courseList.stream().filter(t-> t.getCourseName().contains("Tr")).count();

        System.out.println("numOfTrCourses = " + numOfTrCourses); // 2


        // allMatch(), anyMatch() etc. are terminal functions which means we can use them at the end of expressions.
        // filter(), sorted() etc. are intermediate functions. They must be followed by terminal functions e.e. get() , count(). collect() etc.
    }
}
