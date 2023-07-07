public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
       System.out.println("Comendo Vegetais");
        
    }

    @Override
    public void emitirSon() {
       System.out.println("Som de Réptil");
        
    }

    @Override
    public void locomover() {
       System.out.println("Rastejando");
    }

    
    
}
