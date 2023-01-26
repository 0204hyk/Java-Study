package blackjack2;

import java.util.Scanner;

public class Game {
	
	static public void gameInfo(Card[] user, Card[] dealer) {
		System.out.println("------ 유저 ------");
		for (int i = 0; i < user.length && user[i] != null; ++i) {
			Card c = user[i];
			System.out.printf("[%c%s]", Card.shapes[c.shape], Card.ranks[c.rank]);
		}
		System.out.printf("(%d)", Card.getValue(user));
		System.out.println();
		System.out.println();
		
		System.out.println("------ 딜러 ------");
		for (int i = 0; i < dealer.length && dealer[i] != null; ++i) {
			Card c = dealer[i];
			if (!c.hidden) { 
				System.out.printf("[%c%s]", Card.shapes[c.shape], Card.ranks[c.rank]);				
			} else {
				System.out.println("[XX]");
			}
		}
		System.out.println();
	}
	
	public Game() {
		Deck deck = new Deck();
		
		Card[] user = new Card[21];
		Card[] dealer = new Card[21];
		
		user[0] = deck.draw();
		user[1] = deck.draw();
		
		dealer[0] = deck.draw();
		Card c = deck.draw();
		c.hide();
		dealer[1] = c;
		
		if (Card.getValue(user) == 21 && Card.getValue(dealer) != 21) {
			dealer[1].open();
			gameInfo(user, dealer);
			System.out.println("=================");
			System.out.println("플레이어 블랙잭!");
			return;
		} else if (Card.getValue(dealer) == 21 && Card.getValue(user) != 21) {
			dealer[1].open();
			gameInfo(user,dealer);
			System.out.println("=================");
			System.out.println("딜러 블랙잭!");
			return;
		}
		
		
		Scanner sc = new Scanner(System.in);
		int userIndex = 2;
		int dealerIndex = 2;
		
		while(true) {
			gameInfo(user, dealer);
			System.out.println("1. Hit\t2.Stand");
			int hit = sc.nextInt();
			
			if (hit == 1) {
				user[userIndex++] = deck.draw();
				if (Card.getValue(user) > 21) {
					gameInfo(user, dealer);
					System.out.println("플레이어 버스트로 패배");
					return;
				} else if (Card.getValue(user) == 21) {
					dealer[1].open();
					while (Card.getValue(dealer) <= 16) {
						dealer[dealerIndex++] = deck.draw();
					}
					break;
				}
				
			} else if (hit == 2) {
				dealer[1].open();
				while (Card.getValue(dealer) <= 16) {
					dealer[dealerIndex++] = deck.draw();
				}
				break;
			} else {
				continue;
			}
		}
		gameInfo(user, dealer);
		
		int userValue = Card.getValue(user);
		int dealerValue = Card.getValue(dealer);
		
		System.out.println("=====================");
		if (dealerValue > 21) {
			System.out.printf("플레이어(%d) vs 딜러(%d)\n딜러 버스트로 패배\n", userValue, dealerValue);
		} else if (userValue == dealerValue) {
			System.out.printf("플레이어(%d) vs 딜러(%d)\n무승부!\n", userValue, dealerValue);
		} else if (userValue > dealerValue) {
			System.out.printf("플레이어(%d) vs 딜러(%d)\n플레이어 승리!\n", userValue, dealerValue);
		} else {
			System.out.printf("플레이어(%d) vs 딜러(%d)\n딜러 승리!\n", userValue, dealerValue);
		}
		
	}
}

