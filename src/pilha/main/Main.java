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
        PilhaArray s = new PilhaArray(3, 1);
        
        //ADICIONANDO 3 ITENS
        s.push('a');
        System.out.println("Tamanho = " + s.size());
        s.push('b');
        System.out.println("Tamanho = " + s.size());
        s.push('c');
        System.out.println("Tamanho = " + s.size());
        
        // ADICONANDO + 1 ITEM COM PILHA CHEIA
        try{
            s.push('d');
            System.out.println("Top = " + s.top());
        
        }catch(EPilhaVazia e){
            System.out.println(e.getMessage());
        }
        finally{
           s.print();
        }
    }
}
