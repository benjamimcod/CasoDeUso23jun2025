package service;

import model.Aluno;
import model.Funcionario;


import java.util.Scanner;

public class Service {
    Aluno aluno = new Aluno();
    Funcionario funcionario = new Funcionario();

    public void aluno(){
        //nome
        Scanner scanNome = new Scanner(System.in);
        System.out.println("Escreva o nome do aluno!!");
        String nome = scanNome.nextLine();

        aluno.setNome(nome);
        String nomeAluno = aluno.getNome();

        //idade
        Scanner scanIdade = new Scanner(System.in);
        System.out.println("Escreva a idade!!");
        int idade = scanIdade.nextInt();

        aluno.setIdade(idade);
        int idadeAluno = aluno.getIdade();

        //matricula
        Scanner matricula = new Scanner(System.in);
        System.out.println("Escreva o número da matrícula!!");
        int scanMatricula = matricula.nextInt();

        aluno.setMatricula(scanMatricula);
        int matriculaX = aluno.getMatricula();
        System.out.println("Seu nome é: " + nomeAluno);
        if(idadeAluno<0)System.out.println("o aluno: " + nomeAluno + " está invalido");
        else System.out.println(idadeAluno);
        System.out.println("Seu matrícula é: " + matriculaX);


    }

    public void funcionario(){
        //idade
        Scanner scanIdade = new Scanner(System.in);
        System.out.println("Escreva a idade!!");
        int idade = scanIdade.nextInt();

        funcionario.setIdade(idade);
        int idadeAluno = funcionario.getIdade();

        //nome
        Scanner scanNome = new Scanner(System.in);
        System.out.println("Escreva o nome do aluno!!");
        String nome = scanNome.nextLine();

        funcionario.setNome(nome);
        String nomeAluno = funcionario.getNome();

        //salario
        Scanner scanSalario = new Scanner(System.in);
        System.out.println("Escreva o salário!!");
        int salario = scanSalario.nextInt();

        funcionario.setIdade(salario);
        int idadeFuncionario = funcionario.getIdade();
    }

}
