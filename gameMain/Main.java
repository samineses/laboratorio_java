/*************************************************************
*       Saulo Samineses 
*       RA   = 188132
*       Data = 15/04/2024
*       Hora = 02:27
* 
*
* -enxuguei ao maximo: se não to usando um get ou set não to implementando
*
*
*
*  #duvidas
* -ao imprimir inventario sem o toString o compilador já itendifica o toString, automaticamente?
* -qual a diferença entre instanciar um objeto direto sem usar new??
*
*
*
*
*************************************************************/
package gameMain;
import java.util.ArrayList;
import java.util.List;
import gameClasses.*;
import battleClass.*;
import java.util.Scanner;
//import static battleClass.CampoDeBatalha.*;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args){
        
        /*        
        
        
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
        
        
        
        
        */
        
        /////////////////////////////////////////////////////////////////// 
        
        /*
        //INICIALIZANDO ( Masmorra pt1 )
        //inventario01.listarItens();
        //player01.setLevel(70);
        
        Monstro monstro01 = new Monstro("helloWorld",80,9);
        Monstro monstro02 = new Monstro("helloWorld",80,9);
        Monstro monstro03 = new Monstro("helloWorld",80,9);
        
        //System.out.println(monstro01.toString());
        monstro01.setTesouros(listaItens02);
        monstro02.setTesouros(listaItens02);
        monstro03.setTesouros(listaItens02);
        //CampoDeBatalha.batalharContraMonstro(monstro01, player01);
        //System.out.println("----------------------------------------------------\n");
        //inventario01.listarItens();
        List <Monstro> monstros = new ArrayList<>();
        monstros.add(monstro01);
        monstros.add(monstro02);
        monstros.add(monstro03);
        
        //BauDeTesouros bau = new BauDeTesouros(listaItens01, 3);
        
        
        //Masmorra masmorra01 = new Masmorra(monstros, bau);
        
        //masmorra01.abrirPortaItem(player01);
        */

        //INSTANCIANDO ( Race, Classe, Item)
        Race raceHumano = Race.HUMANO;
        Race raceAnao = Race.ANAO;
        Race raceElfo = Race.ELFO;
        Classe classeMago = Classe.MAGO;
        Classe classeLadrao = Classe.LADRAO;
        Classe classeGuerreiro = Classe.GUERREIRO;
        //depois eu seto quais raças e classes cada item pode usar
        Item itemCapacete = new Item("capacete", TipoItem.CABECA ,0,250,true);
        Item itemArmadura = new Item("armadura", TipoItem.CORPO,15,350,true);
        Item itemSapato = new Item("sapato", TipoItem.PE,20,650,true);
        Item itemEspada = new Item("espada", TipoItem.MAO,20,650,true);

        
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
        itensJogador.add(itemEspada);
        itensJogador.add(itemSapato);
        itensJogador.add(itemArmadura);
        itensJogador.add(itemCapacete);
                
        
        //INSTANCIANDO e SETANDO ( Inventario , Player )
        Inventario inventario = new Inventario(itensJogador,4);
        Player player01 = new Player("pedrinho",raceHumano,classeMago);       //e se tiver mais de um jogador?        
        player01.setLevel(20);        
        player01.setInventario(inventario);
        
        
        //BUG01_testando pois to criando uma Myfunction pra isso
        Item testeNulo = new Item("nulo",null,0,650,false);
        player01.setItemHead(testeNulo);
        player01.setItemBody(testeNulo);
        player01.setItemFoot(testeNulo);
        player01.setItemRhand(testeNulo);
        player01.setItemLhand(testeNulo);
        
        
            
        
        boolean teste = true;
        if (teste ==true){
            //CONFIGURANDO SAÍDA
            String outInicial = new String();
            outInicial= "---------------------------------------\n" +
            "Jogo Mostra:\n"                            +
            "Jogador 01: " + player01.getNAME() + "\n"  +
            "O que você deseja fazer?\n"                +
            "1 - Ver informações do jogador\n"          +
            "2 - Mostrar seus itens equipados\n"        +
            "3 - Listar itens do inventário\n"          +
            "4 - Equipar itens do inventário\n"         +
            "5 - Vender itens do inventário\n"          +
            "6 - Passar para abrir a porta\n"           +
            "\n0 - Sair do Jogo\n"                      +
            "---------------------------------------"   ;
            
            @SuppressWarnings("resource")
            Scanner inputUsuario = new Scanner(System.in);         
            int n;
            String name;
            while (true){
                System.out.println(outInicial);        
                System.out.print("\nJogador digita: ");
                n = inputUsuario.nextInt();
                System.out.println("\n---------------------------------------\n");
                if (n<=6){
                    
                    //Sair do Jogo
                    if(n==0){
                        break;
                    }
                    
                    //Ver informações do jogador
                    else if(n==1){
                        String s ="Jogo Mostra:\n" 
                        + player01.toString()
                        + "\n[Pressione 1 para voltar]"
                        + "\n[Pressione x para sair do jogo]"
                        + "\n---------------------------------------";
                        System.out.println(s);
                        System.out.print("\nJogador pressiona: ");
                        n = inputUsuario.nextInt();                        
                        if(n==1){
                            continue;
                        }else{
                            System.out.println("outra tecla pressionada, saindo do jogo");                            
                            break;
                        }                        
                    }
                    
                    //Mostrar itens equipados
                    else if(n==2){
                        String s = "Jogo Mostra:\n"
                                + "\nCabeça: "       + player01.getItemHead().toString()
                                + "\n\nBody: "        + player01.getItemBody().toString()
                                + "\n\nPé: "          + player01.getItemFoot().toString()
                                + "\n\nMão Esquerda: "+ player01.getItemLhand().toString()
                                + "\n\nMão Direita: " + player01.getItemRhand().toString()
                                + "\n...\n[Pressione 1 para voltar]"
                                + "\n[Pressione x para sair]"
                                + "\n---------------------------------------";
                            System.out.println(s);
                            System.out.print("\nJogador pressiona: ");
                            n = inputUsuario.nextInt();
                            if (n==1){
                                continue;
                            }else{
                                break;
                            }
                    }
                    
                    //Listar itens do inventario
                    else if(n==3){
                        System.out.println("Jogo Mostra:\nListando itens do inventário\n ");
                        player01.getInventory().listarItens();
                        String s ="\n...\n[Pressione 1 para voltar]"  
                        + "\n---------------------------------------";
                        System.out.println(s);
                        
                        System.out.print("\nJogador pressiona: ");
                        n = inputUsuario.nextInt();
                        
                        if(n==1){
                            continue;
                        }else{
                            System.out.println("outra tecla pressionada, saindo do jogo");                            
                            break;
                        }
                    }
                    
                    //Equipar itens do inventario
                    else if(n==4){
                        while(true){
                            boolean equip = false;
                            System.out.println("Jogo Mostra:\n[Digite o nome do item a ser equipado]");
                            System.out.print("\nNome do item : ");
                            name = inputUsuario.next();                        
                            
                            for(int i=0; i<player01.getInventory().getItens().size(); i++){
                                //capacete
                                if(name.intern() == player01.getInventory().getItens().get(i).getNAME()){
                                    
                                    if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Cabeça"){
                                        player01.setItemHead(player01.getInventory().getItens().get(i));
                                    }
                                    else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Corpo"){
                                        player01.setItemBody(player01.getInventory().getItens().get(i));
                                    }
                                    else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Mão"){
                                        player01.setItemLhand(player01.getInventory().getItens().get(i));
                                        //player01.setItemRhand(player01.getInventory().getItens().get(i));
                                    }
                                    else if(player01.getInventory().getItens().get(i).getTipo().DESCRICAO == "Pé"){
                                        player01.setItemFoot(player01.getInventory().getItens().get(i));
                                    }
                                    equip = true;    
                                    String s = "\n[Jogador equipou " + name
                                                + "]\n...\n[Pressione 1 para equipar outro item]"
                                                + "\n[Pressione 2 para voltar]"
                                                + "\n---------------------------------------";
                                    System.out.println(s);     
                                    System.out.print("\nJogador pressiona: ");
                                    n = inputUsuario.nextInt();
                                    break;  
                                }
                            }
                            if (equip == false){
                                String s =  "\nO item "+ name +" não existe no inventario"
                                            + "]\n...\n[Pressione 1 para equipar outro item]"
                                            + "\n[Pressione 2 para voltar]"
                                            + "\n---------------------------------------";
                                System.out.println(s);
                                System.out.print("\nJogador pressiona: ");
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
                            System.out.println(s1);
                            System.out.print("\nNome do item : ");
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
                                    System.out.println(s2);
                                    System.out.print("\nJogador pressiona: ");
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
                    
                    
                    else if(n==6){
                        //igual a 5
                        break;
                    }
                    
                    

                }//e se o usuario digitar algo diferente de inteiro??
                else{
                    System.out.println( "\nEsse valor não é valido, name novamente\n");
                }
            }
            //fim do jogo
        }
            }//fim if teste
}//fim classMain
