# actividad-10---arboles



## 📘 Asignatura
Estructuras de Datos 


## 🌳 Tipo de Árbol Implementado

En esta actividad se implementó un **Árbol General (n-ario)**.

Un árbol general es una estructura no lineal donde **cada nodo puede tener múltiples hijos**, a diferencia del árbol binario que solo permite dos.

Este modelo fue elegido porque es el mismo tipo de árbol explicado en clase por el docente, similar a:

- La estructura de carpetas del sistema de archivos.
- Organigramas empresariales.
- Menús anidados de aplicaciones.

---

## 🧠 Terminología Aplicada

En el árbol construido:

- **Raíz**: A
- **Nodos internos**: B y C
- **Hojas**: D, E y F
- **Padre de D y E**: B
- **Padre de F**: C
- **Descendientes de A**: todos los nodos
- **Altura del árbol**: calculada con el método `getAltura()`
- **Cantidad de hojas**: calculada con el método `contarHojas()`

---

## ⚙️ Estructura del Proyecto

El proyecto está compuesto por tres clases:

- `Nodo.java` → Representa cada nodo y su lista de hijos.
- `Arbol.java` → Gestiona la raíz, métricas y la representación gráfica.
- `Main.java` → Construye el árbol igual al ejemplo visto en clase.

---

## 🖥️ Representación Gráfica en Consola

El programa imprime el árbol usando caracteres ASCII para visualizar claramente la jerarquía:

<pre>└── A
├── B
│ ├── D
│ └── E
└── C
└── F</pre>


---

## 📏 Métricas Implementadas

- Método `getAltura()` → Calcula la altura del árbol.
- Método `contarHojas()` → Cuenta los nodos hoja.



## ✅ Conclusión

Esta implementación demuestra el uso correcto de la terminología de árboles, la clasificación como árbol general, el cálculo de sus propiedades y una representación visual clara de la jerarquía.
