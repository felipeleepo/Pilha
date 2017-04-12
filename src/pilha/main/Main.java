package pilha.main;

import pilha.array.PilhaArray;
import pilha.excecoes.EPilhaVazia;
/**
 *
 * @author Felipe
 */
public class Main {
    public static void main(String[] args) {
        // Pilha de tamanho 1, e incremento de 1
        PilhaArray s = new PilhaArray(1, 1);
        
        try{
            s.push(5);
            s.push(3);
            System.out.println(s.pop());
            s.push(2);
            s.push(8);
            System.out.println(s.pop());
            System.out.println(s.pop());
            s.push(9);
            s.push(1);
            System.out.println(s.pop());
            s.push(7);
            s.push(6);
            System.out.println(s.pop());
            System.out.println(s.pop());
            s.push(4);
            System.out.println(s.pop());
            System.out.println(s.pop());
           // System.out.println("Top = " + s.top());
        
        }catch(EPilhaVazia e){
            System.out.println(e.getMessage());
        }
        finally{
           s.print();
        }
        
        // Teste da Lista sobre Pilha
        /*
        PilhaArray ele10 = new PilhaArray(1, 10);
        double t1,t2;
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 10;i++){
            ele10.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("10/10: " + (t2-t1));
        
        ele10 = new PilhaArray(1, 0);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 10;i++){
            ele10.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("10/2: " + (t2-t1));
        System.out.println("-----------------------------------");
        
        PilhaArray ele100 = new PilhaArray(1,10);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 100;i++){
            ele100.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("100/10: " + (t2-t1));
        
        ele100 = new PilhaArray(1, 100);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 100;i++){
            ele100.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("100/100: " + (t2-t1));
        
        ele100 = new PilhaArray(1,0);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 100;i++){
            ele100.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("100/2: " + (t2-t1));
        System.out.println("-----------------------------------");
        
        PilhaArray ele1000 = new PilhaArray(1, 10);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000;i++){
            ele1000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1000/10: " + (t2-t1));
        
        ele1000 = new PilhaArray(1, 100);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000;i++){
            ele1000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1000/100: " + (t2-t1));
        ele1000 = new PilhaArray(1, 1000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000;i++){
            ele1000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1000/1000: " + (t2-t1));
        ele1000 = new PilhaArray(1, 0);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000;i++){
            ele1000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1000/2: " + (t2-t1));
        System.out.println("-----------------------------------");
        
        PilhaArray ele10000 = new PilhaArray(1, 10);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 10000;i++){
            ele10000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("10000/10: " + (t2-t1));
        ele10000 = new PilhaArray(1, 100);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 10000;i++){
            ele10000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("10000/100: " + (t2-t1));
        ele10000 = new PilhaArray(1, 1000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 10000;i++){
            ele10000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("10000/1000: " + (t2-t1));
        ele10000 = new PilhaArray(1, 10000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 10000;i++){
            ele10000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("10000/10000: " + (t2-t1));
        ele10000 = new PilhaArray(1, 0);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 10000;i++){
            ele10000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("10000/2: " + (t2-t1));
        
        System.out.println("-----------------------------------");
        
        PilhaArray ele100000 = new PilhaArray(1, 10);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            ele100000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("100000/10: " + (t2-t1));
        ele100000 = new PilhaArray(1, 100);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            ele100000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("100000/100: " + (t2-t1));
        ele100000 = new PilhaArray(1, 1000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            ele100000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("100000/1000: " + (t2-t1));
        ele100000 = new PilhaArray(1, 10000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            ele100000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("100000/10000: " + (t2-t1));
        ele100000 = new PilhaArray(1, 100000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            ele100000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("100000/100000: " + (t2-t1));
        ele100000 = new PilhaArray(1, 0);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            ele100000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("100000/2: " + (t2-t1));
        System.out.println("--------------------------");
        
        PilhaArray ele1000000 = new PilhaArray(1, 10);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ele1000000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1kk/10: " + (t2-t1));
        ele1000000 = new PilhaArray(1, 100);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ele1000000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1kk/100: " + (t2-t1));
        ele1000000 = new PilhaArray(1, 1000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ele1000000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1kk/1k: " + (t2-t1));
        ele1000000 = new PilhaArray(1, 10000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ele1000000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1kk/10k: " + (t2-t1));
        ele1000000 = new PilhaArray(1, 100000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ele1000000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1kk/100k: " + (t2-t1));
        ele1000000 = new PilhaArray(1, 10000000);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ele1000000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1kk/1kk: " + (t2-t1));
        ele1000000 = new PilhaArray(1, 0);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ele1000000.push(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("1kk/2: " + (t2-t1));
        */
        
        
    }
}
