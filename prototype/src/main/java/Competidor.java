
public class Competidor implements Cloneable{
    private String nome;
    private String arteMarcialPrincipal;
    private String arteMarcialSecundaria;
    private float peso;
    private float altura;
    private Cartel cartel;

    public Competidor(String nome, String arteMarcialPrincipal, String arteMarcialSecundaria, float peso, float altura, Cartel cartel) {
        this.nome = nome;
        this.arteMarcialPrincipal = arteMarcialPrincipal;
        this.arteMarcialSecundaria = arteMarcialSecundaria;
        this.peso = peso;
        this.altura = altura;
        this.cartel = cartel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArteMarcialPrincipal() {
        return arteMarcialPrincipal;
    }

    public void setArteMarcialPrincipal(String arteMarcialPrincipal) {
        this.arteMarcialPrincipal = arteMarcialPrincipal;
    }

    public String getArteMarcialSecundaria() {
        return arteMarcialSecundaria;
    }

    public void setArteMarcialSecundaria(String arteMarcialSecundaria) {
        this.arteMarcialSecundaria = arteMarcialSecundaria;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Cartel getCartel() {
        return cartel;
    }

    public void setCartel(Cartel cartel) {
        this.cartel = cartel;
    }

    @Override
    public Competidor clone() throws CloneNotSupportedException{
        Competidor competidorClone = (Competidor) super.clone();
        competidorClone.cartel = (Cartel) competidorClone.cartel.clone();
        return competidorClone;
    }

    @Override
    public String toString() {
        return "Competidor{" +
                "nome='" + nome + '\'' +
                ", arteMarcialPrincipal='" + arteMarcialPrincipal + '\'' +
                ", arteMarcialSecundaria='" + arteMarcialSecundaria + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", cartel=" + cartel +
                '}';
    }
}
