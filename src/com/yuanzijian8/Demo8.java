package com.yuanzijian8;

/*
���ʣ� ΪʲôҪ���ø���Ĺ��췽�����������������������ǣ�

	���ø��� �Ĺ��췽���ǿ��Գ�ʼ���Ӹ���̳���ȥ�����Եġ�

*/ 
class Fu{
	
	int x = 10;

	String name;

	public Fu(String name){
		this.name = name;
		System.out.println("Fu��d���εĹ��췽��...");
	}

	public Fu(){
		System.out.println("Fu���޲εĹ��췽��...");
	}
}


class Zi extends Fu{

	int x = 20;

	public Zi(String name){
		super(name); //ָ�����ø���һ�������Ĺ��캯����
	}


	public void print(){
		System.out.println("x1 = "+ x);
	}

}


class Demo8 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi("��ͷ����"); 
		System.out.println("name= "+z.name);

	}
}
