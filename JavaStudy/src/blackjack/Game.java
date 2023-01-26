package blackjack;

import java.util.Scanner;

public class Game {
	
	public static void gameInfo(Card[] user, Card[] dealer) {
		System.out.println("- User");
		for (int i = 0; i < user.length && user[i] != null; ++i) {
			Card c = user[i];
			System.out.printf("[%c%s] ", Card.shapes[c.shape], Card.ranks[c.rank]);
		}
		System.out.printf("(%d)", BlackJack.getValue(user));
		System.out.println();
		System.out.println();
		
		System.out.println("- Dealer");
		for (int i = 0; i < dealer.length && dealer[i] != null; ++i) {
			Card c = dealer[i];
			if (!c.hidden) {				
				System.out.printf("[%c%s] ", Card.shapes[c.shape], Card.ranks[c.rank]);
			} else {
				System.out.println("[XX]");
			}
		}
		System.out.println();
	}
	
	public Game() {
		
		Deck d = new Deck(3);
		
		// A만 21개를 뽑았을 때 최대 21개
		Card[] user = new Card[21];
		Card[] dealer = new Card[21];
		
		System.out.println("유저에게 두장");
		user[0] = d.draw();
		user[1] = d.draw();
		
		System.out.println("딜러에게 두장");
		dealer[0] = d.draw();
		Card c = d.draw();
		c.hide();
		dealer[1] = c;
		
		Scanner sc = new Scanner(System.in);
		int userIndex = 2;
		int dealerIndex = 2;
		
		while(true) {
			gameInfo(user, dealer);
			System.out.println("1. hit\t2.stand");
			int hit = sc.nextInt();
			
			if (hit == 1) {
				user[userIndex++] = d.draw();
				
				if (BlackJack.getValue(user) > 21) {
					System.out.println("플레이어 버스트...");
					return;
				} else if (BlackJack.getValue(user) == 21) {
					while (BlackJack.getValue(dealer) <= 16) {
						dealer[1].open();
						dealer[dealerIndex++] = d.draw();
					}
					break;
				}
				
			} else if (hit == 2) {
				dealer[1].open();
				while (BlackJack.getValue(dealer) <= 16) {
					dealer[dealerIndex++] = d.draw();
				}
				break;
			} else {
				continue;
			}
			
		}
		
		int userValue = BlackJack.getValue(user);
		int dealerValue = BlackJack.getValue(dealer);
		gameInfo(user, dealer);
		
		if (dealerValue > 21) {
			System.out.printf("%d(user) vs %d(dealer) 딜러의 버스트로 유저 승!!\n", userValue, dealerValue);
		} else if (userValue == dealerValue) {
			System.out.printf("%d(user) vs %d(dealer)로 무승부\n", userValue, dealerValue);
		} else if (userValue > dealerValue) {
			System.out.printf("%d(user) vs %d(dealer)로 유저 승!!\n", userValue, dealerValue);
		} else {
			System.out.printf("%d(user) vs %d(dealer)로 딜러 승!!\n", userValue, dealerValue);
		}

		
	}

}
