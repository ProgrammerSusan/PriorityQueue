/*
 * Susan Hatem
 * 311
 * github.com/ProgrammerSusan/PriorityQueue
 */
package priorityqueue;

public class PriorityQueue {

    public static void main(String[] args) {
    int[] first = {1, 2, 3, 4, 5}, second = {1, 1, 0, 1, 1}, third = {1, 5, 1, 2, 5, 6}, fourth = {1, 2, 2, 3, 2, 2, 17}, fifth = {1, 2, 2, 0, 2, 2, 17, 4};
    int [] sixth = new int[1023], seventh = new int[1023];
    int k = 0;
    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < Math.pow(2,i); j++) {
            sixth[k] = (int) Math.pow(2,i);
            seventh[k] = (int) Math.pow(2,i);
            k++; 
        }
        seventh[500] = 1;
    }
    
    valid(first, 0);
    valid(second, 0);
    valid(third, 0);
    valid(fourth, 0);
    valid(fifth, 0);
    valid(sixth, 0);
    valid(seventh, 0);
    }
    
    public static int isValid(int[] arr, int i) {
        int m = 0;
        if(i < arr.length) {
            if(arr[i] == 0 || (i > 0 && arr[i] < arr[(i - 1) / 2])) {
                System.out.println("Invalid, fails at index " + i);
                return Integer.MAX_VALUE;
            }
                return m = isValid(arr, (2 * i + 1)) + isValid(arr, (2 * i + 2));
        }
        return -1;
    }
    
    public static void valid(int[] arr, int i) {
        if(isValid(arr, i) < 0) {
            System.out.println("Valid");
        }
    }
}
