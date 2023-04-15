package fundamentos.sobrecarga;

public class Vetor {
    private int x;
    private int y;
    private int z;

    public Vetor(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vetor add(Vetor outro) {
        int novaX = this.x + outro.x;
        int novaY = this.y + outro.y;
        int novaZ = this.z + outro.z;
        return new Vetor(novaX, novaY, novaZ);
    }
    public Vetor subtract(Vetor outro) {
        int novaX = this.x - outro.x;
        int novaY = this.y - outro.y;
        int novaZ = this.z - outro.z;
        return new Vetor(novaX, novaY, novaZ);
    }

}
