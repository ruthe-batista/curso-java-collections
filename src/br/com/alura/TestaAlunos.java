package br.com.alura;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Sergio Lopes");

        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(alunos);
        });

        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);


    }
}
