package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import interfaces.IExecutorBase;

public class StreamsExecute implements IExecutorBase{

    @Override
    public void Execute() {
       List<String> frutas = new ArrayList<String>();

       frutas.add("Maça");
       frutas.add("Banana");
       frutas.add("Pera");
       frutas.add("Uva Roxa");
       frutas.add("Uva Verde");
       frutas.add("Melancia");

       Collection<String> filtroFrutas = List.of("Pera", "Uva Roxa","Banana");
        frutas
            .stream()
            .filter(fruta -> filtroFrutas.contains(fruta)).toList()
            .forEach(fruta -> System.out.println(fruta.toUpperCase()));
    }
    
}
