package com.java;

/**
 * ����è��
 * 
 * @author imooc
 *
 */
//static+��--��������

public class Cat {
	
	public void z() {
		System.out.println(2);
	}
	static int i=2;
	static class Zz {
		int i=1;
		public static void x() {
			new Zz().z();
		}
		public void z() {
			System.out.println(Cat.i);
			
		}
	}
	
	
	// ��Ա���ԣ��ǳơ����䡢���ء�Ʒ��
	// �޸����ԵĿɼ���---private �޶�ֻ���ڵ�ǰ���ڷ���
	private String name;// �ǳ� String����Ĭ��ֵnull
	private int month;// ���� int����Ĭ��ֵ0
	private double weight;// ���� double����Ĭ��ֵ0.0
	private String species;// Ʒ��

	//static: ��̬ ��̬��Ա�����Ա
	//static+����--����̬���ԡ�������
	private static int price;//�ۼ�
	
	
	public static int getPrice() {
		return price;
	}

	public  void setPrice(int price) {
		this.price = price;
	}

	static{
		System.out.println("���Ǿ�̬�����1");
	}//��̬�����
	
	//���췽��
	public Cat() {
		//static+�����ڵľֲ�����--��������
//		static int temp=14;
		System.out.println("���ǳ���è~~");
	}

	public Cat(int month) {
		// this.month=month;
		this.setMonth(month);
	}

//	{
//		name="��";
//		price=130;
//		System.out.println("���ǹ�������1");
//	}//��������
//	
	
	static{
		price=290;
		Cat temp=new Cat();
		temp.name="С��";
		System.out.println("���Ǿ�̬�����2");
	}//��̬�����
	
	// ����get/set����
	// ��get/set��������Ӷ����Ե��޶�
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return "����һֻ���У�" + this.name + "�ĳ���è";
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month <= 0)
			System.out.println("������Ϣ���󣬳���è������������0");
		else
			this.month = month;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	// ��Ա�������ܶ����Զ���
	// �ܶ��ķ���
	//�ڳ�Ա�����У�����ֱ�ӷ������о�̬��Ա
	public void run() {
		eat();
		this.name="��";
		this.price=20;
		System.out.println("�ۼ���"+Cat.price+"��"+this.name+"����");
	}

	public void run(String name) {
		
		int temp=14;
		{
//			int temp=12;
			System.out.println("������ͨ�����1��temp="+temp);
		}//��ͨ�����
		

		System.out.println(name + "����,temp="+temp);
		
		{
//			int temp=13;
			System.out.println("������ͨ�����2��temp="+temp);
		}//��ͨ�����
	}

	// �Զ����ķ���
	//static+����--���෽������̬����
	public static void eat() {
		//��̬�����в���ֱ�ӷ���ͬһ�����еķǾ�̬��Ա��ֻ��ֱ�ӵ���ͬһ�����еľ�̬��Ա
		//ֻ��ͨ������ʵ�����󣬶���.��Ա�����ķ�ʽ���ʷǾ�̬��Ա
		Cat temp=new Cat();
		temp.run();
		temp.name="С��";//��̬�����в���ʹ��this
//		temp.name="С��";
		price=1500;
		System.out.println("Сè����");
	}
}
