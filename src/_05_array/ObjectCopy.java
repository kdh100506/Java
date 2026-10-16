package _05_array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        Book[] bookCopy = new Book[5];

        book[0] = new Book("태백산맥", "조정래");
        book[1] = new Book("데미안", "헤르만헤세");
        book[2] = new Book("연을 쫒는 아이", "할레드 호세이니");
        book[3] = new Book("오디세이아", "호메로스");
        book[4] = new Book("집가고 싶다", "김도현");

        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i] = new Book();
        }

        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i].setBookName(book[i].getBookName());
            bookCopy[i].setAuthor(book[i].getAuthor());
        }

        System.out.println("book");
        for (int i = 0; i < book.length; i++) {
            book[i].bookInfo();
        }

        book[0].setBookName("니코마코스의 윤리학");
        book[0].setAuthor("아리스토텔레스");

        System.out.println("\nbook 수정");
        for (int i = 0; i < book.length; i++) {
            book[i].bookInfo();
        }

        System.out.println("\nbookCopy");
        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i].bookInfo();
        }
    }
}
