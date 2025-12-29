package com.fls;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharWrite {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("chartest.txt");
				BufferedWriter bw = new BufferedWriter(fw)){
			String msg = "this is simple char stream write and read operations";
			bw.write(msg);
			bw.flush();
			
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
