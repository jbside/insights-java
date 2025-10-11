package bubbleSort;

import interfaces.IExecutorBase;

public class BubbleSortExecute implements IExecutorBase {

    @Override
    public void Execute() {
        int[] array = new int[100];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * Math.random());
//            System.out.println(array[i]);
        } 

        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }                    
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));

//        System.out.println("Sorted array:");    
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
    }
}
