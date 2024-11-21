/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unavarra.is.practica7.ejercicios;
import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Paciente {
    private String nombre;
    private float peso;
    private float altura;
    private int anioNacimiento;

    public String getNombre() {
        return nombre;
    }

    public Paciente(String nombre, float peso, float altura, int anioNacimiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.anioNacimiento = anioNacimiento;
    }
    
    private int calcularEdad(){ 
        return LocalDate.now().getYear() - anioNacimiento;
    }
    
    private float calcularImc(){
        return (float) (peso / Math.pow(altura, 2));
    }
    
    public boolean problema(){
        if(calcularImc() >= 25){
           if(calcularEdad() > 65){
               return true;
           }    
        }  
        return false;
    }
}
