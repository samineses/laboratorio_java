package gameClasses;

//Criando um enum = limita o acesso
public enum Classe {

    MAGO("Mago"),
    LADRAO("Ladrão"),
    GUERREIRO("Guerreiro");
    
    public final String DESCRICAO;
    
    private Classe (String DESCRICAO){
        this.DESCRICAO = DESCRICAO;
    }
    
      
}