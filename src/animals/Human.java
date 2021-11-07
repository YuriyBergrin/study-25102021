package animals;

public class Human extends Animal{
    boolean Vegan;

    public void setVegan(boolean Vegan){
        this.Vegan = Vegan;
    }

    @Override
    public boolean isVegan() {
        return Vegan;
    }

    @Override
    public void setAge ( int age){
        if (age > 0 & age <= 99) {
            this.age = age;
        } else {
            System.out.println("Задан некорректный возраст\n");
            this.age = 0;
        }

    }
}
