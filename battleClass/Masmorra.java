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
        batalharContraMonstro(monstros.get(0),jogador);      
    }

    //ABRIR PORTA ITEM
    /*  Sobre o método abrirPortaItem:
    *   
    *   recebe como parametro um player e entrega uma listagem de dois itens gerados aleatoriamente para
    *   o player poder escolher entre um deles
    */
    public void abrirPortaItem(Player jogador){        
        List<Item> listaVazia = new ArrayList<>();
        BauDeTesouros localBau = new BauDeTesouros(listaVazia, 2);
        Scanner input = new Scanner(System.in);         
        String name;
        
        listaVazia = tesouros.pegarItensAleatorios(2);
        localBau.setItens(listaVazia);        
        localBau.listarItens();
        printDont("\nDigite o nome do item escolhido: ");
        name = input.next();                    //e se o nome for digitado errado pelo usuario?
        
        jogador.getInventory().adicionarItem(localBau.acessarItem(name));
        print("\nO item <"+localBau.acessarItem(name).getNAME() +"> foi adicionado");
        input.close(); 
    }
    
    //IMPRESSAO
    public String toString(String name){
        

        return  "monstros = [" + monstros + "]" +
                "tesouros = [" + tesouros + "]" ;        
    }
    
}