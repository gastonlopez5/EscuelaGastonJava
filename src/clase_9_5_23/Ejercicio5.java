package clase_9_5_23;

public class Ejercicio5 {
    /*
        Mostrar los números pares que hay entre el 1 y el 10
    */
    public static void main(String[] args) {
        //While y For -> son bucles (estructuras repetitivas)

        //While
        System.out.println("while");
        System.out.println("-----");

        int i = 1;                  //declaracion
        while (i <= 10){            //condicion
            if (i%2 == 0) {
                System.out.println(i);
            }
            i++;    //paso: no olvidar de incrementar -> i = i+1
        }
    }
}
