public class Peixe extends Animal {
    private String corEscamos;

    public String getCorEscamos() {
        return corEscamos;
    }

    public void setCorEscamos(String corEscamos) {
        this.corEscamos = corEscamos;
    }

    @Override
    public void alimentar() {
       System.out.println("Comendo substâcias");
        
    }

    @Override
    public void emitirSon() {
        System.out.println("Peixe não tem som");
        
    }

    @Override
    public void locomover() {
    System.out.println("Nadando");
    }

     public void soltarBolhas(){
        System.out.println("Soltando bolhas");

     }
    
}
