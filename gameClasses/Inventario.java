

package gameClasses;
import java.util.List;
import static gameMain.Printx.*;

public class Inventario {
    
    //ATRIBUTOS
    private List<Item> itens;
    private int limiteDeItens;
    
    
    //CONSTRUCTOR ( Inventário )
    public Inventario(List<Item> itens , int limiteDeItens){    
        this.itens = itens;
        this.limiteDeItens = limiteDeItens;
    }

    public Inventario(){
        
    }
    
    //GETTERS and SETTERS
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public int getLimiteDeItens() {
        return limiteDeItens;
    }
    public void setLimiteDeItens(int limiteDeItens){
        this.limiteDeItens = limiteDeItens;
    }
    
    //ACESSAR ITEM
    public Item acessarItem(String name){  
        int p = 0;     
        while(true){
            if(name == itens.get(p).getNAME()){
                return itens.get(p);                
            }
            p++;
            if(p == (itens.size())){
                //print("N deu certo");
            return null;
            }
        }    
    }

    //ADICIONAR ITEM
    public boolean adicionarItem(Item item){    
        if(itens.size()< limiteDeItens){
            itens.add(item);
            return true;
        }else{
            return false;
        }
    }
    
    
    /* LISTAR ITENS INVENTARIO
     * entrega varias strings com nomes dos itens dentro do inventario
     */
    public void listarItens(){
        
        if(itens.size()==0){
            print("O inventário está vazio");
            return;
        }
        
        for (int i=0; i<itens.size(); i++){
            print("° " + itens.get(i).getNAME() );       
        }
        return;        
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
