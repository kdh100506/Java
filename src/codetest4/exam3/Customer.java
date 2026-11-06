package codetest4.exam3;

public class Customer {
    private String name;
    private int reservedSeats;

    public Customer(String n){
        name = n;
        reservedSeats = 0;
    }

    public void addReservation(int ars) {
        reservedSeats += ars;
    }

    public void showInfo() {
        System.out.println(name + ": " + reservedSeats + "석");
    }
}
