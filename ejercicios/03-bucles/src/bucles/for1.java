package bucles;

public class for1 {
    public static void main(String[] args) {
        //Ejemplo de diferentes maneras de usar un blucle for en Java
        // For loop Ejemplo
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // For loop con arreglo
        String[] frutas = {"Manzana", "Banana", "Cereza"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: " + frutas[i]);
        }

        // For-each loop
        for (String fruta : frutas) {
            System.out.println("Fruta (for-each): " + fruta);
        }
    }

    
    
    
}
