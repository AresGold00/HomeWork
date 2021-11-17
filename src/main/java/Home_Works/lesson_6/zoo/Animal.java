package Home_Works.lesson_6.zoo;

public class Animal {
    protected String type;       // вид животного
    protected String name;       // имя или кличка животного
    protected String color;      // цвет животного
    protected int swims;         // возможность животного плавать
    protected int goes;          // возможность животного ходить
    protected int run;           // возможность животного бегать
    private static int count;
    private final int maxRun = 0;
    private final int maxSwim = 0;
    public Animal(){
        count++;
    }

    public Animal(String type, String name,String color, int swims, int goes, int run){
        this.type = type;
        this.name = name;
        this.color = color;
        this.swims = swims;
        this.goes = goes;
        this.run = run;
        count++;
    }


    public String getName (){return  name;}
    public void setName (String name){this.name = name;}

    public static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "Вид/порода: '" + type + '\'' +
                ", Кличка: '" + name + "\' \nТТХ:" +
                ", Может проплыть " + swims + "м. " +
                ", Может пройти " + goes + "м. " +
                ", Может пробежать " + run + "м.\n";
    }
    public void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "  - УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    public void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }
    public void goess(int distance) {
        if (goes >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО прошёл(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }

    public void catInfo() {
    }

    public void dogInfo() {
    }
}



