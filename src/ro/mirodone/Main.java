package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        System.out.println(triangle.isTriangle(1, 2, 2));
        System.out.println(triangle.isTriangle(7, 2, 2));

    }
}
