package tetris;

import javax.swing.JPanel;
import java.awt.*;

/**
 * 
 * 
 * @author Kyle Hammond
 */
class TetrisCell extends JPanel {
	
	// Location of the cell
	int row;
	int col;
	
	// "Borders" to render as edges of the Tetronimos
	// These let Tetronimos stay "whole" after having an individual cell removed
	boolean topBorder, botBorder, leftBorder, rightBorder;
	
	Color c;

	/**
	 * A Tetris cell to be rendered on a Tetris board as part of a
	 * Tetronimo.
	 * 
	 * @param row The row the cell belongs to
	 * @param col The column the cell belongs to
	 * @param c The color of the Tetris cell
	 */
	public TetrisCell(int row, int col, Color c) {
		super();
		this.setPreferredSize(new Dimension(20, 20));
		this.row = row;
		this.col = col;
		this.c = c;
		topBorder = false;
		botBorder = false;
		leftBorder = false;
		rightBorder = false;
	}
	
	/**
	 * Sets the color of the Tetris cell.
	 * 
	 * @param c The color of the Tetris cell
	 */
	public void setColor(Color c) {
		this.c = c;
	}
	
	/**
	 * Sets the borders for the cell. The borders are used to separate
	 * Tetronimos, and keeps Tetronimos together when "chunks" of them
	 * are cleared.
	 * 
	 * @param top The top edge of the cell
	 * @param bot The bottom edge of the cell
	 * @param left The left edge of the cell
	 * @param right The right edge of the cell
	 */
	public void setBorders(boolean top, boolean bot, boolean left, boolean right) {
		topBorder = top;
		botBorder = bot;
		leftBorder = left;
		rightBorder = right;
	}
	
	/**
	 * Renders a tetris cell using its given color as the background. Renders
	 * borders according to their respective fields' values.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(c);
		g.fillRect(0, 0, 20, 20);
		g.setColor(Color.BLACK);
		if(topBorder) {
			g.drawLine(0, 0, 20, 0);
		}
		if(botBorder) {
			g.drawLine(0, 20, 20, 20);
		}
		if(leftBorder) {
			g.drawLine(0, 0, 0, 20);
		}
		if(rightBorder) {
			g.drawLine(20, 0, 20, 20);
		}
	}
}
