public class tictactoe {
	static int arg1;
	public static void main(String[] args) {
		if (args.length == 0) {
		 System.out.println("Hello, welcome to rock paper scissors game by Werz, please insert rock as arg for rock, paper for paper, scissors for scissors.");
		 return; }
		String laugh = args[0];
		if (laugh.length() < 2) {
			System.out.println("Wrong way");
			return;
		}
		String answer = laugh.substring(0,1).toUpperCase() + laugh.substring(1);
		if ("Scissors".equals(answer))	 {
			arg1 = 3;
		} else if ("Paper".equals(answer)) {
			arg1 = 2; 
		} else if ("Rock".equals(answer)) {
			arg1 = 1; }
		  else {
			  System.out.println("Wrong way");
		  }
		game(arg1);

	}
	public static void game(int arg) {
		int result = (int) (Math.random() * 3) + 1;
		if (result == 1 && arg == 3) {
			System.out.println("You lose, computer chose rock.");
		}
		if (result == 2 && arg == 3) {
			System.out.println("You win, computer chose paper.");
		}
		if (result == 3 && arg == 3) {
			System.out.println("Tie, both chose scissors.");
		}
		if (result == 1 && arg == 2) {
			System.out.println("You win, computer chose rock.");
		}
		if (result == 2 && arg == 2) {
			System.out.println("Tie, both chose paper.");
		}
		if (result == 3 && arg == 2) {
			System.out.println("You lose, computer chose scissors."); }
		if (result == 1 && arg == 1) {
			System.out.println("Tie, both chose rock");
		}
		if (result == 2 && arg == 1) {
			System.out.println("You lose, computer chose paper");
		}
		if (result == 3 && arg == 1) {
			System.out.println("You win, computer chose scissors");
		}
	}
}




