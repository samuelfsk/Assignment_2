import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;

public class Birthday {

	public static void main(String[] args) {
		String j="";
		double total=0;
		String name="";

		JOptionPane.showMessageDialog(null, "Welcome to the toy company to \n choose a toy for young children.");
		do {
			name = JOptionPane.showInputDialog("Enter name of the child :");
			Toy a = new Toy();
			int b = Integer.parseInt( JOptionPane.showInputDialog("How old is " + name +"?"));
			do {
				String c =JOptionPane.showInputDialog("Choose a toy: a plushie, blocks or a book");
				a.setAge(b);
				a.setToy(c);
				a.setCost(c);
				if (a.getToy().equals("")){
					JOptionPane.showMessageDialog(null, "Invalid toy name ! please try again");

				}
			}while(a.getToy().equals(""));
			if (a.ageOK()== false) {
				String f;
				f= JOptionPane.showInputDialog("Toy is not age-appropriate \n do you want to choose another Toy(yes/no)");
				if (f.equalsIgnoreCase("no")) {
					JOptionPane.showMessageDialog(null, "okay you may continue");
				}
				if (f.equalsIgnoreCase("yes")) {
					name = JOptionPane.showInputDialog("Enter name of the child :");
					b = Integer.parseInt( JOptionPane.showInputDialog("How old is " + name +"?"));
					do {
						String c =JOptionPane.showInputDialog("Choose a toy: a plushie, blocks or a book");
						a.setAge(b);
						a.setToy(c);
						a.setCost(c);
						if (a.getToy().equals("")){
							JOptionPane.showMessageDialog(null, "invalid toy name ! please try again");
						}
					}while(a.getToy().equals(""));
				}

			}
			else {
				JOptionPane.showMessageDialog(null, "Good choice!");
			}
			int x=1;
			int y=1;
			String add="";
			add=JOptionPane.showInputDialog("Do you want to add a card (yes/no) :");
			a.addCard(add);
			if (add.equalsIgnoreCase("yes")) {
				x=0;
			}
			add=JOptionPane.showInputDialog("Do you want to add a ballon (yes/no) :");
			a.addBalloon(add);
			if (add.equalsIgnoreCase("yes")) {
				y=0;
			}
			if (x==0 && y==0) {
				JOptionPane.showMessageDialog(null,"The toy for "+ name + a.toString() + "\n (This cost includes the cost of card and ballon)");	
			}
			if (x==1 && y==0) {
				JOptionPane.showMessageDialog(null,"The toy for "+ name + a.toString() + "\n (This cost includes the cost of the ballon) ");	

			}
			if (x==0 && y==1) {
				JOptionPane.showMessageDialog(null,"The toy for "+ name + a.toString() + "\n (This cost includes the cost of the card) ");	

			}
			if (x==1 && y==1){
				JOptionPane.showMessageDialog(null,"The toy for "+ name + a.toString());
			}
			j=JOptionPane.showInputDialog("Do you want to continue? (yes/no)");
			total=total+a.getCost();


		} while(j.equalsIgnoreCase("Yes"));
		Random r = new Random();
		DecimalFormat df = new DecimalFormat("$0.00");
		JOptionPane.showMessageDialog(null, "The total cost for your order is " + df.format(total)+ "\n your order number is: " + r.nextInt(10000)+1 +
				"\n Programmer: Samuel Hailemichael");









	}
}

