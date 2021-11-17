package lessons.lesson_5_oop;

public class classWork {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Murzik";
        cat1.color = "white";
        cat1.age = 4;

        System.out.println(cat1);
        System.out.println(cat1.name);
        System.out.println(cat1.color);
        System.out.println(cat1.age);

        Cat cat2 = new Cat("Barsik", "black", 10);
        System.out.println(cat2.name);
        System.out.println(cat2.color);
        System.out.println(cat2.age);

        new Cat("Vaska", "red", 2).run();

        cat1.run();
        cat2.run();
        cat1.voice();
        cat2.voice();

    }
}
