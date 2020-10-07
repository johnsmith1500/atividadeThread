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
public class Conta extends Thread{
    private String nome;
    private int valorConta;
    private int timestamp;
    private int valorDeposito;
    private int valorSaque;
    private boolean parada;
    private boolean fim;
    
    
    public Conta(String nome, int valor) {
        this.nome = nome;
        this.valorConta = valor;
        this.start();
    }
    
    public int Deposito(int valorDeposito, int timestamp) {
        this.valorDeposito = valorDeposito;
        this.parada = false;
        this.fim = false;
        this.valorConta = this.valorDeposito + this.valorConta;
        return this.valorConta;
    }
    
    public int Saque(int valorSaque, int timestamp) {
        this.valorSaque = valorSaque;
        this.parada = false;
        this.fim = false;
        return this.valorConta;
    }
    
    public void run() {
            if(this.valorSaque <= this.valorConta){
            this.valorConta = this.valorConta - this.valorSaque;
            System.out.println("Conta: " + this.getNome());
            System.out.println("Valor na Conta de "+this.getNome()+": "+this.valorConta);
            
            
        try {
                this.sleep(timestamp);
  
              /*  while(parada){
                    synchronized (this){
                        System.out.println("Parado Aqui: " + this.getNome());
                        wait();
                    }
                }
                
                if(fim){
                        System.out.println("Fechando Thread");
                        interrupt();
                        break;
                    }*/
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            System.out.println("Valor de Saque Insuficiente na conta de "+this.getNome());
            }

       // System.out.println("Fim da Thread " + this.getNome());
   }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorConta() {
        return this.valorConta;
    }

    public void setValorConta(int valor) {
        this.valorConta = valor;
    }
    
    public int getValorDeposito() {
        return this.valorDeposito;
    }

    public void setValorDeposito(int valorDeposito) {
        this.valorDeposito = valorDeposito;
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

   public void setTempo(int tempo) {
       this.timestamp = tempo;
   }
   
   public synchronized void parar(){
       this.parada = true;
       notify();
   }
   
   public synchronized void voltar(){
       this.parada = false;
       notify();
   }
   
   public synchronized void sair(){
       this.fim = true;
       notify();
   }
}
