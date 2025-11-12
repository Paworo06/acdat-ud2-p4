import java.io.*;

public class LimpiarArchivo {

    public static void main(String[] args) {

        /* TODO 1: Validar los argumentos (debe haber 2: entrada y salida). TERMINADO
           - Si no son correctos, mostrar:
             "Uso: java limpiararchivo <entrada.txt> <salida.txt>"
           - Terminar el programa si faltan.
        */

        /* TODO 2: Obtener las rutas de entrada y salida desde args[0] y args[1]. EN PROCESO*/

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

        if (validarArgumentos(args)) {
            String entrada = args[0];
            String salida = args[1];

            BufferedReader brE = null;
            BufferedWriter bwS = null;
            try {
                brE = new BufferedReader(new FileReader(entrada));
                bwS = new BufferedWriter(new FileWriter(salida));

                String linea =  brE.readLine();
                int contador = 1;
                while (linea != null) {
                    // Procesamiento de líneas
                    if (linea.trim().startsWith("#") || linea.isEmpty()) {
                        continue;
                    } else{
                        bwS.write(contador + "\t" +  linea);
                        bwS.newLine();
                        contador++;
                    }

                    linea = brE.readLine();
                }

                bwS.flush(); // Descarga el BufferedWriter
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bwS != null) {
                        bwS.close(); // Cierra el writer
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    if (brE != null) {
                        brE.close(); // Cierra el reader
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * Metodo que comprueba que el programa admita solo 2 argumentos de entrada
     * y que estos sean archivos con extensión (.txt)
     * @param args array de argumentos del Main.
     */
    static boolean validarArgumentos(String[] args) {
        boolean valido;
        if (args.length == 2) {
            if (args[0].endsWith(".txt") && args[1].endsWith(".txt")) {
                valido  = true;
            } else {
                System.out.println("Argumentos incorrectos");
                System.err.println("\tUso: java limpiararchivo <entrada.txt> <salida.txt>");
                valido = false;
            }
        } else {
            System.err.println("Solo se permiten dos argumentos de entrada.");
            valido = false;
        }

        return valido;
    }
}