package lessons.lesson_5;

public class Cat {
    static String name;
    static String color;
    static int age = 2;

    public Cat(){
        System.out.println("The new cat born!!!");
    }

    public Cat(String color){
        this();
        this.color = color;
    }

    public Cat(String name, String color, int age){
        this(color);
        this.name = name;
        this.age = age;
    }

   public void run(){
        System.out.printf("%s %s-colored run \n",this.name, this.color);
    }
    public void voice(){
        System.out.printf("%s %s-colored meauww \n",this.name, this.color);
    }
}
