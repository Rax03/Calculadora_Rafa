import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int operando1 = 0;
        int operando2 = 0;
        int resultado = 0;
        int opcion = 0; // la apcion que elige el usuario
        do{

            System.out.print("Introduce un operando 1: ");
            operando1 = teclado.nextInt();
            System.out.print("Introduce un operando 2: ");
            operando2 = teclado.nextInt();

            System.out.print("Pulse 1 para sumar \n"
                    +"Pulsa 2 para restar \n"
                    +"Pulasa 3 para multiplicar\n"
                    +"Pulsa 4 para dividir\n"
                    +"Pulsa 5 para salir del programa");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    resultado=operando1+operando2;
                    System.out.print("Su resultado es " +resultado);

                    break;
                case 2:
                    resultado=operando1-operando2;
                    System.out.print("Su resultado es " +resultado);
                    break;
                case 3:
                    resultado=operando1*operando2;
                    System.out.print("Su resultado es " +resultado);
                    break;
                case 4:
                    if(operando2>0){
                        resultado=operando1/operando2;
                        System.out.print("Su resultado es " +resultado);
                    }else{
                        System.out.print("Error no se puede dividir por 0");

                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.print("Opcion no válida");
            }
            System.out.println();

        }while(opcion!=5);
        System.out.print("Gracias por usar calculadora Rafa.");
    }
}