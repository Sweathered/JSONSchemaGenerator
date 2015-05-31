import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ParseJSON {
	public static void main(String[] args) throws IOException {
		String jsonInput = readFile("src/main/resources/json/example.json");
		System.out.println(jsonInput);
	}

	private static String readFile(String pathname) throws IOException {
		File file = new File(pathname);
		StringBuilder fileContents = new StringBuilder((int) file.length());
		Scanner scanner = new Scanner(file);
		String lineSeparator = System.getProperty("line.separator");

		try {
			while (scanner.hasNextLine()) {
				fileContents.append(scanner.nextLine() + lineSeparator);
			}
			return fileContents.toString();
		} finally {
			scanner.close();
		}
	}
}
