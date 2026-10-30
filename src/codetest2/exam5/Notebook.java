package codetest2.exam5;

public class Notebook {
    private int totalCount;
    private int rentalCount;

    public Notebook() {
        totalCount = 5;
        rentalCount = 0;
    }

    public void rentNotebook(int rentCount) {
        if(rentCount > 0 && rentCount <= 5) {
            rentalCount += rentCount;
        } else {
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }

    public void returnNotebook(int returnCount) {
        if(returnCount > 0 && returnCount <= rentalCount) {
            rentalCount -= returnCount;
        } else {
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("전체 노트북: " + totalCount);
        System.out.println("대여 중: " + rentalCount);
        System.out.println("남은 노트북: " + (totalCount - rentalCount));
    }
}
