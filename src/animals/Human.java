package animals;

public class Human extends Animal {
    boolean vegan;

    public void setVegan(boolean whoIsHuman) {
        this.vegan = whoIsHuman;
    }

    @Override
    public boolean isVegan() {
        return vegan;
    }


    @Override
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Задан некорректный возраст\n");
            this.age = 0;
        }

    }
}

// В классе Human создать метод setVegan, который принимает параметр типа boolean и задает значение полю vegan.
// В классе Human переопределить метод isVegan() таким образом, чтобы он возвращал значение переменной vegan.