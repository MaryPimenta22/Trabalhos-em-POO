public class Banco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNunConta(123456);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNunConta(1234);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(1000);
        p1.estadoAtual();
        p2.estadoAtual();

    }
}
