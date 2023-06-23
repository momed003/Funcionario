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
                gerente.setNome(sc.next());
                System.out.println("digite sua idade: ");
                gerente.setIdade(sc.nextInt());
                System.out.println("digite sua carga horaria: ");
                gerente.setCargaH(sc.nextInt());
                System.out.println("digite seu ordenado mensal: ");
                gerente.setSalario(sc.nextDouble());

                    sc.close();

                System.out.println("------------------------------");
                System.out.println("seu nome: "+gerente.getNome());
                System.out.println("idade:"+gerente.getIdade());
                System.out.println("bonus anual: "+gerente.bonus()+"mts");
                System.out.println("carga horaria: "+gerente.CargaHoraria());
                System.out.println("suas funcoes: "+ gerente.funcao());
                System.out.println("assiduo: "+gerente.assiduo());
                System.out.println("desempeho: "+gerente.desempenho());
                System.out.println("-----------------------------");
            case 2:

        }


    }
}
