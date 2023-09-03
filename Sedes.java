import java.util.ArrayList;

public class Sedes {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    public Sedes(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }
    public float PromedioNotasSede() {
        float sum = 0;
        for (Estudiante estudiante : estudiantes) {
            sum += estudiante.promedio();
        }
        return estudiantes.isEmpty() ? 0 : sum / estudiantes.size();
}
}



