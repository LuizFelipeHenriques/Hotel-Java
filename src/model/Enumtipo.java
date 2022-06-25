package src1.model1;

public enum Enumtipo {
    
    BASICO ("Básico"), MASTER ("Master"), PRESIDENCIAL ("Presidencial");
    
    private String valor;
    private Enumtipo (String valor){
        this.valor = valor;
    }
    public String getValor() {
        return valor;
    }


}
