package day30customexceptions;

public class InvalidStudentGradeException extends Exception{
    // by establishing this inheritance, we ensure that this class thta we are
    // creating serves as exception class

    public InvalidStudentGradeException(String message){ // parameterised constructor
        super(message);

    }
}
