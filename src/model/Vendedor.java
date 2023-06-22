package model;

public class Vendedor extends  FuncionarioSuper implements  Funcao {
     FuncionarioSuper vendedor=new FuncionarioSuper() {
         @Override
         public int getCargaH() {
             return super.getCargaH();
         }

         @Override
         public void setCargaH(int cargaH) {
             super.setCargaH(cargaH);
         }

         @Override
         public String getNome() {
             return super.getNome();
         }

         @Override
         public void setNome(String nome) {
             super.setNome(nome);
         }

         @Override
         public int getIdade() {
             return super.getIdade();
         }

         @Override
         public void setIdade(int idade) {
             super.setIdade(idade);
         }

         @Override
         public String getCargo() {
             return super.getCargo();
         }

         @Override
         public void setCargo(String cargo) {
             super.setCargo(cargo);
         }

         @Override
         public double getSalario() {
             return super.getSalario();
         }

         @Override
         public void setSalario(double salario) {
             super.setSalario(salario);
         }

         @Override
         public double getBonus() {
             return super.getBonus();
         }

         @Override
         public void setBonus(double bonus) {
             super.setBonus(bonus);
         }
     };
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
