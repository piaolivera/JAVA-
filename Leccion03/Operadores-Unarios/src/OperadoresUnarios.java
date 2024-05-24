/*
 * @author Pia Olivera
 */
public class OperadoresUnarios {
    public static void main(String[] args) {
        var a =3;
        var b= -a; //le cambiamos el signo al valor de la variable "a"
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
        var c = true;
        var d = !c;  //cambiamos el valor de la variable "c" a false. lo contrario-
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incrementi
        //1. pre-incremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; //primero se incrementa la variable y después se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2. post-incremento (simbolo despues de la variable)
        var g =5;
        var h = g++; //primero se utiliza el valor y despues se incrementa
        System.out.println("g = " + g); //teniamos pendiente un incremento
        System.out.println("h = " + h);
        
        //decremento
        //1.pre-decremento
        var i =2;
        var j = --i;
        System.out.println("i = " + i); // ya esta decrementada
        System.out.println("j = " + j);
        
        //2. post-decremento
        var k = 4;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
        
        
        
        
        
        
    }
    
}
