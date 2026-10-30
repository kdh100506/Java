package codetest2.exam3;

public class Customer {
    private String name;
    private int reservedSeats;

    public Customer(String name) {
        this.name = name;
    }

    public void addReservation(int add) {
        reservedSeats += add;
    }

    public void showInfo() {
        System.out.println(name + ": " + reservedSeats + "석");
    }
}
