package designPattern.simpleFactory;

import designPattern.factoryMethod.ExportFinancialPdfFile;
import designPattern.factoryMethod.ExportStandardPdfFile;
//工厂类角色
public class FruitFactory {

	public static Fruit getFruit(String type) {
		if ("apple".equals(type)) {
			return new Apple();
		} else if ("banana".equals(type)) {
			return new Banana();
		} else {
			throw new RuntimeException("没有找到对象");
		}
	}
}
