public class Cadeira {
    String modelo;
    String cor;
    int tamanho;
    float largura;
    boolean usando;

    void status() {
        System.out.println("Uma cadeira " + this.modelo);
        System.out.println("A cor é : " + this.cor);
        System.out.println("O tamanho é: " + this.tamanho);
        System.out.println("A largura é: " + this.largura);
        System.out.println("Alguém esta sentado? " + this.usando);

    }

    void cheia() {
        if (this.usando == true) {
            System.out.println("ERRO! não posso sentar.");
        } else {
            System.out.println("Estou sentando.");
        }
    }    
    void ocupado() {
       this.usando = true;

    }
   void desocupada(){
        this.usando = false;
   }

public void usando() {
}
    }

