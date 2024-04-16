/*
 * deixar tudo no constructor atrapalha um pouco
 * 
 */

package gameClasses;
import java.util.List;

public class Inventario {
    
    //ATRIBUTOS
    private List<Item> itens;
    private int limiteDeItens;
    
    
    //CONSTRUCTOR ( Inventário )
    public Inventario(List<Item> itens , int limiteDeItens){    
        this.itens = itens;
        this.limiteDeItens = limiteDeItens;
    }
    
    //GETTERS
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    /////////////////
    public int getLimiteDeItens() {
        return limiteDeItens;
    }
    
    //ACESSAR ITEM
    public Item acessarItem(String name){       //e se tiver itens iguais na lista??
        //Item itemAcesso = new Item(null, null, 0, 0, false);
        Integer p = new Integer(0);
        for (int i=0; i<itens.size(); i++){
            if (itens.get(i).getNAME().equals(name)){
                p = i;
                //itemAcesso = itens.get(i);
                break;
            }   
        }
        return itens.get(p);
        //return itemAcesso;
    }

    //ADICIONAR ITEM
    public boolean adicionarItem(Item item){        //falta ver o caso de inventario cheios
        itens.add(item);
        return true;
    }
    
    //LISTAR ITENS INVENTARIO
    public void listarItens(){
        for (int i=0; i<itens.size(); i++){
            System.out.println("- "+itens.get(i).getNAME()); 
        }
    }

    //REMOVER ITEM
    public void removerItem(String name){
        for (int i=0; i<itens.size(); i++){
            String p = itens.get(i).getNAME();
            if (p.equals(name)){
                itens.remove(i);
                break;
            }
        }        
    }
    
    //REMOVER VARIOS ITEMS
    public void removerItems(List<String> nomes){
        for (int m=0; m<nomes.size(); m++){
            for (int n=0; n<itens.size();n++){
                String p = itens.get(n).getNAME();
                if(p.equals(nomes.get(m))){
                    itens.remove(n);
                break;
                }
            
            }
        }
    }
    
    //IMPRESSÃO 
    public String toString() {
        
        String local;
    
        local = "\n< Limite de Itens = " + limiteDeItens + " >\n" 
        + "\n " + itens;
        
        return  local;
    }
        
}
