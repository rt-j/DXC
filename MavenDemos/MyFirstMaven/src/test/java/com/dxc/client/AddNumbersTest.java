package com.dxc.client;

import junit.framework.TestCase;

public class AddNumbersTest extends TestCase {
	public AddNumbersTest() {
		AddNumbers add;
	}
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	public void testAdd() {
	  AddNumbers a=new AddNumbers();
	  int result=a.add(2, 4);
	  assertEquals(6, result);
	}

}
