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
        Conta a = new Conta("João Victor", 1000);
        Conta p1 = new Conta("Jussimar", 1000);
        Conta p2 = new Conta("Evertt", 1000);
        
        a.Deposito(500, 500);
        p1.Deposito(300, 1000);
        p2.Saque(500, 2000);
        p2.Deposito(300, 2000);
        a.Saque(1500, 500);
        a.Deposito(300, 500);
        a.Saque(500, 500);
        a.Deposito(300, 500);
        a.Saque(500, 500);
        p2.Deposito(1300, 2000);
        p1.Saque(250, 1000);
        a.Saque(500, 500);
        p1.Deposito(1300, 1000);
        p2.Saque(250, 2000);
        a.Deposito(1300, 500);
        a.Saque(250, 500);

    }
    
}
