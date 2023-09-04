import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sedes {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Sedes(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public float promedioNotasSede() {
        float sum = 0;
        for (Estudiante estudiante : estudiantes) {
            sum += estudiante.promedio();
        }
        return estudiantes.isEmpty() ? 0 : sum / estudiantes.size();
    }

    public float medianaNotasSede() {
        List<Float> notas = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            for (Examen examen : estudiante.getExamenes()) {
                notas.add((float) examen.getNota());
            }
        }

        Collections.sort(notas);

        int n = notas.size();
        if (n % 2 == 0) {
            float nota1 = notas.get(n / 2 - 1);
            float nota2 = notas.get(n / 2);
            return (nota1 + nota2) / 2;
        } else {
            return notas.get(n / 2);
        }
    }

    public int modaNotasSede() {
        List<Float> notas = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            for (Examen examen : estudiante.getExamenes()) {
                notas.add((float) examen.getNota());
            }
        }

        Map<Float, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        float moda = 0;

        for (Float nota : notas) {
            int frequency = frequencyMap.getOrDefault(nota, 0) + 1;
            frequencyMap.put(nota, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                moda = nota;
            }
        }

        return (int) moda;
    }

    public float desviacionEstandarNotasSede() {
        List<Float> notas = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            for (Examen examen : estudiante.getExamenes()) {
                notas.add((float) examen.getNota());
            }
        }

        float sum = 0;
        float mean = promedioNotasSede();

        for (float nota : notas) {
            sum += Math.pow(nota - mean, 2);
        }

        return (float) Math.sqrt(sum / notas.size());
    }
}




