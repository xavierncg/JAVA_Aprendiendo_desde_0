public class TiposDeVariables {
    public static void main(String[] args) {

        byte age = 23; // 1 byte y nos permite almacenar valores entre -128 y 127. adecuado para almacenar edades, ya que no se espera que superen los 127 años.
        System.out.println("Edad: " + age); 

        float price = 19.99f; // 4 bytes y nos permite almacenar valores decimales con una precisión de hasta 7 dígitos. adecuado para almacenar precios, ya que no se espera que superen los 7 dígitos de precisión.
                               // Debemos utilizar la letra "f" al final del valor para indicar que es un número de tipo float, ya que por defecto los números decimales se consideran de tipo double.
        double pi = 3.141592653589793; // 8 bytes y nos permite almacenar valores decimales con una precisión de hasta 15 dígitos. adecuado para almacenar valores matemáticos, como el número pi, que requiere una mayor precisión.

        int xAxis, yAxis;
        xAxis = 10;
        yAxis = 20;

        System.out.println("Eje X: " + xAxis);
        System.out.println("Eje Y: " + yAxis);
        age = 30;
        System.out.println("Edad: " + age);

        char initial = 'J'; // 2 bytes y nos permite almacenar un solo carácter. adecuado para almacenar iniciales, ya que no se espera que superen un solo carácter.
        System.out.println("Inicial: " + initial);

        boolean isTeacher = true; // 1 byte y nos permite almacenar valores de verdadero o falso. adecuado para almacenar valores booleanos, como si Java es divertido o no.
        System.out.println("¿Es profesor? : " + isTeacher);
    }
}
