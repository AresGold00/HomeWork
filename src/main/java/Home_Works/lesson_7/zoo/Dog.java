package Home_Works.lesson_7.zoo;

public class Dog {

    private String name;
    private int appetite;
    private boolean hungry;

    Dog(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info() {

        String isHungry = !hungry ? "Я сыт gaf " : "Хавчика неси я голоден gaf gaf\n";
        System.out.println(name + ": " + isHungry);
    }

    void eat(Bowl plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}
