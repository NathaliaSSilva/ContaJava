

public class ContaCorrente {

    String nome; 
    float saldo;
    float limite;
    char tipo;
 
    ContaCorrente(String nome, float saldo, float limite, char tipo){

      this.nome = nome;
      this.saldo = saldo;
      this.limite = limite;
      this.tipo = tipo; 

    }
    
    ContaCorrente(String nome, float saldo, char tipo){

        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    
       
    }
    

    
    ContaCorrente(){

      
       
    }
    

    

}
