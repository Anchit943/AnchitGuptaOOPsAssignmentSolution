package module.greatlearning.department;

class SuperDepartment                         // PARENT CLASS
{
    
    public String departmentName()
    {
        return "Super Department";
    }
    
    public String getTodaysWork()
    {
        return "No Work as of now";
    }
    
    public String getWorkDeadline()
    {
        return "Nil";
    }
    
    public String isTodayAHoliday()
    {
        return "Today is not a Holiday";
    }
}

class AdminDepartment extends SuperDepartment      // ADMIN DEPARTMENT INHERITS FROM SUPER DEPARTMENT
{
    
    public String departmentName()
    {
        return "Admin Department";
    }
    
    public String getTodaysWork()
    {
        return "Complete your documents submission";
    }
    
    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }
}

class HrDepartment extends SuperDepartment            // HR DEPARTMENT INHERITS FROM SUPER DEPARTMENT
{
	
    public String departmentName()
    {
        return "HR Department";
    }
    
    public String getTodaysWork()
    {
        return "Fill today’s timesheet and mark your attendance ";
    }
    
    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }
    
    public String doActivity() 
    {
       return "Team Lunch";
    }
}

class TechDepartment extends SuperDepartment           // TECH DEPARTMENT INHERITS FROM SUPER DEPARTMENT
{
    public String departmentName()
    {
        return "Tech Department";
    }
    
    public String getTodaysWork()
    {
        return "Complete coding of Module 1";
    }
    
    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }
    
    public String getTechStackInformation()
    {
        return "Core Java";
    }
}


public class Main                                        
{
	
	public static void main(String[] args)
	{
		
		AdminDepartment adminObj = new AdminDepartment();
		HrDepartment HRObj = new HrDepartment();
		TechDepartment TechObj = new TechDepartment();
		
		System.out.println("Welcome to "+ adminObj.departmentName()
		                    +"\n"+ adminObj.getTodaysWork() + "\n"+ adminObj.getWorkDeadline()
		                    +"\n"+ adminObj.isTodayAHoliday() +"\n"); 
		                    
		
		System.out.println("Welcome to "+ HRObj.departmentName() + "\n" + HRObj.doActivity()
		                    +"\n"+ HRObj.getTodaysWork() + "\n" + HRObj.getWorkDeadline()
		                    +"\n"+ HRObj.isTodayAHoliday() +"\n");
		                    
		System.out.println("Welcome to "+ TechObj.departmentName()
		                    + "\n" + TechObj.getTodaysWork() +"\n"+ TechObj.getWorkDeadline()
		                    +"\n"+ TechObj.getTechStackInformation() + "\n" + TechObj.isTodayAHoliday()); 
	}	   
	    
	}


