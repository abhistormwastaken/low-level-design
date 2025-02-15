// there should exist only one instance of the class (object) in the system during the lifetime of JVM


// ---------Eager initialization---------

public class Singleton {
    // private static instance of the class because only one instance should exist
    // final to make sure that the instance is not changed
    private static final Singleton instance = new Singleton();

    private Singleton() {
        // private constructor to prevent instantiation outside the class
    }

    // public static method to return the instance of the class
    public static Singleton getInstance() {
        return instance;
    }
}

Singleton obj = Singleton.getInstance();

// ---------Lazy initialization---------

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation outside the class
    }

    // public static method to return the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

Singleton obj = Singleton.getInstance(); // creates the instance when called for the first time

// now this is not thread safe, if two threads call the getInstance() method at the same time, two instances will be created
// we can do this by making the method synchronized, but this will reduce the performance as it becomes completely sequential
// one thread enters the method, the others waits for it to finish, then the next thread enters and so on
// so even if the instance is created, the other threads will wait instead of using the instance

// ---------Thread safe lazy initialization (Method Level)---------   slowwww

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation outside the class
    }

    // public static method to return the instance of the class
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// so we can use block level synchronization and double-checked locking to avoid the performance issue

// ---------Thread safe lazy initialization (Block Level)---------   fast because of double-checked locking mechanism

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation outside the class
    }

    // public static method to return the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { // argument is the class object (representing the class)
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

// ---------Bill Pugh Singleton Implementation---------

// this is the best way to create a singleton class
// it uses a static inner helper class to create the instance of the class
// the instance is created when the inner class is loaded, so it is thread safe and lazy initialization is also achieved

public class Singleton {
    private Singleton() {
        // private constructor to prevent instantiation outside the class
    }

    private static class SingletonHelper {
        private static final Singleton instance = new Singleton(); // can be referenced and instantiated by the outer class as it is static
    }

    public static Singleton getInstance() {
        return SingletonHelper.instance; // loads the inner class and creates the instance
    }
}