package src;

import src.models.Carte;

public class Main {

    public static void main(String[] args) {

        Carte carte1 = new Carte();
        System.out.println("Cartea nr. 1 :");
        System.out.println("====================");
        carte1.setTitlu("1987");
        carte1.setAutor("Gheorghi Verdes");
        carte1.setPagini(328);
        carte1.setPret(39.99f);
        carte1.setInStoc(true);
        carte1.setCantitate(10);

        System.out.println("Titlu: " + carte1.getTitlu());
        System.out.println("Autor: " + carte1.getAutor());
        System.out.println("Pagini: " + carte1.getPagini());
        System.out.println("Pret: " + carte1.getPret());
        System.out.println("In stoc: " + carte1.isInStoc());
        System.out.println("Cantitatea: " + carte1.getCantitate());
        System.err.println("====================");

        Carte carte2 = new Carte("1995", "Gheorghi Verdes", 328, 29.99f, true, 10);
        // System.out.println("Cartea nr. 2 : ");
        // System.out.println("====================");
        // System.out.println("Titlu: " + carte2.getTitlu());
        // System.out.println("Autor: " + carte2.getAutor());
        // System.out.println("Pagini: " + carte2.getPagini());
        // System.out.println("Pret: " + carte2.getPret());
        // System.out.println("In stoc: " + carte2.isInStoc());
        // System.out.println("Cantitatea: " + carte2.getCantitate());
        
        carte2.afiseazaInfoCarte();

    }
}