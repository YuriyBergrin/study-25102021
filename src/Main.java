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
        cow1.setName("Бурёнка");
        cow1.setAge(5);

        Cow cow2 = new Cow();
        cow2.setName("Машка");
        cow2.setAge(20);

        Cow cow3 = new Cow();
        cow3.setName("Мурка");
        cow3.setAge(21);

        //добавить 1-3 человека
        Human Human1 = new Human();
        Human1.setName("Дима");
        Human1.setAge(28);
        Human1.setVegan(true);

        Human Human2 = new Human();
        Human2.setName("Ефросиния");
        Human2.setAge(99);
        Human2.setVegan(false);

        Human Human3 = new Human();
        Human3.setName("Людмила");
        Human3.setAge(100);
        Human3.setVegan(false);

        //спрашиваем, кто они по жизни
        animalBiography(cat1);
        animalBiography(cat2);
        animalBiography(cow1);
        animalBiography(cow2);
        animalBiography(cow3);
        animalBiography(Human1);
        animalBiography(Human2);
        animalBiography(Human3);
        //вызвать animalBiography для коров и людей
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
}
