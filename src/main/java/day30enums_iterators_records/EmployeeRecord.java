package day30enums_iterators_records;

public final record EmployeeRecord(String employeeName, int employeeNum){

    /*
                        Notes about RECORDS in Java

       In Java, Records were introduced in Java 14 (Preview) and became a standard feature in
       Java 16. They are a concise way to create classes that are primarily used to hold data.

     - all records are final by default
     - Record object are IMMUTABLE... can't be changed
     - Records don't allow setters (because they are IMMUTABLE)
     - Records can NOT extend to any other class. They extend to Record abstract class by default
     - They implicitly extend to record class (no multiple inheritance in Java). However, you can implement any interface

     - Records allow to create / define static fields but not instance fields
     - Records allow to create non-static and static method



    Canonical Constructor:

   - Records have Canonical Constructor. However, you can create your own constructor as well
   - If you need to do some sort of validation (if statement etc.)

   parameterised constructor (Canonical Constructor)
     public EmployeeRecord(String employeeName, int employeeNum){
        this.employeeName = employeeName;
        this.employeeNum = employeeNum;
    }
     */

    // overriding Canonical Constructor
//    public EmployeeRecord(String employeeName, int employeeNum){
//        if (employeeNum < 0){
//            throw new IllegalArgumentException("Employee number can't be negative");
//        }
//        this.employeeName = employeeName;
//        this.employeeNum = employeeNum;
//    }

    // COMPACT CONSTRUCTOR  - UNIQUE FEATURE OF RECORD
    //it allows to remove the parameters as well as assignment

    public EmployeeRecord{ // COMPACT CONSTRUCTOR
        if (employeeNum < 0){
            throw new IllegalArgumentException("Employee number can't be negative");
        }

    }

   //  public String address; instance variables are not allowed in records
   // because they should be mentioned record constructor


    public static String address; // can create / define static variables in records

    public static final String DEFAULT_EMPLOYEE_ADDRESS  = "London, UK";


    // Can we create methods in records?
    // Yes both static and non-static methods can be created in Java records

    public String nameInUpperCase(){ // non-static

        return employeeName.toUpperCase();
    }


    public static void print(){ // static
        System.out.println("Checking if static methods can be created in Record");
    }


}
