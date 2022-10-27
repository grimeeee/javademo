package project;

public class member {
int mnum;
String name;
String phone;
String membership;
String pt;
String locker;
String sweatsuit;

public int getMnum() {
	return mnum;
}

public void setMnum(int mnum) {
	this.mnum = mnum;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getMembership() {
	return membership;
}

public void setMembership(String membership) {
	this.membership = membership;
}

public String getPt() {
	return pt;
}

public void setPt(String pt) {
	this.pt = pt;
}

public String getLocker() {
	return locker;
}

public void setLocker(String locker) {
	this.locker = locker;
}

public String getSweatsuit() {
	return sweatsuit;
}

public void setSweatsuit(String sweatsuit) {
	this.sweatsuit = sweatsuit;
}

public member(int mnum, String name, String phone, String membership, String pt, String sweatsuit, String locker ) {
	super();
	this.mnum = mnum;
	this.name = name;
	this.phone = phone;
	this.membership = membership;
	this.pt = pt;
	this.sweatsuit = sweatsuit;
	this.locker = locker;
	
}

public member() {
	
}

}
