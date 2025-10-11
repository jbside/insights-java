package services;

import java.util.Scanner;

public class ScannerService {
    private static Scanner scannerInstance;
    private static ScannerService instance;

    public static ScannerService getInstance() {
        if (instance == null) {
            instance = new ScannerService();
            scannerInstance = new Scanner(System.in);
        }
        return instance;
    }

    public Scanner getScanner() {
        return scannerInstance;
    }

    public void closeScanner() {
        scannerInstance.close();
        scannerInstance = null;
    }
}
