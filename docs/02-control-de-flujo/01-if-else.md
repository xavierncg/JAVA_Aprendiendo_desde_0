Los flujos de control en JAVA define como se ejecutan las instrucciones de un programa y no solamente en JAV en la programacion como tal.

Se divide en 3 tipos principales.

* Secuenciales.
Este se ejecutara linea por linea, y es la que estamos usando al aprender a programar al inicio del curso ejemplo:

int numero = 10;  //asignacion simple.

System.out.println("numero = " + numero)  // esto mostrara el resultado de la variable numero.

A esto llamamos secuencial que va de arriba hacia abajo en orden. 

* condicional - (if,else if, else)
Condicional nos permite tomar decisiones y no ir netamente linea por linea, si no pegar saltos dependiendo si una condicion se cumple o no
ejemplo:

int numero = scanner.nextInt();

if (numero > 0){
    System.out.println("El numero es positivo.");
} else if (numero < 0){
    System.out.println("El numero es negativo.");
} else {
    System.out.println("El numero es 0.");
}

Aca tenemos 3 caminos posibles donde si una condicion se cumple hace algo, sino si, hara algo y en otro caso es 0.