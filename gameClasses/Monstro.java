package gameClasses;

//import java.util.ArrayList;
import java.util.List;

public class Monstro {

    //atributos:NOME, nivel, tesouro ao ser derrotado
    private final String NOME = "NOME do monstro";
    private int poder;
    private List<Item> tesouros;
    private int niveisPerdidos;
    
    //metodos getters and setters
    public String getNOME() {
        return NOME;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public List<Item> getTesouros() {
        return tesouros;
    }

    public void setTesouros(List<Item> tesouros) {
        this.tesouros = tesouros;
    }

    public int getNiveisPerdidos() {
        return niveisPerdidos;
    }

    public void setNiveisPerdidos(int niveisPerdidos) {
        this.niveisPerdidos = niveisPerdidos;
    }


    //metodo de impressao
    public String toString() {
            
        return  "Descrição do monstro = " + NOME + "\n" +
                "Poder do monstro = " + poder + "\n" +
                "Descrição do itens que dropa = " + tesouros + 
                "niveis perdidos = " + niveisPerdidos ;
                
                
    }



}