import java.util.Scanner;

public class Ejercicio {

    private Scanner lectorTeclado;

    public void ejercicio1() {
        // 1- pedir cosas por teclado
        // 2_ guardar cosas en variables
        lectorTeclado = new Scanner(System.in);
        System.out.println("cuantas bebidas vas a comprar");
        int bebidas = lectorTeclado.nextInt();

        System.out.println("cuantos bocadillos vas a comprar");
        int bocatas = lectorTeclado.nextInt();

        System.out.println("cuanto vale cada bebida");
        double precioBebida = lectorTeclado.nextDouble();

        System.out.println(" precio del bacadillo?");
        double precioBocata = lectorTeclado.nextDouble();

        System.out.println("cuantas personas han realizado la compra");
        int numeroPersonas = lectorTeclado.nextInt();


        // 3- realizar calculos

        double costeBocadillo = bocatas*precioBocata;
        double costoBebidas = bebidas*precioBebida;
        double costoTotal = costeBocadillo+costoBebidas;
        double precioPersona = costoTotal/numeroPersonas;
        // 4- mostrar informacion

        System.out.printf(" el precio total de la compra es: %.2f%n",costoTotal);
        System.out.printf(" el precio total de la compra por persona es: %.2f%n",precioPersona);
        System.out.printf(" el precio total de los bocadillos es: %.2f%n",costeBocadillo);
        System.out.printf(" el precio total de las bebidas es: %.2f%n",costoBebidas);

        lectorTeclado.close();
    }

    public void ejercicio4(){

        // pedir datos
        lectorTeclado = new Scanner(System.in);
        System.out.println("cuantos segundos quieres comvertir a horas");
        int segundosIn = lectorTeclado.nextInt();

        // realizar calculo
            // segundos en una hora 3600
            // minutos en horas 60
            // segundos en minutos 60

        int hora = segundosIn/3600;
        int minutos = (segundosIn%3600)/60;
        int segundos = segundosIn%60;

        //mostrar datos
        System.out.println("los "+segundosIn+" segundos equibalen a "+hora+" horas");
        System.out.println("equibalen a "+minutos+" minutos");
        System.out.println(" equibalen a "+segundos+" segundos");


        lectorTeclado.close();
    }

}
