package pilha.array;

import pilha.modelo.Pilha;
import pilha.excecoes.EPilhaVazia;

/**
 *
 * @author Felipe
 */
public class PilhaArray implements Pilha {
    private Object S[];
    private int  t, op = 0;
    // OP <= 0: DUPLICA A PILHA
    // OP > 0: AUMENTA "OP" INDICES NA PILHA
    
    public PilhaArray(int tam){
        this.t = -1;
        S = new Object[tam];
    }
    
    public PilhaArray(int tam, int op){
        this.t = -1;
        this.op = op;
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
        if((t+1) < S.length)
            S[++t] = o;
        else{
            System.out.println("Pilha cheia. Valor não inserido.");
            aumentar();      
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
    
    public void print(){
        System.out.println("---PRINT---");
        for(int i = 0; i<S.length;i++)
                System.out.println("S["+i+"] = "+S[i]);                
    }
    
    public void aumentar(){
        if(op <= 0){
                Object aux[] = new Object[size()*2];
                aux = S.clone();                
                S = new Object[size()*2];
                for(int i = 0; i<aux.length;i++)
                    S[i] = aux[i];
                System.out.println("Pilha duplicada.");
            }
            else{
                Object aux[] = new Object[size()+op];
                aux = S.clone();
                S = new Object[size()+op];
                for(int i = 0; i<aux.length;i++)
                    S[i] = aux[i];
                System.out.println("Pilha aumentada em " + op);               
            }   
    }
}
