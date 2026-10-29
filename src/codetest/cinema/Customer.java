package codetest.cinema;

public class Customer {
    private final String name;
    private int reservedSeats;

    public Customer(String name) {
        this.name = name;
        this.reservedSeats = 0;
    }

    public void addReservation(int count) {
        reservedSeats += count;
    }

    public void showInfo() {
        System.out.println(name + ": " + reservedSeats + "석");
    }
}
