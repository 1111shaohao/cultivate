package Memento;
/**
 * @author Lenovo
 * @version 1.0
 * @created 09-2��-2020 17:51:26
 */
public class MementoPattern {
	public MementoPattern(){
	}
	public static void main(String[] args) {
		Originator or = new Originator();
		Caretaker cr= new Caretaker();
		//���÷�����or�������ĳ�̬ΪS0
		or.setState("S0");
		System.out.println("��ʼ״̬��"+or.getState());
		//����״̬
		//or.createMemento() ��¼��s0״̬�ı���¼����
		cr.setMemento(or.createMemento());
		//�����ʼ̬
		or.setState("S1");
		System.out.println("�µ�״̬��"+or.getState());
		//�ָ�״̬
		or.restoreMemento(cr.getMemento());
		//or��״̬�ֱ�ΪS0
		System.out.print("�ָ�״̬��"+or.getState());
	}
}//end MementoPattern