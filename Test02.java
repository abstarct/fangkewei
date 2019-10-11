
/*
	����java����������ת�ͺ�����ת��
		1.����ת��(upcasting) :  ��--->��
		2.����ת��(downcasting) :  ��--->��
	
	ע�⣺����������ת�ͻ�������ת�ͣ�������֮�����Ҫ�м̳й�ϵ��
*/
public class Test02{
	
	public static void main(String[] args){
		
		//����ת���ֱ��������Զ�����ת��.
		//�����͵�����ָ�������Ͷ���.
		//����������׶Σ�����׶Σ����н׶Ρ�
		//�������׶�ֻ֪��a1��һ��Animal���͡�
		//���������е�ʱ����е�ʵ�ʶ�����Cat���͡�
		Animal a1 = new Cat();	
		
		//�����ڱ���׶�a1������������Animal����.
		//���Գ����ڱ���׶�a1���ð󶨵���Animal���е�eat����.(��̬��)
		//���������е�ʱ����еĶ���ʵ������Cat���ͣ���Cat�Ѿ���д��eat������
		//���Գ��������н׶ζ���İ󶨵ķ�����Cat�е�eat����.(��̬��)
		a1.eat(); //è����
		
		
		//����ת�ͣ�ǿ������ת��
		Animal a2 = new Cat(); //����ת��.
		
		//Ҫִ��move����,��ô����
		//ֻ��ǿ������ת��,��Ҫ��ǿ������ת����
		Cat c1 = (Cat)a2;
		
		c1.move();
		
		
		//�ж����³������е�ʱ����ʲô���⣿
		//Animal a3 = new Dog(); //����ת��.
		
		//ǿ������ת��
		//Cat c2 = (Cat)a3; // java.lang.ClassCastException
		
		
		//����ǿ������ת����ʱ������Ǵ��ڷ��յģ�
		//Ϊ�˱���ClassCastException�ķ�����java������ instanceof
		/*
			�÷���
				1. instanceof��������������� boolean���� 
				2. (���� instanceof ����) --> true/false
				
				���磺(a instanceof Cat) ��������true��ʾ��a����ָ����е�java������Cat����.
		*/
		Animal a3 = new Dog();
		
		System.out.println(a3 instanceof Cat); //false
		
		//�Ƽ�����������ת�͵�ʱ��Ҫʹ��instanceof������жϣ�����ClassCastException
		if(a3 instanceof Cat){
			Cat c2 = (Cat)a3;
		}
		
		
		
	}
}