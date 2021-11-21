package Home_Works.lesson_7.zoo;

public class Homework {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 200),
                new Cat("Murzik", 200),
                new Cat("Vaska", 300),

        };
        Dog[] dogs = {
                new Dog("Reks", 200),
                new Dog("Lord", 200),
                new Dog("Puhistik", 300),

        };

        var bowl = new Bowl();// java 10+
        bowl.putFood(1100);

        for (Cat cat : cats){
          cat.eat(bowl);
            cat.info();
        }
        for (Dog dog : dogs){
            dog.eat(bowl);
            dog.info();
        }
    }

}
