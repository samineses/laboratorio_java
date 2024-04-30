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
        


        //CONFIGURANDO SAÍDAs
        String jumpLine =   "\n--------------------------------"    ;
        
        String outInicial = "--------------------------------"      +
                            " \n         Jogo Mostra:\n"            +
                            " \nJogador 01: " + player01.getNAME()  +
                            " \nO que você deseja fazer?"           +
                            " \n1 - Ver informações do jogador"     +
                            " \n2 - Mostrar seus itens equipados"   +
                            " \n3 - Listar itens do inventário"     +
                            " \n4 - Equipar itens do inventário"    +
                            " \n5 - Vender itens do inventário"     +
                            " \n6 - Passar para abrir a porta\n"    +
                            " \n0 - Sair do Jogo" + jumpLine        +
                            " \n\nJogador digita: "                 ;
                    
        Scanner inputUsuario = new Scanner(System.in);         
        String n = "";
        
        
        boolean big = false;    //item grande está ou não, equipado
        boolean jump = false;   //alternar os menus dentro do loop
        boolean t = true;
        while (t == true){
                
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
                            "\n[Digite 0 para Voltar ao Menu]"              +
                            "\n[Digite 4 para Ver Itens Equipados]"         +
                            "\n[Digite 5 para Ver Itens do Inventário]" +
                            jumpLine ;
                
                print(s0+ "\n"+ out);
                n = comandoInvalido(n,out,"0","0","4","5");
                    
                if(n.intern() == "0"){
                    continue;
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
                            "\n[Digite 0 para Voltar ao Menu]"                  +
                            "\n[Digite 2 para Equipar Itens]"                   +
                            "\n[Digite 5 para Ver Seus Itens do Inventário]"    +
                            jumpLine         ;
                    
                print(s0+ "\n"+ out);
                
                n = comandoInvalido(n,out,"0","2","0","5");
                
                if (n.intern() == "0"){
                    continue;
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
                            "\n[Digite 0 para Voltar ao Menu]"          +
                            "\n[Digite 1 para Vender Itens]"     +
                            "\n[Digite 2 para Equipar Itens]"    +
                            jumpLine ;
                    
                
                print(s1);
                player01.getInventory().listarItens();
                print(out);
                n = comandoInvalido(n,out,"0","1","2","0");

                if(n.intern()=="0"){
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
                            "\n[Digite 0 para Voltar ao Menu]"          +
                            "\n[Digite 1 para Vender Itens]"            +
                            "\n[Digite 2 para Equipar Itens]"           +
                            "\n[Digite 4 para Ver Itens Equipados]"     +
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
                                if(player01.getItemHead().getNAME()!=null){
                                    player01.getInventory().adicionarItem(player01.getItemHead());
                                }
                                player01.setItemHead(player01.getInventory().getItens().get(i));
                                player01.getInventory().removerItem(player01.getItemHead().getNAME());
                            }

                            else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Corpo"){
                                if(player01.getItemBody().getNAME()!=null){
                                    player01.getInventory().adicionarItem(player01.getItemBody());
                                }
                                player01.setItemBody(player01.getInventory().getItens().get(i));
                                player01.getInventory().removerItem(player01.getItemBody().getNAME());
                            }

                            else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Pé"){
                                if(player01.getItemFoot().getNAME()!=null){
                                    player01.getInventory().adicionarItem(player01.getItemFoot());
                                }
                                player01.setItemFoot(player01.getInventory().getItens().get(i));
                                player01.getInventory().removerItem(player01.getItemFoot().getNAME());
                                
                            }

                            else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Mão"){
                                
                                if(player01.getInventory().getItens().get(i).getItemGrande() == true){   
                                    if(player01.getItemLhand().getNAME()!=null){
                                        if(player01.getItemRhand().getNAME()!=null){
                                            player01.getInventory().adicionarItem(player01.getItemRhand());
                                        }
                                        player01.getInventory().adicionarItem(player01.getItemLhand());
                                    }
                                    player01.setItemLhand(player01.getInventory().getItens().get(i));
                                    player01.setItemRhand(player01.getInventory().getItens().get(i));
                                    big = true;
                                }

                                if(player01.getInventory().getItens().get(i).getItemGrande() == false){
                                    if(player01.getItemLhand().getNAME() == null){
                                        player01.setItemLhand(player01.getInventory().getItens().get(i));
                                    }
                                    else{
                                        if(player01.getItemRhand().getNAME() != null){
                                            if(big == true){
                                                Item nulo = new Item();
                                                player01.setItemLhand(nulo);                                        
                                            }
                                            player01.getInventory().adicionarItem(player01.getItemRhand());
                                        }
                                        player01.setItemRhand(player01.getInventory().getItens().get(i));                                            
                                    }                                                                        
                                    big = false;
                                }                                
                                
                                player01.getInventory().removerItem(player01.getInventory().getItens().get(i).getNAME());                                                                                                      
                            }
                            
                            equip = true;    
                            print("\n< "+player01.getNAME()+" equipou " + n + " >");                        
                            if(big==true){
                                print("\n"+n+" ocupará dois espaços\nde itens das mãos");
                            }
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
                n = comandoInvalido(n,out,"4","1","2","0");
                
                if (n.intern()=="4"){
                    n ="2";
                    jump = true;
                    continue;
                }else if(n.intern()=="0"){
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
                            "\n[Digite 0 para Voltar ao Menu]"                  +
                            "\n[Digite 1 para Vender Itens]"                    +
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
                n = comandoInvalido(n,out,"0","1","2","0");

                if (n.intern()=="0"){
                    continue;
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
                            "\n[Digite 0 para voltar ao menu]"           +
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
                n = comandoInvalido(n,out,"0","2","0","0");                    
    
                if (n.intern()=="0"){
                    continue;
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
