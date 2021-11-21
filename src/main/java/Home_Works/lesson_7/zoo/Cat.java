package Home_Works.lesson_7.zoo;

public class Cat {

    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
        this.hungry = true;

    }

    void info() {

        String isHungry = !hungry ? "Я сыт мурр " : "Хавчика неси я голоден\n\n";
        System.out.println(name + ": " + isHungry);
    }

    void eat(Bowl plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}

