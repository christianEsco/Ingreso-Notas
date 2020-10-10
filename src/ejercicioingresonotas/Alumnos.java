
package ejercicioingresonotas;

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
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getZona() {
        return zona;
    }

    public void setZona(double zona) {
        this.zona = zona;
    }

    public double getExamen() {
        return Examen;
    }

    public void setExamen(double Examen) {
        this.Examen = Examen;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}

