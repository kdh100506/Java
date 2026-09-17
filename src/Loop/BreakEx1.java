package loop;

public class BreakEx1 {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 0; sum < 100; i++) {
            sum += i;
            if (sum > 100) {
                break;
            }
        }
        System.out.printf("i: %d \nsum: %d", i, sum);
    }
}
