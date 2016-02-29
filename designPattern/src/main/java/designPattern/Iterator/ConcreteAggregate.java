package designPattern.Iterator;

public class ConcreteAggregate extends Aggregate {

	private Object[] objArray = null;
	public ConcreteAggregate(Object[] objArray) {
		this.objArray = objArray;
	}
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class ConcreteIterator implements Iterator {

		private int index = 0;
		private int size = 0;
		public void first() {
			// TODO Auto-generated method stub
			index = 0;
			this.size = objArray.length;
		}

		public void next() {
			// TODO Auto-generated method stub
			if (index < size) {
				index++;
			}
		}

		public Object currentItem() {
			// TODO Auto-generated method stub
			return objArray[index];
		}

		public boolean isDone() {
			// TODO Auto-generated method stub
			return index >= size;
		}
		
	}

}
