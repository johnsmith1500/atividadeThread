/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadethread;

/**
 *
 * @author João Victor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta a = new Conta("João Victor");
        a.setValorSaldo(1000);
        Conta p1 = new Conta("Jussimar");
        p1.setValorSaldo(1000);
        Conta p2 = new Conta("Evertt");
        p2.setValorSaldo(1000);
        
        Deposito d1 = new Deposito(a.getNome());
        d1.run(500, 500);
        Deposito d2 = new Deposito(p1.getNome());
        d2.run(300, 1000);
        Saque s1 = new Saque(p2.getNome());
        s1.run(500, 2000);
        Deposito d3 = new Deposito(p2.getNome());
        d3.run(300, 2000);
        Saque s2 = new Saque(a.getNome());
        s2.run(1500, 500);
        Deposito d4 = new Deposito(a.getNome());
        d4.run(300, 500);
        Saque s3 = new Saque(a.getNome());
        s3.run(500, 500);
        Deposito d5 = new Deposito(a.getNome());
        d5.run(300, 500);
        Saque s4 = new Saque(a.getNome());
        s4.run(500, 500);
        Deposito d6 = new Deposito(p2.getNome());
        d6.run(1300, 2000);
        Saque s5 = new Saque(p1.getNome());
        s5.run(250, 1000);
        Saque s6 = new Saque(a.getNome());
        s6.run(500, 500);
        Deposito d7 = new Deposito(p1.getNome());
        d7.run(1300, 1000);
        Saque s7 = new Saque(p1.getNome());
        s7.run(250, 1000);
        Saque s8 = new Saque(a.getNome());
        s8.run(500, 500);
        Deposito d8 = new Deposito(p2.getNome());
        d8.run(1300, 2000);
        Saque s9 = new Saque(p2.getNome());
        s9.run(250, 2000);
        Deposito d9 = new Deposito(a.getNome());
        d9.run(1300, 500);
        Saque s10 = new Saque(a.getNome());
        s10.run(250, 500);
    }
    
}
