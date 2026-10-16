package _05_array;

public class BookArray2 {
    public static void main(String[] args) {
        Book book1 = new Book("태백산맥", "조정래");
        Book book2 = new Book("데미안", "헤르만헤세");
        Book book3 = new Book("연을 쫒는 아이", "할레드 호세이니");
        Book book4 = new Book("오디세이아", "호메로스");

        book1.getInfo();
        book2.getInfo();
        book3.getInfo();
        book4.getInfo();
    }
}
