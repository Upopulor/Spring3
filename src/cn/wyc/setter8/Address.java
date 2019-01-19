package cn.wyc.setter8;

public class Address {
	private String addr;
	private String del;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	@Override
	public String toString() {
		return "Address [addr=" + addr + ", del=" + del + "]";
	}
	
}
