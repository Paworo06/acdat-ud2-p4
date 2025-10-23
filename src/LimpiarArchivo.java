public class LimpiarArchivo {

    public static void main(String[] args) {

        /* TODO 1: Validar los argumentos (debe haber 2: entrada y salida).
           - Si no son correctos, mostrar:
             "Uso: java limpiararchivo <entrada.txt> <salida.txt>"
           - Terminar el programa si faltan.
        */

        /* TODO 2: Obtener las rutas de entrada y salida desde args[0] y args[1]. */

        /* TODO 3: Abrir los flujos.
           - Crear BufferedReader envolviendo un FileReader con la ruta de entrada.
           - Crear BufferedWriter envolviendo un FileWriter con la ruta de salida (sobrescribe).
           - Guardar las referencias para cerrarlas manualmente después.
        */

        /* TODO 4: Leer línea a línea con readLine().
           - Patrón: leer primera línea; mientras no sea null, procesar; luego leer la siguiente.
        */

        /* TODO 5: Procesamiento por línea.
           - Aplicar trim() para quitar espacios al inicio y final.
           - Si la línea queda vacía o empieza por "#", saltarla (continue).
           - Llevar un contador de líneas válidas (empieza en 1).
           - Escribir en el BufferedWriter el formato: n + "\t" + contenido, seguido de newLine().
        */

        /* TODO 6: Al terminar el bucle, llamar a flush() para asegurar que todo se escribe. */

        /* TODO 7: Manejar IOException con try-catch alrededor de la lógica principal.
           - Mostrar un mensaje simple si ocurre un error de E/S.
        */

        /* TODO 8: Cerrar manualmente los recursos en un bloque finally.
           - Cerrar primero el BufferedWriter y luego el BufferedReader.
           - Cada close() envuelto en su propio try-catch para evitar fallos en cascada.
        */

        /* TODO 9 (opcional): Imprimir un resumen final:
           - Total de líneas escritas y la ruta del archivo de salida.
        */
    }
}