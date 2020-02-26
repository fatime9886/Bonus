
import com.Pixel.config.PixelColor;
import com.kasparovtron.pieces.Piece;
public class Board {

	public static Pixel board[][] = new Pixel [64][64];
	public static Pixel activePixel;
	
	public static void init() { 
		
		Pixel(new Pixel(PixelColor.BLUE, 0, 0));
		Pixel(new Pixel(PixelColor.RED, 0, 1));
		Pixel(new Pixel(PixelColor.GREEN, 0, 2));
	}
public static void Pixel(Pixel pixel) {
		
		Pixel pixel;
		int row = pixel.row;
		int col = pixel.col;
		
		
		board[row][col] = pixel;
	}
	private static void initPixel(Pixel pixel) {
		// TODO Auto-generated method stub
		
	}
}

