import model.Gerente;
import model.Vendedor;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        Gerente gerente=new Gerente();
        Vendedor vendedor=new Vendedor();

        System.out.println("escolha um cargo:");
        System.out.println("1-gerente");
        System.out.println("2-vendedor");
        int op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println("digite o nome:");
                String nome=sc.nextLine();
                System.out.println("digite sua idade: ");
                int idade=sc.nextInt();
                System.out.println("digite sua carga horaria: ");
                int carga=sc.nextInt();
                System.out.println("digite seu ordenado mensal: ");
                double salario=sc.nextDouble();

                gerente.setNome(nome);
                gerente.setCargaH(carga);
                gerente.setIdade(idade);
                gerente.setSalario(salario);
                gerente.bonus();
                gerente.funcao();
                gerente.assiduo();
                gerente.desempenho();

                System.out.println(gerente.getNome());
                System.out.println(gerente.getIdade());
                System.out.println(gerente.bonus());
                System.out.println(gerente.CargaHoraria());
        }


    }
}
