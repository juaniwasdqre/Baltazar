public class Main {
    public static void main(String[] args) {
        String saludo = "hola";
        String pepito = "baltazar";
        int numerin = 17;
        int numerin2 = 35453904;
        //DECLARAR VARIABLES
        //PARA QUE EXISTAN Y PODER UTILIZARLAS
        boolean llueve = false;
        System.out.println(saludo+ " Nombre: "+pepito+" Edad: "+numerin+" DNI: "+numerin2);

        for (int i = 0; i <= 10; i++){
            int tabla = 4;
            System.out.println(i+"x"+tabla+"="+i*tabla);
            if (i == 10){
                System.out.println("Terminamos la tabla del "+tabla);
            }
        }

        boolean soleado = false;
        if (soleado==true){
            System.out.println("Esta soleado!");
        } else {
            System.out.println("Esta nublado..");
        }
    }
}
