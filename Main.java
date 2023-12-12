import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int operando1 = -1;
        int operando2 = -1;
        int resultado = 0;
        int opcion = 0; // la opción que elige el usuario
        do{
            do {
                System.out.print("*************************\n"+
                        "Introduce un operando 1 \n"+
                        "************************* \n"+
                        " ");
                try {
                    operando1 = teclado.nextInt();
                }catch (Exception e) {
                    System.out.println("Inserte un numero");
                    teclado.nextLine();
                }
            }while (operando1==-1);
            do {
                System.out.print("*************************\n"+
                        "Introduce un operando 2\n"+
                        "************************* \n"+
                        " ");
                try {
                    operando2 = teclado.nextInt();
                } catch (Exception e) {
                    System.out.println("Inserte un numero");
                    teclado.nextLine();
                }
            }while (operando2==-1);
            do {
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
            }while (opcion==0);
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
                    System.out.print("Opción no válida");
            }
            System.out.println();
        }while(opcion!=5);
        System.out.print("************************************\n"+
                "Gracias por usar calculadora Rafa\n"+
                "********************************** \n");
    }
}