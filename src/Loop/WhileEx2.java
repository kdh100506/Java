package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i += 1;
        } while (i<=10);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
