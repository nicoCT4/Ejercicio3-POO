import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int carnet;
    private String correo;
    private String fechaDeNacimiento;
    private ArrayList<Examen> examenes;
    private Map<String, List<Integer>> notasPorMateria = new HashMap<>();

    public Estudiante(String nombre, String apellido, int carnet, String correo, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.correo = correo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.examenes = new ArrayList<Examen>();
    } 
    public void setExamen(Examen examen) {
        this.examenes.add(examen);
    }
    public ArrayList<Examen> getExamenes() {
        return examenes;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getCarnet() {
        return carnet;
    }
    public String getCorreo() {
        return correo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void agregarNota(String materia, int nota) {
        if (!notasPorMateria.containsKey(materia)) {
            notasPorMateria.put(materia, new ArrayList<>());
        }
        notasPorMateria.get(materia).add(nota);
    }

    public Map<String, List<Integer>> getNotasPorMateria() {
        return notasPorMateria;
    }
}

