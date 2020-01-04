
/**
 * Write a description of class Developer here.
 *
 * Sirjan Baniya
 * @id (NP01CP4A180058)
 */
public class Developer
{

    //declaring instance variables
    String platform;
    String interviewerName;
    String developerName;
    int workingHours;
    
    //defining the constructor with parameters
    public Developer(String platform,String interviewerName,int workingHours)
    {
        this.platform=platform;
        this.interviewerName=interviewerName;
        this.workingHours=workingHours;
        this.developerName="";
    }
    //creating getter method for Platform 
    public String getPlatform(){ 
        return platform;
    }
    //creating getter method for interviewerName
    public String getInterviewerName(){
        return interviewerName;
    }
    //creating getter method for workingHours
    public int getWorkingHours(){ 
        return workingHours;
    }
    public String getDeveloperName(){ //method to get the name of developer
        return developerName;
    }
    //using setter method
    public void setDeveloperName(String developerName){ //method to set the name of developer
        this.developerName=developerName;
    }
    //displaying the result
    //method to display the information of developer
    public void display(){ //method to display the information of developer
        System.out.println("The platform is:"+getPlatform());
        System.out.println("The interviewer name is:"+getInterviewerName());
        System.out.println("Total working hours is:"+getWorkingHours());
        //checking conditions
        if(!developerName.equals("")){ 
            System.out.println("The name of developer is:"+getDeveloperName());
        }
        
        }
    }
            
        
        
        
        
        
    
        
    
    
    
    
    
    
    
    
    


























