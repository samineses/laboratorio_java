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
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);         
        String name;
        
        listaVazia = tesouros.pegarItensAleatorios(2);
        localBau.setItens(listaVazia);        
        
        String s = "Você abriu uma porta de item:\n"
                + "< Escolha entre esses dois itens aleatorios do bau>\n";
        print(s);

        localBau.listarItens();
        printDont("\nDigite o nome do item escolhido: ");
        name = input.next();                    //e se o nome for digitado errado pelo usuario?
        
        if(localBau.acessarItem(name.intern()) != null){
            jogador.getInventory().adicionarItem(localBau.acessarItem(name.intern()));
            print("\nO item < "+ name +" > foi adicionado");
        }
        else{
            print("o item < "+ name + " > nao tá aqui\n");
        }

        //input.close(); 
    }
    
    //IMPRESSAO
    public String toString(String name){
        

        return  "monstros = [" + monstros + "]" +
                "tesouros = [" + tesouros + "]" ;        
    }
    
}