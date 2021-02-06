import java.util.Scanner;
public class Cabrera_cubeDemo {
    public static void main(String[]Args)
   {
       int price_of_goldcube, price_of_silvercube, length_of_container, width_of_container;
       int height_of_container, length_of_each_cube, number_of_gold_cubes, number_of_silver_cubes;
       Scanner keyboard = new Scanner(System.in);
       Cabrera_cubes method = new Cabrera_cubes();
       
       System.out.print("Price of each gold cube = ");
       price_of_goldcube = keyboard.nextInt();
       
       System.out.print("Price of each silver cube = ");
       price_of_silvercube = keyboard.nextInt();
       
       System.out.print("Length of container = ");
       length_of_container = keyboard.nextInt();
       
       System.out.print("Width of container = ");
       width_of_container = keyboard.nextInt();
       
       System.out.print("Height of container = ");
       height_of_container = keyboard.nextInt();
       
       System.out.print("Length of each cube  = ");
       length_of_each_cube = keyboard.nextInt();
       
       System.out.print("Number of gold cubes available  = ");
       number_of_gold_cubes = keyboard.nextInt();
       
       System.out.print("Number of silver cubes available = ");
       number_of_silver_cubes = keyboard.nextInt();
       
       int cubenumlength, cubenumwidth, cubenumheight, maxnumcubes;
       
      cubenumlength = method.cubenumlength(length_of_container,length_of_each_cube );
      
      cubenumwidth = method.cubenumwidth(width_of_container, length_of_each_cube);
      
      cubenumheight = method.cubenumheight(height_of_container, length_of_each_cube);
      
      maxnumcubes = method.maxnumofcubes(cubenumwidth, cubenumheight, cubenumlength);
      
      System.out.println("Maximum price of the total cubes that can be placed in the container = " + (maxnumcubes * price_of_goldcube));
   }
    
}
