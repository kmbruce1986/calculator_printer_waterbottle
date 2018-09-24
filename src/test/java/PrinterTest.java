import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(1000, 100);
    }

    @Test
    public void canGetSheets(){
        int sheetTotal = printer.getSheets();
        assertEquals(1000, sheetTotal);
    }

    @Test
    public void canPrintEnoughPaper(){
        int pagesTotal = printer.makeCopies(5, 2);
        assertEquals(10, pagesTotal);
        int newSheetTotal = printer.getSheets();
        assertEquals(990, newSheetTotal);
        int newTonerTotal = printer.getToner();
        assertEquals(90, newTonerTotal);
    }

    @Test
    public void cannotPrintNotEnoughPaper(){
        int pagesTotal = printer.makeCopies(100, 20);
        assertEquals(2000, pagesTotal);
        assertEquals(1000, printer.getSheets());
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canRefillPaper(){
        printer.refillPaper();
        assertEquals(1000, printer.getSheets());
    }

    @Test
    public void canGetToner(){
        int tonerTotal = printer.getToner();
        assertEquals(100, tonerTotal);
    }
}
