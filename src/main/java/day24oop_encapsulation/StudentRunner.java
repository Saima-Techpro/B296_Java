package day24oop_encapsulation;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student();

        // We can read all 3 variables through getter methods
        System.out.println(student.getName());  // Henry
        System.out.println(student.getAge());  // 15
        System.out.println(student.isSuccess()); // true


        // update the name variable
        student.setName("Hary");

        // to see the updated value, we need to use get method again

        System.out.println(student.getName()); // Hary


        student.setAge(19);
        student.setSuccess(false);


        System.out.println(student.getAge());  // 19
        System.out.println(student.isSuccess()); // false



        // setters do NOT update the original data. The update happens in the object class

        Student student1 = new Student();
        System.out.println(student1.getName());  // Henry


    }
}
