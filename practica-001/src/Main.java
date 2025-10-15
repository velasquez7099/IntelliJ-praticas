public class Main {
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

    }



}
