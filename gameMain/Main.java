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
//import battleClass.*;
import gameClasses.*;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
       /*//INICIALIZANDO ( Masmorra )
        Monstro monstro01 = new Monstro();
        Monstro monstro02 = new Monstro();
        Monstro monstro03 = new Monstro();
        
        BauDeTesouros bau = new BauDeTesouros(0, null);

        List<Monstro> listMonstro = new ArrayList<Monstro>();
        listMonstro.add(monstro01);
        listMonstro.add(monstro02);
        listMonstro.add(monstro03);

        Masmorra masmorra01 = new Masmorra(listMonstro ,bau );
        masmorra01.toString();
        */
                
        //INSTANCIANDO ( Players )
        Player player01 = new Player("pedrinho");
        Player player02 = new Player("zequinha");
        Player player03 = new Player("joazinho");
        
        player01.setLevel(100);
        player02.setLevel(90);
        player03.setLevel(80);
        
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


        List<Item> listaItens = new ArrayList<Item>();
        Item item01 = new Item("item01", null ,10,10,true,listaClasses,listaRaces);
        Item item02 = new Item("item02", null,15,15,true,listaClasses,listaRaces);
        Item item03 = new Item("item03", null,20,20,true, listaClasses,listaRaces);

        Inventario inventario01 = new Inventario(listaItens,10);
        inventario01.adicionarItem(item01);
        inventario01.adicionarItem(item02);
        inventario01.adicionarItem(item03);
        
        player01.setInventario(inventario01);
        /*
        
        //Acessando Item e testando acesso logo abaixo(comentado)
        inventario01.acessarItem(item02);
        //System.out.println("esse é o item procrado"+ inventario01.acessarItem(item02).toString());
        */
        
        
        
        
        //IMPRESSÃO ( Players )
        System.out.println("----------------------------------------------------\n");
        System.out.println(player01.toString());
        System.out.println("----------------------------------------------------\n");
        
        //IMPRESSÃO DO INVENTARIO
        //inventario01.listarItens();
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
        String itemProcurado = "nome do item";
        System.out.println("Item procurado    = "+ inventario01.acessarItem(itemProcurado) );      
        System.out.println("----------------------------------------------------\n");
        //System.out.println(player01.toString());

    }
    
    
}
