package com.Craftsvilla.genericUtilities;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public static File file=null;
	public static FileInputStream fin=null;
	public static Workbook wb=null;
	public static Sheet sh=null;
		
	public static String[][] getData(String filename,String sheetname) 
	{
		try
		{
			file=new File(filename);
			fin=new FileInputStream(file);
		    wb =new XSSFWorkbook(fin);
		    sh=wb.getSheet(sheetname);
		    int rownum=sh.getFirstRowNum()+1;
		    int colnum=sh.getRow(0).getLastCellNum();
		    String[][] data=new String[ rownum][colnum];
		    
		    for(int i=0;i<rownum;i++)
		    {
		    	Row r=sh.getRow(i);
		    	for(int j=0;j<colnum;j++)
		    	{
		    		Cell c=r.getCell(j);
		    		String  value=new DataFormatter().formatCellValue(c);
		    		data[i][j]=value;
		    	}
		    }
		    return data;
		 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
			finally
			{
				try
				{
					file=null;
					fin.close();
					fin=null;
					wb.close();
					wb=null;
					sh=null;
				}
				catch (Exception e)
				{
					e.printStackTrace();
					
	
				}
				{
					
				}
				
				
			}
	
			
		

		}	
	

}
