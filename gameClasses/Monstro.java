package gameClasses;

public class Monstro {

    //atributos:nome, nivel, tesouro ao ser derrotado
    String nome;
    String tesouroDrop;
    int level;

    //metodos getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTesouroDrop() {
        return tesouroDrop;
    }
    public void setTesouroDrop(String tesouroDrop) {
        this.tesouroDrop = tesouroDrop;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    //metodo de impressao
    public String toString() {
            
        return  "Descrição do monstro = " + nome + "\n" +
                "Nível de poder do monstro = " + level + "\n" +
                "Descrição do itens que dropa = " + tesouroDrop ;
    }



}