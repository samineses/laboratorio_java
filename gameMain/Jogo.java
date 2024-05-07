package gameMain;
import gameClasses.Item;
import gameClasses.Player;
import battleClass.Masmorra;

import static gameMain.ComandoInvalido.comandoInvalido;
import static gameMain.Delay.delay;
import static gameMain.Printx.print;
import static gameMain.Printx.printDont;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
@SuppressWarnings("resource")


public class Jogo {
    
    private Masmorra masmorra;
    private List<Player> players;


    /*   GETTERs and SETTERs
    *   coloco quado necessario
    */
    public void setMasmorra(Masmorra masmorra) {
       this.masmorra = masmorra;
   }
   public void setPlayers(List<Player> players) {
       this.players = players;
   }
    
    
    /*
     * METODO TO STRING
     */

    


    public void loopDeJogo(boolean t){
        
        String jumpLine =   "\n--------------------------------"    ;
        
        String outInicial = "--------------------------------"          +
                            " \n         Jogo Mostra:\n"                +
                            " \nJogador 01: "+ players.get(0).getNAME() +
                            " \nO que você deseja fazer?"               +
                            " \n1 - Ver informações do jogador"         +
                            " \n2 - Mostrar seus itens equipados"       +
                            " \n3 - Listar itens do inventário"         +
                            " \n4 - Equipar itens do inventário"        +
                            " \n5 - Vender itens do inventário"         +
                            " \n6 - Passar para abrir a porta\n"        +
                            " \n0 - Sair do Jogo" + jumpLine            +
                            " \n\nJogador digita: "                     ;
                    
        Scanner inputUsuario = new Scanner(System.in);         
        String n = "";
        
        
        boolean big = false;    //item grande está ou não, equipado
        boolean jump = false;   //alternar os menus dentro do loop
        while (t==true){
                
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
                String s0 = jumpLine                                +
                            "\n              Jogo Mostra:"          + 
                            "\n         -Informações do Jogador-"   +
                            "\n\n"+ players.get(0).toString()       ;

                String out ="\n..."                                     +
                            "\n[Digite 0 para Voltar ao Menu]"          +
                            "\n[Digite 4 para Ver Itens Equipados]"     +
                            "\n[Digite 5 para Ver Itens do Inventário]" +
                            jumpLine                                    ;
                
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
                String s0 = jumpLine+ "\n              Jogo Mostra:"                    +
                            "\n        -" + players.get(0).getNAME()+" Equip Itens-"    +
                            "\n\n° Head: "+ players.get(0).getItemHead().getNAME()      +
                            "\n° Body: "+ players.get(0).getItemBody().getNAME()        +
                            "\n° Foot: "+ players.get(0).getItemFoot().getNAME()        +
                            "\n° Left Hand: "+ players.get(0).getItemLhand().getNAME()  +
                            "\n° Right Hand: "+ players.get(0).getItemRhand().getNAME() ;
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
                String s1 = jumpLine + "\n              Jogo Mostra:\n       "  + 
                            "-Inventário do "+ players.get(0).getNAME()+ "-\n"  ;    
                
                String out = "\n..."                            +
                            "\n[Digite 0 para Voltar ao Menu]"  +
                            "\n[Digite 1 para Vender Itens]"    +
                            "\n[Digite 2 para Equipar Itens]"   +
                            jumpLine                            ;
                    
                
                print(s1);
                players.get(0).getInventory().listarItens();
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
                players.get(0).getInventory().listarItens();
                if(players.get(0).getInventory().getItens().size()!=0){
                    printDont(s2);
                    n = inputUsuario.next();                        
                    print(jumpLine);
                    
                    boolean equip = false;
                    for(int i=0; i<players.get(0).getInventory().getItens().size(); i++){    
                        if(n.intern() == players.get(0).getInventory().getItens().get(i).getNAME()){
                            
                            if(players.get(0).getInventory().getItens().get(i).getTipo().DESCRICAO == "Cabeça"){
                                if(players.get(0).getItemHead().getNAME()!=null){
                                    players.get(0).getInventory().adicionarItem(players.get(0).getItemHead());
                                }
                                players.get(0).setItemHead(players.get(0).getInventory().getItens().get(i));
                                players.get(0).getInventory().removerItem(players.get(0).getItemHead().getNAME());
                            }

                            else if(players.get(0).getInventory().getItens().get(i).getTipo().DESCRICAO == "Corpo"){
                                if(players.get(0).getItemBody().getNAME()!=null){
                                    players.get(0).getInventory().adicionarItem(players.get(0).getItemBody());
                                }
                                players.get(0).setItemBody(players.get(0).getInventory().getItens().get(i));
                                players.get(0).getInventory().removerItem(players.get(0).getItemBody().getNAME());
                            }

                            else if(players.get(0).getInventory().getItens().get(i).getTipo().DESCRICAO == "Pé"){
                                if(players.get(0).getItemFoot().getNAME()!=null){
                                    players.get(0).getInventory().adicionarItem(players.get(0).getItemFoot());
                                }
                                players.get(0).setItemFoot(players.get(0).getInventory().getItens().get(i));
                                players.get(0).getInventory().removerItem(players.get(0).getItemFoot().getNAME());
                                
                            }

                            else if(players.get(0).getInventory().getItens().get(i).getTipo().DESCRICAO == "Mão"){
                                
                                if(players.get(0).getInventory().getItens().get(i).getItemGrande() == true){   
                                    if(players.get(0).getItemLhand().getNAME()!=null){
                                        if(players.get(0).getItemRhand().getNAME()!=null){
                                            players.get(0).getInventory().adicionarItem(players.get(0).getItemRhand());
                                        }
                                        players.get(0).getInventory().adicionarItem(players.get(0).getItemLhand());
                                    }
                                    players.get(0).setItemLhand(players.get(0).getInventory().getItens().get(i));
                                    players.get(0).setItemRhand(players.get(0).getInventory().getItens().get(i));
                                    big = true;
                                }

                                if(players.get(0).getInventory().getItens().get(i).getItemGrande() == false){
                                    if(players.get(0).getItemLhand().getNAME() == null){
                                        players.get(0).setItemLhand(players.get(0).getInventory().getItens().get(i));
                                    }
                                    else{
                                        if(players.get(0).getItemRhand().getNAME() != null){
                                            if(big == true){
                                                Item nulo = new Item();
                                                players.get(0).setItemLhand(nulo);                                        
                                            }
                                            players.get(0).getInventory().adicionarItem(players.get(0).getItemRhand());
                                        }
                                        players.get(0).setItemRhand(players.get(0).getInventory().getItens().get(i));                                            
                                    }                                                                        
                                    big = false;
                                }                                
                                
                                players.get(0).getInventory().removerItem(players.get(0).getInventory().getItens().get(i).getNAME());                                                                                                      
                            }
                            
                            equip = true;    
                            print("\n< "+players.get(0).getNAME()+" equipou " + n + " >");                        
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
                players.get(0).getInventory().listarItens();
                printDont(s2);
                n = inputUsuario.next();                        
                print(jumpLine);
                boolean venda = false;
                for(int i=0; i<players.get(0).getInventory().getItens().size(); i++){
                    if(n.intern() == players.get(0).getInventory().getItens().get(i).getNAME()){
                        
                        List<Item> listaItensVender = new ArrayList<>();
                        listaItensVender.add(players.get(0).getInventory().getItens().get(i));
                        players.get(0).venderItems(listaItensVender);
                        venda = true;
                        
                        print("< "+players.get(0).getNAME()+" vendeu o item " + n + " >");
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
    
                //Masmorra masmorrax = new Masmorra(masmorra.getMonstros(), masmorra.getTesouros());
                Random porta = new Random();
                int portaAleatoria = (porta.nextInt(2) + 1);
                    
                print(s0);
                delay();
                if(portaAleatoria == 1){                        
                    masmorra.abrirPortaMonstro(players.get(0));
                }
                else if(portaAleatoria == 2){
                    masmorra.abrirPortaItem(players.get(0));
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
