// concrete product classes that implement the abstract product interfaces
public class WindowsTextBox implements TextBox {
    @Override
    public void display() {
        System.out.println("Displaying Windows TextBox");
    }
}