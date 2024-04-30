package battleClass;
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
        
        
        BauDeTesouros localBau = new BauDeTesouros();
        localBau.setItens(tesouros.pegarItensAleatorios(2));
        localBau.setLimiteDeItens(2);
        
        String s0 = "\nParabéns, você abriu uma porta de item"  +
                    "\n\nItens do tesouro da masmorra:"           ;

        String s1 = "\nEntre os itens do tesouro da masmorra"           +
                    "\nSerão sorteados 2 deles de forma aleatoria "     +
                    "\nDentre os quais você poderá escolher um deles"   +
                    "\n\n[Boa Sorte]";

        
                
        print(s0);
        tesouros.listarItens();
        print(s1);
        delay();
        print("\nItens sorteados:");
        localBau.listarItens();
        print("\n[Escolha um dos itens]");

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);         
        String name;
            
        while(true){
            String s2 = "---------------------------------------\n" +
                        "\nJogador digita: "                        ; 
            String s3 = "\n---------------------------------------"   ;

            printDont(s2);
            name = input.next();
            print(s3);
            
            for (int i=0;i<localBau.getItens().size();i++){
                if(localBau.getItens().get(i).getNAME()==name.intern()){
                    String s4 = "< O jogador "+ jogador.getNAME()+" adicionou " + 
                                "\n  "+ name +" ao seu inventário >"; 
                    if(jogador.getInventory().adicionarItem(tesouros.acessarItem(name.intern()))==true){
                        print(s4);
                    }else{
                        print("< O seu inventário está cheio >");
                    }
                    return;
                }
            }
            
            String s5 = "o item '"+ name + "' nao é válido\n"   +
                        "\n..."                                 +
                        "\n[Digite novamente o nome do item]";          
            print(s5);
            }        
    }
    
    
    //IMPRESSAO
    public String toString(String name){
        

        return  "monstros = [" + monstros + "]" +
                "tesouros = [" + tesouros + "]" ;        
    }
    
}