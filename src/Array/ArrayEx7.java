package array;

public class ArrayEx7 {
    public static void main(String[] args) {
        char firstalpha = 'A';

        char[] alpha1 = new char[13];
        for (int i = 0; i < alpha1.length; i++) {
            alpha1[i] = firstalpha++;
        }

        char[] alpha2 = new char[13];
        for (int i = 0; i < alpha2.length; i++) {
            alpha2[i] = firstalpha++;
        }

        char[] alpha = new char[26];

        System.arraycopy(alpha1, 0, alpha, 0, 13);
        System.arraycopy(alpha2, 0, alpha, 13, 13);

        for (int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i]);
        }
    }
}
