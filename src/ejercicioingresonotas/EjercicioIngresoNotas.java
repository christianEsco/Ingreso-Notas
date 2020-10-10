package ejercicioingresonotas;
/*
Integrantes:
Christian Escobar 2224
Roxana Estrada 1600747
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioIngresoNotas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Alumnos> ListAlumno = new ArrayList();

        int carnet;
        String nombre;
        double nota1;
        double nota2;
        double zona;
        double Examen;
        double total;
        int opcion;

        do {

            System.out.println("Menu");
            System.out.println("1. Agregar alumnos y notas");
            System.out.println("2. ver datos");
            System.out.println("3. Cambiar un dato");
            System.out.println("4. salir");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese carnet");
                    carnet = in.nextInt();
                    System.out.println("Ingrese nombre");
                    nombre = in.next();
                    System.out.println("Ingrese parcial-1");
                    nota1 = in.nextDouble();
                    System.out.println("Ingrese parcial-2");
                    nota2 = in.nextDouble();
                    System.out.println("Ingrese zona");
                    zona = in.nextDouble();
                    System.out.println("Ingrese Examen");
                    Examen = in.nextDouble();

                    ListAlumno.add(new Alumnos(carnet, nombre, nota1, nota2, zona, Examen));
                    break;
                case 2:
                    System.out.println("Los datos guardados son ");
                    System.out.println("===============================================");
                    System.out.println("Numero de alumo \t Nombre \t Numero de carnet \t Nota parcial 1 \t Nota parcial 2 \t Nota de zona \t Examen \t Total");
                    int d = 1;
                    for (Alumnos alumno : ListAlumno) {
                        System.out.println(d + "\t\t\t " + alumno.getNombre() + "\t\t " + alumno.getCarnet()
                                + "\t\t\t " + alumno.getNota1() + " \t\t\t " + alumno.getNota2()
                                + "   1"
                                + "\t\t " + alumno.getZona() + " \t\t " + alumno.getExamen() + " \t\t " + alumno.getTotal());
                        d++;
                    }
                    System.out.println("===============================================");

                    break;
                case 3:
                    System.out.println("Ingrese el numero de canet que decea cambiar");
                    int carneet = in.nextInt();
                    int indice = 0;
                    boolean act = false;
                for (Alumnos alumno : ListAlumno) {

                        if (alumno.getCarnet() == carneet) {
                            int selec;
                            act = true;
                            System.out.println("Hay repetido" + indice);
                            System.out.println("Seleccione que Dato decea modificar");
                            System.out.println("1. carnet");
                            System.out.println("2. Nombre");
                            System.out.println("3. parcial-1");
                            System.out.println("4. parcial-2");
                            System.out.println("5. zona");
                            System.out.println("6. Examen");
                            selec = in.nextInt();
                            switch (selec) {
                                case 1:
                                    System.out.println("Ingresa el nuevo numero de carnet");
                                    carnet = in.nextInt();
                                    ListAlumno.get(indice).setCarnet(carnet);
                                    break;
                                case 2:
                                    System.out.println("Ingresa el nuevo nombre");
                                    nombre = in.next();
                                    ListAlumno.get(indice).setNombre(nombre);
                                    break;
                                case 3:
                                    System.out.println("Ingresa la nueva nota del parial-1");
                                    nota1 = in.nextInt();
                                    ListAlumno.get(indice).setNota1(nota1);
                                    ListAlumno.get(indice).setTotal(alumno.getNota1() + alumno.getNota2() + alumno.getZona() + alumno.getExamen());
                                    break;
                                case 4:
                                    System.out.println("Ingresa la nueva nota del parial-2");
                                    nota2 = in.nextInt();
                                    ListAlumno.get(indice).setNota2(nota2);
                                    ListAlumno.get(indice).setTotal(alumno.getNota1() + alumno.getNota2() + alumno.getZona() + alumno.getExamen());
                                    break;
                                case 5:
                                    System.out.println("Ingresa la nueva nota de zona");
                                    zona = in.nextInt();
                                    ListAlumno.get(indice).setZona(zona);
                                    ListAlumno.get(indice).setTotal(alumno.getNota1() + alumno.getNota2() + alumno.getZona() + alumno.getExamen());
                                    break;
                                case 6:
                                    System.out.println("Ingresa la nueva nota del examen");
                                    Examen = in.nextInt();
                                    ListAlumno.get(indice).setExamen(Examen);
                                    ListAlumno.get(indice).setTotal(alumno.getNota1() + alumno.getNota2() + alumno.getZona() + alumno.getExamen());
                                    break;
                            }

                        }
                        indice++;
                    }
                    if (act == false) {
                        System.out.println("===============================================");
                        System.out.println("No hay registro de este carnet");
                        System.out.println("Por favor ingrese un carnet valido");
                        System.out.println("===============================================");
                    }

                    break;
            }
        } while (opcion != 4);

    }
}
            

        
