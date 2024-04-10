package classesFilhas;

public class Mago{

    private final String DESCRICAO;    
    
    public Mago(String DESCRICAO){
        
        this.DESCRICAO = DESCRICAO;

    }
    
    // impressao
    public String toString() {
        String local;

        local =   "                   " + "--" +  DESCRICAO + "--"  + "\n";
        
        return local;

    }

}
