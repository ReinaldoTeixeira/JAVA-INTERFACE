import java.util.ArrayList;
import java.util.List;

public class Banco
{
    List<Conta> listatop = new ArrayList<Conta>();

    public void adicionarConta(Conta x){
        
        listatop.add(x);
        
    }

    public Double saldoTotal(){
        Double total = 0.0;

        for(Conta cont: listatop){
            total += cont.saldo();
        }

        return total;
    }

    public Conta maiorSaldo(){

        Conta inicio = listatop.get(0);

        for(int i = 1; i < listatop.size(); i++){

            if(inicio.saldo() < listatop.get(i).saldo()){

                inicio = listatop.get(i);
                
            }
            
        }

        return inicio;
        
    }
    
}
