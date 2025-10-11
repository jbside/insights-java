package lambda;

import interfaces.IExecutorBase;

public class LambdaExecute implements IExecutorBase {

    interface RetornoString{
        String concatenar(String entrada);
    }
    
    @Override
    public void Execute() {
    
        var MeuTexto = "Olá";
        RetornoString MinhaString = (entrada) -> "Thê ThÊ".concat(" " + entrada);

        System.out.println(MinhaString.concatenar(MeuTexto));
    }
    
}
