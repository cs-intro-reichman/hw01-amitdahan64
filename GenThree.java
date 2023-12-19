/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
    public static void main(String[] args) {

        /* Checking and storing min, max and range values
         creating numbers array for later use. */
        int min = Math.min(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        int max = Math.max(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        int range = max-min +1;
        int[] numbers = new int[3];
        
        // Printing 3 random numbers and storing them in numbers array
        for(int i = 0; i < 3; i++) {
            int random = (int)((Math.random() * range ) + min);
            System.out.println(random);
            numbers[i] = random;
        }

        // Finding the lowest number and printing it
        int lowest = Math.min(numbers[0], numbers[1]);
        lowest = Math.min(lowest, numbers[2]);
        System.out.println("The minimal generated number was " + lowest);
        



    }
}
