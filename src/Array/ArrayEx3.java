package array;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 ==0) {
                arr[a] = i;
                System.out.print(arr[a++] + " ");
            }
        }
    }
}
