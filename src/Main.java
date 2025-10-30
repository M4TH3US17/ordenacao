import java.util.Arrays;

public class Main {

    public static void trocarPosicao(double[] vetor, int ind1, int ind2) {
        double aux = vetor[ind1];
        vetor[ind1] = vetor[ind2];
        vetor[ind2] = aux;
    }

    public static double[] bubbleSort(double[] vetor, int deepSize, int surfaceSize) {
        int size = vetor.length;
        boolean isFirstLoop = (deepSize == 0 && surfaceSize == 0);

        if(isFirstLoop) {
            deepSize = (size - 1);
            surfaceSize = size - deepSize;
        }

        int bubbleIndex = 0;

        System.out.println("\n\nBubble: " + vetor[bubbleIndex] + ", Surface: " + vetor[surfaceSize]);
        System.out.println(Arrays.toString(vetor));

        // Buscar o index do menor valor da esquerda (fundo)
        for(int deepIndex = deepSize; deepIndex >= 0; deepIndex--) {
            boolean ehMenorValorDoFundo = vetor[deepIndex] < vetor[bubbleIndex];
            if(ehMenorValorDoFundo) bubbleIndex = deepIndex;
            deepSize = deepSize - 1;
        };

        // Alocar a bubble para surface
        for(int surfaceIndex = 0; surfaceIndex < surfaceSize; surfaceIndex++) {
            boolean ehParaIrParaSuperficie = vetor[bubbleIndex] < vetor[surfaceIndex];
            if(ehParaIrParaSuperficie) trocarPosicao(vetor, bubbleIndex, surfaceIndex);
        }

        return bubbleSort(vetor, size-surfaceSize, surfaceSize + 1);
    };

    public static void main(String[] args) {
        double[] vetor = {6.1, 2.3, 9.4, 5.1, 8.9, 9.8, 10, 7.0, 6.3, 4.4};
        bubbleSort(vetor, 0, 0);
    }
}


