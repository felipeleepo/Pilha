package pilha.main;

import pilha.array.PilhaArray;
import pilha.excecoes.EPilhaVazia;
import pilha.modelo.Pilha;
/**
 *
 * @author Felipe
 */
public class Main {
    public static void main(String[] args) {
        PilhaArray s = new PilhaArray(3);
        
        //ADICIONANDO 3 ITENS
        s.push('a');
        System.out.println(s.size());
        s.push('b');
        System.out.println(s.size());
        s.push('c');
        System.out.println(s.size());
        
        // REMOVENDO 5 ITENS
        try{
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
        s.push('d');
        System.out.println(s.size());
        System.out.println(s.top());
        
        }catch(EPilhaVazia e){
            System.out.println(e.getMessage());
        }
        finally{
        
        }
    }
}
