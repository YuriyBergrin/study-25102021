import users.Cleaner;

public class Main {
    public static void main(String[] args)  {
        Cleaner cleaner = new Cleaner("Гузелька");
        cleaner.setSalary(500);
        cleaner.hello();
        cleaner.doWork("Пофиксить баги");
        cleaner.rest();


    }
}
