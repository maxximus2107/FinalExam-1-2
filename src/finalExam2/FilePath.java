package finalExam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePath {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\M\\eclipse-workspace\\finalExam\\dictionary.txt"; //My filePath directory

		if (doesFileExist(filePath)) {
			readAndPrintDictionary(filePath);
		} else {
			System.out.println("The file does not exist at the specified path.");
		}
	}

	public static boolean doesFileExist(String path) {
		File file = new File(path);
		return file.exists();
	}

	public static void readAndPrintDictionary(String path) {
		try {
			Scanner scanner = new Scanner(new File(path));

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split(" - ");

				if (parts.length == 2) {
					String word = parts[0].trim();
					String meanings = parts[1].trim();

					System.out.println(word);
					String[] meaningList = meanings.split(",");
					for (String meaning : meaningList) {
						System.out.println(meaning.trim());
					}
				}
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
}
