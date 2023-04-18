import java.util.Random;

public class BogoSort {
    private static Random rand = new Random();

    public static void bogoSort(int[] arr) {
        while(!isSorted(arr)) {
           shuffle(arr);
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i=1; i< arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    private static void shuffle(int[] arr) {
        for (int i = arr.length -1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
