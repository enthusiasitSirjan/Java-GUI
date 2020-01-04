
/**
 * Write a description of class JuniorDeveloper here.
 *
 * Sirjan Baniya
 * @id (np01cp4a180058)
 */
public class JuniorDeveloper extends Developer //inheritation concept
{
    //decalaring instanace variables
    int salary;
    String appointedDate;
    String evaluationPeriod;
    String terminationDate;
    String specialization;
    String appointedBy;
    boolean joined;
    //declaring a constructor
    public JuniorDeveloper(String platform,String interviewerName,int workingHours,int salary,String appointedBy,String terminationDate)
    {
        super(platform,interviewerName,workingHours);//inheritating the parameters of constructor from the parent class
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;
        this.appointedDate="";
        this.evaluationPeriod="";
        this.specialization="";
        joined=false;
    }
    //using getter method
    public int getSalary(){//method to get salary
        return salary;
    }
    public String getAppointedBy(){//method to get appointed by
        return appointedBy;
    }
    public String getTerminationDate(){//method to get termination date
        return terminationDate;
    
    }
    public String getEvaluationPeriod(){//method to get evaluation period
        return evaluationPeriod;
    }
    public String getAppointedDate(){//method to get appointed date
        return appointedDate;
    }
    public String getSpecialization(){//method to get specialization 
        return specialization;
    }
    public boolean getJoined(){//method to get joined status
        return joined;
    }
    //using setter method for specialization
    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
    //using stter method for appointed date
    public void setAppointedDate(String appointedDate){
        this.appointedDate=appointedDate;
    }
    //using setter method for terminationDate
    public void setTerminationDate(String terminationDate){
        this.terminationDate=terminationDate;
    }
   
    //using setter method with no return type
    public void setSalary(int salary){//method to set salary
     if(joined==true){
            System.out.println("Sorry , We Cannot change the salary for already appointed person");
       
    }
    else if(joined==false){
        this.salary=salary;
    
    }
    }  
    public void setAppointedBy(String appointedBy){//method to set appointed by
        this.appointedBy=appointedBy;
     }
   //method to appoint a developer 
    public void appointDeveloper(String developerName,String appointedDate,String terminationDate,String specialization)
    {
        if(joined==false){
            super.setDeveloperName(developerName);//calling a method with parameter from the parent class
            joined=true;
        }
        else {
            System.out.println("The person has already joined");
            System.out.println("The appointed date is"+getAppointedDate());
        }
        this.appointedDate=appointedDate;
        this.terminationDate=terminationDate;
        this.specialization=specialization;
     }
    //method with same digital signature as of parent class to display the information of developer
    public void display(){
        super.display();//calling a method from parent class
        if(joined==true){
            System.out.println("The appointed date is "+getAppointedDate());
            //System.out.println("The evaluation period is "+getEvaluationPeriod());
            System.out.println("The termination date is "+getTerminationDate());
            System.out.println("The salary of developer is "+getSalary());
            System.out.println("The specialization of developer is "+getSpecialization());
            System.out.println("The developer is appointed by "+getAppointedBy());
        }
    }
    
}
   
    
    

    
        
            
            
            
            
        
        
            
        
        
            
            
        
        
        
        
        
       
    
    
    
        
    
    
    
    
    
    
    
    

    
        
    
    
    
    
    
    
    

