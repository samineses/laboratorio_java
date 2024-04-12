package gameClasses;

//Criando um enum = limita o acesso
public enum Classe {

    MAGO("Mago","hi"),
    LADRAO("Ladrão", "hi"),
    GUERREIRO("Guerreiro","hi" );
    
    public final String DESCRICAO;
    public final String helloworld;
    
    private Classe (String DESCRICAO, String hello){
        this.DESCRICAO = DESCRICAO;
        this.helloworld = hello;
    }
    
      
}