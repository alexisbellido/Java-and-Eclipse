package com.zinibu.basic;

import java.io.FileNotFoundException;

public class MyFileNotFoundException extends FileNotFoundException {
	private static final long serialVersionUID = 1L;

	public MyFileNotFoundException() {}
	
	public MyFileNotFoundException(String gripe) {
		super(gripe);
	}

}
