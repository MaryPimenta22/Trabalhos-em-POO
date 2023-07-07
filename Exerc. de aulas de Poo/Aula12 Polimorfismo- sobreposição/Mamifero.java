public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPele(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");

    }

    @Override
    public void emitirSon() {
        System.out.println("som de Mamifero");

    }

    @Override
    public void locomover() {
        System.out.println("Correndo");

    }

}
