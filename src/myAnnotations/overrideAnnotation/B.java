package myAnnotations.overrideAnnotation;

public class B extends A {
    @Override
    public void testA() {
        System.out.println("Hello from class B");
    }
}
