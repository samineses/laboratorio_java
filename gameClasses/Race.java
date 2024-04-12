package gameClasses;

public enum Race{

    HUMANO("humano"),
    ELFO("elfo"),
    ANAO("anao");
    
    public final String DESCRICAO;
         
    
    //initializing constructor with description
    private Race (String DESCRICAO){
        this.DESCRICAO = DESCRICAO;
    }        

}

