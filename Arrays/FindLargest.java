public class FindLargest {
    public static void main(String[] args) {

        int[] arr = {3, 3, 6, 1};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}
