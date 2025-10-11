package async;

import java.util.concurrent.CompletableFuture;
import interfaces.IExecutorBase;

public class AsyncExecute implements IExecutorBase {

    @Override
    public void Execute() {

        try {
            CompletableFuture.runAsync(() -> {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Olá, eu sou um método assíncrono!");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            for (int i = 0; i < 10; i++) {
                System.out.println("Hallo!");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
