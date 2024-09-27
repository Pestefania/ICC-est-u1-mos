public class App {
    public static void main(String[] args) {
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        int[] arreglo = {10, 5, 8, 2, 9};

        // Ordenar el arreglo en forma ascendente (true)
        metodos.sortBySeleccion(arreglo, true);
        System.out.println("Arreglo ordenado ascendente:");
        metodos.printArreglo(arreglo);

        // Ordenar el arreglo en forma descendente (false)
        metodos.sortBySeleccion(arreglo, false);
        System.out.println("Arreglo ordenado descendente:");
        metodos.printArreglo(arreglo);
    }
}