package com.trainingbasket.employeestatsmailer;

import java.io.IOException;
import java.io.Reader;

import com.trainingbasket.employeestatsmailer.service.ReaderService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ReaderService readerService = new ReaderService("d:\\Absenteeism_at_work_Project.csv");
		try {
			readerService.readFileIntoList().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
