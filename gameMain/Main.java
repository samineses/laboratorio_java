/*
*       Saulo Samineses Ra=188132 
*       Data = 10/04/2024
*
*/
package gameMain;
import java.util.ArrayList;
import java.util.List;
import battleClass.*;
import classesFilhas.*;
import gameClasses.*;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ////////////////////////////////////////////////////////
        //INICIALIZANDO (Masmorra)
        Monstro monstro01 = new Monstro();
        Monstro monstro02 = new Monstro();
        Monstro monstro03 = new Monstro();
        
        BauDeTesouros bau = new BauDeTesouros();

        List<Monstro> listMonstro = new ArrayList<Monstro>();
        listMonstro.add(monstro01);
        listMonstro.add(monstro02);
        listMonstro.add(monstro03);

        Masmorra masmorra01 = new Masmorra(listMonstro ,bau );
        
        
        
        
        
        
        //////////////////////////////////////////////////////////////////////
        //inicializando e setando: Racas
        Raca raca01 = new Raca("long life",10);
        raca01.setNomeDaRaca("elfo");
        
        //inicializando itens
        Item item01 = new Item("item01",10);
        Item item02 = new Item("item02",20);
        Item item03 = new Item("item03",30);
        
        //Inicializando e setando: Inventario
        List<Item> lista = new ArrayList<Item>();
        Inventario inventario01 = new Inventario(lista,10);
        inventario01.setLimiteInventario(10);
        inventario01.setInventario(lista);
        
        //adicionando itens no inventario
        inventario01.adicionarItem(item01);
        inventario01.adicionarItem(item02);
        inventario01.adicionarItem(item03);


        //removendo item do inventario
        inventario01.removerItem(item01);
        
        //Acessando Item e testando acesso logo abaixo(comentado)
        inventario01.acessarItem(item02);
        //System.out.println("esse é o item procrado"+ inventario01.acessarItem(item02).toString());


        

        //inicializando Playeres
        Player Player01 = new Player("pedrinho");
        Player Player02 = new Player("juninho");
        Player Player03 = new Player("joaozinho");
        Player Player04 = new Player("zequinha");
        

        //inicializando e setando: Classes e herdeiros
        Classe classe01 = new Classe(null,null,null,null);

        classe01.setItemMaoDireita(item01);
        classe01.setItemMaoEsquerda(item02);
        classe01.setItemPe(item03);
   
        Mago mago01 = new Mago("MAGO", classe01.getItemMaoDireita(), classe01.getItemMaoEsquerda(), classe01.getItemPe() );
        mago01.setItemCabeca("leather helmet");
        
        Ladrao ladrao01 = new Ladrao("LADRAO", classe01.getItemMaoDireita(), classe01.getItemMaoEsquerda(), classe01.getItemPe() );
        ladrao01.setItemCorpo("leather tunic");

        Guerreiro guerreiro01 = new Guerreiro("GUERREIRO", classe01.getItemMaoDireita(), classe01.getItemMaoEsquerda(), classe01.getItemPe());
        guerreiro01.setItemCorpo("iron chestplate");
        guerreiro01.setItemCabeca("iron helmet");

        //setando Playeres
        Player01.setLevel(100);
        Player01.setRaca(raca01);
        Player01.setClasse(classe01);
        Player01.setInventario(inventario01);

        Player02.setLevel(100);
        Player02.setRaca(raca01);
        Player02.setClasse(mago01);
        Player02.setInventario(inventario01);

        Player03.setLevel(100);
        Player03.setRaca(raca01);
        Player03.setClasse(ladrao01);
        Player03.setInventario(inventario01);

        Player04.setLevel(100);
        Player04.setRaca(raca01);
        Player04.setClasse(guerreiro01);
        Player04.setInventario(inventario01);



        
        //Saídas
        System.out.println("----------------------------------------------------\n");
        System.out.println(Player01.toString());
        inventario01.listarInventario();
        System.out.println("----------------------------------------------------\n");
        //System.out.println(Player02.toString());        
        System.out.println("----------------------------------------------------\n");
        //System.out.println(Player03.toString());        
        System.out.println("----------------------------------------------------\n");
        //System.out.println(Player04.toString());        
        System.out.println("----------------------------------------------------\n");

    }
    
    
}