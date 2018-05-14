public class Conta 
{
    
    Double saldo;
    String nome;
    
    public Conta(Double saldo, String nome){
            
        this.saldo  = saldo;
        this.nome =  nome;
        
    }
    
    public void saque(double valor){
        
        this.saldo -= valor;
        
    }
    
    public void depositar(double valor){
        
        this.saldo += valor;
    
    }
    
    
    public Double saldo(){
     
        return saldo;
        
    }
    
}
