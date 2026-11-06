package codetest4.exam5;

public class Notebook {
    private int totalCount;
    private int rentalCount;

    public Notebook() {
        totalCount = 5;
        rentalCount = 0;
    }

    public void rentNotebook(int s) {
        if(s > 0 && s <= totalCount - rentalCount) {
            rentalCount += s;
        } else {
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }

    public void returnNotebook(int s) {
        if( s > 0 && s < rentalCount) {
            rentalCount -= s;
        } else {
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("전체 노트북: " + totalCount + "대\n대여 중: " + rentalCount + "대\n남은 노트북: " + (totalCount - rentalCount) + "대");
    }
}
