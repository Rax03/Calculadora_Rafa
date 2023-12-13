import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int operando1 = -1;
        int operando2 = -1;
        int resultado = 0;
        int opcion = 0; // la opción que elige el usuario
        do {

               opcion = opcionesUsuario();
               operaciones(opcion);


            System.out.println();
        } while (opcion != 5);
        System.out.print("************************************\n" +
                "Gracias por usar calculadora Rafa\n" +
                "********************************** \n");
    }


    public static int opcionesUsuario() {
        Scanner teclado = new Scanner(System.in);
        int opcion=0;

            System.out.print("Pulse 1 para sumar \n"
                    + "Pulsa 2 para restar \n"
                    + "Pulsa 3 para multiplicar\n"
                    + "Pulsa 4 para dividir\n"
                    + "Pulsa 5 para salir del programa\n ");
            try {
                opcion = teclado.nextInt();
            } catch (Exception e) {
                teclado.nextLine();
            }
        return opcion;
    }



    public static int operaciones(int opcion) {
        int resultado = 0;

        switch (opcion) {
            case 1:
                resultado = suma(resultado);
                System.out.print("Su resultado es " + resultado);
                break;
            case 2:
                resultado = resta(resultado);
                System.out.print("Su resultado es " + resultado);
                break;
            case 3:
                resultado = multiplica(resultado);
                System.out.print("Su resultado es " + resultado);
                break;
            case 4:
                resultado = divide(resultado);
                System.out.print("Su resultado es " + resultado);
                break;
            case 5:
                break;
            default:
                System.out.print("Opción no válida");
        }
        System.out.println();
        return opcion;

    }
    public static int suma(int resultado){
        int operando1 =0;
        int operando2 =0;
        resultado=operando1+operando2;
        return(resultado);

    }
    public static int resta(int resultado) {
        int operando1 = 0;
        int operando2 = 0;
        resultado = operando1 - operando2;
        return (resultado);
    }
    public static int multiplica(int resultado) {
        int operando1 = 0;
        int operando2 = 0;
        resultado = operando1 * operando2;
        return (resultado);
    }
    public static int divide(int resultado) {
        int operando1 = 0;
        int operando2 = 0;
        if (operando1>0) {
            resultado = operando1 / operando2;
        }else{
            System.out.println("No se puede dividir por 0");
        }
        return (resultado);
    }

}

