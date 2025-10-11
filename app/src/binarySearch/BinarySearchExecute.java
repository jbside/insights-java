package binarySearch;

import java.util.Scanner;

import interfaces.IExecutorBase;
import services.ScannerService;

public class BinarySearchExecute implements IExecutorBase {

    @Override
    public void Execute() {
        int[] array = new int[100];
        Scanner sc = ScannerService.getInstance().getScanner();

        for (int i = 0; i < array.length;i++) {
            array[i] = i * 2;
        }

        System.out.println("What number you want to find?");
        int number = sc.nextInt();

        boolean find = false;
        int start = 0;
        int end = array.length - 1;
        int middle;
        int qtdTestes = 0;

        while (start <= end) {
            qtdTestes++;
            middle = (int) (start + end) / 2;
            if (array[middle] == number) {
                find = true;
                break;
            } else if (array[middle] < number){
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        if (find) {
            System.out.println("NUMBER FOUND!");
        } else {
            System.out.println("NUMBER NOT FOUND!");
        }

        System.out.println("QUANTIDADE DE TESTES: " + qtdTestes);
    }

}
