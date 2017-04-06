package pilha.excecoes;

/**
 *
 * @author Felipe
 */
public class EPilhaVazia extends Exception{
    
    public EPilhaVazia(){
        
    }

    public EPilhaVazia(String mensagem){
        super(mensagem);
    }
}
