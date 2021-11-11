package one.Dio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Manuela");
        aluno.put("Idade", "17");
        aluno.put("Sala", "10");
        aluno.put("media", "8.5");
        aluno.put("Tuma", "6c");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "João");
        aluno2.put("Idade", "10");
        aluno2.put("Sala", "9");
        aluno2.put("media", "9.5");
        aluno2.put("Tuma", "2b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }
}
