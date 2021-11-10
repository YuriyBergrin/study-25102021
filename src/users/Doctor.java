package users;

import interfaces.Charity;
import interfaces.Work;

public class Doctor extends User implements Work, Charity {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void doCharityWork(String goodness) {
        System.out.println("Я поддерживаю " + goodness + ".");

    }

    @Override
    public void benefits() {
        System.out.println("Мне нравиться делать мир лучше.");
    }

    @Override
    public void doWork(String task) {
        System.out.println("Мое призвание - " + task + ".");
    }

    @Override
    public void rest() {
        System.out.println("Свободное время провожу с семьей.");
    }

    @Override
    public void sayProfession() {
        System.out.println("Я врач " + name + ", моя зп " + salary + " рублей.");
    }
}
