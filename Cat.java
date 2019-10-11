public class Cat extends Animal{

	//重写
	public void eat(){
		System.out.println("猫吃鱼");
	}
	
	//Cat特有的方法.
	public void move(){
		System.out.println("猫走猫步！");
	}
}