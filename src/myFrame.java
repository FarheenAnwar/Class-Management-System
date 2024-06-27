import java.awt.LayoutManager;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Utilities;

public class myFrame extends JFrame{
   private int index;
   JPanel cardPanel;
   CardLayout cardLayout;
   private JTextField uField;
   private myPanel resultPanel;
   private myPanel profilePanel;
   private myPanel sosPanel;
   private JLabel nodata;
   private JLabel nameLabel;
   private JLabel rollNoLabel;
   private JLabel studentName;
   private JLabel studentRollNo;
   private JLabel emailLabel;
   private JLabel studentEmail;
   Color skyBlue = new Color(173, 216, 230);
   

   
   public myFrame(ArrayList<Student> studentsList){
   
       cardLayout = new CardLayout();
       cardPanel = new JPanel(cardLayout);
       cardPanel.setBounds(0, 0, 2000,2000);//imp to setBounds for  cardpanel
       cardPanel.setSize(2000,2000);
       
    // ------------MAIN PANEL---------------------------
        myPanel mainPanel = new myPanel();
        ImageIcon image = new ImageIcon("images.png");
        JLabel label = new JLabel();
        label.setIcon(image);
        label.setBounds(200, 100, 500, 100);

        JLabel text = new JLabel();
        text.setText("Do you want to login as: ");
        text.setBounds(200, 210, 200, 70);
        text.setFont(new Font("Arial",Font.BOLD,16));

        JButton adminButton = new JButton();
        adminButton.setBounds(200, 270, 100, 40);
        adminButton.setText("Admin");
        adminButton.setFocusable(false);
    

        JButton sButton = new JButton();
        sButton.setBounds(200, 340, 100, 40);
        sButton.setText("Student");
        sButton.setFocusable(false);

        mainPanel.add(label);
        mainPanel.add(text);
        mainPanel.add(adminButton);
        mainPanel.add(sButton);

        // ---------------------LOGIN PANEL-------------------------
        myPanel loginPanel = new myPanel();
        myPanel consolePanel = new myPanel();
        myPanel noticeboard=new myPanel();
        Color color = new Color(50,130,190);  
        Color plum = new Color(128,0,128);
        consolePanel.setBackground(color);
       // consolePanel.setBackground(Color.CYAN);
        loginPanel.setBackground(Color.LIGHT_GRAY);

        consolePanel.setBounds(630, 0, 650, 2000);
        //consolePanel.setBorder(BorderFactory.createLineBorder(plum));
        consolePanel.setBorder(BorderFactory.createMatteBorder(10,10,10,10,plum));
        loginPanel.setBorder(BorderFactory.createMatteBorder(10,10,10,10,plum));

        //loginPanel.setBackground(Color.CYAN);
        ImageIcon imagecui = new ImageIcon("imagecui.png");

        JLabel login = new JLabel();
        login.setText("LOGIN");
        login.setFont(new Font("Arial",Font.BOLD,70));
        login.setText("<html><b><u>LOGIN</u></b></html>");
        login.setBounds(320, 0, 30, 80);

        JLabel loginImg = new JLabel();
        loginImg.setIcon(imagecui);
        loginImg.setBounds(210, 60, 350, 280);

        JLabel u_name = new JLabel();
        u_name.setText("Username:");
       // u_name.setBounds(610, 240, 210, 70);
       u_name.setBounds(220, 285, 210, 70);

        JLabel p_word = new JLabel();
        p_word.setText("Password: ");
        p_word.setBounds(220, 365, 210, 70);

        uField = new JTextField();
        uField.setBounds(220, 335, 210, 40);

        JTextField pField = new JTextField();
        pField.setBounds(220, 415, 210, 40);

        JCheckBox robot = new JCheckBox();
        robot.setText("I am not a robot");
        robot.setBackground(color);
        robot.setBounds(270, 470, 210, 40);

        JButton signIn = new JButton();
        signIn.setFocusable(false);
        signIn.setText("SIGN IN");
        signIn.setBounds(275, 510, 110, 30);

        JButton backbn1 = new JButton();
        backbn1.setText("BACK");
        backbn1.setFocusable(false);
        backbn1.setBounds(275, 560, 110, 30);

        JLabel invalid = new JLabel();
        invalid.setText("INVALID USERNAME OR PASSWORD!");
        invalid.setVisible(false);

        loginPanel.add(invalid);
        TextAnimation animation = new TextAnimation();
        animation.setBounds(97, 150, 100, 80);

        // Add a mouse listener to handle clicks
        animation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.openai.com"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JLabel uniLabel = new JLabel();
        uniLabel.setText("Comsats University Islamabad");
        uniLabel.setBounds(150, 50, 500, 30);
        uniLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel portalLabel = new JLabel();
        portalLabel.setText("CU Online Student Console");
        portalLabel.setBounds(100, 36, 500, 60);
        portalLabel.setFont(new Font("Times New Roman", Font.ITALIC, 26));

        ImageIcon portal = new ImageIcon("portal.png");      
        JLabel consoleimg = new JLabel();
        consoleimg.setIcon(portal);
        consoleimg.setBounds(10, 20, 100, 100);

        ImageIcon logo_image = new ImageIcon("logo.png");      
        JLabel lo_go = new JLabel();
        lo_go.setIcon(logo_image);
        lo_go.setBounds(40, 22, 100, 100);

        noticeboard.setBounds(97, 150, 450, 500);
        noticeboard.setBackground(Color.LIGHT_GRAY);
        JTextArea textArea = new JTextArea();
        
        textArea.setText("\n=> Kamyab jawan Sports League Talent Hunt weightlifting\n is being organized at COMSATS University Islamabad Male\nGym in the basement of CUI JZ Library from May 20-21, 2024\n you are requested to show your talent and become the part\nof HEC( Islamabad region team)for national and international\nlevel university Sports competition.\n\n=>Course Catalog: https://cuonline.comsats.edu.pk/publicacc\ness/\n\n=>Official Facebook Page: https://web.facebook.com/cuioffic\nial/?_rdc=1&_rdr\n\n=> Symposium on the World Quantum Day (22/05/2024)\n\n=> It is to inform that student's bus service will resume\noperation after the winter break,\nstarting from February 12, 2024.\n\n=> The timings will be observed in SP-24 as per the \nfollowing schedule.\n-1st arrival in campus 8:00 am\n-2nd arrival 11:00 am\n-1st drop 2:45 pm\n-2nd drop 5:45 pm");
        textArea.setFont(new Font("Corbel", Font.BOLD, 14));
        textArea.setForeground(Color.YELLOW);
        Color emerald = new Color(0,120,60);
        textArea.setBackground(emerald);
        
        textArea.setEditable(false); // Make text area non-editable

        // Add a MouseListener to handle link clicks
        textArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() > 0) {
                    int offset = textArea.viewToModel(e.getPoint());
                    try {
                        int rowStart = Utilities.getRowStart(textArea, offset);
                        int rowEnd = Utilities.getRowEnd(textArea, offset);
                        String line = textArea.getText().substring(rowStart, rowEnd);
                        if (line.contains("http")) {
                            String url = line.substring(line.indexOf("http"));
                            Desktop.getDesktop().browse(new URI(url));
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        JScrollPane notification = new JScrollPane(textArea);
        notification.setBounds(25,100,400,350);
        //notification.setBackground(Color.GREEN);
        JLabel notify=new JLabel();
        notify.setBounds(150,10,275,100);
        notify.setText("NOTICEBOARD");
        notify.setFont(new Font("Impact", Font.PLAIN, 26));
        notification.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.white));
        noticeboard.add(notification, BorderLayout.CENTER);
        noticeboard.add(notify);
       
 

        loginPanel.add(noticeboard);
        loginPanel.add(uniLabel);
        loginPanel.add(consolePanel);
        consolePanel.add(portalLabel);
       // loginPanel.add(animation);
        consolePanel.add(consoleimg);
        loginPanel.add(lo_go);

        
         //loginPanel.add(loginImg);
        // loginPanel.add(u_name);
        // loginPanel.add(p_word);
        // loginPanel.add(uField);
        // loginPanel.add(pField);
        // loginPanel.add(robot);
        // loginPanel.add(signIn);
        // loginPanel.add(backbn1);
                // loginPanel.add(uniLabel);
        consolePanel.add(loginImg);
        consolePanel.add(u_name);
        consolePanel.add(p_word);
        consolePanel.add(uField);
        consolePanel.add(pField);
        consolePanel.add(robot);
        consolePanel.add(signIn);
        consolePanel.add(backbn1);
        //---------------------------------------
        //           STUDENT MENU PANEL

        myPanel menuPanel = new myPanel();

        JButton dashboardBn= new JButton();
        dashboardBn.setText("DASHBOARD");
        dashboardBn.setBounds(290, 330, 150, 40);

        ImageIcon dash= new ImageIcon("dashboard.png");      
        JLabel dashboardimg = new JLabel();
        dashboardimg.setIcon(dash);
        dashboardimg.setBounds(310, 220, 100, 100);

        JButton profileBn= new JButton();
        profileBn.setText("PROFILE");
        profileBn.setBounds(460, 330, 150, 40);

        ImageIcon prof= new ImageIcon("profile.png");      
        JLabel profileimg = new JLabel();
        profileimg.setIcon(prof);
        profileimg.setBounds(480, 222, 100, 100);

        JButton sosBn= new JButton();
        sosBn.setText("SOS");
        sosBn.setBounds(630, 330, 150, 40);

        ImageIcon sos= new ImageIcon("sos.png");      
        JLabel sosimg = new JLabel();
        sosimg.setIcon(sos);
        sosimg.setBounds(652, 222, 100, 100);


        JButton resultBn = new JButton();
        resultBn.setText("RESULT");
        resultBn.setFocusable(false);
        resultBn.setBounds(800, 330, 150, 40);

        ImageIcon results= new ImageIcon("result.png");      
        JLabel resultimg = new JLabel();
        resultimg.setIcon(results);
        resultimg.setBounds(825, 222, 100, 100);


        JButton exitbn = new JButton();
        exitbn.setFocusable(false);
        exitbn.setText("EXIT");
        exitbn.setBounds(800, 580, 150, 40);

        JButton backbn2 = new JButton();
        backbn2.setText("BACK");
        backbn2.setFocusable(false);
        backbn2.setBounds(290, 580, 150, 40);
        
        JLabel Label1 = new JLabel();
        Label1.setText("Comsats University Islamabad");
        Label1.setBounds(500, 50, 500, 30);
        Label1.setFont(new Font("Times New Roman", Font.BOLD, 28));

        ImageIcon logoimage = new ImageIcon("logo.png");

       
        JLabel logo = new JLabel();
        logo.setIcon(logoimage);
        logo.setBounds(380, 22, 100, 100);
            
        menuPanel.setBackground(skyBlue);
        menuPanel.add(logo);
        menuPanel.add(Label1);
        menuPanel.add(dashboardBn);
        menuPanel.add(dashboardimg);
        menuPanel.add(profileBn);
        menuPanel.add(profileimg);
        menuPanel.add(resultBn);
        menuPanel.add(resultimg);
        menuPanel.add(sosBn);
        menuPanel.add(sosimg);
        menuPanel.add(backbn2);
        menuPanel.add(exitbn);

        backbn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) cardPanel.getLayout();
                    layout.show(cardPanel,"LOGIN_PANEL");
                    invalid.setVisible(false);
                    uField.setText("");
                    pField.setText("");
                    //System.out.println(getusernameFieldText());
                    return;
                
                }
            
        });
        exitbn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                
                }
            
        });
        // -------------------------------------------
        signIn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout layout = (CardLayout) cardPanel.getLayout();
            for(int i=0;i<studentsList.size();i++){
            if((uField.getText().equalsIgnoreCase(studentsList.get(i).getRollNo()))&&(pField.getText().equals("ABC"))){
                //uField.setEditable(false);
                Student s =studentsList.get(i); 
                rollNoLabel.setVisible(true);
                nameLabel.setVisible(true);
                emailLabel.setVisible(true);
                studentName.setText(s.getName());
                studentName.setVisible(true);
                studentRollNo.setText(s.getRollNo());
                studentRollNo.setVisible(true);
                studentEmail.setText(s.getEmail());
                studentEmail.setVisible(true);
                layout.show(cardPanel,"MENU_PANEL");
                System.out.println(studentsList.get(i));
                

                index = i;
                studentsList.get(index).getSubjects().get(0).getTotalMarks();
                if (s.getGPA()==0.0){
                    nodata.setVisible(true);
                    return;
                 }
                else{

                
                
                System.out.println(s);
                s.getSubjects().get(0).getTotalMarks();
                String[][]data1 = new String[s.getSubjects().size()][3];
               
                for(int j=0;j<4;j++){
                     data1[j][0]= s.getSubjects().get(j).getName();
                     data1[j][1]=" "+s.getSubjects().get(j).getTotalMarks();
                     data1[j][2] = " "+s.getSubjects().get(j).getGPA();
                 }
                String[] column1 = {"Subject","Total Marks","GPA"};
                            
                JTable resulttable = new JTable(data1, column1);
                resulttable.setRowHeight(50);    
                resulttable.setBounds(350, 250, 800, 820);
                resulttable.getColumnModel().getColumn(0).setPreferredWidth(150); // Subject column width
                resulttable.getColumnModel().getColumn(1).setPreferredWidth(150); // Teacher column width
                resulttable.getColumnModel().getColumn(2).setPreferredWidth(150);
        
                JScrollPane resultscrollPane = new JScrollPane(resulttable);
                resultscrollPane.setBounds(245, 170, 820,223);
        
                JLabel GPALabel = new JLabel();
                GPALabel.setText("CGPA: ");
                GPALabel.setFont(new Font("Times New Roman",Font.BOLD,18));
                GPALabel.setBounds(250, 400, 500, 30);

                JLabel finalGPA = new JLabel();
                finalGPA.setText(""+studentsList.get(i).getGPA());
                finalGPA.setFont(new Font("Times New Roman",Font.PLAIN,18));
                finalGPA.setBounds(320, 400, 500, 30);

                JButton backbutton = new JButton();
                backbutton.setText("BACK");
                backbutton.setFocusable(false);
                backbutton.setBounds(245, 450, 100, 40);

                JLabel resultlabel=new JLabel();
                resultlabel.setText("RESULT CARD");
                resultlabel.setFont(new Font("Times New Roman",Font.BOLD,26));
                Color custom = new Color(250,100,100);  
                resultlabel.setForeground(custom);
                resultlabel.setBounds(550, 120, 500, 30);

                JLabel nameLabel = new JLabel();
                nameLabel.setText("Comsats University Islamabad");
                nameLabel.setBounds(500, 50, 500, 30);
                nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
        
                ImageIcon unilogo = new ImageIcon("logo.png");
        
               
                JLabel LOGO = new JLabel();
                LOGO.setIcon(unilogo);
                LOGO.setBounds(380, 22, 100, 100);
                    
                resultPanel.add(LOGO);
                resultPanel.add(nameLabel);
                resultPanel.add(GPALabel);
                resultPanel.add(backbutton);
                resultPanel.add(finalGPA);
                resultPanel.add(resultlabel);
                resultPanel.add(resultscrollPane) ;
                
                backbutton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        CardLayout layout = (CardLayout) cardPanel.getLayout();
                            layout.show(cardPanel,"MENU_PANEL");
                            //System.out.println(getusernameFieldText());
                            return;
                        
                        }
                });

              }
            
                
                return;
            }
            }
            invalid.setForeground(Color.RED);
            invalid.setBounds(850, 365, 250, 200);
            invalid.setVisible(true);
           
        }
    });
    
    dashboardBn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
           CardLayout layout = (CardLayout) cardPanel.getLayout(); 
           layout.show(cardPanel,"DASHBOARD_PANEL");
        }
    });
    profileBn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           CardLayout layout = (CardLayout) cardPanel.getLayout(); 
           layout.show(cardPanel,"PROFILE_PANEL");
        }
    });
    sosBn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            CardLayout layout = (CardLayout) cardPanel.getLayout(); 
            layout.show(cardPanel,"SOS_PANEL");
         }
    });
    resultBn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           CardLayout layout = (CardLayout) cardPanel.getLayout(); 
           layout.show(cardPanel,"RESULT_PANEL");
        }
    });

        //---------------------DASHBOARD PANEL-------------------------
        myPanel dashboard = new myPanel();
       
        JLabel label1 = new JLabel();
        label1.setText("Comsats University Islamabad");
        label1.setBounds(500, 50, 500, 30);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 28));

        ImageIcon logoimg = new ImageIcon("logo.png");

       
        JLabel Logo = new JLabel();
        Logo.setIcon(logoimage);
        Logo.setBounds(380, 22, 100, 100);
        
        String[][] data = {
                {"4","Mam Bushra", "BAI-3A"},
                { "4","Dr. Zobia","BAI-3A"},
                { "3","Mam Hina","BAI-3A"},
                {"4","Sir Ahmed","BAI-3A"}
        };

        String[] columnNames = {"Credit Hours","Teacher","Class"};

        JButton ai =new JButton();
        ai.setText("AI");
        ai.setFocusable(false);
        ai.setBounds(201,320,100,52);
        Color customcolor=new Color(40,200,210);
        ai.setBackground(customcolor);

        JButton cal =new JButton();
        cal.setText("Calculus");
        cal.setFocusable(false);
        cal.setBackground(customcolor);
        cal.setBounds(201,270,100,51);

        JButton dsa =new JButton();
        dsa.setText("DSA");
        dsa.setFocusable(false);
        dsa.setBackground(customcolor);
        dsa.setBounds(201,221,100,50);

        JButton oop =new JButton();
        oop.setText("OOP");
        oop.setFocusable(false);
        oop.setBackground(customcolor);
        oop.setBounds(201,171,100,51);
    
        JTable table = new JTable(data, columnNames);
        table.setRowHeight(50);    
        table.setBounds(350, 250, 800, 820);
        table.getColumnModel().getColumn(0).setPreferredWidth(150); // Subject column width
        table.getColumnModel().getColumn(1).setPreferredWidth(150); // Teacher column width
        table.getColumnModel().getColumn(2).setPreferredWidth(150);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(300, 150, 800,223);

        JButton backBtn = new JButton();
        backBtn.setText("BACK");
        backBtn.setFocusable(false);
        backBtn.setBounds(200, 400, 100, 40);
         
        
        dashboard.add(Logo);
        dashboard.add(label1);
        dashboard.add(scrollPane);
        dashboard.add(oop);
        dashboard.add(dsa);
        dashboard.add(cal);
        dashboard.add(ai);
        dashboard.add(backBtn);
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) cardPanel.getLayout();
                    layout.show(cardPanel,"MENU_PANEL");
                    //System.out.println(getusernameFieldText());
                    return;
                
                }
        });
    //--------------------RESULT PANEL---------------------------------
    resultPanel = new myPanel();

    nodata = new JLabel();
    String txt = getusernameFieldText() ;
    System.out.println("txt"+txt);
    nodata.setText("NO DATA AVAILABLE");
    nodata.setVisible(false);
    nodata.setBounds(100,100,100,100);
    resultPanel.add(nodata);

    //-----------------------SOS_PANEL----------------------------------
    JPanel sosPanel= new myPanel();
    
    JLabel TITLE = new JLabel();
    TITLE.setText("Comsats University Islamabad");
    TITLE.setBounds(500, 50, 500, 30);
    TITLE.setFont(new Font("Times New Roman", Font.BOLD, 28));

    ImageIcon logo1 = new ImageIcon("logo.png");

    JLabel LOGO1 = new JLabel();
    LOGO1.setIcon(logo1);
    LOGO1.setBounds(380, 22, 100, 100);

    // Read data from file and display in JTable  

    String[][] courses = null;
try (BufferedReader br = new BufferedReader(new FileReader("sos.txt"))) {
    String line;
    int rows = 0;
    while ((line = br.readLine()) != null) {
        rows++;
    }
    System.out.println("Total rows: " + rows); // Debugging
    courses = new String[rows][4];
    int row = 0;
    br.close();
    BufferedReader Br = new BufferedReader(new FileReader("sos.txt")); // Reset BufferedReader
    while ((line = Br.readLine()) != null) {
        String[] splitData = line.split("-");
        courses[row][0] = splitData[0]; // Serial NUmber
        courses[row][1] = splitData[1]; // Course code
        courses[row][2] = splitData[2]; // Name
        courses[row][3] = splitData[3]; //Credit Hours
        row++;
    }
    Br.close();
} catch (IOException e) {
    e.printStackTrace();
}


String[] column = {"Serial Number","Code", "Name", "Credit Hours"};
JTable tablesos = new JTable(courses, column);
tablesos.setRowHeight(30);
JScrollPane scroller = new JScrollPane(tablesos);
scroller.setBounds(140, 190, 1000,400);

JLabel name =new JLabel();
name.setText("Scheme of Studies (SOS)");
name.setForeground(Color.BLUE);
name.setFont(new Font("Times New Roman",Font.BOLD,24));
name.setBounds(510,40,600,200);
JLabel degree = new JLabel();
degree.setText("BS Artificial Intelligence");
degree.setForeground(Color.RED);
degree.setFont(new Font("Times New Roman",Font.BOLD,18));
degree.setBounds(535,64,600,200);

JButton BACKTOMENU =new JButton();
BACKTOMENU.setText("Back");
BACKTOMENU.setBounds(580, 600, 100, 40);
BACKTOMENU.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        CardLayout layout = (CardLayout) cardPanel.getLayout();
            layout.show(cardPanel,"MENU_PANEL");
            return;
        
        }
});
sosPanel.add(BACKTOMENU);
sosPanel.add(name);
sosPanel.add(degree);
sosPanel.add(scroller);
sosPanel.add(LOGO1);
sosPanel.add(TITLE);

    
    //---------------------CONTACT DETAILS PANEL------------------------
    profilePanel = new myPanel();

    JLabel heading = new JLabel();
        heading.setText("Comsats University Islamabad");
        heading.setBounds(500, 50, 500, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));

    ImageIcon logoprofile = new ImageIcon("logo.png");

       
    JLabel LOGO = new JLabel();
    LOGO.setIcon(logoprofile);
    LOGO.setBounds(380, 22, 100, 100);

    JLabel headlabel=new JLabel();
    headlabel.setText("STUDENT PROFILE");
    headlabel.setFont(new Font("Times New Roman",Font.BOLD,20));
    Color custom = new Color(250,100,100);  
    headlabel.setForeground(custom);
    headlabel.setBounds(550, 150, 500, 30);
   
    
    nameLabel = new JLabel();
    nameLabel.setText("NAME:");
    nameLabel.setBounds(500,250,100,100);
    nameLabel.setForeground(Color.black);
    nameLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
    nameLabel.setVisible(false);

    studentName = new JLabel();
    studentName.setBounds(570,250,100,100);
    studentName.setForeground(Color.blue);
    studentName.setFont(new Font("Times New Roman",Font.BOLD,16));
    studentName.setVisible(false);
 
    rollNoLabel = new JLabel();
    rollNoLabel.setText("ROLL NO:");
    rollNoLabel.setBounds(500,300,100,100);
    rollNoLabel.setForeground(Color.black);
    rollNoLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
    rollNoLabel.setVisible(false);

    studentRollNo = new JLabel();//studentName;studentRollNo;emailLabel;studentEmail
    studentRollNo.setBounds(600,300,100,100);
    studentRollNo.setForeground(Color.blue);
    studentRollNo.setFont(new Font("Times New Roman",Font.BOLD,16));
    studentRollNo.setVisible(false);

    emailLabel = new JLabel();
    emailLabel.setText("EMAIL ID:");
    emailLabel.setBounds(500,350,250,100);
    emailLabel.setForeground(Color.black);
    emailLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
    //emailLabel.setVisible(false);

    studentEmail = new JLabel();
    studentEmail.setBounds(600,350,250,100);
    studentEmail.setForeground(Color.blue);
    studentEmail.setFont(new Font("Times New Roman",Font.BOLD,16));
    studentEmail.setVisible(false);

    JButton BACK = new JButton();
    BACK.setText("BACK");
    BACK.setFocusable(false);
    BACK.setBounds(570, 500, 100, 40);
    
    profilePanel.add(BACK);
    profilePanel.add(LOGO);
    profilePanel.add(heading);
    profilePanel.add(headlabel);
    profilePanel.add(nameLabel);
    profilePanel.add(rollNoLabel);
    profilePanel.add(emailLabel);
    profilePanel.add(studentName);
    profilePanel.add(studentRollNo);
    profilePanel.add(studentEmail);
 

    BACK.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           CardLayout layout = (CardLayout) cardPanel.getLayout();
                layout.show(cardPanel,"MENU_PANEL");
                 //System.out.println(getusernameFieldText());
                return;
            
            }
     });


    // --------------------FRAME----------------------------------------
    cardPanel.add(mainPanel,"MAIN_PANEL");
    cardPanel.add(loginPanel,"LOGIN_PANEL");
    cardPanel.add(menuPanel,"MENU_PANEL");
    cardPanel.add(dashboard,"DASHBOARD_PANEL");
    cardLayout.show(cardPanel, "LOGIN_PANEL");
    loginPanel.setVisible(true);
    cardPanel.add(resultPanel,"RESULT_PANEL");
    cardPanel.add(sosPanel,"SOS_PANEL");
    cardPanel.add(profilePanel,"PROFILE_PANEL");
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("CUI PORTAL ISLAMABAD.");
    this.setSize(2000, 2000);
    this.setBounds(0,0,2000, 2000);
    this.setBackground(Color.CYAN);
    this.setVisible(true);
    this.getContentPane().add(cardPanel);

    
  }
  public String getusernameFieldText() {
  String txt1 = uField.getText();
  System.out.println("workinhg"+txt1);
    return txt1;
}

}

