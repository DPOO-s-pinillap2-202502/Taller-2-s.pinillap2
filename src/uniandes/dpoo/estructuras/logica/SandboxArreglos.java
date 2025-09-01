package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
        int calCulo = getCantidadEnteros();
        int[] cpArregloEntero = new int[calCulo];
        for (int i = 0; i < calCulo; i++)
        {
        	cpArregloEntero[i] = arregloEnteros[i];
        }
        return cpArregloEntero;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	int calCulo = getCantidadCadenas();
    	String[] cpArregloCadenas = new String[calCulo];
        for (int i = 0; i < calCulo; i++)
        {
        	cpArregloCadenas[i] = arregloCadenas[i];
        }

        return cpArregloCadenas;
    }


    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * return
     */
    public int getCantidadEnteros( )
    {
    	return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * return
     */
    public int getCantidadCadenas( )
    {
    	return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int papuEntero = getCantidadEnteros();
        int[] valor = new int[papuEntero + 1];
        
        for (int i = 0; i < papuEntero; i++)
        {
        	valor[i] = arregloEnteros[i];
        }
        
        valor[papuEntero] = entero;
        arregloEnteros = valor;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int papuCadena = getCantidadCadenas();
        String[] valor = new String[papuCadena + 1];

        for (int i = 0; i < papuCadena; i++)
        {
            valor[i] = arregloCadenas[i];
        }
        valor[papuCadena] = cadena; 
        arregloCadenas = valor;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
        int calCulo = 0;
        for (int i = 0; i < this.getCantidadEnteros(); i++)
        {
            if (this.arregloEnteros[i] != valor)
            {
                calCulo++; 
            }
        }

        int[] remplazo = new int[calCulo];
        int cpRequeridos = 0; 
        for (int i = 0; i < this.arregloEnteros.length; i++)
        {
            if (this.arregloEnteros[i] != valor)
            {
                remplazo[cpRequeridos] = this.arregloEnteros[i];
                cpRequeridos++;
            }
        }

        this.arregloEnteros = remplazo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
        int calCulo = 0;
        for (int i = 0; i < this.getCantidadCadenas(); i++)
        {
            if (!this.arregloCadenas[i].equals(cadena))
            {
                calCulo++; 
            }  
        }      

        String[] remplazo = new String[calCulo];
        int cpRequeridos = 0; 
        for (int i = 0; i < this.arregloCadenas.length; i++)
        {
            if (!this.arregloCadenas[i].equals(cadena))
            {
                remplazo[cpRequeridos] = this.arregloCadenas[i];
                cpRequeridos++;
            }
        }
        this.arregloCadenas = remplazo;
    }
    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * param entero El nuevo valor que debe agregarse
     * param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
        int papuEntero = getCantidadEnteros();
        if (papuEntero == 0)
        {
            arregloEnteros = new int[]{ entero };
            return;
        }
        if (posicion < 0) posicion = 0;
        if (posicion > papuEntero) posicion = papuEntero;
        int[] remplazo = new int[papuEntero + 1];
        for (int i = 0; i < posicion; i++)
        {
            remplazo[i] = arregloEnteros[i];
        }
        remplazo[posicion] = entero;
        for (int i = posicion; i < papuEntero; i++)
        {
            remplazo[i + 1] = arregloEnteros[i];
        }

        arregloEnteros = remplazo;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
        int papuEntero = getCantidadEnteros();
        if (posicion < 0 || posicion >= papuEntero) return; 

        int[] remplazo = new int[papuEntero - 1];
        int cpRequeridos = 0;

        for (int i = 0; i < papuEntero; i++)
        {
            if (i == posicion) continue; 
            remplazo[cpRequeridos] = arregloEnteros[i];
            cpRequeridos++;
        }
        arregloEnteros = remplazo;
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
        int calCulo = valores.length;
        int[] remplazo = new int[calCulo];

        for (int i = 0; i < calCulo; i++)
        {
            remplazo[i] = (int) valores[i]; 
        }
        arregloEnteros = remplazo;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
        int calCulo = objetos.length;
        String[] remplazo = new String[calCulo];

        for (int i = 0; i < calCulo; i++)
        {
            remplazo[i] = String.valueOf(objetos[i]); 
        }
        arregloCadenas = remplazo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
        for (int i = 0; i < getCantidadEnteros(); i++)
        {
            if (arregloEnteros[i] < 0)
            {
                arregloEnteros[i] = -arregloEnteros[i];
            }
        }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
        int calCulo = getCantidadEnteros();
        for (int i = 0; i < calCulo - 1; i++)
        {
            int mini = i;
            for (int j = i + 1; j < calCulo; j++)
            {
                if (arregloEnteros[j] < arregloEnteros[mini])
                {
                    mini = j;
                }
            }
            int temp = arregloEnteros[i];
            arregloEnteros[i] = arregloEnteros[mini];
            arregloEnteros[mini] = temp;
        }
    }
    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
        int calCulo = getCantidadCadenas();

        for (int i = 0; i < calCulo - 1; i++)
        {
            int mini = i;
            for (int j = i + 1; j < calCulo; j++)
            {
                if (arregloCadenas[j].compareTo(arregloCadenas[mini]) < 0)
                {
                    mini = j;
                }
            }
            String temp = arregloCadenas[i];
            arregloCadenas[i] = arregloCadenas[mini];
            arregloCadenas[mini] = temp;
        }
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * param valor El valor buscado
     * return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
        int conteo = 0;
        for (int i = 0; i < getCantidadEnteros(); i++)
        {
            if (arregloEnteros[i] == valor) conteo++;
        }
        return conteo;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
        int conteo = 0;
        for (int i = 0; i < getCantidadCadenas(); i++)
        {
            if (arregloCadenas[i].equalsIgnoreCase(cadena)) conteo++;
        }
        return conteo;
    }
      
    

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * param valor El valor que se debe buscar
     * return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
        int calCulo = 0;
        for (int i = 0; i < arregloEnteros.length; i++)
        {
            if (arregloEnteros[i] == valor) calCulo++;
        }
        if (calCulo == 0) return new int[]{}; 

        int[] posiciones = new int[calCulo];
        int cpRequeridos = 0;
        for (int i = 0; i < arregloEnteros.length; i++)
        {
            if (arregloEnteros[i] == valor)
            {
                posiciones[cpRequeridos] = i;
                cpRequeridos++;
            }
        }
        return posiciones;
    }
    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
        if (getCantidadEnteros() == 0) return new int[]{};

        int mini = arregloEnteros[0];
        int macro = arregloEnteros[0];

        for (int i = 1; i < arregloEnteros.length; i++)
        {
            int actual = arregloEnteros[i];
            if (actual < mini) mini = actual;
            if (actual > macro) macro = actual;
        }
        return new int[]{ mini, macro };
    }
    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < getCantidadEnteros(); i++)
        {
            int v = arregloEnteros[i];
            Integer freq = mapa.get(v);
            if (freq == null) mapa.put(v, 1);
            else mapa.put(v, freq + 1);
        }
        return mapa;
    }
    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
        HashMap<Integer, Integer> hist = calcularHistograma();
        int conteo = 0;
        for (Integer clave : hist.keySet())
        {
            if (hist.get(clave) > 1) conteo++;
        }
        return conteo;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
        if (otroArreglo == null) return false;
        if (getCantidadEnteros() != otroArreglo.length) return false;

        for (int i = 0; i < arregloEnteros.length; i++)
        {
            if (arregloEnteros[i] != otroArreglo[i]) return false;
        }
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
        if (otroArreglo == null) return false;
        if (getCantidadEnteros() != otroArreglo.length) return false;

        HashMap<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < arregloEnteros.length; i++)
        {
            int v = arregloEnteros[i];
            Integer f = a.get(v);
            a.put(v, f == null ? 1 : f + 1);
        }


        HashMap<Integer, Integer> b = new HashMap<>();
        for (int i = 0; i < otroArreglo.length; i++)
        {
            int v = otroArreglo[i];
            Integer f = b.get(v);
            b.put(v, f == null ? 1 : f + 1);
        }

        if (a.size() != b.size()) return false;

        for (Integer k : a.keySet())
        {
            Integer fa = a.get(k);
            Integer fb = b.get(k);
            if (fb == null || !fa.equals(fb)) return false;
        }
        return true;
    }
    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
        if (cantidad < 0) cantidad = 0;

        if (minimo > maximo)
        {
            int cambio = minimo;
            minimo = maximo;
            maximo = cambio;
        }

        int[] remplazo = new int[cantidad];
        int rango = maximo - minimo + 1;

        for (int i = 0; i < cantidad; i++)
        {
            int valorAleatorio = (int)(Math.random() * rango) + minimo;
            remplazo[i] = valorAleatorio;
        }

        this.arregloEnteros = remplazo;
        }
}
    

