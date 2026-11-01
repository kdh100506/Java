package codetest3.exam5;

public class Notebook {
    private int totalCount;
    private int rentalCount;

    public Notebook() {
        totalCount = 5;
        rentalCount = 0;
    }

    public void rentNotebook(int r) {
        if(r > 0 && r <= totalCount - rentalCount) {
            rentalCount += r;
        } else {
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }

    public void returnNotebook(int r) {
        if(r > 0 && r <= rentalCount) {
            rentalCount -= r;
        } else {
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("전체 노트북: " + totalCount + "대\n대여 중: " + rentalCount + "대\n남은 노트북: " + (totalCount - rentalCount) + "대");
    }
}
