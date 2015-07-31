package chpt16.trash;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class ParseTrash {
	public static void fillBin(String filename, Fillable bin) {
		try {
			BufferedReader data = new BufferedReader(new FileReader(filename));
			String buf;
			while ((buf = data.readLine()) != null) {
				String type = buf.substring(0, buf.indexOf(':')).trim();
				double weight = Double.valueOf(
						buf.substring(buf.indexOf(':') + 1).trim())
						.doubleValue();
				bin.addTrash(Trash.factory(new Trash.Info(type, weight)));
			}
			data.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Special case to handle Vector:
	public static void fillBin(String filename, Vector bin) {
		fillBin(filename, new FillableVector(bin));
	}
} // /:~
