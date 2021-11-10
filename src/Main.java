import users.Cleaner;
import users.Manager;
import users.Testers;

public class Main {
    public static void main(String[] args)  {
        Cleaner cleaner = new Cleaner("Гузелька");
        cleaner.setSalary(500);
        cleaner.hello();
        cleaner.doWork("Пофиксить баги");
        cleaner.rest();

        Testers tester = new Testers("Artem");
        tester.setSalary(1000000);
        tester.hello();
        tester.doWork("Пофиксить баги");
        tester.rest();

        Manager manager = new Manager("Бонд");
        manager.setSalary(12345);
        manager.hello();
        manager.doWork("Что вы тут встали!? Работаем, господа.");
        manager.rest();
        manager.controlEmployee();
    }
}
