package _05_array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("태백산맥", "조청래"));
        bookList.add(new Book("데미안", "헤르만헤세"));
        bookList.add(new Book("연을 쫒는 아이", "할레드 호세이니"));
        bookList.add(new Book("오디세이아", "호메로스"));
        bookList.add(new Book("동의보감", "허준"));

        // for (int i = 0; i < bookList.size(); i++) {
        //     bookList.get(i).bookInfo();
        // }

        for(Book book : bookList) {
            book.bookInfo();
        }


    }
}
