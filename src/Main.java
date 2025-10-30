import java.util.Arrays;

public class Main {

    public static void trocarPosicao(double[] vetor, int ind1, int ind2) {
        System.out.println("INDEX BUBBLE: " + ind1 + ", INDEX SURFACE: " + ind2);
        double aux = vetor[ind1];
        vetor[ind1] = vetor[ind2];
        vetor[ind2] = aux;
    }

    public static double[] bubbleSort(double[] vetor, int deepSize, int surfaceSize) {
        int size = vetor.length;

        if (surfaceSize >= size - 1) {
            return vetor;
        }

        int bubbleIndex = surfaceSize;
        for (int deepIndex = surfaceSize + 1; deepIndex < size; deepIndex++) {
            if (vetor[deepIndex] < vetor[bubbleIndex]) {
                bubbleIndex = deepIndex;
            }
        }

        if (bubbleIndex != surfaceSize) {
            trocarPosicao(vetor, bubbleIndex, surfaceSize);
        }

        return bubbleSort(vetor, size, surfaceSize + 1);
    }

    public static double[] bubbleSort(double[] vetor) {
        return bubbleSort(vetor, vetor.length, 0);
    }

    public static void main(String[] args) {
        double[] vetor = {6.1, 2.3, 9.4, 5.1, 8.9, 9.8, 10, 7.0, 6.3, 4.4};
        bubbleSort(vetor, 0, 0);
    }
}


