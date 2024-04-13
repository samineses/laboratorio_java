package gameClasses;

public enum TipoItem {
    
    CABECA("Cabeça"),
    CORPO("Corpo"),
    MAO("Mão"),
    PE("Pé");

    public final String DESCRICAO;
    
    private TipoItem(String DESCRICAO){
        this.DESCRICAO = DESCRICAO;
    }



}
