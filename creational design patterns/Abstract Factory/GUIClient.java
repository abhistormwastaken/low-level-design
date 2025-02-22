// main class for demonstration
public class GUIClient {
    public static void main(String[] args) {
        GUIFactory factory;

        // Choose the factory based on the OS (or other logic)
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else if (os.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            System.out.println("Unsupported OS");
            return;
        }

        Button button = factory.createButton();
        TextBox textBox = factory.createTextBox();

        button.render();
        textBox.display();
    }
}

//Output:

// If you run it on Windows:

// Rendering Windows Button
// Displaying Windows TextBox

// If you run it on macOS:

// Rendering MacOS Button
// Displaying MacOS TextBox

// If you run it on an unsupported operating system (e.g., Linux):

// Unsupported OS