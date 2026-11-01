package codetest3.exam3;

public class Cinema {
    private String title;
    private int availableSeats;

    public Cinema(String t, int as) {
        title = t;
        availableSeats = as;
    }

    public void reserve(Customer customer, int count) {
        if(count <= 0) {
            System.out.println("올바른 좌석 수를 입력하세요.");
        } else if(count > availableSeats) {
            System.out.println("예약 가능한 좌석이 부족합니다.");
        } else {
            availableSeats -= count;
            customer.addReservation(count);
        }
    }

    public void showInfo() {
        System.out.println("영화 제목: " + title + "\n남은 좌석: " + availableSeats + "석");
    }
}
