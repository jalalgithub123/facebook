package com.stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\moham\\eclipse-workspace\\SUCCESS\\FaceBookTest\\src\\test\\resources\\FaceBookFeature\\FaceBook.feature",

		glue="com.stepdefinition", dryRun=false,
		plugin = "html:target")
public class TestRunner {
	public static String userexcel = null;
	public static String passexcel = null;

@BeforeClass
public  static void methodCall(String row) throws Exception {
	BaseClass.excelData(row);
}
}