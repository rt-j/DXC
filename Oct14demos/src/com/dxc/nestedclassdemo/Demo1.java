package com.dxc.nestedclassdemo;
class CheckPassword{
	int i;
	 class PasswordEncrypt{//if we give this as private then we cannot access in Demo1 class
		int j=200;
		void encryptionDone() {
			System.out.println("Yeah");
		}
	}
	public void display() {
		PasswordEncrypt d=new PasswordEncrypt();
		d.encryptionDone();
	}
}
public class Demo1 {
public static void main(String[] args) {
	CheckPassword c=new CheckPassword();
	c.display();
	CheckPassword.PasswordEncrypt s=c.new PasswordEncrypt();
	s.encryptionDone();
}
}
