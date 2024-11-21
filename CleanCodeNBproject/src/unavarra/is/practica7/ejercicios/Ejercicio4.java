package unavarra.is.practica7.ejercicios;

public class Ejercicio4 {
    
    private static String[] diasSemana = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
    
    public static String diaSemana(int dia){
        switch (dia){    
            case 1:
                return diasSemana[0];
            case 2:
                return diasSemana[1];
            case 3:
                return diasSemana[2];
            case 4:
                return diasSemana[3];
            case 5:
                return diasSemana[4];
            case 6:
                return diasSemana[5];
            case 7:
                return diasSemana[6];
            default:
                return "dia incorrecto";
        }
    }

    public static void main(String[] args) {
        System.out.println(diaSemana(3));
    }
    
}
