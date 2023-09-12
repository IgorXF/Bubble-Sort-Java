public class BubbleSort {
    public static void main(String[] args) {
        System.out.print( "o vetor:88 77 23 11 17 68 36  \n \t" );
        //declaracao e inicialicao de um vetor de int
        int array[] = {88, 77, 23, 11, 17, 68, 36};
        
        //variavel auxiliar para trocar elementos durante a ordenacao
        int auxiliar;
        
        //verifica se alguma troca foi feita em uma passagem
        boolean controll; 

        //loop 1: controla o numero de passagens atraves do array
        for (int i = 0; i < array.length; ++i){
            
            //inicializa a variavel de controle como verdadeira no inicio de cada passagem
            controll = true;
            
            //loop 2: comapara e se necessario troca se necessario elementos adjacentes
            for(int j = 0; j < array.length - 1; ++j){
                if(array[j] > array[j + 1]){
                    //troca os elementos caso eles estejam fora de ordem
                    auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                    
                    //define a variavel como falsa para indicar que houve uma troca
                    controll = false;
                    for (int k = 0; k < array.length; ++k){
                        System.out.print(array[k] + " ");
                    }
                    System.out.print(" \n \t" );
                }
            }

            //se durante uma passagem nao ocorrer nenhuma troca quer dizer que o vetor está totalmente ordenado
            if(controll){
                break;
            }
        }

        //quando ordenado, imprime o vetor
        System.out.print("versao final ordenada \n \t");
        for (int l = 0; l < array.length; ++l){
            
            System.out.print(array[l] + " ");
        }
    }
}
