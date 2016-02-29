package designPattern.factoryMethod;
//具体产品角色
public class ExportFinancialPdfFile implements ExportFile {

	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("导出财务版PDF文件");
		return true;
	}

}
