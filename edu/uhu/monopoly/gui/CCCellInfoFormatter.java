package edu.uhu.monopoly.gui;

import edu.uhu.monopoly.Cell;

public class CCCellInfoFormatter implements CellInfoFormatter {
    public String format(Cell cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }
}
