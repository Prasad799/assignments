package myWork;
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
public class GenericsExample {
	public static void main(String[] args) {
        // Creating a Box of Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Integer Value: " + intBox.getValue());

        // Creating a Box of String
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String Value: " + strBox.getValue());

        // Creating a Box of Double
        Box<Double> doubleBox = new Box<>(3.14);
        System.out.println("Double Value: " + doubleBox.getValue());
    }
}
