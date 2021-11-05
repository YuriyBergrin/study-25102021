import animals.Animal;
import animals.Cat;
import animals.Cow;
import animals.Human;

public class Main {
    public static void main(String[] args) {
        //создаем животных
        Cat cat1 = new Cat();
        cat1.setName("Мурзик");
        cat1.setAge(3);

        Cat cat2 = new Cat();
        cat2.setName("Барсик");
        cat2.setAge(-1);//обратите внимание, что тут задается отрицательное значение

        //добавить 1-3 коровы
        Cow cow1 = new Cow();
        cow1.setName("Буренка");
        cow1.setAge(3);

        Cow cow2 = new Cow();
        cow2.setName("Быченка");
        cow2.setAge(4);

        //добавить 1-3 человека
        Human human1 = new Human();
        human1.setName("Цой");
        human1.setAge(35);
        human1.setVegan();


        Human human2 = new Human();
        human2.setName("Виктор");
        human2.setAge(47);
        human2.setVegan();


        //спрашиваем, кто они по жизни
        animalBiography(cat1);
        animalBiography(cat2);
        //вызвать animalBiography для коров и людей
        animalBiography(cow1);
        animalBiography(cow2);

        humanBiography(human1);
        humanBiography(human2);

    }


    //автобиография животного
    private static void animalBiography(Animal animal) {
        System.out.println("Привет, меня зовут " + animal.getName() + ".");
        System.out.println("Мне " + animal.getAge() + " лет.");
        System.out.println("У меня " + animal.pawQuantity + " лапы.");//исправить ошибку в классе Animal, чтобы тут все было ок.
        if (animal.isVegan()) {
            System.out.println("Я хипстер.");
        } else {
            System.out.println("Я не веган.");
        }
        System.out.println();//пустая строка для пробела между строками
    }

    private static void humanBiography(Human human) {
        System.out.println("Привет, меня зовут " + human.getName() + ".");
        System.out.println("Мне " + human.getAge() + " лет.");
        if (human.setVegan()) {
            System.out.println("Я веган");
        } else {
            System.out.println("Я не веган");
        }
        System.out.println();

    }
}
