import java.util.Arrays;

public class Main {

    public static void trocarPosicao(double[] vetor, int ind1, int ind2) {
        double aux = vetor[ind1];
        vetor[ind1] = vetor[ind2];
        vetor[ind2] = aux;
    }

    /* BUBBLE SORT */
    public static double[] bubbleSort(double[] vetor, int deepSize, int surfaceSize) {
        int size = vetor.length;
        if (surfaceSize >= size - 1) return vetor;
        int bubbleIndex = surfaceSize;

        for (int deepIndex = surfaceSize + 1; deepIndex < size; deepIndex++) {
            if (vetor[deepIndex] < vetor[bubbleIndex]) {
                bubbleIndex = deepIndex;
            }
        }

        if (bubbleIndex != surfaceSize) trocarPosicao(vetor, bubbleIndex, surfaceSize);
        return bubbleSort(vetor, size, surfaceSize + 1);
    }

    public static double[] bubbleSort(double[] vetor) {
        return bubbleSort(vetor, vetor.length, 0);
    }

    /* INSERTION SORT */
    public static void insertion_sort(double vetor[]) {
        int i, j;
        double aux;

        for(i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while((j >= 0) && (aux < vetor[j])) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
    }

    public static void main(String[] args) {
        double[] vetor = {6.1, 2.3, 9.4, 5.1, 8.9, 9.8, 10, 7.0, 6.3, 4.4};
        //bubbleSort(vetor, 0, 0);
        insertion_sort(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}


