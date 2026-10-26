Que es una variable en JAVA?

Una variable es un espacio en memoria donde se almacena un valor dicho valor puede cambiar durante la ejecucion del programa.

JAVA es un lenguaje fuertemente **TIPADO** que significa esto:

\*\* Significa que vamos a estar obligados a cada vez que creamos una variables a decirle que tipo de datos se va a almacenar en esa variable o cajita que crearemos en memoria.
la estructura para declarar una variable seria la siguiente:

En java las variables debemos declararlas de esta manera:

    Tipo De Dato    Nombre       =  valor ;
        |              |         |    |
       int           numero      =     6; ---> estamos diciendo que queremos declarar un numero entero e inicializamos con 6. Por lo tanto no podremos guardar otro valor que no sea int.
                                               A eso nos referimos con fuertemente tipado, que al declarar una variable con un tipo de dato, solalente podremos usar los datos que correspondan al  tipo de dato que declaramos.

Tipos de datos primitivos:

String nombre = "Adrian";

int numero = 10;

float precio = 14,400f

short edad = 17

long cedula = 234567889

char caracter = 'c'

boolean isActive = true

****Constante****

Una Constante es un espacio en memoria donde se almacena un valor, pero a diferencia de una variable su valor no puede cambiar durante la ejecucion del programa ni en la compilacion.
y su manera de declararla al antes de elegir el tipo de dato debemos colocar final y su nombre debe ser escrito en mayuscula.

En JAVA las CONSTANTES debemos declararlas de esta manera:

Modificador Tipo De Dato Nombre = valor;---> punto y coma representa el fin de la sentencia  
 | | | |
final int FECHA_NACIMIENTO = 1994;---> No tiene valor por defecto, por lo tanto debemos declararlo
e inicializarlo directamente otorgandole un valor al instante.
las variables a por otro lado si tienen valores por defecto. pero las constantes NO.
Usar UPPER_CASE apra las Constantes.

Reglas Obligatorias para definir nombres de **Variables** y **Constantes**:

    0 1                        0 2                          0 3                                    0 4
     |                          |                            |                                      |

No pueden Deben comenzar Solo pueden No pueden ser
contener Espacios. con una letra,$ o _ Contener letras,numeros, Palabras Reservadas.
$ o _

**Practicas Recomendadas**:

    0 1                        0 2                          0 3                                    0 4
     |                          |                            |                                      |

Usa camelCase. Elige nombres Java es sencible a Evita nombres muy
Significativos. Mayusculas. Largos.
