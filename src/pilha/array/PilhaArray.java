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
            //System.out.println("Pilha cheia.");
            aumentar(o);      
        }
        //print();
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
        for(int i = 0; i<size();i++)
            System.out.println("S["+i+"] = "+S[i]);                
    }
    
    public void aumentar(Object o){
        int n;
        Object aux[];
        if(op <= 0){
                n = size()*2;
               // System.out.println("Pilha duplicada.");
            }
            else{
                n = size()+op;
                //System.out.println("Pilha aumentada em " + op);               
            }  
        aux = new Object[n];
        aux = S.clone();
        S = new Object[n];         
            for(int i = 0; i<aux.length;i++)
                S[i] = aux[i];
        S[size()] = o;
        t++;
    }
    
    public void empty(){
        t = -1;
        S = null;
    }
}
