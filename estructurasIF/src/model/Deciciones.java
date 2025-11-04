package model;

import java.util.Scanner;

public class Deciciones {
    public void estructuraIF(int nota){
        System.out.println("vamos a explicar la estructura IF");
        //int nota = 4;
        if (nota>5){
            System.out.println("el examen esta aprovado ");
        } else {
            System.out.println("el examen esta suspenso");
        }
        System.out.println("terminando evaluacion");

    }

    public void estructuraIFELSEIF(double nota){
        // 0 desastroso
        // 1-3 esta mal
        // 4-4.99 raspado
        // 5-7.99 bien
        // 8-8.99 notable
        // 9-9.99 sobre saliente
        // 10 mh
        System.out.println("iniciando la evaluacion del examen ");

        if (nota>=0 && nota<=10){
            if (nota<1){// esta entre 0 y 0.99?
                System.out.println("examen desastroso");

            } else if(nota<4){
                System.out.println("el examen esta mal");

            } else if (nota<5) {
                System.out.println("el examen esta suspenso raspado");

            } else if (nota<8) {
                System.out.println("examen bien");

            } else if (nota<9){
                System.out.println("notable");

            } else if (nota<10){
                System.out.println("sobresaliente");

            } else {
                System.out.println("examen MH");
            }
        } else {
            System.out.println("rango incorrecto");
        }
        System.out.println("finalizando evaluacion");


    }

    public void ejercicio4T2(){

        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("dime que numero quieres evaluar ");

        int numero = lecturaTeclado.nextInt();

        if (numero%2==0){
            System.out.printf("el numero %d es par %n",numero);
        } else {
            System.out.printf("el numero %d es inpar %n",numero);
        }
        lecturaTeclado.close();

    }

    public void ejercicio10T2(int horas){
        //pide el salio base*hora
        //horas trabajadas
        //horas extra?
        //horas extra>40horas
        //horas extra*2
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("cual es tu salario por hora");
        int salarioHora = lecturaTeclado.nextInt();

        System.out.println("cuantas horas trabajaste");
        int horasTrabajadas = lecturaTeclado.nextInt();

        System.out.println(" has hecho horas extra");
        boolean extra = lecturaTeclado.nextBoolean();


        int salarioTotal =0;
        salarioTotal += horas*salarioHora;

        if (extra && horasTrabajadas>horas){
            int numeroHorasExtras = horasTrabajadas-horas;
            salarioTotal = numeroHorasExtras*(salarioHora*2);
        }
        System.out.printf("el salario cobrado este mes es %d euros %n ",salarioTotal);
        lecturaTeclado.close();

    }
}
