/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioingresonotas;
// juan josue chajil navarro carnet 2000166
/**
 *
 * @author DELL
 */
public class Alumnos {
    
     int carnet;
    String nombre;
    double nota1;
    double nota2;
    double zona;
    double Examen;
    double total;

    public Alumnos(int carnet, String nombre, double nota1, double nota2, double zona, double Examen) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.zona = zona;
        this.Examen = Examen;
        this.total = nota1 + nota2 + zona + Examen;
    }

    public Alumnos() {
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }
}
