package Model;

public class Category {

	private int cate_id;
	private String cate_name;
	public Category(int cate_id, String cate_name) {
		super();
		this.cate_id = cate_id;
		this.cate_name = cate_name;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCate_id() {
		return cate_id;
	}
	public void setCate_id(int cate_id) {
		this.cate_id = cate_id;
	}
	public String getCate_name() {
		return cate_name;
	}
	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}
	
	
}
