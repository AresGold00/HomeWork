package Home_Works.lesson_6.zoo;

public class Cat extends Animal {

    private static int count;           // счетчик количества созданных животных класса Cat (котов)

    public Cat(String type, String name,String color, int swims, int goes, int run) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.swims = swims;
        this.goes = goes;
        this.run = run;
        count++;
    }
    public void catInfo() {
        System.out.println("Cat: " + name + " Run: " + run+ " meters" + " Swim:" + swims + " Goes: " +goes+ " meters");
    }
    public Cat(String color) {
        this.color = color;
    }
    public static void run() {
    }
    public static void swim() {
    }
    public static int getCount() {
        return count;
    }


    public static int getCountClone() {
        return 0;
    }
}
