package Home_Works.lesson_6;

import Home_Works.lesson_6.zoo.Animal;
import Home_Works.lesson_6.zoo.Cat;
import Home_Works.lesson_6.zoo.Dog;

public class Homework {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Кот сиамский", "Мурзик","Black", 50, 1400, 550),
                new Cat("Кошка абиссинская", "Алиса", "Red", 50, 1610, 450),
                new Dog("Собака Дог (кобель)", "Барсик","Orange", 50, 1500, 498),
                new Dog("Собака Пудель (самка) ", "Лора","Black",  50, 1200, 550)
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].catInfo();
            animals[i].dogInfo();

        }
        System.out.println("---------------------------------------------------------------------------------------");



        //Вывод общих результатов из данных класса;
        System.out.println("Всего котов создано: " + (Cat.getCount() + Cat.getCountClone()));
        System.out.println("Всего собак создано: " + (Dog.getCount() + Dog.getCountClone()));


        System.out.println("Бег: ");
        System.out.println("---------------------------------------------------------------------------------------");
        // заставляем животных бегать
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Плавание: ");
        System.out.println("---------------------------------------------------------------------------------------");

        //заставляем животных плавать
        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(50);
        }
        System.out.println("Ходьба: ");
        System.out.println("---------------------------------------------------------------------------------------");
        //заставляем животных ходить
        for (int i = 0; i < animals.length; i++) {
            animals[i].goess(1600);
        }
        System.out.println("---------------------------------------------------------------------------------------");

    }

//    private static void simple1() {
//        System.out.println("Animal born");
//        Animal[] animal = {
//                new Cat("Mirzik", "black", 130,5),
//                new Cat("Vaska", "white", 140,10),
//                new Dog("Reks", "sspace grey", 150,25),
//                new Dog("Barsik", "red", 95,20)
//        };
//        for (int i = 0; i < animal.length; i++) {
//            animal[i].catSpecific();
//            animal[i].dogSpecific();
//
//        }
//    }


//    private static void simple() {
//
//        Animal animal = new Animal("Animal born");
//        Cat cat = new Cat("Barsik","black", 100,5);
//        Cat cata = new Cat("Barsik","black", 100,5);
//        animal.animalInfo();
//        cat.animalInfo();
//        cat.catSpecifications();
//        cata.animalInfo();
//        cata.dogSpecifications();
//
//        Animal danimal = new Animal("Dogs");
//        Dog dog = new Dog("Sharik","black",150,25);
//        Dog doga = new Dog("Tuzik","black",120,15);
//        danimal.animalInfo();
//        dog.animalInfo();
//        dog.catSpecifications();
//        doga.animalInfo();
//        doga.dogSpecifications();
//    }

}
