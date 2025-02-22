// concrete product classes that implement the abstract product interfaces
public class MacOSTextBox implements TextBox {
    @Override
    public void display() {
        System.out.println("Displaying MacOS TextBox");
    }
}