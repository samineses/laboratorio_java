package battleClass;
import java.util.ArrayList;
import java.util.List;
import gameClasses.*;
import java.util.Random;

public class BauDeTesouros extends Inventario{

    
    public BauDeTesouros(List<Item> itens , int limiteDeItens){
        super(itens, limiteDeItens);                                
    }

    /* Descrição do Método pegarItensAleatorios:
    * Dentre itens da lista de itens do BauDeTesouros
    * ele gera uma lista aleatoria de itens de quantidade definida
    *
    * observação: esses laços são só para garantir que os itens gerados sejam diferentes
    *       tem erro AAAAAAA
    */
    public List<Item> pegarItensAleatorios(int quantidade){
        Random random = new Random();
        List <Item> listaItens = new ArrayList<>();
        int cont1 = getItens().size();
        int cont2 = 0;
        while(true){
            if(cont2==quantidade){
                return listaItens;    
            }
            for (int i=0; i<quantidade;i++){
                int p = random.nextInt(getItens().size());      
                if(cont1 != p){
                    cont1 = p;
                    cont2++;
                    listaItens.add(getItens().get(p));
                }else{
                    break;
                }
            }
        }        
    }


}