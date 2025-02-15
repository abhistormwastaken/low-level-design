// imagine you're a factory and the developer asks you to create an object with a lot of properties
// you can pass them as arguments to the constructor, but it's hard to keep track of the order of the arguments

// eg code:

// public class Burger {
//    private String bun;
//    private Boolean ketchup;
//    private Boolean mustard;

//    public Hotdog(String bun, Boolean ketchup, Boolean mustard) {
//        this.bun = bun;
//        this.ketchup = ketchup;
//        this.mustard = mustard;
//    }
// }

// Burger burger = new Burger("wheat", true, false);

// OR you can use the builder pattern which is more readable and easy to use which allows you to create objects incrementally

public class Burger{
    private String bun;
    private Boolean ketchup;
    private Boolean mustard;

    // optional parameters
    public Burger(String bun) {
        this.bun = bun;
        return this;
    }

    public addKetchup(Boolean ketchup) {
        this.ketchup = true;
        return this;
    }

    public addMustard(Boolean mustard) {
        this.mustard = true;
        return this;
    }
}

// now you can create a burger object like this (possible because we are returning `this` in the methods)
Burger burger = new Burger("wheat")
                    .addKetchup(true)
                    .addMustard(false);

// you can even deligate the building logic to another entirely different class which would make objects immutable

public class Burger {
    private String bun;
    private Boolean ketchup;
    private Boolean mustard;

    public Burger(Builder builder) {
        this.bun = builder.bun;
        this.ketchup = builder.ketchup;
        this.mustard = builder.mustard;
    }

    public static class Builder {
        private String bun;
        private Boolean ketchup;
        private Boolean mustard;

        public Builder(String bun) {
            this.bun = bun;
        }

        public Builder addKetchup(Boolean ketchup) {
            this.ketchup = true;
            return this;
        }

        public Builder addMustard(Boolean mustard) {
            this.mustard = true;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}

// calling the inner class functions first to set the properties and then calling the build method to create the object of outer class
Burger burger = new Burger.Builder("wheat")
                    .addKetchup(true)
                    .addMustard(false)
                    .build();