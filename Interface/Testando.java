public class Testando
{
   
    public static void main(String[] arg){
       
       Banco b =  new Banco();
       
       
       ContaInvestimento ci = new ContaInvestimento("reinaldo",0.00);
       ContaPoupanca cp = new ContaPoupanca("junior",0.00); 
       
        ci.depositar(50.00);
        ci.valorRendimento();
        
        cp.depositar(50.00);
        cp.valorRendimento();    
        
        
        b.adicionarConta(ci);
        b.adicionarConta(cp);
        
       System.out.println("Saldo Total das Contas: " + b.saldoTotal());
        
       System.out.println("Conta com Maior Saldo: " + b.maiorSaldo().saldo());
        
    }
    
    
}
