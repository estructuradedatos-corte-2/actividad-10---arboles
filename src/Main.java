public class Main {

    public static void main(String[] args) {

        // ========== CREAR NODOS ==========
        Nodo A = new Nodo("A"); // Raíz
        Nodo B = new Nodo("B");
        Nodo C = new Nodo("C");
        Nodo D = new Nodo("D");
        Nodo E = new Nodo("E");
        Nodo F = new Nodo("F");

        // ========== RELACIONES PADRE - HIJO ==========
        A.agregarHijo(B);
        A.agregarHijo(C);

        B.agregarHijo(D);
        B.agregarHijo(E);

        C.agregarHijo(F);

        // ========== CREAR ÁRBOL ==========
        Arbol arbol = new Arbol(A);

        // ========== MÉTRICAS ==========
        System.out.println("Altura del árbol: " + arbol.getAltura(A));
        System.out.println("Cantidad de hojas: " + arbol.contarHojas(A));

        // ========== DIBUJO DEL ÁRBOL ==========
        System.out.println("\nRepresentación del Árbol:");
        arbol.imprimirArbol(A, "", true);
    }
}
