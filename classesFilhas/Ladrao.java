package classesFilhas;
    
public class Ladrao{
    
    private final String DESCRICAO;
    

    public Ladrao(String DESCRICAO){
        this.DESCRICAO = DESCRICAO;
    }
        
   
    // impressao
    public String toString() {
        String local;

        local =   "                   " + "--" +  DESCRICAO + "--"  + "\n";

        return local;
    }


}

