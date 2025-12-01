
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static int print(int[][] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++){
            for (int a = 0; a < array[i].length; a++){
                temp += array[i][a];
            }
        }
        return temp;
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array[i].length; n++){
                sum += array [i][n];
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] array){
        int sum = sum(array);
        int num = array.length * array[0].length;
        return (double) sum / num;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] array){
        int minimum = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array[i].length; n++){
                if (array[i][n] < minimum){
                    minimum = array[i][n];
                }
            }
        }
        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] array){
        int maximum = 0;
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array[i].length; n++){
                if (array[i][n] > maximum){
                    maximum = array[i][n];
                }
            }
        }
        return maximum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array[i].length; n++){
                if (array[i][n] % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] array){
        int count = 0;
        for (int[] i : array){
            for (int n : i){
                if (n % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array[i].length; n++){
                if (array[i][n] < 0){
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] array){
        int rowSum = 0;
        int[] out = new int[array.length];
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array[i].length; n++){
                rowSum += array[i][n];
            }
            out[i] = rowSum;
            rowSum = 0;
        }
        return out;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] array){
        int[] colSums = new int[array[0].length];
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array[i].length; n++){
                colSums[n] += array[i][n];
            }
        }
        return colSums;
    }

}
