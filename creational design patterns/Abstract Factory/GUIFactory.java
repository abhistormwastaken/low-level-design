// abstract factory interface, which declares methods for creating the abstract products.
public interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}