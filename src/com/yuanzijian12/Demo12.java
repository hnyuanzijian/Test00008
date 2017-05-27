package com.yuanzijian12;
class Animal{

	String name;

	String color;

	public Animal(String name, String color){
		this.name = name;
		this.color = color;
	}
}

//狗是属于动物中一种
class Dog extends Animal {

	public Dog(String name,String color){
		super(name,color); //指定调用父类两个 参数的构造函数。
	}

	public void bite(){
		System.out.println(name+"咬人!!");
	}
}

//老鼠 也是属于动物中一种
class Mouse extends  Animal{
	
	public Mouse(String name,String color){
		super(name,color);
	}
	
	public void dig(){
		System.out.println(name+"打洞..");
	}

}

class Demo12{

	public static void main(String[] args) 
	{
		Dog d = new Dog("哈士奇","白色");
		System.out.println("狗是狗类吗？"+ (d instanceof Dog));
		System.out.println("狗是动物类吗？"+ (d instanceof Animal));	
		//System.out.println("狗是老鼠类吗？"+ (d instanceof Mouse));		// false true
		
		Animal a = new Animal("狗娃","黄色"); //狗娃是人
		System.out.println("动物都是狗吗？"+ (a instanceof Dog));


	}
}

