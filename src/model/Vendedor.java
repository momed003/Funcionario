package model;

public class Vendedor extends  FuncionarioSuper implements  Funcao {
    private FuncionarioSuper vendedor=new Vendedor();
    @Override
    public double bonus() {
        return vendedor.getSalario()*0.05;
    }

    @Override
    public int CargaHoraria() {
        return 8;
    }

    @Override
    public String desempenho() {
        return null;
    }

    @Override
    public String funcao() {
        return "cuidar das vendas ";
    }

    @Override
    public boolean assiduo() {
        return false;
    }
}
