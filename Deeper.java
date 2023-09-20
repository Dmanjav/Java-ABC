public class Deeper {
    public static void main(String[] args) {
        int miEntero = 9;
        double miDouble = miEntero; //Esto es un casting implicito

        System.out.println(miEntero);
        System.out.println(miDouble);       

        double miDouble2 = 9.78d;
        int miEntero2 = (int) miDouble2; //Esto es un casting explicito

        System.out.println(miDouble2);
        System.out.println(miEntero2);

        //Manipulación de strings
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //Lower and Upper case
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //Finding a character in a string
        //Java does count too from 0
        System.out.println(txt.indexOf("K"));

        //Special Characters
        // \' = single quote
        // \" = double quote
        // \\ = backslash
        // \n = new line
        // \r = carriage return
        // \t = tab
        // \b = backspace
        // \f = form feed
        String txt2 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt2);
    }
}