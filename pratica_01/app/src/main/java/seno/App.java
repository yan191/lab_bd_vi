/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package seno;

public class App {
    public static void main(String[] args) {
        try {
            Calculadora calculadora = new Calculadora();
            System.out.println(calculadora.seno(4, 10));
        }catch (Exception error) {
            error.printStackTrace();
        }
    }
}
