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
        ArrayList<Estudiante> sedeCentral = new ArrayList<Estudiante>();
        ArrayList<Estudiante> sedeSur = new ArrayList<Estudiante>();
        ArrayList<Estudiante> sedeNorte = new ArrayList<Estudiante>();
        boolean go=true;
        String opcion="";
        String opcion2="";
        int currentIndex;
        int clase;
        int notaClase=0;
        String opcion3="";
        int opcion4=0;

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
                    Examen examen = new Examen("",notaClase);
                    switch(opcion4){
                        case 1:
                            examen.setNombre("Matematica");
                            break;
                        case 2:
                            examen.setNombre("Lenguaje");
                            break;
                        case 3:
                            examen.setNombre("Quimica");
                            break;
                        case 4:
                            examen.setNombre("Fisica");
                            break;
                        case 5:
                            examen.setNombre("Comprension lectora");
                            break;
                        case 6:
                            examen.setNombre("Estadistica");
                            break;
                    }
                    estudiantes.get(currentIndex).setExamen(examen);
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
                            sedeCentral.add(estudiantes.get(currentIndex));
                            break;
                        case "2":
                            sedeSur.add(estudiantes.get(currentIndex));
                            break;
                        case "3":
                            sedeNorte.add(estudiantes.get(currentIndex));
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
                            printSedeCentral(sedeCentral);
                            break;
                        case "2":
                            printSedeSur(sedeSur);
                            break;
                        case "3":
                            printSedeNorte(sedeNorte);
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }

                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
                }
}
            }
    public static void printMenu(){
        System.out.println("Bienvenido al sistema de la Universidad Escuintleca");
        System.out.println("1. Ingresar estudiante");
        System.out.println("2. Ingresar nota");
        System.out.println("3. Ver promedio de notas por sede");
        System.out.println("4. Salir");
    }
    public static void printEstudiantes(ArrayList<Estudiante> estudiantes){
        System.out.println("");
        System.out.println("Lista de Estudiantes: ");
        for (int i=0; i<estudiantes.size(); i++){
            System.out.println( i + " - " + estudiantes.get(i).getNombre());
            System.out.println("");
        }
    }
    public static void printMenuClases(){
        System.out.println("Que examen realizo?");
        System.out.println("Ingrese el numero de la clase: ");
        System.out.println("1. Matematica");
        System.out.println("2. Lenguaje");
        System.out.println("3. Quimica");
        System.out.println("4. Fisica");
        System.out.println("5. Comprension lectora");
        System.out.println("6. Estadistica");
    }
    public static void printMenuSedes(){
        System.out.println("De que sede le gustaria ver la estadistica descriptiva?");
        System.out.println("1. Sede central");
        System.out.println("2. Sede sur");
        System.out.println("3. Sede norte");
    }
    public static void printSedeCentral(ArrayList<Estudiante> sedeCentral) {
        System.out.println("Sede central");
        System.out.println("");
    
        for (Estudiante estudiante : sedeCentral) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Examenes:");
            for (Examen examen : estudiante.getExamenes()) {
                System.out.println("  - " + examen.getNombre() + ": " + examen.getNota());
            }
            System.out.println("");
        }
    }
    public static void printSedeSur(ArrayList<Estudiante> sedeSur) {
        System.out.println("Sede sur");
        System.out.println("");
    
        for (Estudiante estudiante : sedeSur) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Examenes:");
            for (Examen examen : estudiante.getExamenes()) {
                System.out.println("  - " + examen.getNombre() + ": " + examen.getNota());
            }
            System.out.println("");
        }
    }
    public static void printSedeNorte(ArrayList<Estudiante> sedeNorte) {
        System.out.println("Sede norte");
        System.out.println("");
    
        for (Estudiante estudiante : sedeNorte) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Examenes:");
            for (Examen examen : estudiante.getExamenes()) {
                System.out.println("  - " + examen.getNombre() + ": " + examen.getNota());
            }
            System.out.println("");
        }
    }
}