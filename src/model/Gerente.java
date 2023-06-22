package model;

public class Gerente extends FuncionarioSuper implements Funcao{
    private  FuncionarioSuper gerente= new Gerente();
    @Override // reutilizacao do codico criado na interfACE
    public double bonus() {
       double bonusAnual= gerente.getSalario()+0.50;
       return  bonusAnual;
    }

    @Override
    public int CargaHoraria() {
      return   gerente.getCargaH();
    }

    @Override
    public String desempenho() {
        return null;
    }

    @Override
    public boolean assiduo() {
        return false;
    }
}
