public class MetodosOrdenamiento {
    public int[] sortBySeleccion(int[] arreglo, boolean ascendente) {
        int tamanio = arreglo.length;

        // Recorrer el arreglo
        for (int i = 0; i < tamanio - 1; i++) {
            int indice = i;
            // Encontrar el índice del valor adecuado (mínimo o máximo)
            for (int j = i + 1; j < tamanio; j++) {
                if (ascendente) {
                    // Si se debe ordenar de manera ascendente
                    if (arreglo[j] < arreglo[indice]) {
                        indice = j;
                    }
                } else {
                    // Si se debe ordenar de manera descendente
                    if (arreglo[j] > arreglo[indice]) {
                        indice = j;
                    }
                }
            }
            // Intercambiar el valor mínimo/máximo encontrado con el valor actual
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    // Método para imprimir el arreglo manualmente
    public void printArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // Para hacer un salto de línea al final
    }
}
