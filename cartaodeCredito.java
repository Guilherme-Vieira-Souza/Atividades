package CARTAO;
public class cartaodeCredito {
        
    int numero;
    String numeroDoTitular;
    String cpf;
    double limite;
    double fatura;
    
    public double consultarLimite(){
        return limite;
    }
    public double consultarSaldo(){
        return fatura;
    }

    public void realizarCompra(double valor){
    if(valor <= this.limite){
        this.limite -= valor;
        this.fatura += valor;
        System.out.println("Parabéns pela sua compra!!!");
    }else{
        System.out.println("Voce não tem limite para concluir sua compra!!!");
        System.out.println("Seu limite é de : "+ this.limite);
    }
    }
    
}
    

    

