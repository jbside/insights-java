package threads;

import interfaces.IExecutorBase;

public class ThreadsExecute implements IExecutorBase {

    @Override
    public void Execute() {
        Thread emailTask = new Thread(new EmailTask());
        Thread logTask = new Thread(new LogTask());
        
        System.out.println("Tasks started!");

        try{
            emailTask.start();
            emailTask.join();
            logTask.start();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
