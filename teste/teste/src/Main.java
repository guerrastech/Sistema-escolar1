import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String nomeAluno1 = cadastrarNome();
        String emailAluno1 = cadastrarEmail();
        Double notasAluno1[] = cadatrarNotas();
        String result1 = aprovação(notasAluno1[1],notasAluno1[2],notasAluno1[3]);

        String nomeAluno2 = cadastrarNome();
        String emailAluno2 = cadastrarEmail();
        Double notasAluno2[] = cadatrarNotas();
        String result2 = aprovação(notasAluno2[1],notasAluno2[2],notasAluno2[3]);

        String nomeAluno3 = cadastrarNome();
        String emailAluno3 = cadastrarEmail();
        Double notasAluno3[] = cadatrarNotas();
        String result3 = aprovação(notasAluno3[1],notasAluno3[2],notasAluno3[3]);


        System.out.println();
    }

    public static String cadastrarNome(){
        Scanner sc = new Scanner(System.in);
        String nome = "";
        System.out.print("Digite o nome do aluno: ");
        nome = sc.next();
        return nome;
    }

    public static String cadastrarEmail() {
        Scanner sc = new Scanner(System.in);
        String email = "";
        System.out.print("Digite o email do aluno: ");
        email = sc.next();
        return email;
    }

    public static Double[] cadatrarNotas(){
        Scanner sc = new Scanner(System.in);
        Double notas[] = new Double[3];
        int i = 0;
        while (i < 3){
            System.out.print("Digite a nota do aluno: ");
            notas[i] = sc.nextDouble();
            i++;
        }
        return notas;
    }

    public static String aprovação(Double nota1, Double nota2, Double nota3){
        String result = "Aprovado";
        Double media = (nota1+nota2+nota3)/3;

        if(media >= 7){
            return result;
        }
        else{
            return "Reprovado";
        }
    }




}