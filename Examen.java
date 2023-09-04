public class Examen {
    private String nombre;
    private int nota;

    public Examen(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNota() {
        return nota;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
}