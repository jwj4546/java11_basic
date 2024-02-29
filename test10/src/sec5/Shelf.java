package sec5;

import java.util.ArrayList;
//일반(구현) 클래스
public class Shelf {
	//List<String> => "wooji", "xin", "jin", "lee", "cho", ....
	protected ArrayList<String> shelf;					
	public Shelf() {
		shelf = new ArrayList<String>();					//생략해도 됨
		
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
	
}
