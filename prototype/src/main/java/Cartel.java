public class Cartel implements Cloneable {
    private int totalLutas;
    private int totalVitorias;
    private int totalDerrotas;

    public Cartel(int totalLutas, int totalVitorias, int totalDerrotas) {
        super();
        this.totalLutas = totalLutas;
        this.totalVitorias = totalVitorias;
        this.totalDerrotas = totalDerrotas;
    }

    public int getTotalLutas() {
        return totalLutas;
    }

    public void setTotalLutas(int totalLutas) {
        this.totalLutas = totalLutas;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        this.totalVitorias = totalVitorias;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int totalDerrotas) {
        this.totalDerrotas = totalDerrotas;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cartel{" +
                "totalLutas=" + totalLutas +
                ", totalVitorias=" + totalVitorias +
                ", totalDerrotas=" + totalDerrotas +
                '}';
    }
}
