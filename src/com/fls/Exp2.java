package com.fls;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Exp2 {

	public static void main(String[] args) {

		List<String> data = Arrays.asList("Abishek", "Sahana", "Ashwin");
		String path = "data.txt";
		try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(path))) {
			data.stream().forEach(x -> {
				try {
					bw.write(x);
					bw.newLine();
				} catch (Exception ie) {
					ie.printStackTrace();
				}
			});
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
