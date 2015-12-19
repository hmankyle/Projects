package tetris;

import java.awt.*;

/**
 * @author Kyle Hammond
 *
 */
abstract class Tetronimo {
	
	TetrisCell[] cells;

	/**
	 * Creates an abstract tetris block.
	 * @param c The color of the Tetronimo
	 */
	public Tetronimo(Color c) {
		super();
		cells = new TetrisCell[4];
	}
	
	
}
