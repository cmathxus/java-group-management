package com.java.group.management;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> grupos = new ArrayList<>();
        ArrayList<String> grupo = new ArrayList<>();

        while (true) {
            System.out.print("Deseja criar um grupo? S/N ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("S")) {
                while (true) {
                    System.out.print("Deseja adicionar um novo participante? ");
                    if (sc.next().equalsIgnoreCase("S")) {
                        System.out.print("Qual nome do usuário? ");
                        String nome = sc.next();
                        grupo.add(nome);
                    } else {
                        grupos.add(grupo);
                        grupo = new ArrayList<>(Collections.emptyList());
                        break;
                    }
                }
            } else {
                break;
            }
        }
        int contador = 1;

        for (ArrayList<String> grp : grupos) {
            System.out.println("Grupo " + contador);
            for (String nome : grp) {
                System.out.println(nome);
            }
            contador += 1;
        }
    }
}

