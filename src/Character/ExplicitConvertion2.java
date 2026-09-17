package Chapter_2;

public class ExplicitConvertion2 {
    public static void main(String[] args) {

        int iNum = 1000;
        byte bNum = (byte)iNum;
        System.out.println(bNum);

        double dNum = 1.2;
        float fNum2 = 0.9f;
        int iNum3 = (int)dNum + (int)fNum2;
        int iNum4 = (int)(dNum + fNum2);

        System.out.println(iNum3);
        System.out.println(iNum4);

    }
}
