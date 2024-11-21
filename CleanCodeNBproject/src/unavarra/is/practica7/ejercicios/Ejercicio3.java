package unavarra.is.practica7.ejercicios;

public class Ejercicio3 {
    enum HMS { correcto,segundos_incorrectos,minutos_incorrectos,hora_incorrecta;}

    public static HMS horaCorrecta(int hora, int minuto, int segundo){
        
        if(hora>0 && hora<24 && minuto>0 && minuto<60 && segundo>0 && segundo<60){
            return HMS.correcto;
        }
        if (hora>0 && hora<24 && minuto>0 && minuto<60){
            return HMS.segundos_incorrectos;
        }
        if (hora>0 && hora<24){
            return HMS.minutos_incorrectos;
        }
        return HMS.hora_incorrecta;
    }

    public static void main(String[] args) {
        System.out.println(horaCorrecta(9,34,23));
        System.out.println(horaCorrecta(25,34,23));
    }
    
}
