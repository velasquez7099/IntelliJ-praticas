public class MainMetodos {
    public static void main(String[] args) { // ESTOS SON METODOS
        System.out.println("Main para probar metodos y variables");

        saludar("BORJA"); // las declaras y luego las puedes llamar
        despedir("MARIA");
    }

    public static void saludar (String data){ // ES UN METODO

        System.out.println("Enhorabuena "+data+" has llamado a tu primer metodo");

    }
    public static void despedir (String data){ // OTRO METODO

        System.out.println("hasta luego "+data+" hemos terminado");

    }
}
