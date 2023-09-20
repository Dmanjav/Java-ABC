//To compile the code is javac Name_of_the_class.java
//To run the code is java Name_of_the_class

public class Main {
    //The main method is necessary for the code to run, pretty important MANJA
    public static void main(String[] args) {
        //The print function is actually a bit long but it's okay
        System.out.println("My first Java program!");
        System.out.println("This is a print with the 'println()'");
        System.out.print("This is a print with the 'print()'");
        System.out.print("The difference is the new line char");
        System.out.println();
        System.out.println(5 + 5);

        //Variables
        //I can also declare variables and not assign them a value
        int intNumber = 5;
        float floatNumber = 5.5f;
        String stringText = "This is a string";
        char charText = 'c';
        boolean booleanText = true;

        System.out.println(intNumber);
        System.out.println(floatNumber);
        System.out.println(stringText);
        System.out.println(charText);
        System.out.println(booleanText);

        // The final, it works as "final" or "const" in other languages
        final int finalNumber = 5;
        // finalNumber = 6; //This will throw an error
        /*
        error: cannot assign a value to final variable finalNumber
        finalNumber = 6; //This will throw an error
        */

       System.out.println("Hello " + stringText);
       System.out.println(intNumber + floatNumber);
    }
}