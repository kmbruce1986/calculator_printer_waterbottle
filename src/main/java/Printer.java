public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public int getToner() {
        return toner;
    }

    public int makeCopies(int pages, int copies){
        int totalSheetsUsed = pages * copies;
        if (this.sheets >= totalSheetsUsed) {
            this.sheets -= totalSheetsUsed;
            this.toner -= totalSheetsUsed;
        }
        return totalSheetsUsed;
    }


    public void refillPaper(){
        this.sheets = 1000;
    }
}
