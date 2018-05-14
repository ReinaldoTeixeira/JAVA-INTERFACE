public class ContaInvestimento extends Conta implements Rendimento
{
    double investimento;
    double juros = 0.5;
    
    public ContaInvestimento(String nome, Double saldo){
    
        super(saldo, nome);  
        
    
    }
    
    public Double valorRendimento(){
        
      this.investimento =  this.saldo + (this.saldo * this.juros);
       
       return investimento;
        
        
    }
    
    
}
