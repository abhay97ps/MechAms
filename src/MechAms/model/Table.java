package MechAms.model;

public class Table {

	int num_att;
	String table_name;
	String attribute_name_1;
	String attribute_name_2;
	String attribute_name_3;
	String attribute_name_4;
	String attribute_name_5;
	String attribute_name_6;
	String attribute_name_7;
	String attribute_name_8;
	String attribute_name_9;
	String attribute_name_10;
	public Table(int num_att, String table_name, String attribute_name_1, String attribute_name_2,
			String attribute_name_3, String attribute_name_4, String attribute_name_5, String attribute_name_6,
			String attribute_name_7, String attribute_name_8, String attribute_name_9, String attribute_name_10) {
		super();
		this.num_att = num_att;
		this.table_name = table_name;
		this.attribute_name_1 = attribute_name_1;
		this.attribute_name_2 = attribute_name_2;
		this.attribute_name_3 = attribute_name_3;
		this.attribute_name_4 = attribute_name_4;
		this.attribute_name_5 = attribute_name_5;
		this.attribute_name_6 = attribute_name_6;
		this.attribute_name_7 = attribute_name_7;
		this.attribute_name_8 = attribute_name_8;
		this.attribute_name_9 = attribute_name_9;
		this.attribute_name_10 = attribute_name_10;
	}
	public String getAttributeName(int i) {
		
		switch(i) {
		
		case 1: return getAttribute_name_1();
		case 2: return getAttribute_name_2();
		case 3: return getAttribute_name_3();
		case 4: return getAttribute_name_4();
		case 5: return getAttribute_name_5();
		case 6: return getAttribute_name_6();
		case 7: return getAttribute_name_7();
		case 8: return getAttribute_name_8();
		case 9: return getAttribute_name_9();
		case 10: return getAttribute_name_10();
		}
		
		
		return null;
		
	}
	public int getNum_att() {
		return num_att;
	}
	public void setNum_att(int num_att) {
		this.num_att = num_att;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getAttribute_name_1() {
		return attribute_name_1;
	}
	public void setAttribute_name_1(String attribute_name_1) {
		this.attribute_name_1 = attribute_name_1;
	}
	public String getAttribute_name_2() {
		return attribute_name_2;
	}
	public void setAttribute_name_2(String attribute_name_2) {
		this.attribute_name_2 = attribute_name_2;
	}
	public String getAttribute_name_3() {
		return attribute_name_3;
	}
	public void setAttribute_name_3(String attribute_name_3) {
		this.attribute_name_3 = attribute_name_3;
	}
	public String getAttribute_name_4() {
		return attribute_name_4;
	}
	public void setAttribute_name_4(String attribute_name_4) {
		this.attribute_name_4 = attribute_name_4;
	}
	public String getAttribute_name_5() {
		return attribute_name_5;
	}
	public void setAttribute_name_5(String attribute_name_5) {
		this.attribute_name_5 = attribute_name_5;
	}
	public String getAttribute_name_6() {
		return attribute_name_6;
	}
	public void setAttribute_name_6(String attribute_name_6) {
		this.attribute_name_6 = attribute_name_6;
	}
	public String getAttribute_name_7() {
		return attribute_name_7;
	}
	public void setAttribute_name_7(String attribute_name_7) {
		this.attribute_name_7 = attribute_name_7;
	}
	public String getAttribute_name_8() {
		return attribute_name_8;
	}
	public void setAttribute_name_8(String attribute_name_8) {
		this.attribute_name_8 = attribute_name_8;
	}
	public String getAttribute_name_9() {
		return attribute_name_9;
	}
	public void setAttribute_name_9(String attribute_name_9) {
		this.attribute_name_9 = attribute_name_9;
	}
	public String getAttribute_name_10() {
		return attribute_name_10;
	}
	public void setAttribute_name_10(String attribute_name_10) {
		this.attribute_name_10 = attribute_name_10;
	}
	
	
}
