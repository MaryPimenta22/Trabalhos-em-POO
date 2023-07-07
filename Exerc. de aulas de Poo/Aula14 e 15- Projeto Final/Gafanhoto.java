public class Gafanhoto extends Pessoa {
   
    public Gafanhoto(String nome, int idade, String sexo, String login, float experiencia) {
        super(nome, idade, sexo,experiencia);
        this.login = login;
        this.totAssistido = 0;

    }

    private String login;
    private int totAssistido;

    public void viuMaisUm(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto [" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
    }
    
}
