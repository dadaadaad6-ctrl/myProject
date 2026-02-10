public class tictactoe {
	public static void main(String[] args) {
		if (args.length == 0) {
		 System.out.println("Hello, welcome to rock paper scissors game by Werz, please insert 1 as arg for rock, 2 for paper, 3 for scissors.");
		 return; }
		int arg1 = Integer.parseInt(args[0]);
		if (args.length == 1 && arg1 > 0 && arg1 < 4) {
			game(arg1);
		}
		else {
			System.out.println("Wrong way");
		}

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




