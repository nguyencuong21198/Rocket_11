package com.vti.academy.frontend;

import java.sql.SQLException;

import com.vti.academy.backend.Exercise1;

public class Program1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Exercise1 exercise1 = new Exercise1();
		exercise1.connection();
	}
}
