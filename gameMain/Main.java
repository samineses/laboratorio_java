/*************************************************************
*       MC322 - Programação Orientada a Objetos
*       Saulo Samineses 
*       RA   = 188132
*************************************************************/
package gameMain;
import java.util.ArrayList;
import java.util.List;
import gameClasses.*;
import battleClass.*;
import java.util.Scanner;
import java.util.Random;
import static gameMain.Printx.*;
import static gameMain.Delay.*;
import static gameMain.ComandoInvalido.*;


@SuppressWarnings("resource")
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
        Item item01 = new Item("capacete", TipoItem.CABECA ,0,250,true);
        Item item02 = new Item("armadura", TipoItem.CORPO,15,350,true);
        Item item03 = new Item("sapato", TipoItem.PE,20,650,true);
        Item item03_2 = new Item("tenis", TipoItem.PE,20,650,true);

        Item item04 = new Item("espadaCurta", TipoItem.MAO,10,650,true);
        Item item05 = new Item("espadaLonga", TipoItem.MAO,20,650,true);
        Item item06 = new Item("espadaLaser", TipoItem.MAO,30,650,true);
        Item item07 = new Item("cajadoMagico", TipoItem.MAO,40,650,true);

        
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
        //itensJogador.add(item04);
        itensJogador.add(item03);
        itensJogador.add(item03_2);
        //itensJogador.add(item02);
        //itensJogador.add(item01);
        //itensJogador.add(item05);

        List<Item> itensMonstro = new ArrayList<Item>(); 
        itensMonstro.add(item05);
        itensMonstro.add(item06);
        itensMonstro.add(item07);
        
        
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
        
        BauDeTesouros bau = new BauDeTesouros(itensMonstro, 3);
        
        /*INSTANCIANDO e SETANDO
         * inventário
         * player
         */
        Inventario inventario = new Inventario(itensJogador,4);
        
        Player player01 = new Player("pedrinho",raceHumano,classeMago);
        player01.setLevel(80);
        player01.setInventario(inventario);
        


        //CONFIGURANDO SAÍDAs
        String jumpLine =   "\n------------------------------------------" ;
        
        String outInicial = "----------------------------------------------" +
                            " \n             Jogo Mostra:\n"                    +
                            " \nJogador 01: " + player01.getNAME()              +
                            " \nO que você deseja fazer?"                       +
                            " \n1 - Ver informações do jogador"                 +
                            " \n2 - Mostrar seus itens equipados"               +
                            " \n3 - Listar itens do inventário"                 +
                            " \n4 - Equipar itens do inventário"                +
                            " \n5 - Vender itens do inventário"                 +
                            " \n6 - Passar para abrir a porta\n"                +
                            " \n0 - Sair do Jogo"                               +
                            jumpLine +
                            " \n\nJogador digita: "                             ;
                    
        Scanner inputUsuario = new Scanner(System.in);         
        String n = "";
        
        
        boolean jump = false;
        while (true){
                
            if(jump == false){
                printDont("\n"+outInicial);        
                n = inputUsuario.next();
            }
            jump =false;
            
            //SAIR DO JOGO
            if(n.intern() == "0"){
                break;
            }
            
            //VER INFORMAÇÕES DO JOGADOR
            else if(n.intern() == "1"){
                String s0 = jumpLine +
                            "\n              Jogo Mostra:"              + 
                            "\n         -Informações do Jogador-"       +
                            "\n\n"+ player01.toString()                 ;
                String out ="\n..."                                         +
                            "\n[Digite 0 para Sair do Jogo]"                +
                            "\n[Digite 3 para Voltar ao Menu]"              +
                            "\n[Digite 4 para Ver Itens Equipados]"         +
                            "\n[Digite 5 para Ver Seu Itens do Inventário]" +
                            jumpLine ;
                
                print(s0+ "\n"+ out);
                n = comandoInvalido(n,out,"0","3","4","5");
                    
                if(n.intern() == "3"){
                    continue;
                }else if(n.intern() == "0"){
                    break;
                }else if(n.intern()=="5"){
                    n = "3";
                    jump = true;
                    continue;
                }else if (n.intern()=="4"){
                    n ="2";
                    jump = true;
                    continue;
                }    
            }

            //MOSTRAR ITENS EQUIPADOS
            else if(n.intern()=="2"){
                String s0 = jumpLine         +
                            "\n              Jogo Mostra:"                          +
                            "\n        -" + player01.getNAME()+" Equip Itens-"      +
                            "\n\n° Head: "+ player01.getItemHead().getNAME()        +
                            "\n° Body: "+ player01.getItemBody().getNAME()          +
                            "\n° Foot: "+ player01.getItemFoot().getNAME()          +
                            "\n° Left Hand: "+ player01.getItemLhand().getNAME()    +
                            "\n° Right Hand: "+ player01.getItemRhand().getNAME()   ;
                String out= "\n..."                                             +
                            "\n[Digite 0 para Sair do Jogo]"                    +
                            "\n[Digite 2 para Equipar Itens]"                   +
                            "\n[Digite 3 para Voltar ao Menu]"                  +
                            "\n[Digite 5 para Ver Seus Itens do Inventário]"    +
                            jumpLine         ;
                    
                print(s0+ "\n"+ out);
                
                n = comandoInvalido(n,out,"0","2","3","5");
                
                if (n.intern() == "3"){
                    continue;
                }else if(n.intern()=="0"){
                    break;
                }else if(n.intern()=="2"){
                    n = "4";
                    jump = true;
                    continue;
                }else if(n.intern()=="5"){
                    n = "3";
                    jump = true;
                    continue;
                }
            }

            //LISTAR ITENS DO INVENTÁRIO
            else if(n.intern()=="3"){
                String s1 = jumpLine +
                            "\n              Jogo Mostra:\n       "     + 
                            "-Inventário do "+ player01.getNAME()+ "-\n";    
                String out = "\n..."                                    +
                            "\n[Digite 0 para Sair do Jogo]"            +
                            "\n[Digite 1 para Vender Itens]"     +
                            "\n[Digite 2 para Equipar Itens]"    +
                            "\n[Digite 3 para Voltar ao Menu]"          +
                            jumpLine ;
                    
                
                print(s1);
                player01.getInventory().listarItens();
                print(out);
                n = comandoInvalido(n,out,"0","1","2","3");

                if(n.intern()=="0"){
                    break;
                }else if(n.intern()=="3"){
                    continue;
                }
                else if(n.intern()=="1"){
                    n ="5";
                    jump = true;
                    continue;
                }else if(n.intern()=="2"){
                    n = "4";
                    jump = true;
                    continue;
                }
            }

            //EQUIPAR ITENS
            else if(n.intern()=="4"){

                String s1 = jumpLine                                    +
                            "\n              Jogo Mostra:\n"            +                 
                            "\nQual item você gostaria de equipar?\n"   ;
                String s2 =  jumpLine                                   +            
                            "\n\nJogador digita : "                     ;
                                    
                String out = "\n..."                                    +
                            "\n[Digite 1 para Vender Itens]"      +
                            "\n[Digite 2 para Equipar Itens]"    +
                            "\n[Digite 3 para Voltar ao Menu]"          +
                            "\n[Digite 4 para Ver Itens Equipados]"+
                            jumpLine                                    ;
                
                
                print(s1);                
                player01.getInventory().listarItens();
                if(player01.getInventory().getItens().size()!=0){
                    printDont(s2);
                    n = inputUsuario.next();                        
                    print(jumpLine);
                    
                    boolean equip = false;
                    for(int i=0; i<player01.getInventory().getItens().size(); i++){    
                        if(n.intern() == player01.getInventory().getItens().get(i).getNAME()){
                            
                            if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Cabeça"){
                                if(player01.getItemHead().getNAME()==null){
                                    player01.setItemHead(player01.getInventory().getItens().get(i));
                                    player01.getInventory().removerItem(player01.getItemHead().getNAME());
                                }else{
                                    player01.getInventory().getItens().add(player01.getInventory().getItens().get(i));
                                    player01.setItemHead(player01.getInventory().getItens().get(i));
                                }
                                
                            }
                            else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Corpo"){
                                player01.setItemBody(player01.getInventory().getItens().get(i));
                                player01.getInventory().removerItem(player01.getItemBody().getNAME());
                            }
                            else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Mão"){
                                
                                if(player01.getItemRhand().getNAME() == null){
                                    player01.setItemRhand(player01.getInventory().getItens().get(i));
                                    player01.getInventory().removerItem(player01.getItemRhand().getNAME());                                    
                                }else{
                                    player01.setItemLhand(player01.getInventory().getItens().get(i));
                                    player01.getInventory().removerItem(player01.getItemLhand().getNAME());
                                }
                                
                            }
                            //sapato
                            //tenis
                            else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Pé"){
                                if(player01.getItemFoot().getNAME()!=null){
                                    player01.getInventory().adicionarItem(player01.getItemFoot());
                                }
                                player01.setItemFoot(player01.getInventory().getItens().get(i));
                                player01.getInventory().removerItem(player01.getItemFoot().getNAME());
                                
                            }
                            
                            equip = true;    
                            print("\n< "+player01.getNAME()+" equipou " + n + " >");                        
                            break;  
                        }
                    }
                    
                    if (equip == false){
                        print("O item '"+ n +"' não existe no inventario");                            
                    }    
                }else{
                    print("----------------------------------------------");
                    //fazer o mesmo para vender item, mas ainda acho que da pra melhorar                
                }
                
                print(out);
                n = comandoInvalido(n,out,"4","1","2","3");
                
                if (n.intern()=="4"){
                    n ="2";
                    jump = true;
                    continue;
                }else if(n.intern()=="3"){
                    continue;
                }else if(n.intern()=="2"){
                    n = "4";
                    jump = true;
                    continue;
                }else if(n.intern()=="1"){
                    n="5";
                    jump =true;
                    continue;
                }
            }

            //VENDER ITENS
            else if (n.intern()=="5"){

                String s1 = jumpLine       +
                            "\n              Jogo Mostra:\n"                    +  
                            "\nQual o nome do item você gostaria de vender?\n"  ;
                String s2 =  jumpLine                                           +            
                            "\n\nJogador digita : "                             ;
                String out = "\n..."                                            +
                            "\n[Digite 0 para Sair do Jogo]"                    +
                            "\n[Digite 1 para Vender Itens]"                    +
                            "\n[Digite 3 para Voltar ao Menu]"                  +
                            "\n[Digite 6 para Abrir Porta da Masmorra]"         +
                            jumpLine   ;
                print(s1);
                player01.getInventory().listarItens();
                printDont(s2);
                n = inputUsuario.next();                        
                print(jumpLine);
                boolean venda = false;
                for(int i=0; i<player01.getInventory().getItens().size(); i++){
                    if(n.intern() == player01.getInventory().getItens().get(i).getNAME()){
                        
                        List<Item> listaItensVender = new ArrayList<>();
                        listaItensVender.add(player01.getInventory().getItens().get(i));
                        player01.venderItems(listaItensVender);
                        venda = true;
                        
                        print("< "+player01.getNAME()+" vendeu o item " + n + " >");
                        break;
                    }
                }
                if (venda == false){
                    print("O item '"+ n +"' não existe no inventario");
                }
                
                print(out);
                n = comandoInvalido(n,out,"0","1","2","3");

                if (n.intern()=="3"){
                    continue;
                }else if(n.intern()=="0"){
                    break;
                }else if(n.intern()=="1"){
                    n = "5";
                    jump = true;
                    continue;
                }else if(n.intern()=="6"){
                    n = "6";
                    jump = true;
                    continue;
                }
            }

            //ABRIR PORTA
            else if (n.intern()=="6"){
                
                String s0 = jumpLine  +
                            "\n              Jogo Mostra:"               +
                            "\n\nVocê está tentando abrir uma porta da masmorra"+
                            "\nVocê pode igualmente abir uma porta com itens" +
                            "\nou com monstros, Boa sorte!";
                String out = "\n..."                                     +
                            "\n[Digite 0 para sair do jogo]"             +
                            "\n[Digite 1 para voltar ao menu]"           +
                            "\n[Digite 2 para abrir porta novamente]"    +
                            jumpLine  ;
    
                Masmorra masmorra = new Masmorra(monstros, bau);
                Random porta = new Random();
                int portaAleatoria = (porta.nextInt(2) + 1);
                    
                print(s0);
                delay();
                if(portaAleatoria == 1){                        
                    masmorra.abrirPortaMonstro(player01);
                }
                else if(portaAleatoria == 2){
                    masmorra.abrirPortaItem(player01);
                }
                                            
                print(out);
                n = comandoInvalido(n,out,"1","2","3","0");                    
    
                if (n.intern()=="1"){
                    continue;
                }else if(n.intern()=="0"){
                    break;
                }else if(n.intern()=="2"){
                    n = "6";
                    jump = true;
                    continue;
                }
                
            }
            
            //INPUT FORA DOS COMANDOS
            else{
                String s =  jumpLine+
                            "\n\nComando inválido, digite novamente";
                print(s);
            }

        }
        String gameOver =   jumpLine        +
                            "\n            "+
                            "-GAME OVER-"   ;
        print(gameOver);
    }
}
