public class Arbol {

    Nodo raiz; // Nodo principal del árbol (raíz)

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    // ================= MÉTRICAS =================

    // Altura del árbol
    public int getAltura(Nodo nodo) {
        if (nodo == null) return 0;

        int alturaMax = 0;

        for (Nodo hijo : nodo.hijos) {
            int alturaHijo = getAltura(hijo);
            if (alturaHijo > alturaMax) {
                alturaMax = alturaHijo;
            }
        }

        return alturaMax + 1;
    }

    // Contar hojas (nodos sin hijos)
    public int contarHojas(Nodo nodo) {
        if (nodo.hijos.isEmpty()) {
            return 1; // Es hoja
        }

        int total = 0;
        for (Nodo hijo : nodo.hijos) {
            total += contarHojas(hijo);
        }

        return total;
    }

    // ================= REPRESENTACIÓN GRÁFICA =================

   public void imprimirArbol(Nodo nodo, String prefijo, boolean esUltimo) {

        // Imprime el nodo con ramas visuales
        System.out.println(prefijo + (esUltimo ? "└── " : "├── ") + nodo.dato);

        for (int i = 0; i < nodo.hijos.size(); i++) {

            boolean ultimoHijo = (i == nodo.hijos.size() - 1);

            imprimirArbol(
                nodo.hijos.get(i),
                prefijo + (esUltimo ? "    " : "│   "),
                ultimoHijo
            );
        }
    }
}