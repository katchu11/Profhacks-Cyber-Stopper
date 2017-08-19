//@author = HackPirateers

//Please note that there will be offensive language in the code.

import java.awt.BorderLayout;



import java.awt.event.ActionEvent;



import java.awt.event.ActionListener;



import java.lang.reflect.Array;



import java.util.Arrays;



import javax.swing.*;



public class CyberStopper extends javax.swing.JApplet	{

	public static String getString( String s  )

	{

		String input = JOptionPane.showInputDialog( s, "Put your post here...");

		return input;

	}
	static String[] b;
	static String s = "";

	static boolean x = false;

static String bad = " ";

	public static void main(String[] args) {


		JFrame fr = new JFrame("Warning!");



		fr.setSize(720, 300);



		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		fr.setResizable(true);



		fr.setLocation(600, 600);



		JLabel label = new JLabel(" Are you sure you want to send this? " );



		JPanel panel = new JPanel();



		// panel.setLayout(null/*new BorderLayout()*/);



		panel.setBounds(360, 150, 100, 60);



		fr.add(panel);



		panel.add(label);



		// panel.add(label2);



		JButton button = new JButton("Close");



		button.setLayout(null);



		button.setBounds(50, 170, 100, 60);



		JButton button2 = new JButton("Change");



		button2.addActionListener(e -> System.exit(0));



		button2.setLayout(null);



		button2.setBounds(450, 170, 100, 60);



		// button.setBounds(0, 500, 100, 100);



		panel.add(button/* , BorderLayout.WEST */);



		panel.add(button2/* , BorderLayout.EAST */);



		button.addActionListener(e -> System.exit(0));



		button.addActionListener(new ActionListener() {



			public void actionPerformed(ActionEvent arg0) {



				// JOptionPane.showMessageDialog(fr.getComponent(0), s);



				JOptionPane.showMessageDialog(fr.getComponent(0),

						"You Entered The Following Harmfull Word(s) : " + bad  + "\nIn the message '"+ s +  "'\n(Someone may feel potentially depressed by your words...)");



				// JOptionPane.showMessageDialog(fr.getComponent(0), "(Someone

				// was potentially harmed by your words...)");



				// System.out.println(s);



				// System.out.println("(Someone was potentially harmed by your

				// words...)");



			}



		});



		button2.addActionListener(null);



		// makes String input into array of words using reg(ular) expressions



		s = CyberStopper3.getString("Please enter a message without / or other special characters.");



		String[] words = s.split("\\s+");



		for (int i = 0; i < words.length; i++) {



			words[i] = words[i].replaceAll("[^\\w]", "");



		}



		// System.out.println(Arrays.toString(words));



		// Blacklists some words in array, sets window visible



		for (int i = 0; i < words.length; i++) {



			// Copy This for more words, modify word "die" and then add bracket

			// at end of code:



			if (words[i].equals("die") || words[i].equals("Die")) {





				/*	x = true;

}

else{

x = false;

}*/
				bad = "die " + bad;;
				fr.setVisible(true);

			}



			if (words[i].equals("kill") || words[i].equals("Kill")) {


				bad = "kill " + bad;
				fr.setVisible(true);

			}
			if (words[i].equals("bitch") || words[i].equals("Bitch")) {


				bad = "kill " + bad;
				fr.setVisible(true);

			}





			/*	x = true;

}

else{

x = false;

}*/



			if (words[i].equals("kys") || words[i].equals("Kys")) {






				bad = "kys "+ bad;
				fr.setVisible(true);

			}

			/*	x = true;

}

else{

x = false;

}*/



			if (words[i].equals("ugly") || words[i].equals("Ugly")) {


				bad = "ugly " + bad;
				fr.setVisible(true);

			}





			/*	x = true;

}

else{

x = false;

}*/

			if (words[i].equals("stupid") || words[i].equals("Stupid")) {

				bad = "stupid " + bad;



				fr.setVisible(true);

			}





			/*	x = true;

}

else{

x = false;

}*/



			if (words[i].equals("crap") || words[i].equals("Crap")) {

				bad = "crap " + bad;



				fr.setVisible(true);

			}





			/*	x = true;

}

else{

x = false;

}*/



			if (words[i].equals("hate") || words[i].equals("Hate")) {

				bad = "hate " + bad;



				fr.setVisible(true);

			}



			/*	x = true;

}

else{

x = false;

}*/



			if (words[i].equals("shit") || words[i].equals("Shit")) {

				bad = "shit " + bad;





				fr.setVisible(true);

			}



			/*	x = true;

}

else{

x = false;

}*/



			if (words[i].equals("nigga") || words[i].equals("Nigga")) {

				bad = "nigga " + bad;



				fr.setVisible(true);

			}

			if (words[i].equals("nigger") || words[i].equals("Nigger")) {

				bad = "nigger " + bad;



				fr.setVisible(true);

			}



			/*	x = true;

}

else{

x = false;

}*/



			if (words[i].equals("gay") || words[i].equals("Gay")) {

				bad = "gay " + bad;





				fr.setVisible(true);

			}



			/*	x = true;

}

else{

x = false;

}*/



			// if

			// (words[i].equals("gay")

			// ||

			// words[i].equals("Gay")) {



			// fr.setVisible(true);



			if (words[i].equals("fuck") || words[i].equals("Fuck")) {

				bad = "fuck " + bad;



				fr.setVisible(true);

			}



			/*	x = true;

}

else{

x = false;

}*/



			if (words[i].equals("fuckyou") || words[i].equals("Fuckyou") || words[i].equals("FuckYou")) {

				bad = "fuck you " + bad;


				fr.setVisible(true);

			}


			if (words[i].equals("fucking") || words[i].equals("Fucking")) {

				bad = "fucking " + bad;



				fr.setVisible(true);

			}


			/*	x = true;

}

else{

x = false;

}*/



			if (words[i].equals("fu") || words[i].equals("Fu") || words[i].equals("FU")) {

				bad = "fu" + bad;


				fr.setVisible(true);

			}





			/*	x = true;

}

else{

x = false;

}*/

			if (words[i].equals("fucktard")

					|| words[i].equals("Fucktard")

					|| words[i].equals("FuckTard")) {

				bad = "fucktard " + bad;



				//JOptionPane.showMessageDialog(fr.getComponent(0),

				//	"fucktard");

				fr.setVisible(true);

			}



			/*	x = true;

}

else{

x = false;

}*/

			if (words[i].equals("fucktards")

					|| words[i].equals("Fucktards")

					|| words[i].equals("FuckTards")) {

				bad = "fucktards " + bad;


				fr.setVisible(true);

			}

			if (words[i].equals("loser")

					|| words[i].equals("Loser")) {

				bad = "loser " + bad;



				fr.setVisible(true);

			}

			if (words[i].equals("nerd")

					|| words[i].equals("nerd")) {

				bad = "nerd " + bad;


				fr.setVisible(true);

}

			if (words[i].equals("fatass")

					|| words[i].equals("fatass")) {

				bad = "fatass " + bad;

				fr.setVisible(true);

			}



			if (words[i].equals("emo")

					|| words[i].equals("Emo")) {

				bad = "emo " + bad;



				fr.setVisible(true);

			}




			if (words[i]

					.equals("motherfucker")

					|| words[i].equals(

							"Motherfucker")) {

				bad = "motherfucker " + bad;


				fr.setVisible(true);

			}

			if (words[i].equals("queer")

					|| words[i].equals(

							"Queer")) {

				bad = "queer " + bad;



				//JOptionPane

				//.showMessageDialog(

				//	fr.getComponent(

				//	0),

				//	"queer");

				fr.setVisible(true);

			}

			if (words[i]

					.equals("lesbian")

					|| words[i]

							.equals("Lesbian")) {

				bad = "lesbian " + bad;



				fr.setVisible(true);

			}

			if (words[i]

					.equals("dick")

					|| words[i]

							.equals("Dick")) {

				bad = "dick " + bad;



				fr.setVisible(true);

			}

			if (words[i]

					.equals("sucker")

					|| words[i]

							.equals("Sucker")) {

				bad = "sucker " + bad;

				fr.setVisible(true);

			}

			if (words[i]

					.equals("suicide")

					|| words[i]

							.equals("Suicide")) {

				bad = "suicide " +", "+ bad;


				fr.setVisible(true);

			}

			if (words[i]

					.equals("sped")

					|| words[i]

							.equals("Sped")) {

				bad = "sped " + bad;



				fr.setVisible(true);

			}



			if (words[i]

					.equals("assface")

					|| words[i]

							.equals("Assface")) {

				bad = "assface " + bad;



				fr.setVisible(true);

			}



			if (words[i]

					.equals("bullshit")

					|| words[i]

							.equals("Bullshit")) {

				bad = "Bullshit " + bad;



				fr.setVisible(true);

			}


			if (words[i]

					.equals("chink")

					|| words[i]

							.equals("Chink")) {

				bad = "chink " + bad;



				fr.setVisible(true);

			}
}

			if (words[i]

					.equals("retarded")

					|| words[i]

							.equals("retarded")) {

				bad = "retarded " + bad;



				fr.setVisible(true);

			}


}



			if (words[i]

					.equals("retard")

					|| words[i]

							.equals("Retard")) {

				bad = "retard " + bad;

				fr.setVisible(true);

			}

		}
	}
}
