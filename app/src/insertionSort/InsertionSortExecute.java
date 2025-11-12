package insertionSort;

import interfaces.IExecutorBase;

public class InsertionSortExecute implements IExecutorBase {

    @Override
    public void Execute() {
        int[] array = new int[]{2,4,3,10,20,5,9,7};

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * array.length);
        }

        int aux,j;
        for(int i = 1; i < array.length; i++) {
            aux = array[i];
            j = i - 1;
            while(j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = aux;
        }
    }
    
}
