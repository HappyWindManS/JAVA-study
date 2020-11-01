package com.mr.chapter04;

//定义了Animal接口
interface Animal14{
	int ID = 1;     //定义全局常量
	void breathe(); //定义抽象方法breathe
	//定义一个默认方法
	default void getType(String type) {
		System.out.println("该动物属于："+type);
	}
	//定义一个默认方法
	static int getID() {
		return Animal14.ID;
	}
}
//定义了LandAnimal接口，并继承了Animal接口
interface LandAnimal14 extends Animal14{
	void run();//定义抽象方法run（）
}
//Dog类实现了LandAnimal接口
class Dog14 implements LandAnimal14{
	//实现dreathe（）方法
	public void breathe() {
		System.out.println("狗在呼吸");
	}
	//实现run（）方法
	public void run() {
		System.out.println("狗在陆地上跑");
	}
}
//定义测试类
public class Ex14 {
	public static void main(String[] args) {
		System.out.println(Animal14.getID());//通过接口名调用类方法
		Dog14 dog = new Dog14();             //创建Dog类的实例对象
		System.out.println(dog.ID);          //在实现类中获取接口全局常量
		dog.breathe();                       //调用dog对象的breathe()方法
		dog.getType("犬科");                  //调用dog对象，调用接口默认值
		dog.run();
	}
}
