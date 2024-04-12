/*************************************************************
*       Saulo Samineses Ra=188132 
*       Data = 12/04/2024
* -alteração para pull-
*
*
* como na hora de imprimir ele sabe que é esse metodo toString da classe Inventario deve ser usada
*  dentro do método toString de Player?
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
        
        
        
        
        /*//inicializando itens
        Item item01 = new Item("item01",10);
        Item item02 = new Item("item02",20);
        Item item03 = new Item("item03",30);
        */

        
        /*//adicionando itens no inventario
        inventario01.adicionarItem(item01);
        inventario01.adicionarItem(item02);
        inventario01.adicionarItem(item03);
        
        
        //removendo item do inventario
        inventario01.removerItem(item01);
        
        //Acessando Item e testando acesso logo abaixo(comentado)
        inventario01.acessarItem(item02);
        //System.out.println("esse é o item procrado"+ inventario01.acessarItem(item02).toString());
        */
        
        /////////////////////////////////////////////////////////
        //INICIALIZANDO ( Players )
        Player player01 = new Player("pedrinho");
        Player player02 = new Player("zequinha");
        Player player03 = new Player("joazinho");
        
        player01.setLevel(100);
        player02.setLevel(90);
        player03.setLevel(80);
        
        //INICIALIZANDO ( Races )
        Race race01 = Race.ANAO;
        Race race02 = Race.ELFO;
        Race race03 = Race.HUMANO;
        
        player01.setRace(race01);
        player02.setRace(race02);
        player03.setRace(race03);
        
        
        //INICIALIZANDO ( Classes ) 
        Classe classe01 = Classe.MAGO;
        Classe classe02 = Classe.LADRAO;
        Classe classe03 = Classe.GUERREIRO;
        
        player01.setClasse(classe01);
        player02.setClasse(classe02);
        player03.setClasse(classe03);
        
        
        //INICIALIZANDO ( Inventario )
        List<Item> itens01 = new ArrayList<Item>();
        
        Inventario inventario01 = new Inventario(itens01,10);
        Inventario inventario02 = new Inventario(itens01,10);
        Inventario inventario03 = new Inventario(itens01,10);

        inventario01.setlimiteDeItens(10);
        inventario02.setlimiteDeItens(5);
        inventario03.setlimiteDeItens(3);
        inventario01.setItens(itens01);
        inventario02.setItens(itens01);
        inventario03.setItens(itens01);
        
        player01.setInventario(inventario01);
        player02.setInventario(inventario02);
        player03.setInventario(inventario03);
        
        
        //SAÍDAS
        System.out.println("----------------------------------------------------\n");
        System.out.println(player01.toString());
        System.out.println("----------------------------------------------------\n");
        System.out.println(player02.toString());
        System.out.println("----------------------------------------------------\n");
        System.out.println(player03.toString());
        System.out.println("----------------------------------------------------\n");
        
    }
    
    
}
