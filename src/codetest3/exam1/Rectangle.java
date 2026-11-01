package codetest3.exam1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return width * 2 + height * 2;
    }

    public void showInfo() {
        System.out.println("가로: "+ width + "\n세로: " + height + "\n넓이: " + getArea() + "\n둘레: " + getPerimeter());
    }
}
