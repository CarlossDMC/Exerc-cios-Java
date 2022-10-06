import java.util.Scanner;

import entities.Student;

public class application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] rooms = new String[10];

		
		System.out.print("How many students are renting the rooms: ");
		int students = sc.nextInt();
		
		for(int i=0; i<students; i++) {
			System.out.println("-----------------------------------------");
			System.out.print("Enter your name: ");
			String name = sc.next();
			System.out.print("Enter your email: ");
			String email = sc.next();
			System.out.println("Enter the number of the room that you want rented: ");
			int room_number = sc.nextInt();
			System.out.println("-----------------------------------------");
			
			Student st = new Student(name, email, room_number);
			
			rooms[st.getRoom_number()] = st.getName();
			
			System.out.println("Update renteds: " + rooms[st.getRoom_number()]);
			System.out.println("Email: " + st.getEmail());
			System.out.println("Room number: " + st.getRoom_number());
			System.out.println("-----------------------------------------");
			
			
			for(int is=0; is<10; is++) {
				System.out.println(rooms[is]);
			}
			
			}
			sc.close();

		
		
		
		 
		 
		
		
		
		
		
	}

}
