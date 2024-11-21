package unavarra.is.practica7.ejercicios;

public class Ejercicio6 {
    
    public static String letraDNI(int num){
        DNI dni = new DNI();
        return dni.devolverLetra(num%23);
    }


    public static void main(String[] args) {
        System.out.println(letraDNI(72700123)); 
    }
    
}