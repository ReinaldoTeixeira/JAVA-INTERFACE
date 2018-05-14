public class ContaPoupanca extends Conta implements Rendimento
{
    double investimento;
    double juros = 0.2;
    
    public ContaPoupanca(String nome, Double saldo){
    
        super(saldo, nome);  
        
    
    }
    
    public Double valorRendimento(){
        
       this.investimento =  this.saldo + (this.saldo * this.juros);
       
       return investimento;
        
        
    }
    
    
}
