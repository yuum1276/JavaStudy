package javastudy;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ū �� ���ϱ�
		int x, y, max;
		
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° ����: ");
		
		x = input.nextInt();
		
		System.out.println("�ι�° ����: ");
		y = input.nextInt();
		
		if(x > y) {
			max = x;
		}else {
			max = y;
		}
		
		System.out.println("ū ���� " + max);
		


	}

}