
import java.util.ArrayList;
import java.util.List;

// Clase Nodo: representa cada elemento del árbol general
public class Nodo {

    String dato;                 // Valor del nodo (A, B, C...)
    List<Nodo> hijos;    // Lista de hijos (pueden ser muchos)

    // Constructor
    public Nodo(String dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }

    // Método para agregar un hijo
    public void agregarHijo(Nodo hijo) {
        hijos.add(hijo);
    }
}

