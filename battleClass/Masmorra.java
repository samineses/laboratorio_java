package battleClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gameClasses.Item;
import gameClasses.Player;
import static battleClass.CampoDeBatalha.*;
import static gameMain.Printx.*;

public class Masmorra{
    
    //ATRIBUTOS
    private List<Monstro> monstros;
    private BauDeTesouros tesouros;
    
    
    //GET
    public BauDeTesouros getTesouros() {
        return tesouros;
    }


    //CONSTRUCTOR
    public Masmorra(List<Monstro> monstros, BauDeTesouros tesouros){
        this.monstros = monstros;
        this.tesouros = tesouros;
    }

    
    //ABRIR PORTA MONSTRO
    public void abrirPortaMonstro(Player jogador){
        String s1 = "Você abriu uma porta de monstro\n";
        print(s1);
        batalharContraMonstro(monstros.get(0),jogador);      
    }

    
    /*  Sobre o método { abrirPortaItem } :
    *   
    *   recebe como parametro um player e entrega uma listagem de dois itens gerados aleatoriamente para
    *   o player poder escolher entre um deles
    */
    public void abrirPortaItem(Player jogador){        
        
        List<Item> listaVazia = new ArrayList<>();
        listaVazia = tesouros.pegarItensAleatorios(2);
        BauDeTesouros localBau = new BauDeTesouros(listaVazia, 2);
        localBau.setItens(listaVazia);        
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);         
        String name;
        String s1 = "Você abriu uma porta de item\n"
                    +"Escolha entre esses dois itens aleatórios do baú:\n";
        String s2 = "---------------------------------------\n"
                    +"\nJogador escolheu: "; 
        String s3 = "\n---------------------------------------";

        print(s1);
        localBau.listarItens();
        printDont(s2);
        name = input.next();
        print(s3);
        
        if(localBau.acessarItem(name.intern()) != null){
            jogador.getInventory().adicionarItem(localBau.acessarItem(name.intern()));
            print("O item < "+ name +" > foi adicionado");
        }
        else{
            print("o item < "+ name + " > nao tá aqui");        //opcao para digitar novamente
        }

        //input.close(); 
    }
    
    //IMPRESSAO
    public String toString(String name){
        

        return  "monstros = [" + monstros + "]" +
                "tesouros = [" + tesouros + "]" ;        
    }
    
}