package polymorphism.animal;

public class AnimalTest {
    public static void main(String[] args) {
        // AnimalTest atest = new AnimalTest();
        // atest.moveAnimal(new Human());
        // atest.moveAnimal(new Tiger());
        // atest.moveAnimal(new Eagle());

        Animal ani = new Tiger();
        // Human human = (Human) ani;
        // Tiger ti = (Tiger) ani;
        if (ani instanceof Tiger tiger) {
            tiger.move();
        } else if (ani instanceof  Human human) {
            human.move();
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
