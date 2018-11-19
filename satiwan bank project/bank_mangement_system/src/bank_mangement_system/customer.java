package bank_mangement_system;

public class customer {
	
	
	String firstname;
	String lastname;
	int cnic;
	int phone_no;
	Account account = new Account();
	
	
	
	
    
 

	customer(){
    	this.firstname=firstname;
    	this.lastname=lastname;
    	this.cnic=cnic;
    	this.phone_no=phone_no;
    	
    }
    
    
    customer(String firstname,String lastname,int cnic,int phone_no, Account account ){
    	this.firstname=firstname;
    	this.lastname=lastname;
    	this.cnic=cnic;
    	this.phone_no=phone_no;
    	this.account=account;
    	
    	
    }
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	
	   public int getCnic() {
			return cnic;
		}


		public void setCnic(int cnic) {
			this.cnic = cnic;
		}


		public Account getAccount() {
			return account;
		}


		public void setAccount(Account account) {
			this.account = account;
		}

	


    
    
    
    
    
    
	public boolean equals(Object obj) {                                                        
		customer other = (customer) obj;                                                         
		if (firstname == null) {                                                            
		if (other.firstname != null)                                                    
		return false;                                                                  
		} else if (!firstname.equals(other.firstname))                                   
		return false;                                                                      
		return true;                                                                           
		}


	@Override
	public String toString() {
		return "{ Firstname : "  +  firstname  +  "\n lastname : " + lastname + " \n Cnic :" + cnic + "\n Phone_no :"
				+ phone_no + "\n Account no :: " + account.account_no + " \n Account Balance"+ account.getBalance() + "\n}";
	}             
    
}
