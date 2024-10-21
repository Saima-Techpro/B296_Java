package day27collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set03 {
    public static void main(String[] args) {

        // Interview  question: Store the student emails in natural order
        // Student emails should be unique


        long t1 = System.nanoTime(); // starting moment of TreeSet
        // 1st way: TreeSet because emails should be unique and inserted in NATURAL ORDER
        TreeSet<String> stdEmails = new TreeSet<>();
        stdEmails.add("pq@gmail.com");
        stdEmails.add("ab@gmail.com");
        stdEmails.add("xy@gmail.com");
        stdEmails.add("dgh@gmail.com");
        stdEmails.add("ef@gmail.com");
        stdEmails.add("rs@gmail.com");
        stdEmails.add("lmn@gmail.com");
         //System.out.println("stdEmails = " + stdEmails);  // [ab@gmail.com, dgh@gmail.com, ef@gmail.com, lmn@gmail.com, pq@gmail.com, rs@gmail.com, xy@gmail.com]

        long t2 = System.nanoTime(); // starting moment of HashSet
        // System.out.println("Execution time of TreeSeT: " + (t2 - t1));


        // 2nd way: Use Hashset first for speedy addition and then use TreeSet to put them in Natural Order
        HashSet<String> emailsHS = new HashSet<>();
        emailsHS.add("pq@gmail.com");
        emailsHS.add("ab@gmail.com");
        emailsHS.add("xy@gmail.com");
        emailsHS.add("dgh@gmail.com");
        emailsHS.add("ef@gmail.com");
        emailsHS.add("rs@gmail.com");
        emailsHS.add("lmn@gmail.com");
        // System.out.println("emailsHS = " + emailsHS); // [ab@gmail.com, dgh@gmail.com, pq@gmail.com, xy@gmail.com, lmn@gmail.com, rs@gmail.com, ef@gmail.com]

        long t3 = System.nanoTime(); // ending moment of HashSet

       // now create TreeSet and assign this HashSet to new TreeSet
       TreeSet<String> emailsTS = new TreeSet<>(emailsHS);
       // System.out.println("emailsTS = " + emailsTS); // [ab@gmail.com, dgh@gmail.com, ef@gmail.com, lmn@gmail.com, pq@gmail.com, rs@gmail.com, xy@gmail.com]

        long t4 = System.nanoTime(); // ending moment of HashSet + TreeSet combined




        System.out.println("Execution time of TreeSeT: " + (t2 - t1));
        System.out.println("Execution time of HashSeT: " + (t3 - t2));
        System.out.println("Execution time of HashSeT through TreeSeT: " + (t4 - t2));

    }
}
