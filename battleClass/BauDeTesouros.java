package battleClass;
import java.util.ArrayList;
import java.util.List;
import gameClasses.*;
import java.util.Random;

public class BauDeTesouros extends Inventario{

    
    public BauDeTesouros(List<Item> itens , int limiteDeItens){
        super(itens, limiteDeItens);                                
    }

    public BauDeTesouros(){
    }

    /* PEGAR ITENS ALEATORIOS:
    *  Dentre itens da lista de itens do BauDeTesouros
    *  ele gera uma lista aleatoria de itens de quantidade definida!
    */
    public List<Item> pegarItensAleatorios(int quantidade){
        Random random = new Random();
        List <Item> listaItens = new ArrayList<>();
        int cont = getItens().size();
        while(true){
            if (listaItens.size() == quantidade){
                return listaItens;
            }
            int p = random.nextInt(getItens().size());  
            if(cont != p){
                cont = p;
                listaItens.add(getItens().get(p));
                continue;
            }
            
        }        
    }

    @Override
    public Item acessarItem(String name){        
        int p = 0;     
        while(true){
            if(name == getItens().get(p).getNAME()){
                Item returnItem = getItens().get(p);
                getItens().remove(p);
                return returnItem;                
            }
            p++;
            if(p == (getItens().size())){
            return null;
            }
        }  
    }
}