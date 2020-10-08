package atividadethread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João Victor
 */
public class Conta{
    private String nome;
    private int valorSaldo;
    
    public Conta(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorSaldo() {
        return this.valorSaldo;
    }

    public void setValorSaldo(int valor) {
        this.valorSaldo = valor;
    }
}
