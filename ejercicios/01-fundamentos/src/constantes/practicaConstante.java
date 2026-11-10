package constantes;

public class practicaConstante {
    public static void main(String[] arg) {
        final double TAX_RATE = 0.10; // Declaración de una constante para la tasa de impuestos
        int grossSalary = 3000; // Salario bruto
        double netSalary = grossSalary * (1 - TAX_RATE); // Cálculo del salario neto después de impuestos
        System.out.println("Salario neto después de impuestos: " + netSalary);
    }
    
}
