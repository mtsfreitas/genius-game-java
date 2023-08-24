package genius.model;

import static genius.view.Janela.PEGA_COR_BOTAO;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Martins
 */
public class Jogo {
    
    public static final long VELOCIDADE_PISCA = 1000;
    
    public static final int BOTAO_RED = 0;
    public static final int BOTAO_AZUL = 1;
    public static final int BOTAO_YELLOW = 2;
    public static final int BOTAO_GREEN = 3;
    //public static final int BOTAO_WHITE = 4; ////////////////////////////////////////////////
        
    private static final int QTD_CORES = 4;     //VERMELHO(1), AZUL(2), AMARELO(3), VERDE(4) 
    private static int  conta_cores = 0;
    private static int  item_vetor = 0;
    
    int qtdCoresAcertos = 10; //Numero de cores para acertar
    ArrayList<Integer> cores = null;
//    ArrayList<Integer> acertados = null;

    int v[] = new int[qtdCoresAcertos]; // declaração e alocação de espaço para o vetor "v"

    
    public Jogo(){
        init();
    }
    
    public Jogo(int qtd_cores_acertos){
        qtdCoresAcertos = qtd_cores_acertos;
        init();
    }   
    
    public void init(){
        cores = new ArrayList<>(qtdCoresAcertos);
      
        Random gerador = new Random();
                
        //imprime sequência de qtdCores aleatórios
        for (int i = 0; i < qtdCoresAcertos; i++) {
             cores.add(gerador.nextInt(QTD_CORES));
        }
        
        conta_cores = 0;
        item_vetor = 0;
        v = new int[qtdCoresAcertos];
    }
   
    public int preencheVetor(int k){

        if(conta_cores != qtdCoresAcertos){
            for(int i = conta_cores; i < qtdCoresAcertos; i++)
            {
                
                v[i] = k; 
                conta_cores++;
                break;
            }

        }
        else
             System.out.println("Vetor PREENCHIDO.");
        
        return conta_cores;
         
    }
    public void mostraVetor(){
        for(int i =0; i <qtdCoresAcertos; i++){
            System.out.println(v[i]);
        }          
    }


    
    public boolean checaAcerto(){
         
        if(conta_cores < qtdCoresAcertos)
            return false;
        
        
          int j = 0;
          for(int i =0; i <qtdCoresAcertos; i++)
          {
              if(cores.get(i) != v[i]){
                  System.out.println("Errou!");
                  return false;
              }
              else 
                  if(cores.get(i) == v[i])
                  {
                      j++;
                      
                  }
          }
          if(j==qtdCoresAcertos){
              System.out.println("Parabénssss!");
              return true;
          }
          return false;
          
    }
    
    
    public ArrayList<Integer> getCores(){
        if(cores == null)
            init();
        return cores;
    }
    
    public int getQtdCoresAcertos(){
        return qtdCoresAcertos;
    }
    
    public void setQtdCoresAcertos(int qtdCoresAcertos){
        this.qtdCoresAcertos = qtdCoresAcertos;
    }
    
    public boolean checaAcertoIndividual(){
        if(conta_cores > 0)
            return (cores.get(conta_cores-1) == v[conta_cores-1]);
        return true;
    }


}
