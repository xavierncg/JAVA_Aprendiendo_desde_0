public class TiposDeVariables {
    public static void main(String[] args) {

        byte age = 23; // 1 byte y nos permite almacenar valores entre -128 y 127. adecuado para almacenar edades, ya que no se espera que superen los 127 años.

        float price = 19.99f; // 4 bytes y nos permite almacenar valores decimales con una precisión de hasta 7 dígitos. adecuado para almacenar precios, ya que no se espera que superen los 7 dígitos de precisión.
                               // Debemos utilizar la letra "f" al final del valor para indicar que es un número de tipo float, ya que por defecto los números decimales se consideran de tipo double.
    }
}
