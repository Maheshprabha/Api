package com.atmecs.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	Properties props;
	public PropReader(String filePath) {
		props = new Properties();
		try {
			props.load(new FileInputStream(new File (filePath)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public String get(String key) {
	return props.getProperty(key);
	
}
}
