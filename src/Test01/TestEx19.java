package Test01;

public class TestEx19 {
    public static void main(String[] args) {
        char[] a = new char[26];
        char b = 'Z';
        for (int i = 0; i < 26; i++) {
            a[i] = b--;
        }
        System.out.println(a);
    }
}
