public class OperadoresUnarios {
    public static void main(String[] args) {
        
        int numero = 5;
        boolean flag = true;

        System.out.println("Valor original: " + numero); // 5

        System.out.println("Valor original del flag: " + !flag); // true C

        // Operador de incremento
    
        System.out.println("Después del incremento: " + (numero++)); // 5 Cuando se utiliza el operador de incremento después de la variable, primero se devuelve el valor actual y luego se incrementa en 1.
        System.out.println("Después del incremento: " + (++numero)); // 7 Cuando se utiliza el operador de incremento antes de la variable, primero se incrementa en 1 y luego se devuelve el valor actualizado.
        

        // Operador de decremento
        
        System.out.println("Después del decremento: " + (numero--)); // 5 Cuando se utiliza el operador de decremento después de la variable, primero se devuelve el valor actual y luego se decrementa en 1.
        System.out.println("Después del decremento: " + (--numero)); // 3 Cuando se utiliza el operador de decremento antes de la variable, primero se decrementa en 1 y luego se devuelve el valor actualizado.
        

        // Operador unario negativo
        int negativo = -numero;
        System.out.println("Valor negativo: " + negativo); // -5 Cuando se utiliza el operador unario negativo, se cambia el signo del valor de la variable a su opuesto.
        
        // Operador unario positivo
        int positivo = +numero;
        System.out.println("Valor positivo: " + positivo); // 5 Cuando se utiliza el operador unario positivo, no se realiza ningún cambio en el valor de la variable, simplemente se devuelve su valor original.
    }
    
}
