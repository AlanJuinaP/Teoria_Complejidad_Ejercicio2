import java.util.Random;

public class Comparacion_Busqueda {
    public static void main(String[] args) {
        int n = 1000000;// tamanio del arreglo
        int[] datos = generar_Arreglo(n);
        int objetivo = datos[new Random().nextInt(n)];
    }

    //Metodo el cual genera un arreglo con valores aleatorios
    public static int[] generar_Arreglo(int n){
        Random rand = new Random();
        int[] arreglo = new int[n];
        for(int i = 0; i < n; i++){
            arreglo[i] = rand.nextInt(n * 10);
        }
        return arreglo;
    }
    //Metodo por busqueda binaria O(log n)
    public static int busqueda_Binaria(int[] arr, int objetivo){
        int left = 0, rigth = arr.length - 1;
        while (left <= rigth) {
            int medio = left + (rigth - left) / 2;
            if (arr[medio] == objetivo) {
                return medio;
            }
            if (arr[medio] < objetivo) {
                left = medio + 1;
            }else{
                rigth = medio - 1;
            }
        }
        return -1;
    }

    //metodo por implementacion de busqueda lineal O(n)
    public static int busqueda_Lineal(int[] arr, int objetivo){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == objetivo) {
                return i; // retorna el indice en caso de encontrar el elemento
            }
        }
        return -1; // retornara -1 en caso de que no encuentre
    }
}
