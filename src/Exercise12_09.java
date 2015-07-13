import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DisplayCards extends JFrame implements ActionListener{
	
	static int cardA = 1 + (int)(Math.random() * 54);
	static int cardB = 1 + (int)(Math.random() * 54);
	static int cardC = 1 + (int)(Math.random() * 54);
	static int cardD = 1 + (int)(Math.random() * 54);
	static int cardE = 1 + (int)(Math.random() * 54);
	static int cardF = 1 + (int)(Math.random() * 54);

	//Create variables to store the random number for card 
	private ImageIcon firstCard = new ImageIcon("E:/Java Programs/Assignment5 Ch12/card/" + cardA + ".png");
	private ImageIcon secondCard = new ImageIcon("E:/Java Programs/Assignment5 Ch12/card/" + cardB + ".png");
	private ImageIcon thirdCard = new ImageIcon("E:/Java Programs/Assignment5 Ch12/card/" + cardC + ".png");
	private ImageIcon fourthCard = new ImageIcon("E:/Java Programs/Assignment5 Ch12/card/" + cardD + ".png");
	private ImageIcon fifthCard = new ImageIcon("E:/Java Programs/Assignment5 Ch12/card/" + cardE + ".png");
	private ImageIcon sixthCard = new ImageIcon("E:/Java Programs/Assignment5 Ch12/card/" + cardF + ".png");

	static int aValue = cardValue(cardA);
	static int bValue = cardValue(cardB);
	static int cValue = cardValue(cardC);
	static int dValue = cardValue(cardD);
	static int eValue = cardValue(cardE);
	static int fValue = cardValue(cardF);
	
	static int handOneValue = aValue + bValue + cValue;
	static int handTwoValue = dValue + eValue + fValue;
	
	String a = "Hand One wins!";
	String b = "Hand Two wins!";
	String c = "It's a tie!";
	
	
public static String winner(int handOneValue, int handTwoValue){
	
	String a = "Hand One wins!";
	String b = "Hand Two wins!";
	String c = "It's a tie!";
	if (handOneValue > handTwoValue){
		return a;
	}
	if (handTwoValue > handOneValue){
		return b;
	}
	else return c;
}
	
		
public DisplayCards(){
	
	super("Display three cards");
	
	setLayout( new FlowLayout(FlowLayout.CENTER, 10, 20));

    add( new JLabel(firstCard));
    add( new JLabel(secondCard));
    add( new JLabel(thirdCard));
    add( new JLabel("Total of 1st hand = " + handOneValue));
    add( new JLabel(fourthCard));
    add( new JLabel(fifthCard));
    add( new JLabel(sixthCard));
    add( new JLabel("Total of 2nd hand = " + handTwoValue));
    add( new JLabel(winner(handOneValue, handTwoValue)));

}

public static void main(String[] args) {
	
	DisplayCards frame = new DisplayCards();
	frame.setTitle("Display Hands");
	frame.setSize(850,200);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setResizable(false);

    System.out.println("Card 1 = " + aValue);
    System.out.println("Card 2 = " + bValue);
    System.out.println("Card 3 = " + cValue);
    System.out.println("Hand one equals " + handOneValue + ".");
    System.out.println();
    System.out.println("Card 4 = " + dValue);
    System.out.println("Card 5 = " + eValue);
    System.out.println("Card 6 = " + fValue);
    System.out.println("Hand two equals " + handTwoValue + ".");
    System.out.println();
    System.out.print(winner(handOneValue, handTwoValue));

}
public void actionPerformed(ActionEvent arg0) {
		
}

public static int cardValue(int card){
	
	if (card > 52){
		card = 0;
		return 0;
	}
	
	while (card > 13){
		card = card - 13;
	}
	if (card > 10){
		card = 10;
	}
	return card;
}

}