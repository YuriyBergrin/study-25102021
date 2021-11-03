import animals.Animal;
import animals.Cat;

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

        //добавить 1-3 человека

        //спрашиваем, кто они по жизни
        animalBiography(cat1);
        animalBiography(cat2);
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
