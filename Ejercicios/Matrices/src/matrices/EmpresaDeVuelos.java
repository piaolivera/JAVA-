package matrices;
/**
 * @author Pia Olivera
 */
public class EmpresaDeVuelos {
    public static void main(String[] args) {
        int matriiz[][] ={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
        int suma =0;
        int transpuesta[][] = new int[3][3];
        
        for (int i = 0; i < matriiz.length; i++) {
            for (int j = 0; j < matriiz[i].length; j++) {
                System.out.println(matriiz[i][j] +" ");
                suma+= matriiz[i][j];
                transpuesta[j][i] = matriiz[i][j];
            }
            System.out.println("La suma de los elementos es: "+suma);
        }
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.println(transpuesta[i][j]+" ");
            }
            System.out.println();
        }
        
        int matriz[][] ={
            {2,4},
            {5,1}
        };
        int matriz2[][]={
            {5,6},
            {7,8}
        };
        int resultados[][] = new int[2][2];
        
        for(int i =0; i< matriz.length; i++){
            for(int j= 0; j< matriz2[0].length; j++){
                for(int k=0; k<matriz[0].length;k++){
                    resultados[i][j]+= matriz[i][k] * matriz2[k][j];
                }
                
            }
        }
        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[i].length; j++) {
                System.out.println(resultados[i][j]);
            }
            System.out.println();
        }
    }
}
