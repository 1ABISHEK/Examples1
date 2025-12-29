package com.fls;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class DeSerialDemo {

	public static void main(String[] args) {
		String path = "team.txt";

try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            List<PlayersData> dataIn = (List<PlayersData>) in.readObject();
            System.out.println("Deserialized:");
            dataIn.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


	}

