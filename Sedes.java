import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Sedes {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Sedes(String nombre, ArrayList<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
    public double calcularMediana(String materia) {
        List<Integer> notas = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNotasPorMateria().containsKey(materia)) {
                notas.addAll(estudiante.getNotasPorMateria().get(materia));
            }
        }
        
        Collections.sort(notas);
        int size = notas.size();
        
        if (size % 2 == 0) {
            int mid1 = notas.get(size / 2 - 1);
            int mid2 = notas.get(size / 2);
            return (double) (mid1 + mid2) / 2.0;
        } else {
            return (double) notas.get(size / 2);
        }
    }

    public int calcularModa(String materia) {
        List<Integer> notas = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNotasPorMateria().containsKey(materia)) {
                notas.addAll(estudiante.getNotasPorMateria().get(materia));
            }
        }

        int moda = 0;
        int maxCount = 0;

        for (int nota : notas) {
            int count = Collections.frequency(notas, nota);
            if (count > maxCount) {
                moda = nota;
                maxCount = count;
            }
        }

        return moda;
    }

    public double calcularDesviacionEstandar(String materia) {
        List<Integer> notas = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNotasPorMateria().containsKey(materia)) {
                notas.addAll(estudiante.getNotasPorMateria().get(materia));
            }
        }

        double media = notas.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        double sumOfSquares = notas.stream().mapToDouble(nota -> Math.pow(nota - media, 2)).sum();
        return Math.sqrt(sumOfSquares / notas.size());
    }
    public ArrayList<String> obtenerMateriasPorSede(Sedes sede) {
        ArrayList<String> materias = new ArrayList<>();
        for (Estudiante estudiante : sede.getEstudiantes()) {
            for (Map.Entry<String, List<Integer>> entry : estudiante.getNotasPorMateria().entrySet()) {
                if (!materias.contains(entry.getKey())) {
                    materias.add(entry.getKey());
                }
            }
        }
        return materias;
    }
    
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
}
