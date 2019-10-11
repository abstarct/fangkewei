
public class Test02{
	
	public static void main(String[] args){
		
		Animal a1 = new Cat();	
		
		a1.eat(); //猫吃鱼
		
		Animal a2 = new Cat(); //向上转型.

		Cat c1 = (Cat)a2;
		
		c1.move();
		
		Animal a3 = new Dog();
		
		System.out.println(a3 instanceof Cat); //false
		
		if(a3 instanceof Cat){
			Cat c2 = (Cat)a3;
		}
		
	}
}
