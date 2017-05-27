package com.yuanzijian12;
class Animal{

	String name;

	String color;

	public Animal(String name, String color){
		this.name = name;
		this.color = color;
	}
}

//�������ڶ�����һ��
class Dog extends Animal {

	public Dog(String name,String color){
		super(name,color); //ָ�����ø������� �����Ĺ��캯����
	}

	public void bite(){
		System.out.println(name+"ҧ��!!");
	}
}

//���� Ҳ�����ڶ�����һ��
class Mouse extends  Animal{
	
	public Mouse(String name,String color){
		super(name,color);
	}
	
	public void dig(){
		System.out.println(name+"��..");
	}

}

class Demo12{

	public static void main(String[] args) 
	{
		Dog d = new Dog("��ʿ��","��ɫ");
		System.out.println("���ǹ�����"+ (d instanceof Dog));
		System.out.println("���Ƕ�������"+ (d instanceof Animal));	
		//System.out.println("������������"+ (d instanceof Mouse));		// false true
		
		Animal a = new Animal("����","��ɫ"); //��������
		System.out.println("���ﶼ�ǹ���"+ (a instanceof Dog));


	}
}

