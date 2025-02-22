// ConcretePrototypeA.java implements Prototype interface
public class ConcretePrototypeA implements Prototype {
    private String data;

    public ConcretePrototypeA(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeA(this.data); // Shallow copy for Strings, adjust for complex objects
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA [data=" + data + "]";
    }
}
