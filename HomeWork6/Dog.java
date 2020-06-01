package HomeWork6;

public class Dog extends Animals {

    Dog(String name) {
        super(name);
    }

    public void run(int ride) {
        if (ride <= 500) {
            System.out.println("Собака " + name + " может пробежать " + ride + " метров");
        } else {
            System.out.println(ride + " метров. Слишком большое расстояние для собаки " + name);
        }
    }

    public void run(int ride, int maxRide) {
        if (ride <= maxRide) {
            System.out.println("Собака " + name + " может пробежать " + ride + " метров");
        } else {
            System.out.println(ride + " метров. Слишком большое расстояние для собаки " + name);
        }
    }

    public void swim(int ride) {
        if (ride <= 10) {
            System.out.println("Собака " + name + " может проплыть " + ride + " метров");
        } else {
            System.out.println(ride + " метров. Слишком большое расстояние для собаки " + name);
        }
    }

    public void jump(double height) {
        if (height <= 0.5) {
            System.out.println("Собака " + name + " может прыгнуть на " + height + " метров");
        } else {
            System.out.println(height + " метров. Слишком большая высота прыжка для собаки " + name);
        }
    }
}
