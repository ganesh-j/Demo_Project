package com.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args)  throws Exception{
		
		
		
		try( FileInputStream fis = new FileInputStream("/Users/ganesh/Learn/wallpaper.jpeg");
				FileOutputStream fos =new FileOutputStream("/Users/ganesh/Learn/tryresource.jpeg");) {
			int ch ;
			while((ch= fis.read())!= -1){
				fos.write(ch);
			}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
