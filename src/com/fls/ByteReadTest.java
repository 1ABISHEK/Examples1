package com.fls;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ByteReadTest {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("C:/Users/abishek.ks1/Desktop/Workspace/Examples1/src/bytetest.txt"); BufferedInputStream bis = new BufferedInputStream(fis)){
			byte[] br = new byte[1024];
			
			int x = 0;
			
			while((x = bis.read(br)) != -1) {
				System.out.println(new String(br, 0, x));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
