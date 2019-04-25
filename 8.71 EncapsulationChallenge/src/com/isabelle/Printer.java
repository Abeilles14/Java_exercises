package com.isabelle;

public class Printer {
    private int toner;
    private int pages;
    private boolean duplex;

    public Printer(int toner, boolean duplex) {
        if (toner >= 1 && toner <= 100) {
            this.toner = toner;
        } else {
            this.toner = -1;
        }
        this.toner = toner;
        this.duplex = duplex;
    }

    public int fillToner(int level){
        if(level > 0 && level <= 100){
            if(this.toner + level > 100) {
                return -1;
            }
            return this.toner = level;
        } else {
            return -1;
        }
    }

    public int printPages(int number){
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint/= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pages += pagesToPrint;
        return pagesToPrint;
    }

    public int getToner() {
        return toner;
    }

    public int getPages() {
        return pages;
    }

    public boolean isDuplex() {
        return duplex;
    }

}
