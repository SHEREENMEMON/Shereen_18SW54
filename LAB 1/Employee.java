class Employee{
	int salary;
	int hours;
	
	public void getInfo(int salary,int hours){
		this.salary=salary;
		this.hours=hours;
	}

	public int AddSalary(){
		if(salary>500){
			salary+=10;
					  }
		return salary;			  
		  }

    public int AddWorkHourBonus(){
    	if(hours>5){
    		salary+=5;
    				}
    	return salary;
    }


 public static void main(String[] args) {
    	Employee em=new Employee();
    	em.getInfo(300,8);
    	System.out.println(em.AddSalary());
    	System.out.println(em.AddWorkHourBonus());

    		}
    }