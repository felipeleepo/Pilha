package pilha.array;
import pilha.excecoes.EPilhaVazia;
/**
 *
 * @author Felipe
 */
public class PilhaVP {
    private Object S[];
    private int  tv, tp;
    // OP <= 0: DUPLICA A PILHA
    // OP > 0: AUMENTA "OP" INDICES NA PILHA
    
    public PilhaVP(int tam){
        this.tv = -1;
        this.tp = tam-1;
        S = new Object[tam];
    }
    
    public int sizeV(){
        return tv+1;
    }
    
    public int sizeP(){
        return S.length-tp;
    }
    
    public boolean isEmptyV(){
        if(tv == -1){
            return true;
        }
        return false;
    }
    
    public boolean isEmptyP(){
        if(tp == tv){
            return true;
        }
        return false;
    }
    
    public Object top(String p) throws EPilhaVazia{
        EPilhaVazia e = new EPilhaVazia("Pilha Vazia.");
        if(testeV(p))
            if(!isEmptyV())
                return S[tv];
        if(testeP(p))
            if(!isEmptyV())
                return S[tp];           
        throw e;
    }
    
    public void push(Object o, String p){
        if(testeV(p)){
            if((tv+1) < tp)
                S[++tv] = o;
        }
        else if(testeP(p)){
            if((tp-1) > tv)
                S[--tp] = o;
        }
        /*else
            aumentar(o); 
        */
    }
    
    public Object pop(String p) throws EPilhaVazia{
        EPilhaVazia e = new EPilhaVazia("Pilha Vazia.");
        Object x;
        if(testeV(p))
            if(!isEmptyV()){
                x = S[tv];
                S[tv] = null;
                tv--;
                return x;
            }
        if(testeP(p))
            if(!isEmptyP()){
                x = S[tp];
                S[tp] = null;
                tp++;
                return x;   
        }
        throw e;        
    }
    
    /*public void print(){
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
        tv = -1;
        tp = 1;
        S = null;
    }*/
    
    public boolean testeV(String p){
        if(p.equals("V") || p.equals("v"))
            return true;
        else
            return false;
    }
    
    public boolean testeP(String p){
        if(p.equals("P") || p.equals("p"))
            return true;
        else
            return false;
    }
}
