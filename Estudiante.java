import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int carnet;
    private String correo;
    private String fechaDeNacimiento;
    private ArrayList<Examen> examenes;

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
    public float promedio(){
        float sum=0;
        for (Examen examen : examenes) {
            sum+=examen.getNota();
        }
        return examenes.isEmpty() ? 0 : sum / examenes.size();
    }
}

