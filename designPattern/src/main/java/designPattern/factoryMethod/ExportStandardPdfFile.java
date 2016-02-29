package designPattern.factoryMethod;
//具体产品角色
public class ExportStandardPdfFile implements ExportFile {

	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("导出标准版pdf文件");
		return true;
	}

}
