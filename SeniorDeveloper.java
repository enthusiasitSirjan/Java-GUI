
/**
 * Write a description of class SeniorDeveloper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeniorDeveloper extends Developer
{
    //declaring instance variable
    int salary;
    String joiningDate;
    String staffRoomNumber;
    int contractPeriod;
    float advanceSalary;
    boolean appointed;
    boolean terminated;
    //making a constructor
    public SeniorDeveloper(String platform,String interviewerName,int salary,int contractPeriod,int workingHours )
    {
        super(platform,interviewerName,workingHours);//using the concept of inheritance
        this.salary=salary;
        this.contractPeriod =contractPeriod;
        this.joiningDate="";
        this.staffRoomNumber="";
        this.advanceSalary=0.0f;
        this.appointed=false;
        this.terminated=false;
    }
    //using getter methods
    public int getSalary(){ //method to get salary
        return salary;
    }
    public int getContractPeriod(){ //method to get contract period
        return contractPeriod;
    }
    public String getJoiningDate(){ //method to get joining date 
        return joiningDate;
    }
    public String getStaffRoomNumber(){ //method to get staff room  number
        return staffRoomNumber;
    }
    public float getAdvanceSalary(){ //method to get advance salary
        return advanceSalary;
    }
    public boolean getAppointed(){ //method to get the appointed status
        return appointed;
       
    }
    public boolean getTerminated(){ //method to get termination status
        return terminated;
    }
    //using setter methods
    public void setSalary(int salary){//method to set the salary
        this.salary=salary;
        System.out.println("The salary is updated");
    }
        
    //method to set the contract period
    public void setContractPeriod(int contractPeriod){
        this.contractPeriod=contractPeriod;
        System.out.println("Contract period has been updated");
    }
   
    //method to hire the developer with no return type
    public void getHireDeveloper(String developerName,String joiningDate,float advanceSalary,String staffRoomNumber){
        if(appointed){
            System.out.println(getDeveloperName()+" is already appointed");
            System.out.println("The room number is "+getStaffRoomNumber());
        }
        else{
            super.setDeveloperName(developerName);
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.advanceSalary=advanceSalary;
            appointed=true;
            terminated=false;
        }
    }
    //method for contract termination
    public void getContractTermination(){
        if(terminated==true){
        System.out.println("Sorry Sir ! We have terminated your contract"); 
      }
        else{
            setDeveloperName("");
            joiningDate="";
            advanceSalary=0.0f;
            appointed=false;
            terminated=true;
    }
   }
    //method to print the information of developer 
    public void print()
    {
        System.out.println("Platform is "+getPlatform());
        System.out.println("The name of interviewerName is "+getInterviewerName());
        System.out.println("The salary of developer  is "+getSalary());
        
    }
    //method with same digital signature as of developer class to display the information of developer
    public void display(){
        super.display();//calling the method from parent class
        if(appointed==true){
            System.out.println("Termination Status:"+getTerminated());
            System.out.println("Joining date:"+getJoiningDate());
            System.out.println("Advance salary:"+getAdvanceSalary());
            System.out.println("The salary of developer :"+getSalary());
            System.out.println("The developer is appointed for "+getContractPeriod());
        
        }
    }
}
        
        
    
    
    
 
        
        
        
    
    
  
    
        
    
    
    
    
    
    
    
    
    

     
   
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
            
        
        
    
    
    
    
    
    
    
    
        
        
        
        
        
    
    
    
    
    
    
   
    

