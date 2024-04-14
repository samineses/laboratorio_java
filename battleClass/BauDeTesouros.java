/*
*
*   por que BauDeTesouros tem dois metodos descritos no UML identicas aos metodos do pai Inventario??
*
* -falta a logica do metodo aleatorio
 */


package battleClass;
import java.util.List;
import gameClasses.*;

public class BauDeTesouros extends Inventario{

    
    public BauDeTesouros(List<Item> itens , int limiteDeItens){
        super(itens, limiteDeItens);                                //ele consegue usar as coisas de inventario sem o constructor?
    }

    public List<Item> pegarItensAleatorios(int quantidade){
                
        return null;    
    }


}