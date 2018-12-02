package com.group4.excel;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.group4.entity.Post;

public class UserPostExcel extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String sCurTime = null;
		sCurTime = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());

		String namefile = sCurTime + "my-post.xlsx";
		Sheet sheet = null;
		Row row = null;
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(CellStyle.ALIGN_CENTER);
		List<Post> list = (List<Post>) model.get("list");
		sheet = workbook.createSheet("your-post");
		row = sheet.createRow(0);
		int columnIndex = 0;
		while (columnIndex < 9) {

			if (columnIndex == 0) {
				sheet.setColumnWidth(columnIndex, 3000);
			} else if (columnIndex == 1) {
				sheet.setColumnWidth(columnIndex, 4000);
			} else if (columnIndex == 2) {
				sheet.setColumnWidth(columnIndex, 6000);
			} else if (columnIndex == 3) {
				sheet.setColumnWidth(columnIndex, 4000);
			} else if (columnIndex == 4) {
				sheet.setColumnWidth(columnIndex, 7000);
			} else if (columnIndex == 5) {
				sheet.setColumnWidth(columnIndex, 3000);
			} else if (columnIndex == 6) {
				sheet.setColumnWidth(columnIndex, 3000);
			} else if (columnIndex == 7) {
				sheet.setColumnWidth(columnIndex, 3000);
			} else if (columnIndex == 8) {
				sheet.setColumnWidth(columnIndex, 3000);
			}
			else if (columnIndex == 9) {
				sheet.setColumnWidth(columnIndex, 3000);
			}

			columnIndex++;
		}
		row = sheet.createRow(0);
		row.createCell(0).setCellValue("ID post");
		row.createCell(1).setCellValue("Title");
		row.createCell(2).setCellValue("Description");
		row.createCell(3).setCellValue("Info");
		row.createCell(4).setCellValue("Price");
		row.createCell(5).setCellValue("Quantity");
		row.createCell(6).setCellValue("CreatedAt");
		row.createCell(7).setCellValue("Category");
		row.createCell(8).setCellValue("Username");
		row.createCell(9).setCellValue("Active");
		int rowindex = 1;
		for (Post post : list) {
			row = sheet.createRow(rowindex);
			row.createCell(0).setCellValue(post.getId().toString());
			row.createCell(1).setCellValue(post.getTitle());
			row.createCell(2).setCellValue(post.getDescription());
			row.createCell(3).setCellValue(post.getInfo());
			row.createCell(4).setCellValue(post.getPrice());
			row.createCell(5).setCellValue(post.getQuantity());
			row.createCell(6).setCellValue(post.getCreatedAt());
			row.createCell(7).setCellValue(post.getSubCategory().getName());
			row.createCell(8).setCellValue(post.getUser().getUsername());
			row.createCell(9).setCellValue(post.isAccept());
			rowindex++;
		}
		   try {
	            response.setHeader("Content-Disposition", "attachement; filename=\""
	                    + java.net.URLEncoder.encode(namefile, "UTF-8") + "\";charset=\"UTF-8\"");
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	}

}
