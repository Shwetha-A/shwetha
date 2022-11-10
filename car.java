package car;

public class car {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			enum car1{renault(2020),ferrari(2019),rollsroyce(2022);
			private int value;  
			private car1(int value){  
			this.value=value;  
			}  
			}
			System.out.println("    Car Name\tModel Year");
			for(car1 c : car1.values())
				System.out.println("    "+c+"\t"+c.value);
		}
}
