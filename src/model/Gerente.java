package model;

public class Gerente extends FuncionarioSuper implements Funcao{
      FuncionarioSuper ger = new FuncionarioSuper() {
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
    @Override // reutilizacao do codico criado na interfACE
    public double bonus() {
       double bonusAnual= ger.getSalario()+0.50;
       return  bonusAnual;
    }

    @Override
    public int CargaHoraria() {
      return   ger.getCargaH();
    }

    @Override
    public String desempenho() {
        return null;
    }

    @Override
    public String funcao() {
        return "o gerente tem a funcao de garantir que tudo esteja em ordem," +
                " e que todos os funcionarios seguem o regulamento interno da instituicao";
    }

    @Override
    public boolean assiduo() {
        return false;
    }
}
