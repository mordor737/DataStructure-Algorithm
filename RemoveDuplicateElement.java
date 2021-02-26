public class Main {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 6, 7, 2, 4};
        removeDuplicate(arr);
    }

    public static void removeDuplicate(int[] arr) {
        int size = arr.length;
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    if (j < size) {
                        arr[j] = arr[j + 1];
                        size--;
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
