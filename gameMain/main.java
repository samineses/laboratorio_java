package gameMain;
import gameClasses.*;

public class main {
    public static void main(String[] args){
        
        //inicializando jogador
        Jogador jogador01 = new Jogador();
        
        jogador01.setNome("pedrinho");
        jogador01.setRaca("humano");
        jogador01.setClasse("mago");
        jogador01.setLevel(10);
        jogador01.setElmo("ElmoX");
        jogador01.setCalca("CalcaX");
        jogador01.setBelly("ArmorX");
        jogador01.setRarm("StrongRight");
        jogador01.setLarm("StrongLeft");
        jogador01.setBoot("Boot Nike");
        jogador01.setRightHand("keyNarnia");
        jogador01.setLeftHand(null);

        //inicializando monstro
        Monstro monstro01 = new Monstro();

        monstro01.setNome("monstro do armario de Narnia");
        monstro01.setLevel(20);
        monstro01.setTesouroDrop("chave do armario = keyNarnia");

        //inicializando itens
        Item item01 = new Item();
        item01.setNome("keyNarnia");
        item01.setTipo("não equipavel");
        item01.setBonusPower(10);
        item01.setValor(100);

        
        //Saídas
        System.out.println("\n\n" + "--------------------------");
        System.out.println(jogador01.toString());
        jogador01.possuiMaoVazia();
        System.out.println("\n-------------------------------------------------------------\n");
        System.out.println(monstro01.toString());
        System.out.println("\n--------------------------------------------------------------\n");
        System.out.println(item01.toString());
        System.out.println("\n--------------------------------------------------------------\n");
        
    }
    
    
}