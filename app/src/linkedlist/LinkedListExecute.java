package linkedlist;

import interfaces.IExecutorBase;

public class LinkedListExecute implements IExecutorBase{

    @Override
    public void Execute() {
        LinkedListClass<Integer> numeros = new LinkedListClass<>();    

        for (int i = 0; i <= 1000;i++) {
            numeros.add(i);
        }

        long inicio = System.currentTimeMillis();
        for (int i = 0; i <= numeros.getSize();i++) {
            numeros.get(i);
        }

        Long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução LACO FOR NORMAL: " + (fim - inicio) + " milissegundos");

        IteratorLinkedList<Integer> iterator = numeros.getIterator();
        
        inicio = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.getNext();
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução ITERATOR: " + (fim - inicio) + " milissegundos");
    }
    
}
