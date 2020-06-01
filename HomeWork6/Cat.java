package HomeWork6;

public class Cat extends Animals {

    Cat(String name) {
        super(name);
    }

    public void run(int ride) {
        if (ride <= 200) {
            System.out.println("Кошка " + name + " может пробежать " + ride + " метров");
        } else {
            System.out.println(ride + " метров. Слишком большое расстояние для кошки " + name);
        }
    }

    public void swim(int ride) {
            System.out.println("Кошка " + name+" не умеет плавать!");
    }

    public void jump(double height) {
        if (height <= 2) {
            System.out.println("Кошка " + name + " может прыгнуть на " + height + " метров");
        } else {
            System.out.println(height + " метров. Слишком большая высота прыжка для кошки " + name);
        }
    }
}
