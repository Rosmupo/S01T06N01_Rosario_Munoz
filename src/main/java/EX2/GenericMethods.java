package EX2;

public class GenericMethods {

    public static <T> void printArguments(T a, T b, T c) {
        System.out.println("Primer argumento: " + a.toString() + ". Segundo argumento: " + b.toString() + ".Tercer argumento: " + c.toString());

    }
}
