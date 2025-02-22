
// ConcretePrototypeB.java implements Prototype interface
public class ConcretePrototypeB implements Prototype {
    private int number;

    public ConcretePrototypeB(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeB(this.number);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB [number=" + number + "]";
    }
}