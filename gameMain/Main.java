/*************************************************************
*       MC322 - Programação Orientada a Objetos
*       @author Saulo Samineses_ra188132
*       Laboratório 04
*
*   alteração 01_07_05: 12:44
*************************************************************/
package gameMain;
import java.util.ArrayList;
import java.util.List;
import gameClasses.*;
import battleClass.*;


public class Main {
    public static void main(String[] args){
        

        /*INSTANCIANDO OBJETOS
         * 3 objetos de Raça
         * 3 objetos de Classes
         * 7 objetos de Item
         */
        Race raceHumano = Race.HUMANO;
        Race raceAnao = Race.ANAO;
        Race raceElfo = Race.ELFO;
        Classe classeMago = Classe.MAGO;
        Classe classeLadrao = Classe.LADRAO;
        Classe classeGuerreiro = Classe.GUERREIRO;
        //depois eu seto quais raças e classes cada item pode usar
        Item item01 = new Item("capacete", TipoItem.CABECA ,0,250);
        Item item02 = new Item("armadura", TipoItem.CORPO,15,350);
        Item item03 = new Item("sapato", TipoItem.PE,20,650);
        Item item04 = new Item("espadaCurta", TipoItem.MAO,10,650);
        Item item05 = new Item("espadaLonga", TipoItem.MAO,20,650);
        Item item06 = new Item("espadaLaser", TipoItem.MAO,30,650);
        Item item07 = new Item("cajadoMagico", TipoItem.MAO,40,650);

        item04.setItemGrande(false);
        item05.setItemGrande(true);
        item06.setItemGrande(false);
        //item07.setItemGrande(false);

        /*INSTANCIANDO LISTAS
         * Classes
         * Raças
         * Itens de jogadores
         * Itens de monstros
         */
        List<Classe> listaClasses = new ArrayList<Classe>();
        listaClasses.add(classeMago);
        listaClasses.add(classeLadrao);
        listaClasses.add(classeGuerreiro);
        
        List<Race> listaRaces = new ArrayList<>();
        listaRaces.add(raceHumano);
        listaRaces.add(raceAnao);
        listaRaces.add(raceElfo);
        
        List<Item> itensJogador = new ArrayList<Item>(); 
        itensJogador.add(item04);
        itensJogador.add(item05);
        itensJogador.add(item07);
        itensJogador.add(item06);
        
        List<Item> itensMonstro = new ArrayList<Item>(); 
        itensMonstro.add(item05);
        itensMonstro.add(item06);
        itensMonstro.add(item07);
        itensMonstro.add(item03);
        itensMonstro.add(item02);
        itensMonstro.add(item01);
        
        
        //INSTANCIANDO e SETANDO ( Monstros )
        Monstro monstro01 = new Monstro("esqueleto",100,1);
        Monstro monstro02 = new Monstro("zumbi",90,2);
        Monstro monstro03 = new Monstro("spider",80,3);
        monstro01.setTesouros(itensMonstro);
        monstro02.setTesouros(itensMonstro);
        monstro03.setTesouros(itensMonstro);
        List <Monstro> monstros = new ArrayList<>();
        monstros.add(monstro01);
        monstros.add(monstro02);
        monstros.add(monstro03);
        
        BauDeTesouros bau = new BauDeTesouros(itensMonstro, 6);
        
        /*INSTANCIANDO e SETANDO
         * inventário
         * player
         */
        Inventario inventario = new Inventario(itensJogador,6);
        
        Player player01 = new Player("pedrinho",raceHumano,classeMago);
        player01.setLevel(80);
        player01.setInventario(inventario);    
        



        List<Player> players = new ArrayList<>();
        players.add(player01);
        Masmorra masmorra = new Masmorra(monstros, bau);


        Jogo jogo01 = new Jogo();
        jogo01.setPlayers(players);
        jogo01.setMasmorra(masmorra);
        jogo01.loopDeJogo(true);


    }
}
