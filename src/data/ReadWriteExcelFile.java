package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader d = new Xls_Reader("/Users/vatsalpatel/Desktop/Testing/NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 3));
		String correctEmail = d.getCellData("Data1", 1, 2);
		System.out.println(correctEmail);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		d.setCellData("Data1", "Name", 11, "testing11");
		System.out.println(d.getCellData("Data1", "Name", 11));
		
		d.addColumn("Data1", "Vatsal");

	}

}
