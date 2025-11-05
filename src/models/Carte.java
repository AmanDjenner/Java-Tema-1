package src.models;

public class Carte {
    String titlu;
    String autor;
    Integer pagini;
    float pret;
    boolean inStoc;
    int cantitate;

    // Constructor fara parametri
    public Carte() {
    }

    // Constructor cu parametri
    public Carte(String titlu, String autor, Integer pagini, float pret, boolean inStoc, int cantitate) {
        this.titlu = titlu;
        this.autor = autor;
        this.pagini = pagini;
        this.pret = pret;
        this.inStoc = inStoc;
        this.cantitate = cantitate;
    }
// Metoda pentru afisarea informatiilor despre carte
    public void afiseazaInfoCarte() {
        System.out.println("---> " + titlu + " <---");
        System.out.println("Autor: " + autor);
        System.out.println("Pagini: " + pagini);
        System.out.println("Pret: " + pret);
        System.out.println("In stoc: " + inStoc);
        System.out.println("Cantitate: " + cantitate);
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPagini() {
        return pagini;
    }

    public void setPagini(Integer pagini) {
        this.pagini = pagini;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public boolean isInStoc() {
        return inStoc;
    }

    public void setInStoc(boolean inStoc) {
        this.inStoc = inStoc;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

}
