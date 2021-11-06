package animals;

public class Human extends Animal {
    boolean vegan;

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    @Override
    public boolean isVegan() {
        return vegan;
    }


}



