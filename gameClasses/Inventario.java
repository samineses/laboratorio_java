/*
 * toString(util para teste)
 * removerItem (util para vender item)
 * 
 * 
 * 
 * 
 * 
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
    
    //GETs
    public int getLimiteDeItens() {
        return limiteDeItens;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    //ADICIONAR ITEM
    public boolean adicionarItem(Item item){
        itens.add(item);
        return true;
    }
    
    //ACESSAR ITEM
    Item testando;
    public int xp;
    public Item acessarItem(String name){
        for (int i=0; i<itens.size(); i++){
            String p = itens.get(i).getNAME();
            if (p.equals(name)){
                testando = itens.get(i);
                break;
            }   
        }
        return testando;
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

    //LISTAR ITENS INVENTARIO
    public void listarItens(){
        for (int i=0; i<itens.size(); i++){
            System.out.println("- "+itens.get(i).toString());
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
