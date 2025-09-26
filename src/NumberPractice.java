public class NumberPractice {
    public static void main(String args[]) {

        // Create a float with a negative value and assign it to a variable
        float negativeFloatVal = -5.75f;
        System.out.println(negativeFloatVal);
        
        // Create an int with a positive value and assign it to a variable
        int positiveIntVal = 88;
        System.out.println(positiveIntVal);
        
        // Use the modulo % operator to find the remainder when the int is divided by 3
        int divisibleByThree = positiveIntVal % 3;
        System.out.println(divisibleByThree);
        
        // Use the modulo % operator to determine whether the number is even
        // (A number is even if it has a remainder of zero when divided by 2)
        // Use an if-else to print "Even" if the number is even and "Odd"
        // if the number is odd.
        int[] numsArray = {1, 2, 3, 4, 5, 6};
        evenOrOdd(numsArray);
        
        int numOne = 9; 
        int numTwo = 4;
        int dividedNumber = divideNumber(numOne, numTwo);
        System.out.println(dividedNumber);
    }

    public static void evenOrOdd(int[] numsArray) {
        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray[i] % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
    
    // Divide the number by another number using integer division
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */
    public static int divideNumber(int numOne, int numTwo) {
        if (numOne == 0 || numTwo == 0) {
            return 0;
        }
        int result = numOne / numTwo;
        return result;
    }
}