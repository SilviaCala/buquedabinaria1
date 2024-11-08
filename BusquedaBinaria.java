package busquedabinaria;

/**
 *
 * @author SILVIA
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A[] = {2, 8, 15, 20, 32, 58, 69, 74, 100, 112, 127, 135, 148};
        int pos = BusquedaBinaria(A, 112);

        if (pos == -1) {
            System.out.println("El dato no se encuentra en el Arreglo");
        } else {
            System.out.println("El dato se encuentra en la posición" + pos);
        }
    }

    public static int BusquedaBinaria(int[] A, int dato) {
        int inicio = 0;
        int fin = A.length - 1;

        while (inicio <= fin) {
            int mitad = (inicio + fin) / 2;
            if (A[mitad] == dato) {
                return mitad;
            } else if (A[mitad] < dato) {
                inicio = mitad + 1;
            } else {
                fin = mitad - 1;
            }
        }
        return -1;
    }
}
