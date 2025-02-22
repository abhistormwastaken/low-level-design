// concrete product classes that implement the abstract product interfaces
public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering MacOS Button");
    }
}