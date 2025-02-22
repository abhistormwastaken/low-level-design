// PrototypeClient.java is the main that uses the created prototypes
public class PrototypeClient {
    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA("Original A");
        ConcretePrototypeB prototypeB = new ConcretePrototypeB(100);

        ConcretePrototypeA cloneA = (ConcretePrototypeA) prototypeA.clone();
        ConcretePrototypeB cloneB = (ConcretePrototypeB) prototypeB.clone();

        System.out.println("Original A: " + prototypeA);
        System.out.println("Clone A: " + cloneA);

        System.out.println("Original B: " + prototypeB);
        System.out.println("Clone B: " + cloneB);

        // Modify the clone to show that it's a separate object
        cloneA.setData("Modified Clone A");
        cloneB.setNumber(200);

        System.out.println("Modified Clone A: " + cloneA);
        System.out.println("Modified Clone B: " + cloneB);
        System.out.println("Original A after clone modification: " + prototypeA);
        System.out.println("Original B after clone modification: " + prototypeB);
    }
}

// Output:

// Original A: ConcretePrototypeA [data=Original A]
// Clone A: ConcretePrototypeA [data=Original A]
// Original B: ConcretePrototypeB [number=100]
// Clone B: ConcretePrototypeB [number=100]
// Modified Clone A: ConcretePrototypeA [data=Modified Clone A]
// Modified Clone B: ConcretePrototypeB [number=200]
// Original A after clone modification: ConcretePrototypeA [data=Original A]
// Original B after clone modification: ConcretePrototypeB [number=100]