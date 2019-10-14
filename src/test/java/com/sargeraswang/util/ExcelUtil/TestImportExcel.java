/**
 * @author SargerasWang
 */
package com.sargeraswang.util.ExcelUtil;

import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 测试导入Excel 97/2003
 */
public class TestImportExcel {

  @Ignore
  public void importXls() throws FileNotFoundException {
    File f=new File("src/test/resources/test.xls");
    InputStream inputStream= new FileInputStream(f);
    
    ExcelLogs logs =new ExcelLogs();
    Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs , false,0);
    
    for(Map m : importExcel){
      System.out.println(m);
    }
  }

  @Test
  public void importXlsx() throws FileNotFoundException {
    File f=new File("src/test/resources/test.xlsx");
    InputStream inputStream= new FileInputStream(f);

    ExcelLogs logs =new ExcelLogs();
    Collection<List> importExcel = ExcelUtil.importExcel(List.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs , false);

    for(List m : importExcel){
      System.out.println(m);
    }
  }

}
