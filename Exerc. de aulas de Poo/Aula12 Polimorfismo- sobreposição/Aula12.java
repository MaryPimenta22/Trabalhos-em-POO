public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();


         

 




        m.setPeso(35.3f);
        m.setCorPele("Marron");
        m.alimentar();
        m.locomover();
        m.emitirSon();


        a.locomover();
        p.locomover();
        r.locomover();


    }
}
