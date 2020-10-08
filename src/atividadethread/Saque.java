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
public class Saque extends Conta implements Runnable{
    private int valorSaque;
    private int timestamp;
    
    public Saque(String nome) {
        super(nome);
    }
    
    public void run(int saque, int timestamp) {
        if(this.getValorSaque() <= this.getValorSaldo()){
        this.valorSaque = saque;
        this.timestamp = timestamp;
        int saldoNovo = this.getValorSaldo()-this.getValorSaque();
        System.out.println("Conta: "+this.getNome());
        System.out.println("Saque: "+this.getValorSaque());
        System.out.println("Saldo: "+(this.getValorSaldo()-this.getValorSaque()));
        System.out.println("");
        this.setValorSaldo(saldoNovo);

        try {
            Thread.sleep(this.timestamp);
            } catch (InterruptedException ex) {
                Logger.getLogger(Saque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Conta: "+this.getNome());
            System.out.println("Saque: "+this.getValorSaque());
            System.out.println("Saldo Insufiente");

        }
    }

    public int getValorSaque() {
        return this.valorSaque;
    }

    public void setValorSaque(int valorSaque) {
        this.valorSaque = valorSaque;
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
