package Home_Works.lesson_6.zoo;

public class Dog extends Animal {

    private static int count;           // счетчик количества созданных животных класса Dog (собак)

    public Dog(String type, String name,String color, int swims, int goes, int run) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.swims = swims;
        this.goes = goes;
        this.run = run;
        count++;
    }
    public void dogInfo() {
        System.out.println("CatName: " + name + " Run: " + run+ " meters" + " Swim:" + swims + " Goes: " +goes+ " meters");
    }

    public static int getCount() {
        return count;
    }


    public static void run() {
    }

    public static int getCountClone() {
        return 0;
    }
}
