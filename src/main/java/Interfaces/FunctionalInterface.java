package Interfaces;

public interface FunctionalInterface {
    void adding ();

    public static void main(String[] args) {
        Store<Integer> store = (v) ->  {

            return 10;
        };
    }
    // main class can have interface, functional interface can have only one abstract method
    interface Store<T> {
        T add(T[] arr);
    }
}
