package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void test()throws SQLException {
		//fail("Not yet implemented");
		Testing t=new Testing();
		
		assertEquals(true, t.isConnected());
	}
}


