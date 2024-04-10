package gameClasses;

public class Raca{
    
    private final String DESCRICAO;     
    private final int MINIMOPARAFUGIR;
    private String NomeDaRaca;
    
    //initializing constructor with description
    public Raca (String DESCRICAO, int MINIMOPARAFUGIR){
        this.DESCRICAO = DESCRICAO;
        this.MINIMOPARAFUGIR = MINIMOPARAFUGIR;
    }
    
    //getters and setters
    public String getDESCRICAO() {
        return DESCRICAO;
    }
    
    public int getMINIMOPARAFUGIR() {
    return MINIMOPARAFUGIR;
    }
    
    public String getNomeDaRaca() {
        return NomeDaRaca;
    }
    public void setNomeDaRaca(String NomeDaRaca) {
        this.NomeDaRaca = NomeDaRaca;
    }
    
    //metodo de impressao
    public String toString() {
        return    "[Descrição = "               + DESCRICAO+ "       ]\n             "  
                + "[Raça = "                    + NomeDaRaca+ "                 ]\n             "
                + "[Minimo para fugir = level " + MINIMOPARAFUGIR + "]" 
                ;
    }
    

}

