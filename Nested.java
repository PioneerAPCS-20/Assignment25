
import java.util.Scanner;

public class Nested 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Width: ");
        int width = in.nextInt();
        System.out.print("Height: ");
        int height = in.nextInt();

        // height: number of rows
        for(int i = 0; i < height; i++)
        {
            // width: number of values in each row (number of columns)
            for(int j = 0; j < width; j++)
            {
                System.out.print((j + 1) + " ");
            }
            System.out.println();  // done printing row, go to next line
        }



        /************* 
        
        1  2  3  4
        1  2  3  4
        1  2  3  4


        ****************/



        /***********
         
        Numbers on first line: 1-5

        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

         **********/

        System.out.print("Number: ");
        int n = in.nextInt();

        // row
        for(int r = 0; r < n; r++)
        {
            // columns
            for(int c = 0; c < n - r; c++)
            {
                System.out.print((c + 1) + " ");
            }
            System.out.println();  // end of row, go to next line
        }


        /*****
         
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         
         */

         // row
        for(int r = 0; r < n; r++)
        {
            // columns
            for(int c = 0; c < r + 1; c++)
            {
                System.out.print((c + 1) + " ");
            }
            System.out.println();  // end of row, go to next line
        }










    }
}
