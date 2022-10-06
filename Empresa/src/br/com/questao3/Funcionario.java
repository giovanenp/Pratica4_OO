package br.com.questao3;

public abstract class Funcionario {
  private String nome;
  private String rg;
  private double salarioBase;

  public Funcionario(String nome, String rg, double salarioBase) {
    this.nome = nome;
    this.rg = rg;
    this.salarioBase = salarioBase;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }
  public abstract String imprimeSalario();
}
