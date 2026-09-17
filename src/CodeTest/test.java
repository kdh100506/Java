package CodeTest;

public class test {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            if(i%2==0){
                for(int j = 1; j <= 5; j++){
                    System.out.print((i*5)+j + " ");
                }
            } else {
                for(int j = 5; j >= 1; j--){
                    System.out.print((i*5)+j + " ");
                }
            }
            System.out.println();
        }
    }
}
