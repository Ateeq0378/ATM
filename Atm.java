import java.util.*;
class Process{
	int balance=10000, withdrawal, deposit, action,pin,p;
	int arr[][]={{1,2,3},{4,5,6},{7,8,9},{0,0,0}};
	Scanner sc = new Scanner(System.in);
	void setpin(){
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Please enter four digit PIN");
		pin=sc.nextInt();
		if(pin>=1111&&pin<=9999)
			System.out.println("Your PIN generated successfully");
		else{
			System.out.println("You can't enter less than or more than four digit");
			setpin();
		}
	}
	void enterpin(){
		System.out.println("Please enter your four digit PIN");
		p=sc.nextInt();
	}
	void atmmachine(){
		System.out.println("First of all generate a PIN. If you don't generate PIN, you can't do any thing");
		while(true){
			System.out.println("Enter :-1 for Check Balance");
			System.out.println("Enter :-2 for Withdrawal");
			System.out.println("Enter :-3 for Deposit");
			System.out.println("Enter :-4 for Generate PIN");
			System.out.println("Enter :-5 for Cancle");
			action = sc.nextInt();
			switch(action)
			{
				case 1:
					enterpin();
					if(p==pin){
						System.out.println("Your balance is :"+balance+"Rs.");
					}
					else{
						System.out.println("Wrong PIN");
					}
					break;
				case 2:
					enterpin();
					if(p==pin){
						System.out.println("Enter the amount that you want to withdrawal");
						withdrawal = sc.nextInt();
						if(withdrawal <= balance){
							balance-=withdrawal;
							System.out.println("Your Amount are successfully withdrawal");
							System.out.println("Please collect your cash");
							System.out.println("Your available balance is :"+balance+"Rs.");
						}
						else
							System.out.println("You have no sufficient balance");
					}
					else{
						System.out.println("Wrong PIN");
					}
					break;
				case 3:
					enterpin();
					if(p==pin){
						System.out.println("Enter the amount that you want to deposit");
						deposit=sc.nextInt();
						balance+= deposit;
						System.out.println("Your Amount are successfully deposit");
						System.out.println("Your available balance is :"+balance+"Rs.");
					}
					else{
						System.out.println("Wrong PIN");
					}
					break;
				case 4:
					System.out.println("Please Generate your PIN");
					setpin();
					break;
				case 5:
					System.exit(0);
				default:
				System.out.println("Invalid choice");
			}
		}
	}
}
class Atm{
	public static void main(String[] args) {
		Process ss = new Process();
		ss.atmmachine();
	}
}