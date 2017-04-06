package pilha.array;

import pilha.modelo.Pilha;
import pilha.excecoes.EPilhaVazia;

/**
 *
 * @author Felipe
 */
public class PilhaArray implements Pilha {
    private Object S[];
    private int  t;
    
    public PilhaArray(int tam){
        this.t = -1;
        S = new Object[tam];
    }
    
    public int size(){
        return t+1;
    }
    
    public boolean isEmpty(){
        if(t == -1){
            return true;
        }
        return false;
    }
    
    public Object top() throws EPilhaVazia{
        EPilhaVazia e = new EPilhaVazia("Pilha Vazia.");
        if(!isEmpty())
            return S[t];
        throw e;
    }
    
    public void push(Object o){
        t++;
        if(t < S.length){
            S[t] = o;
            
        }
        else
        {
            t--;
            System.out.println("Pilha cheia.");
        }
    }
    
    public Object pop() throws EPilhaVazia{
        EPilhaVazia e = new EPilhaVazia("Pilha Vazia.");
        if(!isEmpty()){
            Object x = S[t];
            S[t] = null;
            t--;
        return x;   
        }
        throw e;        
    }
}
