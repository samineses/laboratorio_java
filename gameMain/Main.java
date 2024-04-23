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
        itensJogador.add(item04);
        itensJogador.add(item03);
        itensJogador.add(item02);
        itensJogador.add(item01);
        itensJogador.add(item05);

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
        Inventario inventario = new Inventario(itensJogador,4);         //limite de itens?
        
        Player player01 = new Player("pedrinho",raceHumano,classeMago);       //e se outro player?  
        player01.setLevel(80);                                              //level igual ao monstro?
        player01.setInventario(inventario);

        Item testeNulo = new Item("nulo",null,0,0,false);
        player01.setItemBody(testeNulo);
        player01.setItemHead(testeNulo);
        player01.setItemFoot(testeNulo);
        player01.setItemRhand(testeNulo);
        player01.setItemLhand(testeNulo);
        
                


        //CONFIGURANDO SAÍDAs
        
        String outInicial = "---------------------------------------"       +
                            " \n             Jogo Mostra:\n"                +
                            " \nJogador 01: " + player01.getNAME()          +
                            " \nO que você deseja fazer?"                   +
                            " \n1 - Ver informações do jogador"             +
                            " \n2 - Mostrar seus itens equipados"           +
                            " \n3 - Listar itens do inventário"             +
                            " \n4 - Equipar itens do inventário"            +
                            " \n5 - Vender itens do inventário"             +
                            " \n6 - Passar para abrir a porta\n"            +
                            " \n0 - Sair do Jogo"                           +
                            " \n---------------------------------------\n"  +
                            " \nJogador digita: "                           ;
                    
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
                String s0 = "\n---------------------------------------" +
                            "\n              Jogo Mostra:"              + 
                            "\n         -Informações do Jogador-"       +
                            "\n\n"+ player01.toString()                 ;
                String out ="\n..."                                     +
                            "\n[Digite 0 para sair do jogo]"            +
                            "\n[Digite 1 para voltar ao menu]"          +
                            "\n---------------------------------------" ;
                
                print(s0+ "\n"+ out);
                n = comandoInvalido(n,out,"0","1","0","0");
                    
                if(n.intern() == "1"){
                    continue;
                }else if(n.intern() == "0"){
                    break;
                }    
            }

            //MOSTRAR ITENS EQUIPADOS
            else if(n.intern()=="2"){
                String s0 = "\n---------------------------------------"             +
                            "\n              Jogo Mostra:"                          +
                            "\n        -" + player01.getNAME()+" Equip Itens-"      +                                
                            "\n\n° Head: "+ player01.getItemHead().getNAME()       +
                            "\n° Body: "+ player01.getItemBody().getNAME()         +
                            "\n° Foot: "+ player01.getItemFoot().getNAME()         +
                            "\n° Left Hand: "+ player01.getItemLhand().getNAME()   +
                            "\n° Right Hand: "+ player01.getItemRhand().getNAME()  ;
                String out ="\n..."                                                 +
                            "\n[Digite 0 para sair do jogo]"                        +
                            "\n[Digite 1 para voltar ao menu]"                      +
                            "\n[Digite 2 para equipar itens do inventário]"         +
                            "\n---------------------------------------"             ;
                    
                print(s0+ "\n"+ out);
                
                n = comandoInvalido(n,out,"0","1","2","0");
                
                if (n.intern() == "1"){
                    continue;
                }else if(n.intern()=="0"){
                    break;
                }else if(n.intern()=="2"){
                    n = "4";
                    jump = true;
                    continue;
                }
            }

            //LISTAR ITENS DO INVENTÁRIO
            else if(n.intern()=="3"){
                String s1 = "\n---------------------------------------" +
                            "\n              Jogo Mostra:\n       "     + 
                            "-Inventário do "+ player01.getNAME()+ "-\n";    
                String out = "\n..."                                    +
                            "\n[Digite 0 para sair do jogo]"            +
                            "\n[Digite 1 para voltar ao menu]"          +
                            "\n[Digite 2 para vender um dos itens]"     +
                            "\n[Digite 3 para equipar um dos itens]"    +
                            "\n---------------------------------------" ;
                    
                print(s1);
                player01.getInventory().listarItens();
                print(out);
                n = comandoInvalido(n,out,"0","1","2","3");

                if(n.intern()=="0"){
                    break;
                }else if(n.intern()=="0"){
                    continue;
                }
                else if(n.intern()=="2"){
                    n ="5";
                    jump = true;
                    continue;
                }else if(n.intern()=="3"){
                    n = "4";
                    jump = true;
                    continue;
                }
            }

            //EQUIPAR ITENS
            else if(n.intern()=="4"){
                String s1 = "\n---------------------------------------"     +
                            "\n              Jogo Mostra:\n"                +                 
                            "\nQual item você gostaria de equipar?"         +
                            "\n---------------------------------------\n"   +            
                            "\nJogador digita : "                           ;
                                    
                String out = "\n..."                                        +
                            "\n[Digite 1 para voltar ao menu]"              +
                            "\n[Digite 2 para abrir o inventário]"          +
                            "\n[Digite 3 para equipar outros itens]"        +
                            "\n[Digite 4 para ver seus itens equipados]"    +
                            "\n---------------------------------------"     ;


                printDont(s1);
                n = inputUsuario.next();                        
                print("\n---------------------------------------");
                
                boolean equip = false;
                for(int i=0; i<player01.getInventory().getItens().size(); i++){    
                    if(n.intern() == player01.getInventory().getItens().get(i).getNAME()){
                        
                        if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Cabeça"){
                            player01.setItemHead(player01.getInventory().getItens().get(i));
                            player01.getInventory().removerItem(player01.getItemHead().getNAME());

                        }
                        else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Corpo"){
                            player01.setItemBody(player01.getInventory().getItens().get(i));
                            player01.getInventory().removerItem(player01.getItemBody().getNAME());
                        }
                        else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Mão"){
                            if(player01.getItemRhand()!=null){
                                player01.setItemLhand(player01.getInventory().getItens().get(i));
                                player01.getInventory().removerItem(player01.getItemLhand().getNAME());
                            }else{
                                player01.setItemRhand(player01.getInventory().getItens().get(i));
                                player01.getInventory().removerItem(player01.getItemRhand().getNAME());
                            }

                        }
                        else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Pé"){
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
                
                print(out);
                n = comandoInvalido(n,out,"4","1","2","3");
                
                if (n.intern()=="4"){
                    n ="2";
                    jump = true;
                    continue;
                }else if(n.intern()=="1"){
                    continue;
                }else if(n.intern()=="3"){
                    n = "4";
                    jump = true;
                    continue;
                }else if(n.intern()=="2"){
                    n="3";
                    jump =true;
                    continue;
                }
            }

            //VENDER ITENS
            else if (n.intern()=="5"){

                String s1 = "\n---------------------------------------"       +
                            "\n              Jogo Mostra:\n"                +  
                            "\nQual o nome do item você gostaria de vender?"       +
                            "\n---------------------------------------\n"   +            
                            "\nJogador digita : "                           ;
                String out = "\n..."                                          +
                            "\n[Digite 0 para sair do jogo]"             +
                            "\n[Digite 1 para voltar ao menu]"           +
                            "\n[Digite 2 para vender outro item]"        +
                            "\n[Digite 3 para abrir o inventário]"        +
                            "\n---------------------------------------"   ;
                
                printDont(s1);
                n = inputUsuario.next();                        
                print("\n---------------------------------------");
                boolean venda = false;
                for(int i=0; i<player01.getInventory().getItens().size(); i++){
                    if(n.intern() == player01.getInventory().getItens().get(i).getNAME()){
                        
                        List<Item> listaItensVender = new ArrayList<>();
                        listaItensVender.add(player01.getInventory().getItens().get(i));
                        player01.venderItems(listaItensVender);
                        venda = true;
                        
                        print("< "+player01.getNAME()+" vendeu o item " + n + " >");
                        printDont(out);
                        
                        break;
                    }
                }
                if (venda == false){
                    
                    print("O item '"+ n +"' não existe no inventario");
                    print(out);
                    
                }
                                
                n = comandoInvalido(n,out,"0","1","2","3");

                if (n.intern()=="1"){
                    continue;
                }else if(n.intern()=="0"){
                    break;
                }else if(n.intern()=="2"){
                    n = "5";
                    jump = true;
                    continue;
                }else if(n.intern()=="3"){
                    n = "3";
                    jump = true;
                    continue;
                }
            }

            //ABRIR PORTA
            else if (n.intern()=="6"){
                
                String s0 = "\n---------------------------------------"  +
                            "\n              Jogo Mostra:"               +
                            "\n\nVocê está tentando abrir uma porta da masmorra"+
                            "\nVocê pode igualmente abir uma porta com itens" +
                            "\nou com monstros, Boa sorte!";
                String out = "\n..."                                     +
                            "\n[Digite 0 para sair do jogo]"             +
                            "\n[Digite 1 para voltar ao menu]"           +
                            "\n[Digite 2 para abrir porta novamente]"    +
                            "\n---------------------------------------"  ;
    
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
                String s =  "\n---------------------------------------\n"+
                            "\nComando inválido, digite novamente";
                print(s);
            }

        }
        String gameOver="\n---------------------------------------" +
                        "\n            -GAME OVER-"                 ;
        print(gameOver);
    }
}
