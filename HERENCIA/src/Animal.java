class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Clase Dog, que hereda de la clase Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
        int n=5;
        double resultado=n;
    }
}

// Clase Cat, que hereda de la clase Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

