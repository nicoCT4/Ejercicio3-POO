//Universidad del Valle de Guatemala
//Nicolás Concuá - 23197
//1/09/2023
//Ejercicio 3- Arraylist
import java.util.Scanner;
import java.util.ArrayList;

public class universidad{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Sedes sedeC=new Sedes("Sede central", estudiantes);
        Sedes sedeS=new Sedes("Sede sur", estudiantes);
        Sedes sedeN=new Sedes("Sede norte", estudiantes);
        boolean go=true;
        String opcion="";
        String opcion2="";
        int currentIndex;
        int clase;
        int notaClase=0;
        String opcion3="";
        int opcion4=0;
        String materia1="Matematica";
        String materia2="Lenguaje";
        String materia3="Quimica";
        String materia4="Fisica";
        String materia5="Comprension lectora";
        String materia6="Estadistica";

        //Menu
        while (go){
            printMenu();

            System.out.println("Ingrese la opcion que desea: ");
            opcion=sc.nextLine();
            System.out.println("");

            switch(opcion){
                case "1":
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre=sc.nextLine();
                    System.out.println("Ingrese el apellido del estudiante: ");
                    String apellido=sc.nextLine();
                    System.out.println("Ingrese el carnet del estudiante: ");
                    int carnet=sc.nextInt();
                    System.out.println("Ingrese el correo del estudiante: ");
                    String correo=sc.next();
                    System.out.println("Ingrese la fecha de nacimiento del estudiante: ");
                    String fechaDeNacimiento=sc.next();
                    Estudiante estudiante = new Estudiante(nombre, apellido, carnet, correo, fechaDeNacimiento);
                    sc.nextLine();
                    estudiantes.add(estudiante);
                    break;
                case "2":
                    printEstudiantes(estudiantes);
                    System.out.println("Ingrese el indice");
                    currentIndex=sc.nextInt();
                    sc.nextLine();
                    printMenuClases();
                    opcion4=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la nota: ");
                    notaClase=sc.nextInt();
                    switch(opcion4){
                        case 1:
                        estudiantes.get(currentIndex).agregarNota(materia1, notaClase);
                            break;
                        case 2:
                        estudiantes.get(currentIndex).agregarNota(materia2, notaClase);
                            break;
                        case 3:
                        estudiantes.get(currentIndex).agregarNota(materia3, notaClase);
                            break;
                        case 4:
                        estudiantes.get(currentIndex).agregarNota(materia4, notaClase);
                            break;
                        case 5:
                        estudiantes.get(currentIndex).agregarNota(materia5, notaClase);
                            break;
                        case 6:
                        estudiantes.get(currentIndex).agregarNota(materia6, notaClase);
                            break;
                    }
                    System.out.println("En que sede se ubica:");
                    System.out.println("1. Sede central");
                    System.out.println("2. Sede sur");
                    System.out.println("3. Sede norte");
                    System.out.println("Ingrese 1, 2 o 3 dependiendo de donde se ubica : ");
                    opcion2=sc.next();
                    System.out.println("");
                    if (notaClase<0 || notaClase>100){
                        System.out.println("La nota debe ser entre 0 y 100");
                    }else{System.out.println("La nota se ingreso correctamente");}
                    switch(opcion2){
                        case "1":
                            sedeC.setEstudiante(estudiantes.get(currentIndex));
                            break;
                        case "2":
                            sedeS.setEstudiante(estudiantes.get(currentIndex));
                            break;
                        case "3":
                            sedeN.setEstudiante(estudiantes.get(currentIndex));
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }

                    break;
                case "3":
                    printMenuSedes();
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion3=sc.next();
                    System.out.println("");
                    switch(opcion3){
                        case "1":
                            ArrayList<String> materiasSedeC = sedeC.obtenerMateriasPorSede(sedeC);
                            for (String materia : materiasSedeC) {
                                double medianaSedeC = sedeC.calcularMediana(materia);
                                int modaSedeC = sedeC.calcularModa(materia);
                                double desviacionEstandarSedeC = sedeC.calcularDesviacionEstandar(materia);
                                System.out.println(materia);
                                System.out.println("Mediana: " + medianaSedeC);
                                System.out.println("Moda: " + modaSedeC);
                                System.out.println("Desviación Estándar: " + desviacionEstandarSedeC);
                                System.out.println();
                            }
                            break;
                        case "2":
                            ArrayList<String> materiasSedeS = sedeS.obtenerMateriasPorSede(sedeS);
                            for (String materia : materiasSedeS) {
                                double medianaSedeS = sedeS.calcularMediana(materia);
                                int modaSedeS = sedeS.calcularModa(materia);
                                double desviacionEstandarSedeS = sedeS.calcularDesviacionEstandar(materia);
                                System.out.println(materia);
                                System.out.println("Mediana: " + medianaSedeS);
                                System.out.println("Moda: " + modaSedeS);
                                System.out.println("Desviación Estándar: " + desviacionEstandarSedeS);
                                System.out.println();
                            }
                            break;
                        case "3":
                            ArrayList<String> materiasSedeN = sedeN.obtenerMateriasPorSede(sedeN);
                            for (String materia : materiasSedeN) {
                                double medianaSedeN = sedeN.calcularMediana(materia);
                                int modaSedeN = sedeN.calcularModa(materia);
                                double desviacionEstandarSedeN = sedeN.calcularDesviacionEstandar(materia);
                                System.out.println(materia);
                                System.out.println("Mediana: " + medianaSedeN);
                                System.out.println("Moda: " + modaSedeN);
                                System.out.println("Desviación Estándar: " + desviacionEstandarSedeN);
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }

                    break;
                case "4":
                    System.out.println("Gracias por usar el sistema");
                    go=false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
                }
}
            }
    public static void printMenu(){
        System.out.println("\u001B[31m====================================================");
        System.out.println("Bienvenido al sistema de la Universidad Escuintleca");
        System.out.println("1. Ingresar estudiante");
        System.out.println("2. Ingresar nota");
        System.out.println("3. Ver promedio de notas por sede");
        System.out.println("4. Salir");
        System.out.println("====================================================");
    }
    public static void printEstudiantes(ArrayList<Estudiante> estudiantes){
        System.out.println("");
        System.out.println("\u001B[33m-Lista de Estudiantes: ");
        for (int i=0; i<estudiantes.size(); i++){
            System.out.println( i + " - " + estudiantes.get(i).getNombre());
            System.out.println("");
        }
    }
    public static void printMenuClases(){
        System.out.println("====================================================");
        System.out.println("Que examen realizo?");
        System.out.println("Ingrese el numero de la clase: ");
        System.out.println("1. Matematica");
        System.out.println("2. Lenguaje");
        System.out.println("3. Quimica");
        System.out.println("4. Fisica");
        System.out.println("5. Comprension lectora");
        System.out.println("6. Estadistica");
        System.out.println("====================================================");
    }
    public static void printMenuSedes(){
        System.out.println("\u001B[33m====================================================");
        System.out.println("De que sede le gustaria ver la estadistica descriptiva?");
        System.out.println("1. Sede central");
        System.out.println("2. Sede sur");
        System.out.println("3. Sede norte");
        System.out.println("====================================================");
    }   
}