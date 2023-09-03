public class Examen {
    private int nombre;
    private int nota;

    public Examen(int nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public int getNombre() {
        return nombre;
    }
    public int getNota() {
        return nota;
    }
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    //Promedio, mediana, moda, desviacion estandar de notas
}