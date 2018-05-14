public class Testando
{
   
    public static void main(String[] arg){
        
       ContaInvestimento ci = new ContaInvestimento("reinaldo",0.00);
       ContaPoupanca cp = new ContaPoupanca("junior",0.00); 
       
        ci.depositar(50.00);
        ci.saque(20.00);
        ci.valorRendimento();
        
        cp.depositar(50.00);
        cp.saque(20.00);
        cp.valorRendimento();     
        
        System.out.println("Saldo Conta Investimento c/ Juros: " + ci.valorRendimento());
        System.out.println("Saldo Conta Investimento: " + ci.saldo());
       
        System.out.println("Saldo Conta Poupança c/ Juros: " + cp.valorRendimento());
        System.out.println("Saldo Conta Poupança: " + cp.saldo());     
    }
    
    
}
