

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PORT_SCANNER {

	static JFormattedTextField showCID;
	static JTextField region;
	static JTextField model;
	static JFrame scanning;
	static JPanel scn;
	static JLabel message;
	static boolean wait = true;
	//static int counter =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame mainFrame = new JFrame("PORT_SCANNER Genereator by Zoltan F.");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3,1));//main panel
		
		
		JPanel topPanel = new JPanel();//top panel
		topPanel.setLayout(new GridLayout(1,3));
		topPanel.setBackground(Color.GRAY);//red
		JPanel leftTop = new JPanel();
		leftTop.setBackground(Color.GRAY);//orange
		JLabel regionOne = new JLabel("<html><br><br>Select yours PS3 Region<br><br>0000000100 (85) 000B1410624BA803D1EF<br><br>");
	
		
		leftTop.add(regionOne);
	
		//"<html>Hello World!<br>blahblahblah</html>", SwingConstants.CENTER
		JPanel middleTop = new JPanel();
		middleTop.setBackground(Color.GRAY);//pink
		JLabel modelID = new JLabel("<html><br><br>Select yours PS3 Model<br><br>00000001008500 (0B) 1410624BA803D1EF");
		middleTop.add(modelID);
		
		
		JPanel rigthTop = new JPanel(new GridLayout(2,1));//main
		rigthTop.setBackground(Color.GRAY);
		
		JPanel rigthTopTop = new JPanel(new GridLayout(2,1));//scann network ip , psIPAddress Inner top
		rigthTopTop.setBackground(Color.GRAY);
		JPanel rigthTopFirst = new JPanel();
		rigthTopFirst.setBackground(Color.GRAY);
		JPanel rigthTopSecond = new JPanel();
		rigthTopSecond.setBackground(Color.GRAY);
		
		JPanel rigthTopButton = new JPanel(new GridLayout(2,1));//open port numbers , ipScanfound Inner button
		rigthTopButton.setBackground(Color.GRAY);
		JPanel rigthButtonFirst = new JPanel();
		rigthButtonFirst.setBackground(Color.GRAY);
		JPanel rigthSecond = new JPanel();
		rigthSecond.setBackground(Color.GRAY);
		
		
		rigthTop.setBackground(Color.GRAY);//magenta
		rigthTopTop.setBackground(Color.GRAY);//magenta
		rigthTopButton.setBackground(Color.GRAY);//magenta
		JLabel psConnect = new JLabel("Scann network IP");
		JLabel scanFound = new JLabel("Open port numbers");
		JTextField psIPAddress = new JTextField();
		psIPAddress.setColumns(20);
		JTextField ipScanFound = new JTextField();
		ipScanFound.setColumns(20);
		
		rigthTop.add(rigthTopTop);//in to main go panel 2.1
		rigthTopTop.add(rigthTopFirst);//first
		rigthTopTop.add(rigthTopSecond);//second
		rigthTopFirst.add(psConnect);//label
		rigthTopSecond.add(psIPAddress);//textfield
		
		rigthTop.add(rigthTopButton);//in to main go panel 2.1
		rigthTopButton.add(rigthButtonFirst);//first
		rigthTopButton.add(rigthSecond);//second
		rigthButtonFirst.add(scanFound);//label
		rigthSecond.add(ipScanFound);//textfield
		
		
		topPanel.add(leftTop);
		topPanel.add(middleTop);
		topPanel.add(rigthTop);
		
		JPanel middlePanel = new JPanel();//middle panel
		middlePanel.setLayout(new GridLayout(1,3));
		middlePanel.setBackground(Color.GRAY);//BLUE
		JPanel leftMiddle = new JPanel();
		leftMiddle.setBackground(Color.GRAY);//ORANGE
		JLabel regionOneNext = new JLabel("<html>82 (DEX/DEBUG) (default)<br>"
				+ "83 (JAPAN)<br>84 (USA/CANADA)<br>85 (EUROPE)<br>86 (KOREA)<br>87 (UK)<br>88 (MEXICO)<br>"
				+ "89 (AUSTRALIA/NZ)<br>8A (SE ASIA)<br>8B (TAIWAN)<br>8C (RUSSIA/ASIA)"
				+ "<br>8D (CHINA)<br>8E (HONG KONG)");
		leftMiddle.add(regionOneNext);
		JPanel middleMIddle = new JPanel();
		middleMIddle.setBackground(Color.GRAY);//pink
		JLabel modelIDNext = new JLabel("<html>01 PS3 Fat  (Alpha series) - CECHAxx<br>02 PS3 Fat  (Alpha series) - CECHBxx<br>"
				+ "03 PS3 Fat   (Alpha series) - CECHCxx<br>04 PS3 Fat  (Alpha series) - CECHExx<br>"
				+ "05 PS3 Fat   (Alpha series) - CECHGxx<br>06 PS3 Fat  (Alpha series) - CECHHxx<br>"
				+ "07 PS3 Fat   (Alpha series) - CECHJxx or CECHKxx<br>08 PS3 Fat  (Alpha series) - CECHLxx or CECHMxx<br>"
				+ "09 PS3 Slim (2000) - CECH-20xxA or CECH-20xxB<br>0A PS3 Slim (2000) - CECH-21xxA or CECH-21xxB<br>"
				+ "0B PS3 Slim (2000) - CECH-25xxA or CECH-25xxB<br>0C PS3 Slim (3000) - CECH-30xxA or CECH-30xxB<br>"
				+ "0D PS3 SuperSlim (4000) - CECH-40xxA or CECH-40xxB");
		middleMIddle.add(modelIDNext);
		
		
		JPanel rigthMiddle = new JPanel(new GridLayout(2,1));//main panel
		rigthMiddle.setBackground(Color.GRAY);
		JPanel rigthMiddleTop = new JPanel(new GridLayout(2,1));//inner top
		rigthMiddleTop.setBackground(Color.GRAY);
		JPanel rigthMiddleButton = new JPanel(new GridLayout(2,1));//inner button
		rigthMiddleButton.setBackground(Color.GRAY);
		JPanel topFirst = new JPanel();
		topFirst.setBackground(Color.GRAY);
		JPanel topSecond = new JPanel();
		topSecond.setBackground(Color.GRAY);
		JPanel buttonFirst = new JPanel();
		buttonFirst.setBackground(Color.GRAY);
		JPanel buttonSecond = new JPanel();
		buttonSecond.setBackground(Color.GRAY);
		
		rigthMiddle.add(rigthMiddleTop);
		rigthMiddle.add(rigthMiddleButton);
		
		rigthMiddleTop.add(topFirst);
		rigthMiddleTop.add(topSecond);
		
		rigthMiddleButton.add(buttonFirst);
		rigthMiddleButton.add(buttonSecond);
		
		rigthMiddle.setBackground(Color.GRAY);//magenta
		JLabel ip = new JLabel("Enter the IP Address");
		JLabel portN = new JLabel("Enter the port number");
		JTextField ipAddress = new JTextField("192.168.1.");
		JTextField portAddress = new JTextField();
		portAddress.setColumns(20);
		ipAddress.setCaretPosition(10);
		ipAddress.setColumns(20);
		
		
		
		topFirst.add(portN);//
		topSecond.add(portAddress);//
		buttonFirst.add(ip);
		buttonSecond.add(ipAddress);
		
		
		middlePanel.add(leftMiddle);//left middle
		middlePanel.add(middleMIddle);//middle
		middlePanel.add(rigthMiddle);//rigth middle**********************
		
		
		
		
		JPanel buttonPanel = new JPanel();//button panel
		buttonPanel.setBackground(Color.GRAY);//Yellow
		
		
		mainPanel.add(topPanel);//top panel
		mainPanel.add(middlePanel);//midle panel
		mainPanel.add(buttonPanel);//button panel
		buttonPanel.setLayout(new GridLayout(3,1));//set buttonn panel 3 rows 1 column
		
		
		
		JPanel bottonPanel = new JPanel();//will hold the generate botton
		JButton generate = new JButton("Generate");
		JButton setID = new JButton("Set CID");
		bottonPanel.add(generate);
		bottonPanel.add(setID);
		generate.addActionListener(new ActionListener() {
			
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	
            	CID();
                //System.out.println("You clicked the button");
            }
        });  
		
		//three inputbox Holder panel
		JPanel bOne = new JPanel();
		bOne.setBackground(Color.GRAY);//BLACK
		JPanel bTwo = new JPanel();
		bTwo.setBackground(Color.GRAY);//RED
		JPanel bThree = new JPanel(new GridLayout(1,2));//add two panel and the two button
		JPanel bInnerOne = new JPanel();
		bInnerOne.setBackground(Color.GRAY);
		JPanel bInnerTwo = new JPanel();
		bInnerTwo.setBackground(Color.GRAY);
		bThree.add(bInnerOne);
		bThree.add(bInnerTwo);
		
		bThree.setBackground(Color.GRAY);//DARK-GRAY
		region = new JTextField();
		region.setColumns(10);
		bOne.add(region);
		model = new JTextField();
		model.setColumns(10);
		bTwo.add(model);
		
		JButton scann = new JButton("Scanning");// scannin************************************************
		scann.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				scanningMessage();
				
				String str = "";
				ipScanFound.setText("");
				String hostTwo = psIPAddress.getText();
			      for (int port = 1; port <= 1500; port++) { //port numbers 65536
			          try {
			             Socket socket = new Socket();
			             socket.connect(new InetSocketAddress(hostTwo, port), 3);
			             socket.close();
			           //  System.out.println("Port " + port + " is open");
			             str = str + "," + port;
			             ipScanFound.setText(str);
			            
			         } catch (Exception ex) {
			        	 
			        	 //String noOpenPort = "Can't find open ports";
			        	 //String strM = noOpenPort;
			        	 //ipScanFound.setText(strM);
			         }
			       
			}
			      if(str.length()==0)
			      {
			    	  ipScanFound.setText("Can't find open ports");
			    	 // System.out.println("AAAAAAAAAAAAAAAAAAA");
			      }
			     // System.out.println("str is : " + str + " " + str.length() + " " + counter);
			      str = "";
			     // scanninMessageClose();
			      scanning.dispose();
			}});
		
		JButton connect = new JButton("Connect");// connect***********
		connect.addActionListener(new ActionListener() {
			int x =0;
            public void actionPerformed(ActionEvent e)
            {
                  		 
				
            	Socket s = new Socket();
            	String host = ipAddress.getText();
            	String port = portAddress.getText();
				int portInt = Integer.parseInt(port);
            	try {
					s.connect(new InetSocketAddress(host , portInt));
				} catch (IOException e1) {
					//System.err.println("Don't know about host : " + host);
					fails();
					x++;
				}
            	if(x==0)
            	{
            	done();
            	// System.out.println("Connected");
            	// System.out.println(host);
            	}
            	x=0;
              }});  
		
		
		
		bInnerOne.add(scann);
		bInnerTwo.add(connect);
		
		
		bottonPanel.setBackground(Color.GRAY);//cyan************************************
		JPanel idPanel = new JPanel();//will hold to show generated console ID
		idPanel.setBackground(Color.GRAY);//green
		showCID = new JFormattedTextField();
		showCID.setColumns(32);
		showCID.setEditable(false);
		//showCID.setSize(300, 300);
		idPanel.add(showCID);
		
		JPanel inputText = new JPanel();//will hold the 3 input text field
		buttonPanel.add(inputText);
		buttonPanel.add(idPanel);
		buttonPanel.add(bottonPanel);
		
		
		
		
		inputText.setLayout(new GridLayout(1,3));//horizontal hold three input box
		inputText.setBackground(Color.GRAY);//gray
		inputText.add(bOne);
		inputText.add(bTwo);
		inputText.add(bThree);
		
		
		JPanel regioPanel = new JPanel();//will hold region information
		JPanel modelPanel = new JPanel();//will hold model information
		JPanel somethingPanel = new JPanel();//spear panel on rigth
		mainFrame.add(mainPanel);
		mainFrame.setMinimumSize(new Dimension(500,500));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setVisible(true);
	}
	
	public static String generateCID()
	{
		//0000000100 (85) 00 (0B) (1410624BA803D1EF)
		String CID = "";
		String CIDFirstPart = "0000000100";
		String CIDRegion = region.getText();//get Text
		String CIDMiddleZeros = "00";
		String CIDModel = model.getText();//get Text
		String CIDSecondPart = generateHex();//get hex number from Method
		
		CID = CIDFirstPart + CIDRegion + CIDMiddleZeros + CIDModel + CIDSecondPart;
		
		
		
		return CID;
		
	}
	
	public static String generateHex()
	{
		String hexNumber = "1";
		String hexNumberSecond = "04";
		int numberOne = (int)(Math.random()*2);
		char chOne = hexNumberSecond.charAt(numberOne);
		hexNumber = hexNumber + chOne;
		String hexNumberThird = "0";
		hexNumber = hexNumber + hexNumberThird;
		String fromChoice = "0123456789ABCDEF";
		for(int i=0;i<13;i++)
		{
			int number = (int)(Math.random()*15);
			char ch = fromChoice.charAt(number);
			hexNumber = hexNumber + ch;
		}
		
		return hexNumber;
	}
	
	public static void CID()
	{
		showCID.setText(generateCID()); //generateCID();
	}
	
	public static void done()
	{
		JFrame done = new JFrame("Connected");
		JPanel pan = new JPanel();
		JLabel doneLabel = new JLabel("		Connection estabilished");
		
		pan.add(doneLabel);
		done.add(pan);
		done.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		done.setSize(200, 100);
		done.setLocation(100, 100);
		done.setResizable(false);
		done.setVisible(true);
	}
	
	public static void fails()
	{
		JFrame done = new JFrame("Not Connected");
		JPanel pan = new JPanel();
		JLabel doneLabel = new JLabel("Can't connect");
		
		pan.add(doneLabel);
		done.add(pan);
		done.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		done.setSize(200, 100);
		done.setLocation(100, 100);
		done.setResizable(false);
		done.setVisible(true);
	}
	
	public static void scanningMessage()
	{
		scanning = new JFrame("Scanning");
		scn = new JPanel();
		message = new JLabel("Scanning please waith");
		
		scn.add(message);
		scanning.add(scn);
		scanning.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		scanning.setSize(250, 100);
		scanning.setLocation(200, 200);
		scanning.setResizable(false);
		scanning.setVisible(true);
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		wait = false;
		
	}
	
	public static boolean getWait()
	{
		return wait;
	}

	public static void scanninMessageClose()
	{
		scanning.dispose();
	}
			

}




