package model;

public abstract class  FuncionarioSuper {
    private String nome;
    private int idade;

    public int getCargaH() {
        return CargaH;
    }

    public void setCargaH(int cargaH) {
        CargaH = cargaH;
    }

    private int CargaH;
    private String cargo;

    FuncionarioSuper() {

    }

    FuncionarioSuper(String nome, int idade, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    private double salario;
    private double bonus;
}
