package users;

public abstract class User {
    protected String name;//имя сотрудника
    protected int salary = 0;//зп сотрудника

    public User(String name) {
        this.name = name;
    }//это специальный метод, который называется конструктор, этот метод позволят создавать экземпляры класса нужным нам способом
    //этот метод пишется с большой буквы и назван так же как и класс, так же он ничего не возвращает и перед ним не пишется void
    //в данном случае, он нам нужен, чтобы мы могли создавать юзеров, только задавая им какое то имя.
    //подробнее о констурторах https://javarush.ru/groups/posts/konstruktory-v-java-1

    public void hello() {
        System.out.println("Привет меня зовут " + name);
    }//назвать имя сотрудника

    public abstract void sayProfession();//назвать профессию сотрудника

    public int getSalary() {
        return salary;
    }//получить величину зп

    public void setSalary(int salary) {
        this.salary = salary;
    }//задать величину зп
}
