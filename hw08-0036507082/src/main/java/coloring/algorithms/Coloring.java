package coloring.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import marcupic.opjj.statespace.coloring.Picture;

/**
 * Class Coloring defines data structure and a set of methods for working with
 * it.
 * 
 * Users can get reference, test pixel color, apply and accept pixel.
 * 
 * @author Filip
 */
public class Coloring implements Consumer<Pixel>, Function<Pixel, List<Pixel>>, Predicate<Pixel>, Supplier<Pixel> {

	private Pixel reference;
	private Picture picture;
	private int fillColor;
	private int refColor;

	/**
	 * Constructor with given parameters.
	 * 
	 * @param reference given pixel reference
	 * @param picture   given picture
	 * @param fillColor given fill color
	 */
	public Coloring(Pixel reference, Picture picture, int fillColor) {
		this.reference = reference;
		this.picture = picture;
		this.fillColor = fillColor;
		this.refColor = picture.getPixelColor(reference.getX(), reference.getY());
	}

	@Override
	public Pixel get() {
		return reference;
	}

	@Override
	public boolean test(Pixel t) {
		return picture.getPixelColor(t.getX(), t.getY()) == refColor;
	}

	@Override
	public List<Pixel> apply(Pixel t) {
		List<Pixel> list = new ArrayList<Pixel>();
		int x = t.getX();
		int y = t.getY();

		if (y - 1 >= 0) {
			list.add(new Pixel(x, y - 1));
		}
		if (x + 1 <= picture.getWidth() - 1) {
			list.add(new Pixel(x + 1, y));
		}
		if (y + 1 <= picture.getHeight() - 1) {
			list.add(new Pixel(x, y + 1));
		}
		if (x - 1 >= 0) {
			list.add(new Pixel(x - 1, y));
		}
		return list;
	}

	@Override
	public void accept(Pixel t) {
		picture.setPixelColor(t.getX(), t.getY(), fillColor);
	}

}
