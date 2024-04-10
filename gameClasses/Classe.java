package gameClasses;

//Criando um enum = limita o acesso
public enum Classe {

    MAGO(""),
    LADRAO(""),
    GUERREIRO("adssd");
    
    public final String DESCRICAO;
    
    
    private Classe (String DESCRICAO){
        this.DESCRICAO = DESCRICAO;
    }
     
     
    //GET
    public String getDESCRICAO() {
        return DESCRICAO;
    }
    
    //impressao
    public String toString() {
        return    "                   " + "--" +  DESCRICAO + "--" + "\n" ;
    }
      
}