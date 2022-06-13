package vttp2022.workshop;

import javax.sound.sampled.SourceDataLine;

public class DeckOfCards {
    
    public static void main(String[] args) {

        String[] suit = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] deck = new String[52]; 

        for (int i = 0; i < deck.length; i++) {
              deck[i] = rank[i%13] + suit[i/13];
            }

            //Shuffle the deck
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random()*deck.length);

            String tempCard = deck[i];
            deck[i] = deck[index]; 
            deck[index] = tempCard; 
        }

            //Print the shuffled deck 
        for (String u: deck) {
            System.out.println(u);
        }
    }
}
