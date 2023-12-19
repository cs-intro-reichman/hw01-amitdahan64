/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
    public static void main(String[] args) {

        //Storing the triangle's sides values
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isTriangle = false;

        /* Checking if the sides can form a triangle according
        to the Triangle Inequality Theorem */
        if(a+b>c) {

            if(a+c>b) {

                if(c+b>a) {

                    isTriangle = true;
                }
            }
        }

        System.out.println(a + ", " + b + ", " + c + ": " + isTriangle);
    }
    
}
