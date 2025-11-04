public class Main { // 09_10 PROGRAMACION
     static int edadGlobal = 12;
     
     public static void main(String[] args) { // abreviacion psv



        // para imprimir
        System.out.println("este es mi primer proyecto");
        System.out.println("y esto es una prueba");
        //variables

        String miNombre; // variable no definida ###
        char letraDNI='Z';//###
        Character letraDNIcompleja='O' ;
        int edad= 23;//### byte, short, int, long
        Integer edadCompleja=30;
        float peso= 67.4f;
        Float pesoComplejo=100.5f;
        double altura= 1.70;
        Double alturaCompleja=2.10;
        boolean experiencia= true;
        Boolean experienciaCompleja=true;

        final String DNI = "123123A";// una variable no mutable

        miNombre="emerson"; // variable definida
        miNombre="vero";;// puedo cambiarlas,tomara la ultima variable
        letraDNI='S';
        letraDNI=90;
        edad ++;
        edad ++;
        peso=70.5f;
        altura=1.80;
        experiencia= false;



        System.out.println("mi nombre es "+miNombre);//imprecion mas concatenacion
        System.out.println("la letra es "+letraDNIcompleja);
        System.out.println("mi edad es "+edadCompleja+" años");
        System.out.println("mi peso es "+pesoComplejo+" kg");
        System.out.println("mi altura es "+alturaCompleja+" cm");
        System.out.println("tiene experiencia? "+experienciaCompleja);
        System.out.println("mi DNI es "+DNI);
        System.out.println("el valor de numero PI es "+Math.PI);// constantes matematicas
        System.out.println("el valor de E es "+Math.E);
        System.out.println("El valor maximo de un int es "+Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int es "+Integer.MIN_VALUE);

    }
    public  static void nombreMetodo (){
        int edadglobal =14;
        System.out.println();
        System.out.println(edadGlobal);


    }

    public void nombreMetodo1 (){




    }


}
