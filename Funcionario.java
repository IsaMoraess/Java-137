/*Exercício 1: Sistema de Gestão de Funcionários (Encapsulamento)
Objetivo: Criar uma classe Funcionario que encapsula atributos e 
fornece métodos para manipulação.
                                    Passos:
1.Defina a classe Funcionario com os atributos private String nome, 
private String cargo, e private double salario.
2.Crie os métodos getters e setters para cada atributo.
3.Adicione um método public void aumentarSalario(double percentual) que aumenta 
o salário com base em um percentual fornecido.
4.Teste a classe no método main para garantir que os atributos estão 
acessíveis apenas através dos métodos. */

public class Funcionario{
    //ATRIBUTOS
    private String nome;
    private String cargo;
    private double salario;

    //MÉTODOS GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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

    //MÉTODO AUMENTAR SALÁRIO
    public void aumentarSalario(double percentual) {
        this.salario += (this.salario * percentual / 100);
    }
}