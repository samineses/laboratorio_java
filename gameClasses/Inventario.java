package gameClasses;
import java.util.List;
//import java.util.ArrayList;

public class Inventario {

    private int limiteInventario;
    //private List<Item> inventario;
    private List<Item> inventario;



    //constructor Iventário
    public Inventario(List<Item> inventario , int limiteInventario){
        this.inventario = inventario;
        this.limiteInventario = limiteInventario;
    }

      
    //getts and setts
    public int getLimiteInventario() {
        return limiteInventario;
    }
    public void setLimiteInventario(int limiteInventario) {
        this.limiteInventario = limiteInventario;
    }
    public List<Item> getInventario() {
        return inventario;
    }
    public void setInventario(List<Item> inventario) {
        this.inventario = inventario;
    }
    
    
    //Adicionar Item
    public boolean adicionarItem(Item itemx){
        inventario.add(itemx);
        return true;
    }
   
    //Remover Item
    public void removerItem(Item itemx){
        for (int i=0; i<inventario.size();i++){
            Item p = inventario.get(i);
            if(p.equals(itemx)){
                inventario.remove(p);
                break;
            }
        }
    }


    //Acessar Item
    public Item acessarItem(Item itemx){
        for (int i=0; i<inventario.size(); i++){
            Item p = inventario.get(i);
            if (p.equals(itemx)){
                break;
            }
        }
        return itemx;
    }



    //Listar Inventario
    public void listarInventario(){
        for (int i=0; i<inventario.size(); i++){
            System.out.println(inventario.get(i));
        }
    }
    
    
    //impressao
    public String toString() {
        
        String local;
    
        local = "\n[limite = " + limiteInventario + "]\n" + inventario;
        
        return  local;
    }
        
}
