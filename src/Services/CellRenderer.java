/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gilberto
 */
public class CellRenderer extends DefaultTableCellRenderer {
     public CellRenderer() {
	super();
}

public Component getTableCellRendererComponent(JTable table, Object value,
		boolean isSelected, boolean hasFocus, int row, int column) {
	this.setHorizontalAlignment(CENTER);

	return super.getTableCellRendererComponent(table, value, isSelected,
			hasFocus, row, column);
}
}
