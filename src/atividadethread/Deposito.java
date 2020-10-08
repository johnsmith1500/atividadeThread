/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadethread;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author João Victor
 */
public class Deposito extends Conta implements Runnable{
    private int valorDeposito;
    private int timestamp;
    
    public Deposito(String nome) {
        super(nome);
    }
    
    public void run(int deposito, int timestamp) {
        this.valorDeposito = deposito;
        this.timestamp = timestamp;        
        System.out.println("Conta: "+this.getNome());
        System.out.println("Depósito: "+this.getValorDeposito());
        System.out.println("Saldo: "+(this.getValorDeposito()+this.getValorSaldo()));
        System.out.println("");
        int saldoNovo = this.getValorDeposito()+this.getValorSaldo();
        this.setValorSaldo(saldoNovo);
        try {
            Thread.sleep(this.timestamp);
            } catch (InterruptedException ex) {
                Logger.getLogger(Deposito.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public int getValorDeposito() {
        return this.valorDeposito;
    }

    public void setValorDeposito(int valorDeposito) {
        this.valorDeposito = valorDeposito;
    }
    
    public int getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
