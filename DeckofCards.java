import java.util.Random;
import java.util.*;

public class DeckofCards 
{
	private Card[] deck;
	private int currentCard;
	private static final int NUM_DE_CARTA = 52;
	private static final Random randomnum = new Random();
	int second;
	int count;
	int first;

	public DeckofCards()
	{
		String faces[] = {"Ás","Dóis","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Dama","Reis"};
		String suits[] = {"Copas","Ouros","Paus","Espadas"};

		deck = new Card[NUM_DE_CARTA];
		currentCard = 0;

		for (count = 0;count < deck.length;count++) 
		{
			deck[count] = new Card(faces[count % 13], suits[count / 13]);				
		}
	}

	public void shuffle()
	{
		currentCard = 0;

		for (first = 0;first < deck.length;first++) 
		{
			second = randomnum.nextInt(NUM_DE_CARTA);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;		
		}		
	}

	public Card dealcard()
	{
		if (currentCard	< deck.length) 
		{
			return deck[currentCard++];	
		}

		else
		{
			return null;
		}
	}
}