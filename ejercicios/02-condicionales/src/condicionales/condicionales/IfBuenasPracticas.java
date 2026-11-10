package condicionales.condicionales;

public class IfBuenasPracticas {
    public static void main(String[] args) {
        int age = 17;
        double average = 6.5;
        boolean isApproved = average >= 7.0;
        boolean isAdult = age > 17;

        if (isApproved && isAdult) {
            System.out.println("El estudiante ha aprobado");
        } 
        else if (!isApproved) {
            System.out.println("El estudiante no ha aprobado");
        } else {
            System.out.println("El estudiante no cumple con los requisitos");
        }
    }  
}
