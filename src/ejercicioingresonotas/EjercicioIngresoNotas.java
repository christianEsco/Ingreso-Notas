package ejercicioingresonotas;

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
            }

        }
