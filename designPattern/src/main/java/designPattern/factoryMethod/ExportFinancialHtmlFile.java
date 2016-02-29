package designPattern.factoryMethod;
//具体产品角色
public class ExportFinancialHtmlFile implements ExportFile {

	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("导出财务版HTML文件");
		return true;
	}

}
