
/**
 * Write a description of class RigoTechnology here.
 *
 * @author (SIRJAN BANIYA)
 * @version (04/19/2019)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class RigoTechnology implements ActionListener
{
    //Araylist for Developer
    ArrayList<Developer>platformList=new ArrayList<Developer>();
    JFrame frame;

    JSeparator SeparateS;
    //labels  used in the GUI Layout
    JLabel lblSeniorDeveloper,lblPlatformS,lblDeveloperNameS,lblContractPeriodS,lblSalaryS,lblWorkingHourS,lblAdvanceSalaryS, 
    lblPlatformNumberS,lblInterviewerNameS,lblJoiningDateS,lblStaffRoomNumberS;

    JSeparator SeparateJ;
    
    //labels  used in the GUI Layout
    JLabel lblJuniorDeveloper,lblPlatformJ,lblPlatformNumberJ,lblTerminationDate2J,lblSalaryJ,lblWorkingHourJ,lblDeveloperNameJ,
    lblInterviewerNameJ,lblSpecializationJ,lblAppointedDateJ,lblTerminationDateJ,lblAppointedByJ;
    
    //textfeilds which are used in GUI
    JTextField txtPlatformS,txtInterviewerNameS,txtContractPeriodS,txtSalaryS,txtWorkingHourS,txtAdvanceSalaryS,txtPlatformNumberS,
    txtDeveloperNameS,txtJoiningDateS,txtStaffRoomNumberS;

    JTextField txtPlatformJ,txtPlatformNumberJ,txtTerminationDate2J,txtSalaryJ,txtWorkingHourJ,txtInterviewerNameJ,txtDeveloperNameJ,
    txtSpecializationJ,txtAppointedDateJ,txtTerminationDateJ,txtAppointedByJ;
    
    //Buttons used in GUI
    JButton btnAddS,btnAddJ,btnAppointS,btnAppointJ,btnTerminate,btnDisplay,btnClear;
    
    
    //Frame method for getting the GUI Layout
    public void frameLayout()
    {
        frame = new JFrame("Hiring");
        
        //Addition of platform for Senior Developer  
        lblSeniorDeveloper=new JLabel("Senior Developer ");
        lblSeniorDeveloper.setBounds(10,10,200,20);
        frame.add(lblSeniorDeveloper);

        SeparateS =new JSeparator();
        SeparateS.setBounds(10,30,600,20);
        frame.add(SeparateS);

        lblPlatformS=new JLabel("Platform:");
        lblPlatformS.setBounds(10,60,100,20);
        frame.add(lblPlatformS);

        txtPlatformS=new JTextField();
        txtPlatformS.setBounds(120,60,500,20);
        frame.add(txtPlatformS);

        lblInterviewerNameS=new JLabel("Interviewer:");
        lblInterviewerNameS.setBounds(10,85,100,20);
        frame.add(lblInterviewerNameS);

        txtInterviewerNameS=new JTextField();
        txtInterviewerNameS.setBounds(120,85,500,20);
        frame.add(txtInterviewerNameS);

        lblContractPeriodS=new JLabel("Contract Period:");
        lblContractPeriodS.setBounds(10,110,100,20);
        frame.add(lblContractPeriodS);

        txtContractPeriodS=new JTextField();
        txtContractPeriodS.setBounds(120,110,170,20);
        frame.add(txtContractPeriodS);

        lblSalaryS=new JLabel("Salary:");
        lblSalaryS.setBounds(10,135,100,20);
        frame.add(lblSalaryS);

        txtSalaryS=new JTextField();
        txtSalaryS.setBounds(120,135,170,20);
        frame.add(txtSalaryS);

        lblWorkingHourS=new JLabel("Working Hour:");
        lblWorkingHourS.setBounds(350,110,100,20);
        frame.add(lblWorkingHourS);

        txtWorkingHourS=new JTextField();
        txtWorkingHourS.setBounds(450,110,170,20);
        frame.add(txtWorkingHourS);

        btnAddS=new JButton("Add");
        btnAddS.setBounds(519,135,100,20);
        frame.add(btnAddS);
        btnAddS.addActionListener(this);
        
        //GUI Layout for  appointing Senior Developer

        lblPlatformNumberS=new JLabel("Platform No:");
        lblPlatformNumberS.setBounds(10,180,100,20);
        frame.add(lblPlatformNumberS);

        txtPlatformNumberS=new JTextField();
        txtPlatformNumberS.setBounds(120,180,500,20);
        frame.add(txtPlatformNumberS);

        lblDeveloperNameS=new JLabel("Developer Name:");
        lblDeveloperNameS.setBounds(10,205,100,20);
        frame.add(lblDeveloperNameS);

        txtDeveloperNameS=new JTextField();
        txtDeveloperNameS.setBounds(120,205,500,20);
        frame.add(txtDeveloperNameS);

        lblJoiningDateS=new JLabel("Joining Date:");
        lblJoiningDateS.setBounds(10,230,100,20);
        frame.add(lblJoiningDateS);

        txtJoiningDateS=new JTextField();
        txtJoiningDateS.setBounds(120,230,170,20);
        frame.add(txtJoiningDateS);

        lblStaffRoomNumberS=new JLabel("Staff Room No:");
        lblStaffRoomNumberS.setBounds(350,230,130,20);
        frame.add(lblStaffRoomNumberS);

        txtStaffRoomNumberS=new JTextField();
        txtStaffRoomNumberS.setBounds(450,230,170,20);
        frame.add(txtStaffRoomNumberS);

        lblAdvanceSalaryS=new JLabel("Advance Salary:");
        lblAdvanceSalaryS.setBounds(10,255,100,20);
        frame.add(lblAdvanceSalaryS);

        txtAdvanceSalaryS=new JTextField();
        txtAdvanceSalaryS.setBounds(120,255,170,20);
        frame.add(txtAdvanceSalaryS);

        btnTerminate=new JButton("Terminate");
        btnTerminate.setBounds(350,275,100,20);
        frame.add(btnTerminate);
        btnTerminate.addActionListener(this);

        btnAppointS=new JButton("Appoint");
        btnAppointS.setBounds(519,275,100,20);
        frame.add(btnAppointS);
        btnAppointS.addActionListener(this);
        
        //GUI Layout for  adding platform for Junior Developer

        lblJuniorDeveloper=new JLabel("Junior Developer");
        lblJuniorDeveloper.setBounds(10,310,200,20);
        frame.add(lblJuniorDeveloper);

        SeparateJ=new JSeparator();
        SeparateJ.setBounds(10,330,600,20);
        frame.add(SeparateJ);

        lblPlatformJ=new JLabel("Platform:");
        lblPlatformJ.setBounds(10,360,100,20);
        frame.add(lblPlatformJ);

        txtPlatformJ=new JTextField();
        txtPlatformJ.setBounds(120,360,500,20);
        frame.add(txtPlatformJ);

        lblInterviewerNameJ=new JLabel("Interviewer:");
        lblInterviewerNameJ.setBounds(10,385,100,20);
        frame.add(lblInterviewerNameJ);

        txtInterviewerNameJ=new JTextField();
        txtInterviewerNameJ.setBounds(120,385,500,20);
        frame.add(txtInterviewerNameJ);

        lblTerminationDateJ=new JLabel("Terminated Date:");
        lblTerminationDateJ.setBounds(10,410,100,20);
        frame.add(lblTerminationDateJ);

        txtTerminationDateJ=new JTextField ();
        txtTerminationDateJ.setBounds(120,410,170,20);
        frame.add(txtTerminationDateJ);

        lblSalaryJ=new JLabel("Salary:");
        lblSalaryJ.setBounds(10,435,170,20);
        frame.add(lblSalaryJ);

        txtSalaryJ=new JTextField();
        txtSalaryJ.setBounds(120,435,170,20);
        frame.add(txtSalaryJ);

        lblAppointedByJ=new JLabel ("Appointed By:");
        lblAppointedByJ.setBounds(10,460,170,20);
        frame.add(lblAppointedByJ);

        txtAppointedByJ=new JTextField();
        txtAppointedByJ.setBounds(120,460,170,20);
        frame.add(txtAppointedByJ);

        btnAddJ=new JButton("Add");
        btnAddJ.setBounds(500,485,120,20);
        frame.add(btnAddJ);
        btnAddJ.addActionListener(this);

        lblWorkingHourJ=new JLabel("Working Hour:");
        lblWorkingHourJ.setBounds(10,485,170,20);
        frame.add(lblWorkingHourJ);

        txtWorkingHourJ=new JTextField();
        txtWorkingHourJ.setBounds(120,485,170,20);
        frame.add(txtWorkingHourJ);

        //GUI Layout for  appointing Senior Developer
        lblPlatformNumberJ=new JLabel("Platform No:");
        lblPlatformNumberJ.setBounds(10,550,100,20);
        frame.add(lblPlatformNumberJ);

        txtPlatformNumberJ=new JTextField();
        txtPlatformNumberJ.setBounds(120,550,500,20);
        frame.add(txtPlatformNumberJ);

        lblDeveloperNameJ=new JLabel("Developer name:");
        lblDeveloperNameJ.setBounds(10,575,100,20);
        frame.add(lblDeveloperNameJ);

        txtDeveloperNameJ=new JTextField();
        txtDeveloperNameJ.setBounds(120,575,500,20);
        frame.add(txtDeveloperNameJ);

        lblSpecializationJ=new JLabel("Specializatiion");
        lblSpecializationJ.setBounds(10,600,100,20);
        frame.add(lblSpecializationJ);

        txtSpecializationJ=new JTextField();
        txtSpecializationJ.setBounds(120,600,170,20);
        frame.add(txtSpecializationJ);

        lblTerminationDate2J=new JLabel("Termination Date:");
        lblTerminationDate2J.setBounds(10,625,170,20);
        frame.add(lblTerminationDate2J);

        txtTerminationDate2J=new JTextField ();
        txtTerminationDate2J.setBounds(120,625,170,20);
        frame.add(txtTerminationDate2J);

        lblAppointedDateJ=new JLabel("Appointed Date:");
        lblAppointedDateJ.setBounds(350,625,170,20);
        frame.add(lblAppointedDateJ);

        txtAppointedDateJ=new JTextField ();
        txtAppointedDateJ.setBounds(450,625,170,20);
        frame.add(txtAppointedDateJ);

        btnClear=new JButton("Clear");
        btnClear.setBounds(150,660,100,20);
        frame.add(btnClear);
        btnClear.addActionListener(this);

        btnAppointJ=new JButton("Appoint ");
        btnAppointJ.setBounds(310,660,150,20);
        frame.add(btnAppointJ);
        btnAppointJ.addActionListener(this);

        btnDisplay=new JButton("Display All");
        btnDisplay.setBounds(520,660,100,20);
        frame.add(btnDisplay);
        btnDisplay.addActionListener(this);

        //Setting frame layout
        frame.setLayout(null);
        frame.setSize(650,726);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground( Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void clearValue()            //method to clear text fields
    {
        txtPlatformS.setText("");
        txtInterviewerNameS.setText("");
        txtContractPeriodS.setText("");
        txtSalaryS.setText("");
        txtWorkingHourS.setText("");
        txtAdvanceSalaryS.setText("");
        txtPlatformNumberS.setText("");
        txtDeveloperNameS.setText("");
        txtJoiningDateS.setText("");
        txtStaffRoomNumberS.setText("");
        txtPlatformJ.setText("");
        txtPlatformNumberJ.setText("");
        txtTerminationDate2J.setText("");
        txtSalaryJ.setText("");
        txtWorkingHourJ.setText("");
        txtInterviewerNameJ.setText("");
        txtDeveloperNameJ.setText("");
        txtSpecializationJ.setText("");
        txtAppointedDateJ.setText("");
        txtTerminationDateJ.setText("");
        txtAppointedByJ.setText("");
    }

    public void addSenior()     //method to add platform for Senior Developer
    {
        try                                 //Exception handling using try and catch 
        {    //collect the text box values in string
            String platform=txtPlatformS.getText();
            String interviewerName=txtInterviewerNameS.getText();
            String contractPeriod=txtContractPeriodS.getText();
            String workingHour=txtWorkingHourS.getText();
            String salary=txtSalaryS.getText();
            if(platform.equals("")||interviewerName.equals("")||contractPeriod.equals("")||workingHour.equals("")||salary.equals(""))
            {
                JOptionPane.showMessageDialog(frame,"Field should not be left empty");
            }else{
                int contractPeriodInt=Integer.parseInt(contractPeriod);
                int workingHourInt=Integer.parseInt(workingHour);
                int salaryInt=Integer.parseInt(salary);

                SeniorDeveloper sen=new SeniorDeveloper(platform,interviewerName,salaryInt,contractPeriodInt,workingHourInt);
                platformList.add(sen);
                JOptionPane.showMessageDialog(frame,"Successfully Added");

            } 
        }        
        catch(NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(frame,"Input Invalid");
        }
        catch(NullPointerException exp)
        {
            JOptionPane.showMessageDialog(frame,"Please fill all empty fields");
        }
        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(frame,"Error","You have an Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addJunior()      //method to add platform for Junior Developer
    {
        try
        {                                                                                   //Exception handling using try and catch 
            //collect the text box values in string
            String platform=txtPlatformJ.getText();
            String interviewerName=txtInterviewerNameJ.getText();
            String appointedBy=txtAppointedByJ.getText();
            String workingHour=txtWorkingHourJ.getText();
            String salary=txtSalaryJ.getText();
            String terminationDate=txtTerminationDateJ.getText();
            if(platform.equals("")||interviewerName.equals("")||workingHour.equals("")||salary.equals("")||appointedBy.equals("")
            ||terminationDate.equals("")){
                JOptionPane.showMessageDialog(frame,"Field should not be left empty");
            }else{
                int workingHourInt=Integer.parseInt(workingHour);
                int salaryInt=Integer.parseInt(salary);                     //typecasting string to Integer

                JuniorDeveloper jun=new JuniorDeveloper(platform,interviewerName,workingHourInt,salaryInt,appointedBy,terminationDate);
                platformList.add(jun);
                JOptionPane.showMessageDialog(frame,"Successfully Added");
            } 
        }        
        catch(NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(frame,"Input Invalid");
        }
        catch(NullPointerException exp)
        {
            JOptionPane.showMessageDialog(frame,"Please fill all empty fields");
        }
        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(frame,"You have an Error","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void appointSenior()  //method to appoint Senior Developer
    {
        try                                         //Exception handling using try and catch 
        {
            //collect the text box values in string
            int platformNumberS=Integer.parseInt(txtPlatformNumberS.getText());
            String developerName=txtDeveloperNameS.getText();
            String joiningDate=txtJoiningDateS.getText();                                  
            String advanceSalaryS=txtAdvanceSalaryS.getText();
            String staffRoomNumber=txtStaffRoomNumberS.getText();
            if (developerName.equals("")|| joiningDate.equals("")||advanceSalaryS.equals("")
            ||staffRoomNumber.equals("")){
                JOptionPane.showMessageDialog(frame,"Field should not be left empty");
            }else{
                float advanceSalary=Float.parseFloat(advanceSalaryS);                           //typecasting string to Float
                if(platformList.size()>platformNumberS && platformNumberS>=0)
                {
                    Developer a=platformList.get(platformNumberS);                              //typecasting in order to itrate trough the arraylist�
                    if(a instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper s=(SeniorDeveloper)a;
                        if (s.getAppointed()==true){
                            JOptionPane.showMessageDialog(frame,"The developer is already appointed ","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            s.getHireDeveloper(developerName,joiningDate,advanceSalary,staffRoomNumber);
                            JOptionPane.showMessageDialog(frame,"Successfully Appointed");
                        }
                    }else{
                        JOptionPane.showMessageDialog(frame,"This Platform number is not for Senior Developer");
                    }
                }else{
                    JOptionPane.showMessageDialog(frame,"Number of platform available:" + platformList.size(),"Information Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(frame,"Input Invalid");
        }
        catch(NullPointerException exp)
        {
            JOptionPane.showMessageDialog(frame,"Please fill all empty fields");
        }
        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(frame,"Error","You have an Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void appointJunior()                  //method to appoint Junior Developer
    {
        try                             //Exception handling using try and catch 
        {
            int platformNumberJ=Integer.parseInt(txtPlatformNumberJ.getText());                 //typecasting string to Integer
            String developerName=txtDeveloperNameJ.getText();
            String appointedDate=txtAppointedDateJ.getText();                                   //Getting values from textfields
            String terminatedDate=txtTerminationDate2J.getText();
            String specialization=txtSpecializationJ.getText();
            if(developerName.equals("")||appointedDate.equals("")||terminatedDate.equals("")||specialization.equals(""))
            {
                JOptionPane.showMessageDialog(frame,"The field is empty");
            }else{
                if(platformList.size()>platformNumberJ && platformNumberJ>=0)
                {
                    Developer b=platformList.get(platformNumberJ);              //typecasting in order to itrate trough the arraylist�
                    if(b instanceof JuniorDeveloper)
                    {
                        JuniorDeveloper j=(JuniorDeveloper) b;                  //typecasting in order to itrate trough the arraylist�
                        if (j.getJoined()==true){
                            JOptionPane.showMessageDialog(frame,"The developer is already appointed ","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            j.appointDeveloper(developerName,appointedDate,terminatedDate,specialization);
                            JOptionPane.showMessageDialog(frame,"Successfully appointed");
                        }
                    }else{
                        JOptionPane.showMessageDialog(frame,"This Platform number is not for Junior Developer");
                    }
                }else{
                    JOptionPane.showMessageDialog(frame,"Number of platform available:" + platformList.size(),"Information Message",JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }
        catch(NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(frame,"Input Invalid");
        }
        catch(NullPointerException exp)
        {
            JOptionPane.showMessageDialog(frame,"Please fill all empty fields");
        }
        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(frame,"Error","You have an Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void displayResult()                     //method to display result
    {
        for(Developer s:platformList)
        {
            if(s instanceof SeniorDeveloper)
            {
                System.out.println("");
                System.out.println("Senior Developer:");
                System.out.println("____________________________________________________________________");
                SeniorDeveloper senDeveloper=(SeniorDeveloper) s;
                senDeveloper.display();
            }
        }
        for(Developer j:platformList)
        {
            if(j instanceof JuniorDeveloper)
            {
                System.out.println("");
                System.out.println("Junior Developer:");
                System.out.println("____________________________________________________________________");
                JuniorDeveloper jundeveloper=(JuniorDeveloper) j;
                jundeveloper.display();
            }
        }
    }

    public void terminateDeveloper()                //method to terminate developer contract
    {
        try                                         //Exception handling using try and catch 
        {
            int platformNumberS=Integer.parseInt(txtPlatformNumberS.getText());         //typecasting string to Integer
            if(platformNumberS>=0||platformNumberS<platformList.size())
            {
                Developer ter=platformList.get(platformNumberS);                //typecasting in order to itrate trough the arraylist

                if(ter instanceof SeniorDeveloper)
                {
                    SeniorDeveloper terS=(SeniorDeveloper) ter;
                    if (terS.getTerminated()==true){
                        JOptionPane.showMessageDialog(frame, "The developer has already been terminated","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        terS.getContractTermination();
                        JOptionPane.showMessageDialog(frame,"Sorry Sir ! We have terminated your contract");
                    }
                }else{ 
                    JOptionPane.showMessageDialog(frame,"Sorry, Platform number does not belong to Senior Developer .");
                }
            } 
        }

        catch(NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(frame,"Input Invalid");
        }
        catch(NullPointerException exp)
        {
            JOptionPane.showMessageDialog(frame,"Please fill all empty fields");
        }
        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(frame,"Error","You have an Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e)          //method to override actionListener and functioning of buttons
    {
        if(e.getSource()==btnClear) 
        {
            clearValue();
        }
        else  if(e.getSource()==btnAddS)
        {
            addSenior();
        }else if(e.getSource()==btnAddJ)
        {   
            addJunior();
        }else if (e.getSource()==btnAppointS)
        {
            appointSenior();
        }else if(e.getSource()==btnAppointJ)
        {
            appointJunior();
        }else if(e.getSource()==btnDisplay)
        {
            displayResult();
        }else if(e.getSource()==btnTerminate)
        {
            terminateDeveloper();
        }
    }       

    public static void main(String[]args)       //Main method
    {
        new RigoTechnology().frameLayout();
    }
}