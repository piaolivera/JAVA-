
public class Invertido {
    public static void main(String[] args) {
        //Invertimos los elementos
        int numeros[] = {1, 2, 3, 4, 5};
        
        int aux[] = new int[numeros.length];
        
        for (int i = numeros.length-1,j =0; i >=0 ; i--, j++) {
                aux[j]= numeros[i];
                System.out.println(aux[j]);
            }
        
        
        
        //Crea un array de enteros y calcula la suma de todos sus elementos
        
        int enteros[] = {4, 1, 6,7};
        int suma=0;
        for (int i = 0; i < enteros.length ; i++) {
            suma+= enteros[i];           
            
        }
        System.out.println("La suma total del arreglo: " +suma);
        
        //rea un array de enteros y encuentra el valor máximo en el array
        int array [] = {0, 5,10,6};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]> max)
                max = array[i]; 
            
        }
        System.out.println("El valor maximo es :" +max);
        
        }
        
    }

