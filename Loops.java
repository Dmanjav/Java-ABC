public class Loops {

    public static void main(String[] args)
    {
        int x = 10;
        // While
        while( x < 20) {
            System.out.print("Value of x : " + x);
            x++;
            System.out.print("\n");
        }

        // For
        for ( int i = 10; i < 20; i += 2 ) {
            System.out.print("Value of i : " + i);
            System.out.print("\n");
        }

        // Do-While
        int y = 10;
        do {
            // System.out.print("Value of y : " + y);
            System.out.println("Estoy sumando 2");
            y += 2;
        } while ( y < 20 );

        // Enhanced For
        int [] numbers = {10, 20, 30, 40, 50};
         for(int i : numbers ) {
            
            System.out.print( i );
            System.out.print(",");
        }
        System.out.print("\n");
    }
    
}