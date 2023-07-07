public class Funcinario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;

      }
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalahndo() {
        return trabalhando;
    }

    public void setTrabalahndo(boolean trabalahndo) {
        this.trabalhando = trabalahndo;
    }

}

