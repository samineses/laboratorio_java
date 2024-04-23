package battleClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import gameClasses.Item;
import gameClasses.Player;
import static battleClass.CampoDeBatalha.*;
import static gameMain.Printx.*;
import static gameMain.Delay.*;

public class Masmorra{
    
    //ATRIBUTOS
    private List<Monstro> monstros;
    private BauDeTesouros tesouros;
        
    //CONSTRUCTOR
    public Masmorra(List<Monstro> monstros, BauDeTesouros tesouros){
        this.monstros = monstros;
        this.tesouros = tesouros;
    }
    
    //GETTERS
    public BauDeTesouros getTesouros() {
        return tesouros;
    }
    
    
    /*ABRIR PORTA MONSTRO
     *cria um loop aleatorio que percorrerá todos os monstros 
     *da lista de monstros 
     */
    public void abrirPortaMonstro(Player jogador){
        
        print("\n< "+jogador.getNAME()+" abriu uma porta de monstro >\n");
        
        Random m = new Random();
        
        int p = m.nextInt(monstros.size());
        print("\nUm "+ monstros.get(p).getNAME()+" apareceu, se prepare para lutar");
        delay();
        batalharContraMonstro(monstros.get(p),jogador);
    }

    
    
    /*ABRIR PORTA ITEM  
    * recebe como parametro um player e entrega uma listagem de dois itens  
    * gerados aleatoriamente para o player poder escolher entre um deles
    */
    public void abrirPortaItem(Player jogador){        
        
        String s1 = "\nParabéns, você abriu uma porta de item"                        +
                    "\nQual dos dois itens você gostaria de receber?"   +
                    "\nDigite o nome do item abaixo:\n";
                    
        
        List<Item> listaVazia = new ArrayList<>();
        listaVazia = tesouros.pegarItensAleatorios(2);

        BauDeTesouros localBau = new BauDeTesouros(listaVazia, 2);
        localBau.setItens(listaVazia);        
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);         
        String name;
        
        
        print(s1);
        localBau.listarItens();
        
        while(true){
            String s2 = "---------------------------------------\n" +
                        "\nJogador digita: "                        ; 
            String s3 = "\n---------------------------------------"   ;

            printDont(s2);
            name = input.next();
            print(s3);
            
            if(localBau.acessarItem(name.intern()) != null){
                jogador.getInventory().adicionarItem(localBau.acessarItem(name.intern()));
                print("< "+ jogador.getNAME()+" adicionou " +name +" no seu inventário >");
                return;
            }
            
            String s4 = "o item '"+ name + "' nao é válido\n"   +
                        "\n..."                                 +
                        "\n[Digite novamente o nome do item]";          
            print(s4);
            }        
        
        
    }
    
    
    //IMPRESSAO
    public String toString(String name){
        

        return  "monstros = [" + monstros + "]" +
                "tesouros = [" + tesouros + "]" ;        
    }
    
}