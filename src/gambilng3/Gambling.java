package gambilng3;

public class Gambling {

	int everyday_stack = 100;
	int bet_for_every_game = 1;
	int days_won;
	int days_lost;
	int profit;
	int loss;
	int day;
	int max_days = 30;

	void game() {

		while (day < max_days) {
			while (everyday_stack > 50 && everyday_stack < 150) {

				int check = (int) (Math.random() * 10) % 2;

				if (check == 0) {
					everyday_stack++;
					days_won++;

				} else {
					everyday_stack--;
					days_lost--;

				}
				if (everyday_stack > 100) {
					System.out.println("bet won");
					profit = everyday_stack - 100;
					if (profit == 50) {
						System.out.println("Luckeist day");
					}
				} else {
					loss = 100 - everyday_stack;
					if (loss == 50) {
						System.out.println("Unluckeist day");
					}
				}

			}
			day++;
			System.out.println("Total profit in day  " + day + " is " + everyday_stack);
		}

	}

	public static void main(String[] args) {
		Gambling o = new Gambling();
		o.game();
	}

}
