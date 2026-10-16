package _05_array;

public class BookArray {
    public static void main(String[] args) {
        Book[] book = new Book[5];

        book[0] = new Book("태백산맥", "조정래");
        book[1] = new Book("데미안", "헤르만헤세");
        book[2] = new Book("연을 쫒는 아이", "할레드 호세이니");
        book[3] = new Book("오디세이아", "호메로스");
        book[4] = new Book("집가고 싶다", "김도현");

        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }
}
