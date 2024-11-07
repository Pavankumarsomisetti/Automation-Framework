package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demos {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("D:\\KCSE6\\Demo\\config.properties");
		properties.load(fis);
		System.out.println(properties.getProperty("firstName"));
		System.out.println(properties.getProperty("lastName"));
	}
}
