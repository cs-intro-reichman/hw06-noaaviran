import java.awt.Color;

public class Editor4 {

	public static void main (String[] args) {
		String filename = args[0];
		int n = Integer.parseInt(args[1]);


		Color[][] image1 = Runigram.read(filename);
		Color[][] image2 = Runigram.grayScaled(image1);

		Runigram.morph(image1,image2,n);

	}
}
