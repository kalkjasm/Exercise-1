/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        Random rand=new Random();
        Card[] magicHand = new Card[7];
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int random_value=rand.nextInt(13)+1;
            c.setValue(random_value);
            int random_suite=rand.nextInt(4);
            c.setSuit(Card.SUITS[random_suite]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])    
            magicHand[i]=c;
        }
        System.out.println("7 cards from which you can choose are:");
        for(Card m:magicHand){
            System.out.println(m.getSuit()+" "+m.getValue());
        }
        
        System.out.print("Enter the Card Value from 1-13: ");
        int value_choice=k.nextInt();
//        System.out.println();
        System.out.print("Card Suit options are: \n1.Hearts \n2.Diamonds \n3.Spade \n4.Club \nEnter an option for suit from 1-4: ");
        int suit_choice=k.nextInt()-1;
        Card user_card=new Card();
        user_card.setValue(value_choice);
        user_card.setSuit(Card.SUITS[suit_choice]);
        boolean card_found = false;
        Card luckyCard=new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Cards.SUITS[3]);
        for(Card c :magicHand ) {
            if(user_card.getValue()==c.getValue() &&  user_card.getSuit()==c.getSuit()){
                card_found=true;
         }
        }
        if(card_found==true)
            System.out.println("The card is in the magic hand"); 
        else
          System.out.println("The card was not found in the magic hand");  
        k.close();
        
       
        
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
