package com.trainingbasket.employeestatsmailer.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.ResolutionSyntax;

import com.trainingbasket.employeestatsmailer.modal.AbsentismRecord;

public class ReaderService {

	List<AbsentismRecord> absentismRecords;
	private String fileName;

	public ReaderService(String fileName) {
		this.fileName = fileName;
	}

	public List<AbsentismRecord> readFileIntoList() throws IOException {
		absentismRecords = new ArrayList<AbsentismRecord>();
		List<String> lines = Files.readAllLines(Paths.get(fileName));
		lines.forEach(line -> {
			try {
				String columns[] = line.split(",");
				AbsentismRecord record = new AbsentismRecord();
				record.setID(Integer.parseInt(columns[0]));
				record.setReasonForAbsence(Integer.parseInt(columns[1]));
				record.setMonthOfAbsence(Integer.parseInt(columns[2]));
				absentismRecords.add(record);
			} catch (Exception e) {
				System.err.println(e.toString() + "Skipping the line ");
			}
		});
		return absentismRecords;
	}
}
