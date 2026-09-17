package Test01;

public class TestEx17 {
    public static void main(String[] args) {
        String[] cafeMenu = {"Americano", "caffeLate", "MilkTea", "IceCream", "Greem Tea"};
        cafeMenu[1] = "VanillaLate";
        for (int i = 0; i < cafeMenu.length; i++) {
            System.out.println(cafeMenu[i]);
        }
    }
}
