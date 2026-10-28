public class TipoDeDatosInt { 
    
    public static void main(String[] args) {

        byte numeroPequeno = 100; // 1 byte y nos permite almacenar valores entre -128 y 127. adecuado para almacenar valores pequeños, como el número de hijos, ya que no se espera que superen los 127.

        short edad = 25; // 2 bytes y nos permite almacenar valores entre -32,768 y 32,767. adecuado para almacenar edades, ya que no se espera que superen los 32,767 años.
        
        int salario = 50000; // 4 bytes y nos permite almacenar valores entre -2,147,483,648 y 2,147,483,647. adecuado para almacenar salarios, ya que no se espera que superen los 2,147,483,647.
        
        long distancia = 10000000000L; // 8 bytes y nos permite almacenar valores entre -9,223,372,036,854,775,808 y 9,223,372,036,854,775,807. adecuado para almacenar distancias muy grandes, como la distancia entre planetas o estrellas.
    
        float precio = 19.99f; // 4 bytes y nos permite almacenar valores decimales con una precisión de hasta 7 dígitos. adecuado para almacenar precios, ya que no se espera que superen los 7 dígitos de precisión.
                               // Debemos utilizar la letra "f" al final del valor para indicar que es un número de tipo float, ya que por defecto los números decimales se consideran de tipo double. 

        double pi = 3.141592653589793; // 8 bytes y nos permite almacenar valores decimales con una precisión de hasta 15 dígitos. adecuado para almacenar valores matemáticos, como el número pi, que requiere una mayor precisión.
    }

    
}
