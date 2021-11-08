package users;

import interfaces.Work;

public class Cleaner extends User implements Work {
    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void sayProfession() {
        System.out.println("Я уборщица " + name +
                "\n моя зп " + salary);
    }

    @Override
    public void doWork(String task) {
        System.out.println("Молодой человек, я тут полы мою, а ты мне тут со своим " + task);
    }

    @Override
    public void rest() {
        System.out.println("Лежу дома на печи.");
    }
}
