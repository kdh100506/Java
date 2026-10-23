package test1023;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogList = new Dog[5];
        dogList[0] = new Dog("멍멍이", "치와와");
        dogList[1] = new Dog("뽀삐", "진돗개");
        dogList[2] = new Dog("순심이", "삽살개");
        dogList[3] = new Dog("철이", "마르티스");
        dogList[4] = new Dog("삐쭈", "푸들");

        for (Dog dog : dogList) {
            dog.showDogInfo();
        }
    }
}
