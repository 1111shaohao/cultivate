package Memento;


/**
 * @author Lenovo
 * @version 1.0
 * @created 09-2��-2020 17:51:26
 */
public class Originator {
	private String state;
	public Memento m_Memento;
	public Originator(){
	}
	public void finalize() throws Throwable {

	}
	public Memento createMemento(){
		//����һ����¼�з����˳�̬�ı���¼����
//		Memento m1= new Memento(state);
		return new Memento(state);
	}
	public String getState(){
		return state;
	}
	/**
	 * 
	 * @param m
	 */
	//��ԭ״̬
	public void restoreMemento(Memento m){
		this.setState(m.getState());//m.getState()=S0
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(String state){
		this.state=state;
	}
}//end Originator�������ˣ�