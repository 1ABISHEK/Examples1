package com.fls;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class SerialDemo {

	public static void main(String[] args) {

		List<PlayersData> data = Arrays.asList(new PlayersData(1, "Kohli", "King","Banglore"),
				new PlayersData(2, "Rohit", "Hit man","Mumbai"), new PlayersData(3, "ABDE", "360","South Africa"));

		String path = "team.txt";

		try (ObjectOutputStream ow = new ObjectOutputStream(new FileOutputStream(path))) {
			ow.writeObject(data);
			ow.flush();

			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
