package AtividadeSomativaBanco;

import java.util.Scanner;

public class Banco extends Pessoa{

    Scanner lendo = new Scanner(System.in);
    
    // atributos

    public int codigo;
    public int cpf;
    public int cnpj;
    public double saldo;
    public int saque;
    public int emprestimo;
    public int deposito;



    //-----criando métodos-----

    public void criarContaPf(){
        
        System.out.println("Informe seu nome: ");
        setNome(lendo.next());
        System.out.println("Informe sua idade: ");
        setIdade(lendo.nextInt());
        System.out.println("Informe seu CPF: ");
        setCpf(lendo.nextInt());
        
        
    }
    public void criarContaPj(){
        
        System.out.println("Informe seu nome: ");
        setNome(lendo.next());
        System.out.println("Informe sua idade: ");
        setIdade(lendo.nextInt());
        System.out.println("Informe seu CNPJ: ");
        setCnpj(lendo.nextInt());
        
        
    }

    //-----get and set-----
  
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSaque() {
        return saque;
    }

    public void setSaque(int saque) {
        this.saque = saque;
    }

    public int getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(int emprestimo) {
        this.emprestimo = emprestimo;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

}
