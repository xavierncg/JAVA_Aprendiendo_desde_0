package condicionales.condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int age = 18;

        if (age > 18) {
            System.out.println("Es mayor a 18" );
        }
        else if (age == 18) {
            System.out.println("Es mayor de edad" );
        }else {
            System.out.println("Es menor de edad" );
        }

        // Switch case Ejemplo
        int day = 30;
        
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
        }
    }


}
