package njhk.wisdom.web.api.controller.app;

import njhk.wisdom.web.bean.entity.Excel;
import njhk.wisdom.web.service.impl.customer.ExcelService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class ExcelController {

    @Autowired
    ExcelService es;

    @RequestMapping("/import")
    public void addUser(HttpServletResponse response)throws IOException {
        System.out.println("------------------excel");
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建一个Excel表单,参数为sheet的名字
        HSSFSheet sheet = workbook.createSheet("课调答卷表");

        //创建表头
        Excel ec=new Excel();
        setTitle(workbook, sheet);
        List<Excel> answers = es.findList(ec);

        //新增数据行，并且设置单元格数据
        int rowNum = 1;
        for (Excel excel : answers) {
            System.out.println(excel.getId()+"-----------------");
            HSSFRow row = sheet.createRow(rowNum);
           // row.createCell(0).setCellValue(excel.getId());
            row.createCell(1).setCellValue(excel.getName());
            row.createCell(2).setCellValue(excel.getPhone());
            rowNum++;
        }
        String fileName = "survey-answer.xls";
        //清空response
        response.reset();
        //设置response的Header
        response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
        OutputStream os = new BufferedOutputStream(response.getOutputStream());
        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        //将excel写入到输出流中
        workbook.write(os);
        os.flush();
        os.close();
     }


    /***
     * 设置表头
     * @param workbook
     * @param sheet
     */
    private void setTitle(HSSFWorkbook workbook, HSSFSheet sheet){
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(0, 10*256);
        sheet.setColumnWidth(1, 20*256);
        sheet.setColumnWidth(2, 20*256);
        sheet.setColumnWidth(3, 100*256);

        //设置为居中加粗
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        style.setFont(font);

        HSSFCell cell;
        cell = row.createCell(0);
        cell.setCellValue("序号");
        cell.setCellStyle(style);

        cell = row.createCell(1);
        cell.setCellValue("姓名");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("电话");
        cell.setCellStyle(style);

    }


    @RequestMapping(value = "/excel/import")
    public List<Map<String,String>>  excelImport(@RequestParam(value = "excelFile") MultipartFile excelFile) throws Exception{
        if(excelFile==null){
            throw new Exception("请选择文件");
        }

        InputStream fis = excelFile.getInputStream(); //读取input流
        List<Map<String,String>> data = parseExcel(fis);
        System.out.println(data.toString()+"----------");
        return data;
    }

    //解析excel
    private List<Map<String,String>> parseExcel(InputStream fis) throws Exception{
        List<Map<String,String>> data = new ArrayList<Map<String,String>>();
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheetAt(0);
        int firstRow = sheet.getFirstRowNum();//第一行序号
        int lastRow = sheet.getLastRowNum();//最后一行序号

        HSSFRow titleRow = sheet.getRow(firstRow);//表头行

        for(int i=firstRow+1;i<lastRow+1;i++){
            HSSFRow row = sheet.getRow(i); //获取第行
            Map map = getRowData(row,titleRow);//获取第i行数据
            data.add(map);
        }
        for (int i = 0; i <data.size() ; i++) {
            System.out.println(data.get(i).toString()+"++++++++");
            for (String a:data.get(i).keySet()) {
                System.out.println(data.get(i).get(a)+"%%%%%%%%%%");
                System.out.println(a+"!!!!!!!!!!!!!");
            }
        }
        return data;
    }

    //获取excel中一行的数据
    private Map<String,String> getRowData(HSSFRow row,HSSFRow titleRow){
        Map<String,String> map = new HashMap<String,String>();
        int firstCell = row.getFirstCellNum();//第一列序号
        int lastCell = row.getLastCellNum();//最后一列序号

        for(int j=firstCell;j<lastCell;j++){

            String key = titleRow.getCell(j).getStringCellValue();//当前列标题
            HSSFCell cell = row.getCell(j);//当前单元格

            int a=cell.getCellType();
            System.out.println(a+"-------------");

            //当单元格是数字格式时，需要把它的cell type转成String，否则会出错
            if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
                cell.setCellType(HSSFCell.CELL_TYPE_STRING);
            }
            String val =cell.getStringCellValue();//当前单元格的值

            map.put(key,val);
        }

        return map;
    }



    @RequestMapping("/Array")
    public void Array(
            @RequestParam(value = "id",required = false)String[] id
    ){
        for (int i = 0; i <id.length ; i++) {
            System.out.println(id[i]);
        }
            Excel ex=new Excel();
            ex.setAd(id);

            es.findList(ex);

    }

}
