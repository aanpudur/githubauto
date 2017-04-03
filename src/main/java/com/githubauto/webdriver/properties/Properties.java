package com.githubauto.webdriver.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.githubauto.webdriver.Main;

public class Properties {
	public static void main(String[] args) {

		Properties prop = new Properties();
		String homepath = (System.getProperty("user.dir"));
		String path = homepath + "/src/main/java/com/githubauto/webdriver/properties/";
		System.out.println(path);

		try {
			FileInputStream fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
