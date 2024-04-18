/*************************************************************
*       MC322 - Programação Orientada a Objetos
*       Saulo Samineses 
*       RA   = 188132
*       Data = 17/04/2024
*       Hora = 02:06
* 
**
*
*  #duvidas
* -ao imprimir inventario sem o toString o compilador já itendifica o toString, automaticamente?
* -qual a diferença entre instanciar um objeto direto sem usar new??
*
*************************************************************/
package gameMain;
import java.util.ArrayList;
import java.util.List;
import gameClasses.*;
import battleClass.*;
import java.util.Scanner;
import java.util.Random;
import static gameMain.Printx.*;


@SuppressWarnings("resource")
public class Main {
    public static void main(String[] args){
        
        /*        
        //REMOÇÃO (lista de items from inventario)
        List <String> itemsToRemove = new ArrayList<>();
        //itemsToRemove.add("item01");
        //itemsToRemove.add("item02");
        //itemsToRemove.add("item03");
        
        inventario01.removerItems(itemsToRemove);
        print("items removidos   = " + itemToRemove);
        
        
        //IMPRESSÃO ( Acesso à Itens ) 
        String itemProcurado = "null";
        print("Item procurado    = "+ inventario01.acessarItem(itemProcurado) );      
        print("----------------------------------------------------\n");
        //print(player01.toString());        
        */

        //INSTANCIANDO ( Race, Classe, Item)
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
        //Item item08 = new Item("cajadoNoob", TipoItem.MAO,50,650,true);
        //Item item09 = new Item("luvasCaçador", TipoItem.MAO,60,650,true);

        
        //INSTANCIANDO LISTAS (Classes ,Raças, Itens )
        List<Classe> listaClasses = new ArrayList<Classe>();
        listaClasses.add(classeMago);
        listaClasses.add(classeLadrao);
        listaClasses.add(classeGuerreiro);
        
        List<Race> listaRaces = new ArrayList<>();
        listaRaces.add(raceHumano);
        listaRaces.add(raceAnao);
        listaRaces.add(raceElfo);
        
        List<Item> itensJogador = new ArrayList<Item>();            //qual a utilidade do método inventario.adicionarItem(item01)?? 
        itensJogador.add(item04);
        itensJogador.add(item03);
        itensJogador.add(item02);
        itensJogador.add(item01);
        List<Item> itensMonstro = new ArrayList<Item>();            //qual a utilidade do método inventario.adicionarItem(item01)?? 
        itensMonstro.add(item05);
        itensMonstro.add(item06);
        itensMonstro.add(item07);
        //itensMonstro.add(item08);
        //itensMonstro.add(item09);


        //INSTANCIANDO e SETANDO ( Inventario , Player )
        Inventario inventario = new Inventario(itensJogador,4);
        Player player01 = new Player("pedrinho",raceHumano,classeMago);       //e se tiver mais de um jogador?        
        player01.setLevel(20);        
        player01.setInventario(inventario);
        
        
        //INSTANCIANDO e SETANDO ( Monstros )
        Monstro monstro01 = new Monstro("esqueleto",100,9);
        Monstro monstro02 = new Monstro("zumbi",70,9);
        Monstro monstro03 = new Monstro("spider",60,9);
        monstro01.setTesouros(itensMonstro);
        monstro02.setTesouros(itensMonstro);
        monstro03.setTesouros(itensMonstro);
        List <Monstro> monstros = new ArrayList<>();
        monstros.add(monstro01);
        monstros.add(monstro02);
        monstros.add(monstro03);

        BauDeTesouros bau = new BauDeTesouros(itensMonstro, 3);
        

        //BUG01_testando pois to criando uma Myfunction pra isso
        Item testeNulo = new Item("nulo",null,0,0,false);
        player01.setItemHead(testeNulo);
        player01.setItemBody(testeNulo);
        player01.setItemFoot(testeNulo);
        player01.setItemRhand(testeNulo);
        player01.setItemLhand(testeNulo);
        
                


        //CONFIGURANDO SAÍDA
        boolean t = true;
        String outInicial = new String();
        Scanner inputUsuario = new Scanner(System.in);         
        outInicial= "\n---------------------------------------" +
                    "\n             Jogo Mostra:\n"             +
                    "\nJogador 01: " + player01.getNAME()       +
                    "\nO que você deseja fazer?"                +
                    "\n1 - Ver informações do jogador"          +
                    "\n2 - Mostrar seus itens equipados"        +
                    "\n3 - Listar itens do inventário"          +
                    "\n4 - Equipar itens do inventário"         +
                    "\n5 - Vender itens do inventário"          +
                    "\n6 - Passar para abrir a porta\n"         +
                    "\n0 - Sair do Jogo"                        +
                    "\n---------------------------------------" ;
        

        String name;
        int n;
        while (t ==true){
            print(outInicial);        
            printDont("\nJogador digita: ");
            n = inputUsuario.nextInt();
            String out2 = "\n---------------------------------------\n"
                        + "              Jogo Mostra:"; 
            print(out2);

            if (n<=6){
                
                //Sair do Jogo
                if(n==0){
                    break;
                }
                
                //Ver informações do jogador
                else if(n==1){
                    String s="\n"+player01.toString()+ "\n"                +
                            " \n..."                                       +
                            " \n[Pressione 1 para voltar]"                 +
                            " \n[Pressione x para sair do jogo]"           +
                            " \n---------------------------------------"   ;
                    print(s);
                    printDont("\nJogador pressiona: ");
                    n = inputUsuario.nextInt();                        
                    if(n==1){
                        continue;
                    }else{
                        print("outra tecla pressionada, saindo do jogo");                            
                        break;
                    }                        
                }
                
                //Mostrar itens equipados
                else if(n==2){
                    String s="\nCabeça: "       + player01.getItemHead().toString()     +
                            " \n\nBody: "        + player01.getItemBody().toString()    +
                            " \n\nPé: "          + player01.getItemFoot().toString()    +
                            " \n\nMão Esquerda: "+ player01.getItemLhand().toString()   +
                            " \n\nMão Direita: " + player01.getItemRhand().toString()   +
                            " \n...\n[Pressione 1 para voltar]"                         +
                            " \n[Pressione x para sair]"                                +
                            " \n---------------------------------------"                ;
                        print(s);
                        printDont("\nJogador pressiona: ");
                        n = inputUsuario.nextInt();
                        if (n==1){
                            continue;
                        }else{
                            break;
                        }
                }
                
                //Listar itens do inventario
                else if(n==3){
                    print("\nListando itens do inventário\n ");
                    player01.getInventory().listarItens();
                    String s ="\n...\n[Pressione 1 para voltar]"  
                    + "\n---------------------------------------";
                    print(s);
                    
                    printDont("\nJogador pressiona: ");
                    n = inputUsuario.nextInt();
                    
                    if(n==1){
                        continue;
                    }else{
                        print("outra tecla pressionada, saindo do jogo");                            
                        break;
                    }
                }
                
                //Equipar itens do inventario
                else if(n==4){
                    while(true){
                        boolean equip = false;
                        String s1 =  "\nQual item você gostaria de equipar?\n"
                                    +"\nNome do item : ";
                        

                        printDont(s1);
                        name = inputUsuario.next();                        
                        
                        for(int i=0; i<player01.getInventory().getItens().size(); i++){
                            
                            if(name.intern() == player01.getInventory().getItens().get(i).getNAME()){
                                
                                if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Cabeça"){
                                    player01.setItemHead(player01.getInventory().getItens().get(i));
                                }
                                else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Corpo"){
                                    player01.setItemBody(player01.getInventory().getItens().get(i));
                                }
                                else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Mão"){
                                    player01.setItemLhand(player01.getInventory().getItens().get(i));
                                }
                                else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Pé"){
                                    player01.setItemFoot(player01.getInventory().getItens().get(i));
                                }
                                
                                equip = true;    
                                String s = "\n[Jogador equipou " + name
                                            + "]\n...\n[Pressione 1 para equipar outro item]"
                                            + "\n[Pressione 2 para voltar]"
                                            + "\n---------------------------------------";
                                print(s);     
                                printDont("\nJogador pressiona: ");
                                n = inputUsuario.nextInt();
                                break;  
                            }
                        }
                        
                        if (equip == false){
                            String s =  "\nO item "+ name +" não existe no inventario"
                                        + "]\n...\n[Pressione 1 para equipar outro item]"
                                        + "\n[Pressione 2 para voltar]"
                                        + "\n---------------------------------------";
                            print(s);
                            printDont("\nJogador pressiona: ");
                            n = inputUsuario.nextInt();
                        }
                        
                        if (n==1){
                            continue;
                        }else if (n==2){
                            break;
                        }
                    }
                }
                
                //Vender itens do inventário
                else if(n==5){
                    
                    while(true){
                        String s1 = "Jogo Mostra:\n"
                                + "\nDigite o nome do item que gostaria de vender:";
                        print(s1);
                        printDont("\nNome do item : ");
                        name = inputUsuario.next();
                        for(int i=0; i<player01.getInventory().getItens().size(); i++){
                            if(name.intern() == player01.getInventory().getItens().get(i).getNAME()){
                                
                                List<Item> listaItensVender = new ArrayList<>();
                                listaItensVender.add(player01.getInventory().getItens().get(i));
                                player01.venderItems(listaItensVender);
                                String s2 = "\n[Jogador vendeu o item " + name
                                                + "]\n...\n[Pressione 1 para vender outro item]"
                                                + "\n[Pressione 2 para voltar]"
                                                + "\n---------------------------------------";
                                print(s2);
                                printDont("\nJogador pressiona: ");
                                n = inputUsuario.nextInt();
                                break;
                            }                            
                        }
                        if (n==1){
                            continue;
                        }else if (n==2){
                            break;
                        }
                    }
                }
                
                //Passar para abrir a porta
                else if(n==6){
                    
                    Masmorra masmorra = new Masmorra(monstros, bau);
                    Random porta = new Random();
                    int portaAleatoria = (porta.nextInt(2) + 1);
                    
                    if(portaAleatoria == 1){
                        masmorra.abrirPortaMonstro(player01);
                        print("\n...\n[Voltando para o menu inicial]");

                        /*
                        String s = "Você abriu uma porta de monstro:\n"
                        + "< Bem vindo à Masmorra-toEdit>";
                        print(s);
                        //CampoDeBatalha.batalharContraMonstro(monstro01, player01);
                       */ 
                    }
                    else if(portaAleatoria ==2){
                        masmorra.abrirPortaItem(player01);
                        printDont("\n...\n[Voltando para o menu inicial]");
                        //acessorio:ver inventario, tentar abrir outra porta, voltar para menu inicial,sair do jogo
                    }
                    
                    
                }
                
                

            }//e se o usuario digitar algo diferente de inteiro??
            else{
                print( "\nEsse valor não é valido, name novamente\n");
            }
            //inputUsuario.close();
        }
        //fim do jogo
    }//fim main 
}//fim classMain
