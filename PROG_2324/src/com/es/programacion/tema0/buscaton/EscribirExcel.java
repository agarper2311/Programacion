package com.es.programacion.tema0.buscaton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EscribirExcel {

	public void persistirDatosExcel(String[] datos) {

		String fileName = "stats.xlsx";
		String filePath = "C:\\Users\\diego\\Desktop\\Workspaces\\workspace_2324\\src\\main\\resources\\buscaton\\" + fileName;

		// Creando objeto libro de Excel

		try {
			File excelFile = new File(filePath); // Referenciando a la ruta y el archivo Excel a modificar

			FileInputStream fileIS = new FileInputStream(excelFile);
			XSSFWorkbook book = new XSSFWorkbook(fileIS);
			fileIS.close();
			
			//Obtenemos la primera hoja
			XSSFSheet hoja1 = book.getSheetAt(0);

			// Generando el contenido del archivo de Excel
			// Escribo los datos
			int lastRowNum = hoja1.getLastRowNum();
			XSSFRow rowDatos = hoja1.createRow(lastRowNum + 1);
			for (int i = 0; i < datos.length; i++) {
				XSSFCell celda = rowDatos.createCell(i);
				celda.setCellValue(datos[i]);
			}

			
			FileOutputStream fileOS = new FileOutputStream(excelFile);
			book.write(fileOS);
			fileOS.flush();
			fileOS.close();
			System.out.println("Archivo Modificado.!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
