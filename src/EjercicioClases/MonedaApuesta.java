package EjercicioClases;

import java.util.Random;
import java.util.Scanner;

public class MonedaApuesta {
    public static void main(String[] args) {

        double dineroApuesta;
        int cantidadDeTiradas = 1;
        Scanner consola = new Scanner(System.in);

        dineroApuesta = consola.nextDouble();

        while (dineroApuesta > 1 && cantidadDeTiradas <= 50){
            String resultadoTirada = tirarMoneda();

            if(resultadoTirada == "Cara"){
                dineroApuesta*= 2.0;
            }else{
                dineroApuesta/=2.0;
            }

            System.out.println("Tirada " + cantidadDeTiradas + " Resultado "+ resultadoTirada + " Balance " + dineroApuesta);
            cantidadDeTiradas++;
        }
    }

    public static String tirarMoneda(){
        Random rnd = new Random();

        if(rnd.nextBoolean()){
            return "Cara";
        }else{
            return "Cruz";
        }
    }
}
