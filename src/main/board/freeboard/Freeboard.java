package main.board.freeboard;

import java.util.ArrayList;
import java.util.Scanner;

public class Freeboard {
	ArrayList<String> titel = new ArrayList<String>();
	ArrayList<String> inhalt = new ArrayList<String>();
	ArrayList<String> writer = new ArrayList<String>();
	ArrayList<String> number = new ArrayList<String>();
	ArrayList<ArrayList<String>> main = new ArrayList<ArrayList<String>>();

	Scanner sc = new Scanner(System.in);
	
	//�޴�ȭ��
	public Freeboard() {
		main.add(titel);
		main.add(inhalt);
		main.add(writer);
		main.add(number);
		
		titel.add("����			");
		inhalt.add("����			");
		writer.add("�۾���			");
		number.add("��ȣ			");
	}
	
	//���� ����: �Ű������� ���ڿ����� ������ �´� arrayList�� �߰�
	void save() {
		this.titel.add(getTitel());
		this.inhalt.add(getInhalt());
		this.writer.add(getWriter());
		this.number.add(getNumber());
	}
	
	String getTitel() {
		System.out.println("����: ");
		return sc.nextLine();
	}
	String getInhalt(){
		System.out.println("����: ");
		return sc.nextLine();
	}
	String getWriter() {
		System.out.println("�۾���: ");
		return sc.nextLine();
	}
	String getNumber() {
		int size = main.get(0).size()-2;
		String nr = Integer.toString(++size);
		return nr;
	}
	
	//��ü ��ȸ
	void print() {	
		/*j�� i�� ������ �ٲ� ����:
		 ������ ������ �� ��� ���ʺ��� ù�ٿ� �޴��ٰ� ����� ������ �������� ������� �� �κ��� ������ ��µȴ�.
		 ���� �ึ�� ������ �κ��� ��µǱ� ���ؼ� �ٲپ���.
		  */
		for(int j = 0; j<main.get(0).size(); j++) {
			for(int i = 0; i<main.size(); i ++)
			System.out.print(main.get(i).get(j) + " ");
			System.out.println();
			}
		System.out.println();
		
	}
	void editl() {
		System.out.println("��� �Խù��� �����Ͻðڽ��ϱ�?");
		int z = sc.nextInt();
		titel.remove(z);	// ���� �ʿ�
		
	}
	
	void remove() {
		System.out.println("��� �Խù��� �����Ͻðڽ��ϱ�?");
		int z = sc.nextInt();
		titel.remove(z);
		
	}
	
	void exit() {
		System.out.println("�������� �̵��մϴ�.");
		System.exit(0);
	}
}