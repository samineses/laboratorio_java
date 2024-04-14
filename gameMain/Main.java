/*************************************************************
*       Saulo Samineses 
*       RA   = 188132
*       Data = 13/04/2024
*       Hora = 00:54
* 
*
*
* -enxuguei ao maximo: se não to usando um get ou set não to implementando
*
* -como na hora de imprimir ele sabe que é esse metodo toString da classe Inventario deve ser usada
* dentro do método toString de Player?
*
* -criar o metodo saida formatada!!
*
* -qual a diferença entre instanciar um objeto direto sem usar new??
*
* - quero fazer impressao pros metodos do inventario!
*
*************************************************************/
package gameMain;
import java.util.ArrayList;
import java.util.List;
import gameClasses.*;
import battleClass.*;
//import static battleClass.CampoDeBatalha.*;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        
        //INSTANCIANDO ( Players )
        Player player01 = new Player("pedrinho");
        Player player02 = new Player("zequinha");
        Player player03 = new Player("joazinho");
                
        
        //INSTANCIANDO ( Level )
        
        
        
        //INSTANCIANDO ( Races )
        Race race01 = Race.ANAO;
        Race race02 = Race.ELFO;
        Race race03 = Race.HUMANO;
        
        player01.setRace(race01);
        player02.setRace(race02);
        player03.setRace(race03);
        
        
        //INSTANCIANDO ( Classes ) 
        Classe classe01 = Classe.MAGO;
        Classe classe02 = Classe.LADRAO;
        Classe classe03 = Classe.GUERREIRO;
        
        player01.setClasse(classe01);
        player02.setClasse(classe02);
        player03.setClasse(classe03);
        
        
        //INSTANCIANDO ( Inventario e Itens )
        
        List<Classe> listaClasses = new ArrayList<Classe>();
        listaClasses.add(classe01);
        listaClasses.add(classe02);
        listaClasses.add(classe03);
        
        List<Race> listaRaces = new ArrayList<>();
        listaRaces.add(race01);
        listaRaces.add(race02);
        listaRaces.add(race03);
        
        
        Item item01 = new Item("item01", TipoItem.CABECA ,0,250,true,listaClasses,listaRaces);
        Item item02 = new Item("item02", TipoItem.CORPO,15,350,true,listaClasses,listaRaces);
        Item item03 = new Item("item03", TipoItem.PE,20,650,true, listaClasses,listaRaces);
        Item item04 = new Item("item04", TipoItem.MAO,20,650,true, listaClasses,listaRaces);
        
        List<Item> listaItens01 = new ArrayList<Item>();
        List<Item> listaItens02 = new ArrayList<Item>();
        
        listaItens02.add(item04); //pro monstro
        Inventario inventario01 = new Inventario(listaItens01,10);
        inventario01.adicionarItem(item01);
        inventario01.adicionarItem(item02);
        inventario01.adicionarItem(item03);
        
        player01.setInventario(inventario01);
        player01.setItemHead(item01);
        player01.setItemBody(item01);
        player01.setItemFoot(item01);
        player01.setItemRhand(item01);
        player01.setItemLhand(item01);
        
         
        /*//IMPRESSÃO ( Players )
        System.out.println("----------------------------------------------------\n");
        System.out.println(player01.toString());
        System.out.println("----------------------------------------------------\n");
        
        
        
        //IMPRESSÃO DO INVENTARIO
        inventario01.listarItens();
        //System.out.println(inventario01.toString());
        System.out.println("----------------------------------------------------\n");
        
        
        //REMOÇÃO (item from inventario)
        String itemToRemove = "null";
        inventario01.removerItem(itemToRemove);
        System.out.println("item removido     = " + itemToRemove);

        
        //REMOÇÃO (lista de items from inventario)
        List <String> itemsToRemove = new ArrayList<>();
        //itemsToRemove.add("item01");
        //itemsToRemove.add("item02");
        //itemsToRemove.add("item03");
        
        inventario01.removerItems(itemsToRemove);
        System.out.println("items removidos   = " + itemToRemove);
        
        
        //IMPRESSÃO ( Acesso à Itens ) 
        String itemProcurado = "null";
        System.out.println("Item procurado    = "+ inventario01.acessarItem(itemProcurado) );      
        System.out.println("----------------------------------------------------\n");
        //System.out.println(player01.toString());
        

        
        //VENDENDO ITENS
        List<Item> listaItensVender = new ArrayList<>();
        listaItensVender.add(item01);
        listaItensVender.add(item02);
        //listaItensVender.add(item03);
        
        player01.venderItems(listaItensVender);
        */
        
        /////////////////////////////////////////////////////////////////// 

        
        //INICIALIZANDO ( Masmorra pt1 )
        //inventario01.listarItens();
        //player01.setLevel(70);
        //System.out.println(player01.toString());

        Monstro monstro01 = new Monstro("helloWorld",80,9);
        Monstro monstro02 = new Monstro("helloWorld",80,9);
        Monstro monstro03 = new Monstro("helloWorld",80,9);
        
        System.out.println("----------------------------------------------------\n");
        //System.out.println(monstro01.toString());
        monstro01.setTesouros(listaItens02);
        monstro02.setTesouros(listaItens02);
        monstro03.setTesouros(listaItens02);
        //CampoDeBatalha.batalharContraMonstro(monstro01, player01);
        System.out.println("----------------------------------------------------\n");
        //inventario01.listarItens();
        List <Monstro> monstros = new ArrayList<>();
        monstros.add(monstro01);
        monstros.add(monstro02);
        monstros.add(monstro03);

        BauDeTesouros bau = new BauDeTesouros(listaItens01, 3);

        
        Masmorra masmorra01 = new Masmorra(monstros, bau);
        
        masmorra01.abrirPortaItem(player01);
        
        
    }
    
    
}
