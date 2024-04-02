package gameClasses;

public class Item {

    //atributos:nome, tipo(arma, armadura,elmo, não equipavél=usavel), bonus de poder, valor

    String nome;
    String tipo;
    int valor;
    int bonusPower;
    
    //metodos de acesso
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getBonusPower() {
        return bonusPower;
    }
    public void setBonusPower(int bonusPower) {
        this.bonusPower = bonusPower;
    }

    
    //metodo de impressao
    public String toString() {
            
        return  "Descrição do item = " + nome + "\n" +
                "Tipo do item = " + tipo + "\n" +
                "Valor de venda do item = " + valor + "\n" +
                "Bônus de poder do item = " + bonusPower ;
    }

}