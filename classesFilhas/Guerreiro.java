package classesFilhas;

public class Guerreiro{
    
    private final String DESCRICAO;

    public Guerreiro(String DESCRICAO){
        this.DESCRICAO = DESCRICAO;
    }
    
    
    // impressao
    public String toString() {
        String local;
        local =   "                  " + "--" +  DESCRICAO + "--"   + "\n";

        return local;
    }

}
