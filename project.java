import java.util.*;
import java.time.*;
import java.text.SimpleDateFormat;
interface Amazepay
{
    void Recharge();
    void sendMoney();
    void addMoney();
    double checkBalance();
}
class upipayments implements Amazepay
{
    static Scanner sc=new Scanner(System.in);
    static double balance=50000;
    private int pin=1234;
    static double bill;
    public void sendMoney()
    {
        System.out.println(Col.blue+Col.bold+"Enter mobile number"+Col.reset);
        String a=sc.nextLine();
        if(a.length()==10 && (a.charAt(0)=='9' || a.charAt(0)=='8' || a.charAt(0)=='7' || a.charAt(0)=='6'))
        {
            System.out.println(Col.blue+Col.bold+"Enter amount to send"+Col.reset);
            int amount=Integer.parseInt(sc.nextLine());
            while(true)
            {
                System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
                    if(amount<=balance)
                    {
                        balance=balance-amount;
                        System.out.println(Col.green+Col.bold+"Transaction Successfull "+Col.reset+"Rs."+amount);
                    }
                    else
                    {
                        System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
                    }
                    break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
            }
        }
        else
        {
            System.out.println(Col.red+Col.bold+"Invalid mobile number"+Col.reset);
            while(true)
            {
                System.out.println(Col.green+Col.bold+"Enter 1 to re-enter mobile number"+Col.reset);
                int n=Integer.parseInt(sc.nextLine());
                if(n==1)
                {
                    sendMoney();
                    break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Invalid selection please enter valid digit"+Col.reset);
                }
            }
        }
    }
    public void addMoney()
    {
        System.out.println(Col.blue+Col.bold+"Enter amount to add"+Col.reset);
        double a=Double.parseDouble(sc.nextLine());
        while(true)
        {
            System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
            int p=Integer.parseInt(sc.nextLine());
            if(p==pin)
            {
                balance=balance+a;
                System.out.println(Col.green+Col.bold+"Amount added Successfully "+Col.reset+"Rs."+a);
                break;
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid digit"+Col.reset);
            }
        }
    }
    public double checkBalance()
    {
        while(true)
        {
            System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
            int p=Integer.parseInt(sc.nextLine());
            if(p==pin)
            {
                return balance;
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid digit"+Col.reset);
            }
        }
        
    }
	void displayAirtelplans()
	{
	    System.out.println(Col.purple+" _______________________________________________________________________________________"+Col.reset);
	    System.out.println(Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"Select option "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"     Price     "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"   Days     "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    Calls      "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    Data    "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    SMS       "+Col.reset+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"|______________|_______________|____________|_______________|____________|______________!"+Col.reset);
	    System.out.println(Col.purple+"!"+Col.reset+"     1        "+Col.purple+"|"+Col.reset+"     Rs.1799   "+Col.purple+"|"+Col.reset+"   365      "+Col.purple+"|"+Col.reset+"   unlimited   |"+Col.reset+"   24GB     "+Col.purple+"|"+Col.reset+"    3600      "+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"!              |               |            |               |            |              !"+Col.reset);
	    System.out.println(Col.purple+"!"+Col.reset+"     2        "+Col.purple+"|"+Col.reset+"     Rs.3359   "+Col.purple+"|"+Col.reset+"   365      "+Col.purple+"|"+Col.reset+"   unlimited   |"+Col.reset+"   2GB/day  "+Col.purple+"|"+Col.reset+"    100/day   "+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"!              |               |            |               |            |              !"+Col.reset);
	    System.out.println(Col.purple+"!"+Col.reset+"     3        "+Col.purple+"|"+Col.reset+"     Rs.359    "+Col.purple+"|"+Col.reset+"   28       "+Col.purple+"|"+Col.reset+"   unlimited   |"+Col.reset+"   2GB/day  "+Col.purple+"|"+Col.reset+"    100/day   "+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"!______________|_______________|____________|_______________|____________|______________!"+Col.reset);
		int n=Integer.parseInt(sc.nextLine());
		if(n==1)
		{
		    while(true)
		    {
		        System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
			        bill=recharge(1799);
			        if(bill<=balance)
			        {
			            System.out.println(Col.green+Col.bold+Col.blink+"Recharge Successful"+Col.reset);
			            System.out.println("Recharge plan Amount "+bill);
		                balance-=bill;
		                //billing(bill);
			        }
			        else
			        {
			            System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
			        }
		            break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
		    }
		}
		else if(n==2)
		{
		    while(true)
		    {
		        System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
			        bill=recharge(3359);
			        if(bill<=balance)
			        {
			            System.out.println(Col.green+Col.bold+Col.blink+"Recharge Successful"+Col.reset);
			            System.out.println("Recharge plan Amount "+bill);
		                balance-=bill;
			        }
			        else
			        {
			            System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
			        }
		            break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
		    }
		}
		else if(n==3)
		{
		    while(true)
		    {
		        System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
			        bill=recharge(359);
			        if(bill<=balance)
			        {
			            System.out.println(Col.green+Col.bold+Col.blink+"Recharge Successful"+Col.reset);
			            System.out.println("Recharge plan Amount "+bill);
		                balance-=bill;
			        }
			        else
			        {
			            System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
			        }
		            break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
		    }
		}
		else
		{
			System.out.println(Col.red+Col.bold+"Invalid Selection please select valid option"+Col.reset);
		    displayAirtelplans();
		}
	}
	void displayIdeaplans()
	{
	    System.out.println(Col.purple+" _________________________________________________________________________________________"+Col.reset);
	    System.out.println(Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"Select option  "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"     Price     "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    Days    "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    Calls       "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    Data     "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    SMS      "+Col.reset+Col.purple+"|"+Col.reset);
	    System.out.println(Col.purple+"|_______________|_______________|____________|________________|_____________|_____________|"+Col.reset);
	    System.out.println(Col.purple+"!"+Col.reset+"      1        "+Col.purple+"|"+Col.reset+"     Rs.3099   "+Col.purple+"|"+Col.reset+"    365     "+Col.purple+"|"+Col.reset+"    unlimited   "+Col.purple+"|"+Col.reset+"    2GB/day  "+Col.purple+"|"+Col.reset+"    100/day  "+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"!               |               |            |                |             |             !"+Col.reset);
	    System.out.println(Col.purple+"!"+Col.reset+"      2        "+Col.purple+"|"+Col.reset+"     Rs.839    "+Col.purple+"|"+Col.reset+"    84      "+Col.purple+"|"+Col.reset+"    unlimited   "+Col.purple+"|"+Col.reset+"    3GB/day  "+Col.purple+"|"+Col.reset+"    100/day  "+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"!               |               |            |                |             |             !"+Col.reset);
	    System.out.println(Col.purple+"!"+Col.reset+"      3        "+Col.purple+"|"+Col.reset+"     Rs.359    "+Col.purple+"|"+Col.reset+"    28      "+Col.purple+"|"+Col.reset+"    unlimited   "+Col.purple+"|"+Col.reset+"    3GB/day  "+Col.purple+"|"+Col.reset+"    100/day  "+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"!_______________|_______________|____________|________________|_____________|_____________!"+Col.reset);
		int n=Integer.parseInt(sc.nextLine());
		if(n==1)
		{
		    while(true)
		    {
		        System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
			        bill=recharge(3099);
			        if(bill<=balance)
			        {
			            System.out.println(Col.green+Col.bold+Col.blink+"Recharge Successful"+Col.reset);
			            System.out.println("Recharge plan Amount "+bill);
		                balance-=bill;
			        }
			        else
			        {
			            System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
			        }
		            break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
		    }
		}
		else if(n==2)
		{
		    while(true)
		    {
		        System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
			        bill=recharge(839);
			        if(bill<=balance)
			        {
			            System.out.println(Col.green+Col.bold+Col.blink+"Recharge Successful"+Col.reset);
			            System.out.println("Recharge plan Amount "+bill);
		                balance-=bill;
			        }
			        else
			        {
			            System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
			        }
		            break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
		    }
		}
		else if(n==3)
		{
		    while(true)
		    {
		        System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
			        bill=recharge(359);
			        if(bill<=balance)
			        {
			            System.out.println(Col.green+Col.bold+Col.blink+"Recharge Successful"+Col.reset);
			            System.out.println("Recharge plan Amount "+bill);
		                balance-=bill;
			        }
			        else
			        {
			            System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
			        }
		            break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
		    }
		}
		else
		{
	        System.out.println(Col.red+Col.bold+"Invalid Selection please select valid option"+Col.reset);
		    displayIdeaplans();
		}
	}
	void displayJioplans()
	{
	    System.out.println(Col.purple+" ____________________________________________________________________________________"+Col.reset);
	    System.out.println(Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"Select option "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"     Price     "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"   Days   "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    Calls      "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"   Data      "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    SMS     "+Col.reset+Col.purple+"|"+Col.reset);
	    System.out.println(Col.purple+"|______________|_______________|__________|_______________|_____________|____________|"+Col.reset);
	    System.out.println(Col.purple+"!"+Col.reset+"      1       "+Col.purple+"|"+Col.reset+"     Rs.399    "+Col.purple+"|"+Col.reset+"   28     "+Col.purple+"|"+Col.reset+"    unlimited  "+Col.purple+"|"+Col.reset+"   3GB/day   "+Col.purple+"|"+Col.reset+"   100/day  "+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"!              |               |          |               |             |            !"+Col.reset);
	    System.out.println(Col.purple+"!"+Col.reset+"      2       "+Col.purple+"|"+Col.reset+"     Rs.1099   "+Col.purple+"|"+Col.reset+"   84     "+Col.purple+"|"+Col.reset+"    unlimited  "+Col.purple+"|"+Col.reset+"   2GB/day   "+Col.purple+"|"+Col.reset+"   100/day  "+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"!              |               |          |               |             |            !"+Col.reset);
	    System.out.println(Col.purple+"!"+Col.reset+"      3       "+Col.purple+"|"+Col.reset+"     Rs.299    "+Col.purple+"|"+Col.reset+"   28     "+Col.purple+"|"+Col.reset+"    unlimited  "+Col.purple+"|"+Col.reset+"   2GB/day   "+Col.purple+"|"+Col.reset+"   100/day  "+Col.purple+"!"+Col.reset);
	    System.out.println(Col.purple+"!______________|_______________|__________|_______________|_____________|____________!"+Col.reset);
		int n=Integer.parseInt(sc.nextLine());
		if(n==1)
		{
		    while(true)
		    {
		        System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
			        bill=recharge(399);
			        if(bill<=balance)
			        {
			            System.out.println(Col.green+Col.bold+Col.blink+"Recharge Successful"+Col.reset);
			            System.out.println("Recharge plan Amount "+bill);
		                balance-=bill;
			        }
			        else
			        {
			            System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
			        }
		            break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
		    }
		}
		else if(n==2)
		{
		    while(true)
		    {
		        System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
			        bill=recharge(1099);
			        if(bill<=balance)
			        {
			            System.out.println(Col.green+Col.bold+Col.blink+"Recharge Successful"+Col.reset);
			            System.out.println("Recharge plan Amount "+bill);
		                balance-=bill;
			        }
			        else
			        {
			            System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
			        }
		            break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
		    }
		}
		else if(n==3)
		{
		    while(true)
		    {
		        System.out.println(Col.blue+Col.bold+"Enter 4-Digit UPI PIN"+Col.reset);
                int p=Integer.parseInt(sc.nextLine());
                if(p==pin)
                {
			        bill=recharge(299);
			        if(bill<=balance)
			        {
			            System.out.println(Col.green+Col.bold+Col.blink+"Recharge Successful"+Col.reset);
			            System.out.println("Recharge plan Amount "+bill);
		                balance-=bill;
			        }
			        else
			        {
			            System.out.println(Col.red+Col.bold+"Transaction failed -Insufficient balance"+Col.reset);
			        }
		            break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Incorrect pin please enter valid pin"+Col.reset);
                }
		    }
		}
		else
		{
			System.out.println(Col.red+Col.bold+"Invalid Selection please select valid option"+Col.reset);
		    displayJioplans();
		}
	}
	public void Recharge()
	{
	    System.out.println(Col.blue+Col.bold+"Enter mobile Number"+Col.reset);
	    String a=sc.nextLine();
	    if(a.length()==10 && (a.charAt(0)=='9' || a.charAt(0)=='8' || a.charAt(0)=='7' || a.charAt(0)=='6'))
	    {
	        while(true)
	        {
	            System.out.println(Col.green+Col.bold+"Select\n"+Col.reset+"--------->1.For Airtel\n--------->2.For Idea\n--------->3.For Jio");
	            int c=Integer.parseInt(sc.nextLine());
	            if(c==1)
	            {
	                displayAirtelplans();
	                break;
	            }
	            else if(c==2)
	            {
	                displayIdeaplans();
	                break;
	            }
	            else if(c==3)
	            {
	                displayJioplans();
	                break;
	            }   
	            else
	            {
	                System.out.println(Col.red+Col.bold+"Invalid Selection please enter valid digit"+Col.reset);
	            }
	        }
	    }
	    else
	    {
	        System.out.println(Col.red+Col.bold+"Invalid Mobile number"+Col.reset);
	        while(true)
	        {
	            System.out.println(Col.green+Col.bold+"Enter 1 to re-enter mobile number"+Col.reset);
                int n=Integer.parseInt(sc.nextLine());
                if(n==1)
                {
                    Recharge();
                    break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Invalid Selection please enter valid digit"+Col.reset);
                }
	        }
	    }
	}
	double recharge(int plan)
	{
		return plan;
	}
    void selection()
    {
	System.out.println(Col.blink+Col.yellow+"                                       ###    ##     ##    ###    ######## ######## ########     ###    ##    ## ");
        System.out.println("                                      ## ##   ###   ###   ## ##        ##  ##       ##     ##   ## ##    ##  ##  ");
        System.out.println("                                     ##   ##  #### ####  ##   ##      ##   ##       ##     ##  ##   ##    ####   ");
        System.out.println("                                    ##     ## ## ### ## ##     ##    ##    ######   ########  ##     ##    ##    ");
        System.out.println("                                    ######### ##     ## #########   ##     ##       ##        #########    ##    ");
        System.out.println("                                    ##     ## ##     ## ##     ##  ##      ##       ##        ##     ##    ##    ");
        System.out.println("                                    ##     ## ##     ## ##     ## ######## ######## ##        ##     ##    ##    "+Col.reset);
		System.out.println();
		System.out.println();
		while(true)
		{
	        System.out.println(Col.green+Col.bold+"Select\n"+Col.reset+"--------->1.Mobile recharge\n--------->2.Send money\n--------->3.Add money\n--------->4.Check balance");
	        int c=Integer.parseInt(sc.nextLine());
	        if(c==1)
	        {
	            Recharge();
	            System.out.println(Col.green+Col.bold+"Enter 1 to continue or any other digit to exit from AmaZepay"+Col.reset);
	            int b=Integer.parseInt(sc.nextLine());
		        if(b==1)
		        {
		            selection();
		        }
	            break;
	        }
		    else if(c==2)
		    {
		            sendMoney();
		            System.out.println(Col.green+Col.bold+"Enter 1 to continue or any other digit to exit from AmaZepay"+Col.reset);
		            int b=Integer.parseInt(sc.nextLine());
		            if(b==1)
		            {
		                selection();
		            }
		            break;
		    }
		    else if(c==3)
		    {
	            addMoney();
		        System.out.println(Col.green+Col.bold+"Enter 1 to continue or any other digit to exit from AmaZepay"+Col.reset);
		        int b=Integer.parseInt(sc.nextLine());
		        if(b==1)
		        {
		            selection();
		        }
		        break;
		    }
		    else if(c==4)
		    {
		        System.out.println("Available balance "+checkBalance());
		        //System.out.println("Available balance "+balance);
		        System.out.println(Col.green+Col.bold+"Enter 1 to continue or any other digit to exit from AmaZepay"+Col.reset);
		        int b=Integer.parseInt(sc.nextLine());
		        if(b==1)
		        {
		            selection();
		        }
		        break;
		    }
		    else
		    {
		        System.out.println(Col.red+Col.bold+"Invalid selection please enter valid digit"+Col.reset);
		    }
		}
    }
}

class Login
{
    static Scanner sc=new Scanner(System.in);
    Random r=new Random();
    Electronics x3=new Electronics();
    private String user_name="hello";
    private String password="hello@123";
    private String phn="1234567890";
    String getu()
    {
        return user_name;
    }
    String getp()
    {
        return password;
    }
    String getph()
    {
        return phn;
    }
    void setu(String user_name)
    {
        this.user_name=user_name;
    }
    void setp(String password)
    {
        this.password=password;
    }
    void setph(String phn)
    {
        this.phn=phn;
    }
    void select()
    {
        System.out.println(Col.green+"Please Select login or Signup"+Col.reset);
        System.out.println(Col.yellow+"1. LOGIN"+Col.purple+Col.bold+"\n2. SIGNUP"+Col.reset);
        int n1=sc.nextInt();
        if(n1==1)
        {
            login();
        }
        else if(n1==2)
        {
            System.out.println(Col.backwhite+Col.yellow+Col.blink+"Welcome New User"+Col.reset);
            signup();
        }
    }
    static int check=0;
    void login()
    {
        System.out.println(Col.bold+Col.yellow+Col.blink+"Please enter your login details for AmaZehub Shopping"+Col.reset);
        System.out.print(Col.blue+Col.under+"Plaese enter your username"+Col.reset+Col.yellow+" ->  "+Col.reset);
	String avoidingerror1 = sc.nextLine();
        String user_name=sc.nextLine();
	System.out.println();
        System.out.print(Col.skyblue+Col.under+"Plaese enter your password"+Col.reset+Col.yellow+" ->  "+Col.reset);
        String password=sc.next();
	System.out.println();
        if(getu().equals(user_name) && getp().equals(password))
        {
	    check++;
            System.out.println(Col.green+Col.bold+Col.blink+"										Login Successful"+Col.reset);
	    System.out.println();
            while(true)
            {
                System.out.println(Col.yellow+"						  		  WELCOME BACK Mr. "+Col.reset+Col.bold+user_name+Col.reset+Col.yellow+" Continue Your Shopping:)"+Col.reset);
                System.out.println();
                while(true)
                {
                    System.out.println(Col.blue+Col.bold+"				```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		    System.out.println(Col.blue+Col.bold+"				`                                                                                                                         `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           *~~~~~~~~~~~~>"+Col.skyblue+Col.bold+" S.NO"+Col.reset+Col.yellow+" <~~~~~~~~~~~~~~~>"+Col.skyblue+Col.bold+" CATEGORY "+Col.reset+Col.yellow+"<~~~~~~~~~~~~~~~>"+Col.skyblue+Col.bold+" DESCRIPTION / BRIRF" +Col.reset+Col.yellow+"<~~~~~~~~~~~~*"+Col.blue+Col.bold+"            `"+Col.reset);
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!                                                                                               !!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"              1                     ELECTRONICS                MOBILES, LAPTOPS, TV'S          "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"                                                               WASHING MACHINES, etc...        "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!                                                                                               !!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"              2                     AMAZEPAY                   UPI, MOBILE RECHARGE, SEND      "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"                                                               MONEY & much more...            "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!                                                                                               !!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"              3                     FASHION                    CLOTHES- MENS WEAR,             "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"                                                               WOMENS WEAR, etc..              "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!                                                                                               !!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"              4                     GROCERY                    RICE,  SUGAR, OIL               "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"                                                               DETERGENT, etc..                "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!                                                                                               !!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"              5                     KICHEN APPLIANCES          KETTLES, JUICERS,               "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"                                                               MIXERGRINDERS, etc..            "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!                                                                                               !!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"              6                     FURNITURE                  CHAIR'S, BED'S, SOFA            "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!"+Col.reset+Col.bold+"                                                               SETS,DINNING TABLES, etc..      "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!                                                                                               !!"+Col.blue+Col.bold+"           `");
		    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"	    !!"+Col.reset+Col.bold+"		    7			  MOVIES		     BOOKING MOVIE TICKETS 	     "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"		  `");
		    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!                                                                                               !!"+Col.blue+Col.bold+"           `");
		    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"	    !!"+Col.reset+Col.bold+"		    8			  TRAVELS		     BOOK BUS/TRAIN TICKETS	     "+Col.reset+Col.yellow+"!!"+Col.blue+Col.bold+"		  `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           !!                                                                                               !!"+Col.blue+Col.bold+"           `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"           ^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^"+Col.blue+Col.bold+"            `");
                    System.out.println(Col.blue+Col.bold+"				`"+Col.reset+Col.yellow+"                                                                                                                        "+Col.blue+Col.bold+" `");
                    System.out.println(Col.blue+Col.bold+"				```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````"+Col.reset);
                    System.out.println();
                    System.out.println(Col.bold+Col.purple+"please select the category for shopping "+Col.reset);
                    int opt=Electronics.sc.nextInt();
                    if(opt==1)
                    {
            	        Electronics obj = new Electronics();
            	        obj.selection();
            	        break;
                    }
                    else if(opt==2)
                    {
            	        upipayments x = new upipayments();
            	        x.selection();
            	        break;
                    }
                    else if(opt ==3)
                    {
                        Clothes x1 = new Clothes();
                        x1.selection();
                        break;
                    }
		    else if(opt == 4)
		    {
		 	Grocery x2 = new Grocery();
			x2.selection();
			break;
		    }
		    else if(opt == 5)
		    {
			KitchenAppliances x3 = new KitchenAppliances();
			x3.selection();
			break;
		    }
		    else if(opt == 6)
		    {
			Furniture x4 = new Furniture();
			x4.selection();
			break;
		    }
		    else if(opt == 7)
		    {
			Movies x5 = new Movies();
			x5.location();
			break;
		    }
		    else if(opt == 8)
		    {
			Travels x6 = new Travels();
			x6.selection();
			break;
		    }
                    else
                    {
                        System.out.println(Col.bold+Col.red+"Invalid Selection!!, please enter correct input"+Col.reset);
                    }
                }
                System.out.println(Col.backblack+Col.yellow+"Are u want to shop more"+Col.reset);
		System.out.println(Col.bold+Col.red+Col.blink+"------------------------->"+Col.reset+Col.green+Col.bold+" 1- Go to Main Page of AmaZehub "+Col.reset);
		System.out.println(Col.bold+Col.red+Col.blink+"------------------------->"+Col.reset+Col.skyblue+Col.bold+" 2- Billing"+Col.reset);
		System.out.println(Col.bold+Col.red+Col.blink+"------------------------->"+Col.reset+Col.red+Col.bold+" 3- Exit from AmaZehub"+Col.reset);
                int select = sc.nextInt();
                if(select == 1)
                {
                }
		else if(select== 2)
    	        {
	            break;
		}
		else if(select == 3)
		{
		    System.out.println("THANK YOU, HAVE A NICE DAY");
		    System.exit(0);
		}
	        else
		{
	            System.out.println(Col.red+Col.bold+Col.blink+"Invalid Selection!!!"+Col.reset);
		}
            }
        }
        else if(!getu().equals(user_name) && getp().equals(password))
        {
            System.out.println(Col.backblack+Col.red+Col.bold+"You Entered Incorrect Username"+Col.reset+Col.yellow+Col.bold+" \nDo you want to change username or Display the Username"+Col.reset
);
            System.out.println(Col.bold+"Press 1 for display the username \nPress 2 for Update the username"+Col.reset);
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.println(Col.bold+"Please Enter your Mobile Number"+Col.reset);
                String phn=sc.next();
                if(getph().equals(phn))
                {
                    System.out.println(getu());
                    login();
                }
                else if(!getph().equals(phn)){
                    System.out.println(Col.red+"Invalid Mobile Number"+Col.reset);

                }
                else
                {
                    System.out.println(Col.bold+Col.red+"EXIT"+Col.reset);
                }
            }
            else if(n==2)
            {
                System.out.println(Col.bold+Col.green+"Enter new Username"+Col.reset);
                String s=sc.next();
                setu(s);
                login();
            }
            else
            {
                System.out.println(Col.bold+Col.red+"Imvalid Selection");
            }
        }
        else if(getu().equals(user_name)&& !getp().equals(password))
        {
            System.out.println(Col.backblack+Col.red+Col.bold+"You entered Incorrect Password"+Col.reset);
             System.out.println(Col.bold+"Press 1 for display the password \nPress 2 for Update the password"+Col.reset);
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.println(Col.bold+"Please Enter your Mobile Number"+Col.reset);
                String phn=sc.next();
                if(getph().equals(phn))
                {
                    System.out.println(getp());
                    login();
                }
                else if(!getph().equals(phn)){
                    System.out.println(Col.red+"Invalid Mobile Number"+Col.reset);
                }
                else
                {
                    System.out.println(Col.bold+Col.red+"EXIT"+Col.reset);
                }
            }
            else if(n==2)
            {
                System.out.println(Col.bold+Col.green+"Enter new Password"+Col.reset);
                String s=sc.next();
                setp(s);
                login();
            }
            else
            {
                System.out.println(Col.bold+Col.red+"EXIT"+Col.reset);
            }
        }
        else if(!getu().equals(user_name) && !getp().equals(password))
        {
            System.out.println(Col.backblack+Col.red+Col.bold+"You Entered both Username and Password Incorrect "+Col.reset+Col.bold+"\nPress 1 for update both or press any key exit"+Col.reset);
            char c=sc.next().charAt(0);
            if(c=='1')
            {
                System.out.println(Col.bold+Col.green+"Please Enter the new Username"+Col.reset);
                String s=sc.next();
                setu(s);
                System.out.println(Col.purple+Col.blink+"Your Username Updated Successfully"+Col.reset);
                System.out.println(Col.bold+Col.green+"Enter your new Password"+Col.reset);
                String s1=sc.next();
                setp(s1);
                System.out.println(Col.purple+Col.blink+"Your Password Updated Successfully"+Col.reset);
                login();
            }
            else
            {
                System.out.println(Col.bold+Col.red+"EXIT"+Col.reset);
            }
        }
        else{
            System.out.println(Col.bold+Col.red+"EXIT"+Col.reset);
        }
        
    }
    void signup()
    {
        mb();
        System.out.println(Col.bold+Col.skyblue+"Enter a Username"+Col.reset);
	String avoidingerror2 = sc.nextLine();
        String m2=sc.nextLine();
        System.out.println(Col.bold+Col.yellow+"Enter a Password"+Col.reset);
        String m3=sc.next();
        setu(m2);
        setp(m3);
        System.out.println(Col.bold+Col.green+"Congrats Your Account Created"+Col.reset);
        System.out.println(Col.bold+Col.under+"Please login"+Col.reset);
        login();
    }
    void mb()
    {
        System.out.println(Col.bold+Col.white+"Enter your Mobile Number for Signup"+Col.reset);
        String m1=sc.next();
        if(m1.length()==10 && m1.charAt(0)!='0')
        {
            int a=ran();
            System.out.println(Col.green+"Your OTP is "+Col.reset+a);
            val(a);
            setph(m1);
        }
        else
        {
            System.out.println(Col.yellow+"Number Chusko"+Col.reset);
            signup();
        }
    }
    void val(int a)
    {
        System.out.print(Col.bold+Col.yellow+"Please enter your OTP --> "+Col.reset);
        int a1=sc.nextInt();
        if(a1==a)
        {
        }
        else
        {
            System.out.println(Col.red+"OTP is Invalid"+Col.reset);
            System.out.println(Col.bold+"1 for try again 2 for resend OTP"+Col.reset);
            int n=sc.nextInt();
            if(n==1)
            {
                val(a);
            }
            else
            {
                int n1=ran();
                System.out.println(Col.bold+Col.yellow+"Your OTP is "+Col.reset+n1);
                val(n1);
             }
        }
    }
    int ran()
    {
        return (int)(r.nextDouble()*1000)+1000;
    }
}

class Col
{
    static String reset="\u001B[0m";      
    static String bold="\u001B[1m";
    static String blink="\u001B[5m";
    static String red="\u001B[31m";
    static String green="\u001B[32m";
    static String yellow="\u001B[33m";
    static String blue="\u001B[34m";
    static String black = "\u001B[40m";
    static String skyblue = "\u001B[36m";
    static String white = "\u001B[37m";
    static String purple="\u001B[35m";
    static String under="\u001B[21m";
    static String backred = "\u001B[41m";
    static String backblue = "\u001B[44m";
    static String backcyan = "\u001B[46m";
    static String backblack = "\u001B[40m";
    static String backgreen = "\u001B[42m";
    static String backyellow = "\u001B[103m";
    static String backyellowdark = "\u001B[43m";
    static String backwhite = "\u001B[107m";
    static String backpurple ="\u001B[45m";
}

interface Clothes_Main
{
  void Kids (int Model);
  void Womens (int Model);
  void Mens (int Model);
}
class Clothes implements Clothes_Main
{
  static Scanner sc = new Scanner (System.in);
  static double bill = 0;
  void selection ()
  {
	System.out.println(Col.bold+Col.purple+Col.blink+"			    				#######                                      ");
        System.out.println("			    				#         ##    ####  #    # #  ####  #    # ");
        System.out.println("			    				#        #  #  #      #    # # #    # ##   # ");
        System.out.println("			    				#####   #    #  ####  ###### # #    # # #  # ");
        System.out.println("			    				#       ######      # #    # # #    # #  # # ");
        System.out.println("			    				#       #    # #    # #    # # #    # #   ## ");
        System.out.println("			    				#       #    #  ####  #    # #  ####  #    # ");
        System.out.println();                                   
        System.out.println("				    			 #####                                       ");
        System.out.println("				    			#     # ######  ####  ##### #  ####  #    #  ");
        System.out.println("			    				#       #      #    #   #   # #    # ##   #  ");
        System.out.println("			    				 #####  #####  #        #   # #    # # #  #  ");
        System.out.println("			                                      # #      #        #   # #    # #  # #  ");
        System.out.println("				    			#     # #      #    #   #   # #    # #   ##  ");
        System.out.println("			     				 #####  ######  ####    #   #  ####  #    #  "+Col.reset);
        System.out.println();
        System.out.println();

        System.out.println(Col.red+Col.bold+"                                           ---------"+Col.yellow+" S.No "+Col.red+"--------"+Col.yellow+" Category "+Col.red+"-------------"+Col.yellow+" Offers "+Col.red+"----------");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"1            KIDS                   "+Col.green+Col.blink+"UP TO 20% OFF   "+Col.reset+Col.bold+Col.red+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"2            WOMENS                 "+Col.green+Col.blink+"UP TO 15% OFF   "+Col.reset+Col.bold+Col.red+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"3            MENS                   "+Col.green+Col.blink+"UP TO 10% OFF   "+Col.reset+Col.bold+Col.red+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           ----------------------------------------------------------------"+Col.reset);
        System.out.println();
        System.out.print(Col.bold+"Please Select the Category You Want"+Col.reset);
        int select = sc.nextInt();
        //Kids
        if (select == 1)
        {
            	System.out.println (Col.blue+Col.bold+" 					   ___________________________________________ ");
            	System.out.println (Col.blue+Col.bold+" 					  |                                           |");
        	System.out.println (Col.blue+Col.bold+" 					  |      !! Welcome to Kids Collection !!     |");
        	System.out.println (Col.blue+Col.bold+" 					  |-------------------------------------------|");
        	System.out.println (Col.blue+Col.bold+" 					  |         SL.NO           CATEGORY          |");
        	System.out.println (Col.blue+Col.bold+" 					  |                                           |");
        	System.out.println (Col.blue+Col.bold+" 					  |          1              GIRLS             |");
        	System.out.println (Col.blue+Col.bold+" 					  |                                           |");
        	System.out.println (Col.blue+Col.bold+" 					  |          2              BOYS              |");
        	System.out.println (Col.blue+Col.bold+" 					  |___________________________________________|"+Col.reset);
        	System.out.println();
        	System.out.println(Col.bold+"Please Select the Category You Want"+Col.reset);
        	int KidsSelection = sc.nextInt();
    	    Kids (KidsSelection);
        }
        //Women
        else if (select == 2)
        {
            	System.out.println (Col.blue+Col.bold+"  					  ________________________________________________ ");
            	System.out.println (Col.blue+Col.bold+"  					 |                                                |");
        	System.out.println (Col.blue+Col.bold+"  					 |      !! Welcome to Women Collection !!         |");
        	System.out.println (Col.blue+Col.bold+"  					 |------------------------------------------------|");
        	System.out.println (Col.blue+Col.bold+"  					 |         SL.NO           CATEGORY               |");
        	System.out.println (Col.blue+Col.bold+"  					 |                                                |");
        	System.out.println (Col.blue+Col.bold+"  					 |          1              TRADITIONAL            |");
        	System.out.println (Col.blue+Col.bold+"  					 |                                                |");
        	System.out.println (Col.blue+Col.bold+"  					 |          2              WESTERN COLLCTION      |");
        	System.out.println (Col.blue+Col.bold+"  					 |________________________________________________|"+Col.reset);
        	System.out.println();
        	System.out.println(Col.bold+"Please Select the Category You Want"+Col.reset);
        	int WomensSelection = sc.nextInt();
        	Womens (WomensSelection);
        }
        //Mens
        else if (select == 3)
        {
    	        System.out.println (Col.blue+Col.bold+"  					  ________________________________________________ ");
                System.out.println (Col.blue+Col.bold+"  					 |                                                |");
        	System.out.println (Col.blue+Col.bold+"  					 |      !! Welcome to Mens Collection !!          |");
        	System.out.println (Col.blue+Col.bold+"  					 |------------------------------------------------|");
        	System.out.println (Col.blue+Col.bold+"  					 |         SL.NO           CATEGORY               |");
        	System.out.println (Col.blue+Col.bold+"  					 |------------------------------------------------|");
        	System.out.println (Col.blue+Col.bold+"  					 |          1       -      1.  T-SHIRTS           |");
        	System.out.println (Col.blue+Col.bold+"  					 |                         2.  SHIRTS             |");
        	System.out.println (Col.blue+Col.bold+"  					 |                         3.  JACKETS            |");
        	System.out.println (Col.blue+Col.bold+"  					 |                         4.  SWEAT SHIRTS       |");
        	System.out.println (Col.blue+Col.bold+"  					 |------------------------------------------------|");
          	System.out.println (Col.blue+Col.bold+"  					 |          2       -      1.  JEANS              |");
          	System.out.println (Col.blue+Col.bold+"  					 |                         2.  CARGO              |");
    	        System.out.println (Col.blue+Col.bold+"  					 |                         3.  CHINOS             |");
    		System.out.println (Col.blue+Col.bold+"  					 |                         4.  JOGGERS            |");
        	System.out.println (Col.blue+Col.bold+"  					 |________________________________________________|"+Col.reset);
        	System.out.println();
        	System.out.println(Col.bold+"Please Select the Category You Want"+Col.reset);
        	int MensSelection = sc.nextInt();
        	Mens (MensSelection);
        }
        else
        {
        	System.out.println (Col.red+Col.bold+Col.blink+"INVALID!! "+Col.reset+Col.yellow+Col.bold+"\nenter correct Option"+Col.reset);
        	selection ();
        }
      }
  public void Kids (int Model)
  {
    //Girls 
    if (Model == 1)
    {
        System.out.println (Col.purple+Col.bold+"   					   ____________________________________________________________________________ ");
        System.out.println (Col.purple+Col.bold+"   					  |                                                                            |");
    	System.out.println (Col.purple+Col.bold+"   					  |        Hey... Happy Day...! Happy to See You Here Enjoy Your Shopping      |");
    	System.out.println (Col.purple+Col.bold+"   					  |----------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"   					  |                       You Selected Option Girls                            |");
    	System.out.println (Col.purple+Col.bold+"   					  |----------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"   					  |             SL.NO              ITEMS             Cost                      |");
    	System.out.println (Col.purple+Col.bold+"   					  |                                                                            |");
    	System.out.println (Col.purple+Col.bold+"   					  |               1.              T-Shirts           399/-                     |");
    	System.out.println (Col.purple+Col.bold+"   					  |                                                                            |");
    	System.out.println (Col.purple+Col.bold+"   					  |               2.              Shirts             499/-                     |");
    	System.out.println (Col.purple+Col.bold+"   					  |                                                                            |");
    	System.out.println (Col.purple+Col.bold+"   					  |               3.              Frocks             1299/-                    |");
    	System.out.println (Col.purple+Col.bold+"   					  |                                                                            |");
    	System.out.println (Col.purple+Col.bold+"   					  |               4.              Jeans              799/-                     |");
    	System.out.println (Col.purple+Col.bold+"   					  |____________________________________________________________________________|"+Col.reset);
        System.out.println();
        System.out.println(Col.bold+"Please Select the item You Want"+Col.reset);
    	int select = sc.nextInt();
    	if (select == 1)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  T-Shirts \nprice is " +(399 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 399 * quantity;
    	}
    	else if (select == 2)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Shirts- \nprice is " +(499 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 499 * quantity;
    	}
    	else if (select == 3)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Frocks- \nprice is " +(1299 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 1299 * quantity;
    	}
    	else if (select == 4)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Jeans- \nprice is " +(799 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 799 * quantity;
    	}
    	else
    	{
    	    System.out.println (Col.red+Col.bold+"Item not found"+Col.reset);
    	}
    }
    //Boys
    else if (Model == 2)
    {
        System.out.println (Col.purple+Col.bold+"   					   ___________________________________________________________________________________");
        System.out.println (Col.purple+Col.bold+"   					  |                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"   					  |         Hey... Happy Day...! Happy to See You Here Enjoy Your Shopping            |");
        System.out.println (Col.purple+Col.bold+"   					  |-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"   					  |                      You Selected Option Boys                                     |");
    	System.out.println (Col.purple+Col.bold+"   					  |-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"   					  |               SL.NO        ITEMS                    COST                          |");
    	System.out.println (Col.purple+Col.bold+"   					  |                                                                                   |");
	System.out.println (Col.purple+Col.bold+"   					  |                1.          T-Shirts                 299/-                         |");
    	System.out.println (Col.purple+Col.bold+"   					  |                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"   					  |                2.          Shirts                   599/-                         |");
    	System.out.println (Col.purple+Col.bold+"   					  |                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"   					  |                3.          Regular Wear             699/-                         |");
    	System.out.println (Col.purple+Col.bold+"   					  |                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"   					  |                4.          Jeans                    999/-                         |");
    	System.out.println (Col.purple+Col.bold+"   					  |___________________________________________________________________________________|"+Col.reset);
        System.out.println();
        System.out.println(Col.bold+"Please Select the item You Want"+Col.reset);
    	int select = sc.nextInt();
    	if (select == 1)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  T-Shirts \nprice is " +(299 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 299 * quantity;
    	}
    	else if (select == 2)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Shirts- \nprice is " +(599 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 599 * quantity;
    	}
    	else if (select == 3)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Regular Wear- \nprice is " +(699 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 699 * quantity;
    	}
    	else if (select == 4)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Jeans- \nprice is " +(999 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 999 * quantity;
    	}
    	else
    	{
    	    System.out.println (Col.red+Col.bold+"Item not found"+Col.reset);
    	}
    }
    else
    {
        System.out.println(Col.backred+Col.bold+"Invalid Input!!"+Col.reset);
    }
  }
  public void Womens (int Model)
  {
    //Womens 
    if (Model == 1)
    {
        System.out.println (Col.purple+Col.bold+"    					  ___________________________________________________________________________________");
        System.out.println (Col.purple+Col.bold+"    					 |                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"    					 |         Hey... Happy Day...! Happy to See You Here Enjoy Your Shopping            |");
        System.out.println (Col.purple+Col.bold+"    					 |-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"    					 |                      You Selected Option Womens                                   |");
    	System.out.println (Col.purple+Col.bold+"    					 |-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"    					 |               SL.NO       ITEMS                    Cost                           |");
    	System.out.println (Col.purple+Col.bold+"    					 |                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"    					 |                1.        Lehanga Choli             1499/-                         |");
    	System.out.println (Col.purple+Col.bold+"    					 |                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"    					 |                2.        Palazoo                   1099/-                         |");
    	System.out.println (Col.purple+Col.bold+"    					 |                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"    					 |                3.        Designer Dupatta--        1299/-                         |");
    	System.out.println (Col.purple+Col.bold+"    					 |                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"    					 |                4.        Anarkali Suit-            1399/-                         |");
    	System.out.println (Col.purple+Col.bold+"    					 |___________________________________________________________________________________|"+Col.reset);
        System.out.println();
        System.out.println(Col.bold+"Please Select the item You Want"+Col.reset);
    	int select = sc.nextInt();
    	if (select == 1)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Lehanga Choli \nprice is " +(1499 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 1499 * quantity;
    	}
    	else if (select == 2)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Palazzo- \nprice is " +(1099 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 1099 * quantity;
    	}
    	else if (select == 3)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Designer Dupatta-- \nprice is " +(1299 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 1299 * quantity;
    	}
    	else if (select == 4)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Anarkali Suit- \nprice is " +(1399 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 1399 * quantity;
    	}
    	else
    	{
    	    System.out.println (Col.red+Col.bold+"Item not found"+Col.reset);
    	}
    }
    //Western 
    else if (Model == 2)
    {
    	System.out.println (Col.purple+Col.bold+"       					 ___________________________________________________________________________________");
        System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|         Hey... Happy Day...! Happy to See You Here Enjoy Your Shopping            |");
        System.out.println (Col.purple+Col.bold+"       					|-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"       					|                      You Selected Option Womens                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"       					|               SL.NO        ITEMS               Cost                               |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                1.         T-Shirts             799/-                              |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                2.         Shirts               999/-                              |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                3.         Frocks               1699/-                             |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                4.         Jeans                899/-                              |");
    	System.out.println (Col.purple+Col.bold+"       					|___________________________________________________________________________________|"+Col.reset);
        System.out.println();
        System.out.println(Col.bold+"Please Select the item You Want");
    	int select = sc.nextInt();
    	if (select == 1)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  T-Shirts \nprice is " +(799 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 799 * quantity;
    	}
    	else if (select == 2)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Shirts- \nprice is " +(999 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 999 * quantity;
    	}
    	else if (select == 3)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Frocks- \nprice is " +(1699 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 1699 * quantity;
    	}
    	else if (select == 4)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Jeans- \nprice is " +(899 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 899 * quantity;
    	}
    	else
    	{
    	    System.out.println (Col.red+Col.bold+"Item not found"+Col.reset);
    	}
    }
    else
    {
        System.out.println(Col.backred+Col.bold+"Invalid Input!!"+Col.reset);
    }
}
  public void Mens (int Model)
  {
    //Mens 
    if (Model == 1)
    {
        System.out.println (Col.purple+Col.bold+"       					 ___________________________________________________________________________________");
        System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|         Hey... Happy Day...! Happy to See You Here Enjoy Your Shopping            |");
        System.out.println (Col.purple+Col.bold+"       					|-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"       					|                      You Selected Option Mens                                     |");
    	System.out.println (Col.purple+Col.bold+"       					|-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"       					|               SL.NO       ITEMS                 Cost                              |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                1.         T-Shirts              699/-                             |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                2.         Shirts                299/-                             |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                3.         Jackets               1099/-                            |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                4.         Sweat Shirts          799/-                             |");
    	System.out.println (Col.purple+Col.bold+"       					|___________________________________________________________________________________|"+Col.reset);
        System.out.println();
        System.out.println(Col.bold+"Please Select the items You Want"+Col.reset);
    	int select = sc.nextInt();
    	if (select == 1)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  T-Shirts \nprice is " +(699 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 699 * quantity;
    	}
    	else if (select == 2)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Shirts- \nprice is " +(299 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 299 * quantity;
    	}
    	else if (select == 3)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Jackets- \nprice is " +(1099 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 1099 * quantity;
    	}
    	else if (select == 4)
    	{
    	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	int quantity = sc.nextInt();
    	    System.out.println (Col.yellow+Col.bold+"you selected  Sweat Shirt- \nprice is " +(799 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
    	    bill = bill + 799 * quantity;
    	}
    	else
    	{
    	    System.out.println (Col.red+Col.bold+"Item not found"+Col.reset);
    	}
    }
    //Jeans 
    else if (Model == 2)
    {
        System.out.println (Col.purple+Col.bold+"       					 ___________________________________________________________________________________");
        System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|         Hey... Happy Day...! Happy to See You Here Enjoy Your Shopping            |");
        System.out.println (Col.purple+Col.bold+"       					|-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"       					|                      You Selected Option Mens                                     |");
    	System.out.println (Col.purple+Col.bold+"       					|-----------------------------------------------------------------------------------|");
    	System.out.println (Col.purple+Col.bold+"       					|               SL.NO       ITEMS                Cost                               |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                1.         Jeans                1099/-                             |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                2.         Cargos               1299/-                             |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                3.         Chinos               899/-                              |");
    	System.out.println (Col.purple+Col.bold+"       					|                                                                                   |");
    	System.out.println (Col.purple+Col.bold+"       					|                4.         Joggers              1699/-                             |");
    	System.out.println (Col.purple+Col.bold+"       					|___________________________________________________________________________________|"+Col.reset);
        System.out.println();
        System.out.println(Col.bold+"Please Select the items You Want"+Col.reset);
        	int select = sc.nextInt();
        	if (select == 1)
        	{
        	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	    int quantity = sc.nextInt();
        	    System.out.println (Col.yellow+Col.bold+"you selected  Jeans- \nprice is " +(1099 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
        	    bill = bill + 1099 * quantity;
        	}
        	else if (select == 2)
        	{
        	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	    int quantity = sc.nextInt();
        	    System.out.println (Col.yellow+Col.bold+"you selected  Cargos- \nprice is " +(1299 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
        	    bill = bill + 1299 * quantity;
        	}
        	else if (select == 3)
        	{
        	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	    int quantity = sc.nextInt();
        	    System.out.println (Col.yellow+Col.bold+"you selected  Chinos- \nprice is " +(899 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
        	    bill = bill + 899 * quantity;
        	}
        	else if (select == 4)
        	{
        	    System.out.println (Col.bold+Col.green+"enter quantity"+Col.reset);
        	    int quantity = sc.nextInt();
        	    System.out.println (Col.yellow+Col.bold+"you selected  Joggers- \nprice is " +(1699 * quantity) +"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
        	    bill = bill + 1699 * quantity;
        	}
        	else
        	{
        	    System.out.println (Col.red+Col.bold+"Item not found"+Col.reset);
        	}
        }
	else
	{
	    System.out.println(Col.backred+Col.bold+"Invalid Input!!"+Col.reset);
	}
    }
}


interface Furniture_Main
{
    public void chair();
    public void beds();
    public void sofaset();
    public void dining_table_set();
    public void dressing();
}
class Furniture implements Furniture_Main
{
    static Scanner sc = new Scanner(System.in);
    static double bill =0;
    void selection()
    {

	System.out.println(Col.skyblue+Col.bold+Col.blink+"							#######                                                  ");
	System.out.println("							#       #    # #####  #    # # ##### #    # #####  ######");
	System.out.println("							#       #    # #    # ##   # #   #   #    # #    # #     ");
	System.out.println("							#####   #    # #    # # #  # #   #   #    # #    # ##### ");
	System.out.println("							#       #    # #####  #  # # #   #   #    # #####  #     ");
	System.out.println("							#       #    # #   #  #   ## #   #   #    # #   #  #     ");
	System.out.println("							#        ####  #    # #    # #   #    ####  #    # ######");
	System.out.println();                                                         
	System.out.println("							 #####                                                   ");
	System.out.println("							#     # ######  ####  ##### #  ####  #    #              ");
	System.out.println("							#       #      #    #   #   # #    # ##   #              ");
	System.out.println("							 #####  #####  #        #   # #    # # #  #              ");
	System.out.println("							      # #      #        #   # #    # #  # #              ");
	System.out.println("							#     # #      #    #   #   # #    # #   ##              ");
	System.out.println("							 #####  ######  ####    #   #  ####  #    #              "+Col.reset);
	System.out.println();

        System.out.println(Col.yellow+Col.bold+"                                           ---------"+Col.green+" S.No "+Col.yellow+"--------"+Col.green+" Category "+Col.yellow+"-------------"+Col.green+" Offers "+Col.yellow+"----------");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"1            CHAIRS                 "+Col.red+Col.blink+"UP TO 21% OFF   "+Col.reset+Col.bold+Col.yellow+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"2            BEDS                   "+Col.red+Col.blink+"UP TO 13% OFF   "+Col.reset+Col.bold+Col.yellow+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"3            SOFA SETS              "+Col.red+Col.blink+"UP TO 15% OFF   "+Col.reset+Col.bold+Col.yellow+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"4            DINING TABLE SETS      "+Col.red+Col.blink+"UP TO 18% OFF   "+Col.reset+Col.bold+Col.yellow+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"5            DRESSING TABLES        "+Col.red+Col.blink+"UP TO 22% OFF   "+Col.reset+Col.bold+Col.yellow+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           ----------------------------------------------------------------"+Col.reset);
        System.out.println();
        System.out.println(Col.bold+"Please Select the Category you Want"+Col.reset);
        int select=sc.nextInt();
        //chairs
        if(select == 1)
        {
            System.out.println(Col.backblack+Col.yellow+"Available Types of Chiar's  are "+Col.reset);
            System.out.println();
            System.out.println(Col.purple+Col.bold+"                		    ~~~~~~~~~~ S.NO ~~~~~~~~~~ MODEL'S ~~~~~~~~~~");
            System.out.println("				    !                                           !");
            System.out.println("				    !           1              Armchair         !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           2              Folding chair    !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           3              Wing ch          !");
            System.out.println("				    !                                           !");
            System.out.println("				    !                                           !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            chair();
        }
        //beds
        else if(select == 2)
        {
            System.out.println(Col.backblack+Col.yellow+"Available Types of Beds are "+Col.reset);
	    System.out.println();
            System.out.println(Col.blue+"				    ~~~~~~~~~~ S.NO ~~~~~~~~~~ MODEL'S ~~~~~~~~~");
            System.out.println("				    !                                          !");
            System.out.println("				    !           1               Twin XL        !");
            System.out.println("				    !                                          !");
            System.out.println("				    !           2               Loft bed       !");
            System.out.println("				    !                                          !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            beds();
        }
        //sofasets
        else if(select == 3)
        {
            System.out.println(Col.backblack+Col.yellow+"Available Types of Sofaset's are "+Col.reset);
	    System.out.println();
            System.out.println(Col.skyblue+"				    ~~~~~~~~~~ S.NO ~~~~~~~~~~ MODEL'S ~~~~~~~~~~");
            System.out.println("				    !                                           !");
            System.out.println("				    !           1              Wooden Sofas     !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           2              Love seat        !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           3              Divan            !");
            System.out.println("				    !                                           !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            sofaset();
        }
        //dining table
        else if(select ==4)
        {
            System.out.println(Col.backblack+Col.yellow+"Available Types of Dining Tables are"+Col.reset);
	    System.out.println();
            System.out.println(Col.green+"				    ~~~~~~~~~~ S.NO ~~~~~~~~~~ MODEL'S ~~~~~~~~~~~");
            System.out.println("				    !                                            !");
            System.out.println("				    !           1           Square Dining Table  !");
            System.out.println("				    !                                            !");
            System.out.println("				    !           2           Trestle Dining Table !");
            System.out.println("				    !                                            !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            dining_table_set();
        }
        //Dressing table
        else if(select == 5)
        {
            System.out.println(Col.backblack+Col.yellow+"Available Types of Dressing Tables are"+Col.reset);
	    System.out.println();
            System.out.println(Col.yellow+"				    ~~~~~~~~~~ S.NO ~~~~~~~~~~ MODEL'S ~~~~~~~~~~");
            System.out.println("				    !                                           !");
            System.out.println("				    !           1              Alcove Dressers  !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           2              Wall-Mounted     !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           3              The Corner-Shelf !");
            System.out.println("				    !                                           !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            dressing();
        }
        else
        {
            System.out.println(Col.bold+Col.red+"YOU ENTERED INVALID INPUT!! "+Col.reset+Col.green+Col.under+"\nEnter correct input"+Col.reset);
            selection();
        }
    }
    public void chair()
    {
        //Chiars
            System.out.println(Col.green+Col.bold+"You selected item is Chair "+Col.reset);
	    System.out.println();
            System.out.println(Col.yellow+Col.bold+"					 ______________________________________________________________________________________________________");
            System.out.println("					|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("					|_____|_______________________|______________________________________________________|________________|");
            System.out.println("					! 1   | Armchair              |                                                      |  7000/-        !");
            System.out.println("					!     |                       |      3 Reclining Positions                           |                !");
            System.out.println("					!     |                       |      Filling Material: Foam, Polyfill                |                !");
            System.out.println("					!     |                       |      W x H x D: 94 cm x 98 cm x 97 cm                |                !");
            System.out.println("					!     |                       |      (3 ft 1 in x 3 ft 2 in x 3 ft 2 in)             |                !");
            System.out.println("					!     |                       |      1 Year manufacturer Warranty on the Product     |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!     |                       |       Material: Iron                                 |                !");
            System.out.println("					! 2   | Folding Chair         |       Foldable Chair                                 |  5000/-        !");
            System.out.println("					!     |                       |       W x H x D: 36 cm x 23 cm x 12 cm               |                !");
            System.out.println("					!     |                       |       (1 ft 2 in x 9 in x 4 in)                      |                !");
            System.out.println("					!     |                       |       1 Year manufacturer Warranty on the Product    |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!  3  |  Wing Chair           |       Material: Foam                                 |  11,000/-      !");
            System.out.println("					!     |                       |       Color: Grey                                    |                !");
            System.out.println("					!     |                       |       W x H x D: 71.12 cm x 106.68 cm x 71.12 cm     |                !");
            System.out.println("					!     |                       |       1 Year Warranty                                |                !");
            System.out.println("					!     |                       |       Weight: 25 kg                                  |                !");
            System.out.println("					!     |                       |       DIY - Basic assembly to be done                |                !");
            System.out.println("					!     |                       |         1 Year manufacturer Warranty on the Product  |                !");
            System.out.println("					!_____|_______________________|______________________________________________________|________________!"+Col.reset);
	    System.out.println();
            System.out.println(Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model Armchair \nprice is "+(7000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(7000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Foldingchair\nprice is "+(5000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(5000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Wingchair\nprice is "+(11000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(11000*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
    }
    //beds
    public void beds()
    {
            System.out.println(Col.green+Col.bold+"You selected item is Bed"+Col.reset);
            System.out.println(Col.purple+Col.bold+"					 ______________________________________________________________________________________________________");
            System.out.println("					|S.no |  Model             |     Specifications                                     |    Price        |");
            System.out.println("					|_____|____________________|________________________________________________________|_________________|");
            System.out.println("					!  1  |  Twin XL           |     Live and Sleep                                     |                 |");
            System.out.println("					!     |                    |     Item Weight	15 kg 900 g                         |    30,000/-     !");
            System.out.println("					!     |                    |     Included Components	Memory Foam Pillow          |                 !");
            System.out.println("					!     |                    |     1 Year Warranty                                    |                 !");
            System.out.println("					!     |                    |     Generic Name	bed_mattress_conventional           |                 !");
            System.out.println("					!     |                    |     1 Year manufacturer Warranty on the Product        |                 !");
            System.out.println("					!     |                    |                                                        |                 !");
            System.out.println("					!  2  |  Loft bed          |     Material:- Metal                                   |     42,000/-    !");
            System.out.println("					!     |                    |     Colour:- Black                                     |                 !");
            System.out.println("					!     |                    |     Dimension:-146.1L x 203W x 182.9H Centimeter       |                 !");
            System.out.println("					!     |                    |     Assemble required:- Do it yourself                 |                 !");
            System.out.println("					!     |                    |     Mattress not include                               |                 !");
            System.out.println("					!     |                    |     1 Year manufacturer Warranty on the Product        |                 !");
            System.out.println("					!_____|____________________|________________________________________________________|_________________!"+Col.reset);
	    System.out.println();
            System.out.println(Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Twin XL \nprice is "+(30000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(30000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Loft bed\nprice is "+(42000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(42000*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
    }
    public void sofaset()
    {
        //sofasets
            System.out.println(Col.green+Col.bold+"You selected item is sofasets"+Col.reset);
	    System.out.println();
            System.out.println(Col.skyblue+"					 _______________________________________________________________________________________________________");
            System.out.println("					|S.no |    Model            |          Specifications                             |      Price        |");
            System.out.println("					|_____|_____________________|_____________________________________________________|___________________|");
            System.out.println("					! 1   |   Wooden Sofa       |     Jute                                            |      32,000/-     !");
            System.out.println("					!     |                     |     Filling Material: Foam                          |                   !");
            System.out.println("					!     |                     |     Frame Material: Solid Wood                      |                   !");
            System.out.println("					!     |                     |     DIY - Basic assembly to be done with simpletool |                   !");
            System.out.println("					!     |                     |     by the customer, comes with instructions.       |                   !");
            System.out.println("					!     |                     |     1 Year manufacturer Warranty on the Product     |                   !");
            System.out.println("					!     |                     |                                                     |                   !");
            System.out.println("					! 2   |   Love seat         |     Material filled : Foam                          |      20,000/-     !");
            System.out.println("					!     |                     |     Shape: Rectangular                              |                   !");
            System.out.println("					!     |                     |     Mattress Included: Yes                          |                   !");
            System.out.println("					!     |                     |     Seat Capacity: 4 Seater                         |                   !");
            System.out.println("					!     |                     |     W x H x D: 111.76 cm x 35.56 cm x 198.12 c      |                   !");
            System.out.println("					!     |                     |     Delivery Condition: Pre Assembled (Readyto Use) |                   !");
            System.out.println("					!     |                     |     1 Year manufacturer Warranty on the Product     |                   !");
            System.out.println("					!     |                     |                                                     |                   !");
            System.out.println("					! 3   |   Divan             |     Bed Material Subtype: Rosewood (Sheesham)       |      39,000/-     !");
            System.out.println("					!     |                     |     W x H x D: 223 cm x 81 cm x 98 cm               |                   !");
            System.out.println("					!     |                     |     (7 ft 3 in x 2 ft 7 in x 3 ft 2 in)             |                   !");
            System.out.println("					!     |                     |     Storage Type: Drawer                            |                   !");
            System.out.println("					!     |                     |     Delivery Condition: DIY - Basic assembly to be  |                   !");
            System.out.println("					!     |                     |     done with simple tools by the customer,         |                   !");
            System.out.println("					!     |                     |     comes with instructions.                        |                   !");
            System.out.println("					!     |                     |     1 Year manufacturer Warranty on the Product     |                   !");
            System.out.println("					!_____|_____________________|_____________________________________________________|___________________!"+Col.reset);
	    System.out.println();
            System.out.println(Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Wooden Sofa \nprice is "+(32000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(32000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Love Sofa \nprice is "+(20000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(20000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Divan\nprice is "+(39000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(39000*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
    }
    public void dining_table_set()
    {
        //dining_table_set
            System.out.println(Col.green+Col.bold+"You selected item is Dining set"+Col.reset);
	    System.out.println();
            System.out.println(Col.bold+Col.blue+"					 ______________________________________________________________________________________________________");
            System.out.println("					|S.no |    Model            |          Specifications                             |      Price        |");
            System.out.println("					|_____|_____________________|_____________________________________________________|___________________|");
            System.out.println("					! 1   |   Square Dining     |    Finish Type: Honey Finish                        |      32,000/-     !");
            System.out.println("					!     |   Table             |    Extendable                                       |                   !");
            System.out.println("					!     |                     |    W x H: 88.9 mm x 76.2 mm (3 in x 3 in)           |                   !");
            System.out.println("					!     |                     |    DIY -Basic assembly to be done with simple tools |                   !");
            System.out.println("					!     |                     |    the customer, comes with instructions.           |                   !");
            System.out.println("					!     |                     |    1 Year manufacturer Warranty on the Product      |                   !");
            System.out.println("					!     |                     |                                                     |                   !");
            System.out.println("					! 2   |   Trestle Dining    |     Table Top Material: Solid Wood                  |      20,000/-     !");
            System.out.println("					!     |   Table             |     Chair Frame: Solid Wood                         |                   !");
            System.out.println("					!     |                     |     Table (W x H x D): 147 cm x 76 cm x 91 cm       |                   !");
            System.out.println("					!     |                     |     (4 ft 9 in x 2 ft 5 in x 2 ft 11 in)            |                   !");
            System.out.println("					!     |                     |     Seating Capacity: 6 Seater                      |                   !");
            System.out.println("					!     |                     |     Delivery Condition: DIY - Basic assembly to be  |                   !");
            System.out.println("					!     |                     |     done with simple tools by the customer          |                   !");
            System.out.println("					!     |                     |     comes with instructions.                        |                   !");
            System.out.println("					!     |                     |     1 Year manufacturer Warranty on the Product     |                   !");
            System.out.println("					!_____|_____________________|_____________________________________________________|___________________!"+Col.reset);
	    System.out.println();
            System.out.println(Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Square Dining Table \nprice is "+(32000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(32000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Trestle Dining Table\nprice is "+(20000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(20000*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
    }
    public void dressing()
    {
            //Dressing tables
            System.out.println(Col.green+"You selected item is dressing "+Col.reset);
	    System.out.println();
            System.out.println(Col.yellow+"					 ______________________________________________________________________________________________________");
            System.out.println("					|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("					|_____|_______________________|______________________________________________________|________________|");
            System.out.println("					! 1   | Alcove Dressers       |    Storage Included                                  |  10,000/-      !");
            System.out.println("					!     |                       |    W x H x D: 70 cm x 180 cm x 40 cm                 |                !");
            System.out.println("					!     |                       |    (2 ft 3 in x 5 ft 10 in x 1 ft 3 in)              |                !");
            System.out.println("					!     |                       |    Mirror W x H: 45 mm x 115.5 mm                    |                !");
            System.out.println("					!     |                       |    Finish Type: Woodpore                             |                !");
            System.out.println("					!     |                       |    Finish Color: Brown                               |                !");
            System.out.println("					!     |                       |    Knock Down - Delivered is                         |                !");
            System.out.println("					!     |                       |    non-assembled pieces,                             |                !");
            System.out.println("					!     |                       |    installation by service partner                   |                !");
            System.out.println("					!     |                       |    1 Year manufacturer Warranty on the Product       |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					! 2   | Wall-Mounted          |    Storage Included                                  |  5000/-        !");
            System.out.println("					!     |                       |    W x H x D: 70 cm x 180 cm x 40 cm                 |                !");
            System.out.println("					!     |                       |    (2 ft 3 in x 5 ft 10 in x 1 ft 3 in)              |                !");
            System.out.println("					!     |                       |    Mirror W x H: 45 mm x 130 mm                      |                !");
            System.out.println("					!     |                       |    Finish Type: Woodpore                             |                !");
            System.out.println("					!     |                       |    Finish Color: Brown                               |                !");
            System.out.println("					!     |                       |    Knock Down - Delivered                            |                !");
            System.out.println("					!     |                       |    non-assembled pieces,                             |                !");
            System.out.println("					!     |                       |    installation by service partner                   |                !");
            System.out.println("					!     |                       |    1 Year manufacturer Warranty on the Product       |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!  3  |  The Corner-Shelf     |    Storage Included, Stool Included                  |  11,000/-      !");
            System.out.println("					!     |                       |    W x H x D: 118 cm x 80 cm x 40 cm                 |                !");
            System.out.println("					!     |                       |    (3 ft 10 in x 2 ft 7 in x 1 ft 3 in)              |                !");
            System.out.println("					!     |                       |    Mirror W x H: 50 cm x 50 cm                       |                !");
            System.out.println("					!     |                       |    Finish Type: Matt                                 |                !");
            System.out.println("					!     |                       |    Finish Color: White                               |                !");
            System.out.println("					!     |                       |    DIY - Basic assembly to be done with              |                !");
            System.out.println("					!     |                       |    simple tools by the customer.                     |                !");
            System.out.println("					!     |                       |    comes with instructions.                          |                !");
            System.out.println("					!     |                       |    1 Year manufacturer Warranty on the Product       |                !");
            System.out.println("					!_____|_______________________|______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model Alcove Dressers \nprice is "+(10000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(10000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Wall-Mounted\nprice is "+(5000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(5000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is The Corner-Shelf\nprice is "+(11000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(11000*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
    }
}


interface Grocery_Main
{
    void Rice(int brand);
    void Sugar(int brand);
    void Detergent(int brand);
    void Oil(int brand);
    void ToothPaste(int brand);
}
class Grocery  implements Grocery_Main
{
    static Scanner sc = new Scanner(System.in);
    static double bill =0;
    void selection()
    {
        System.out.println(Col.yellow+Col.bold+Col.blink+"					                 #####                                              ");
        System.out.println("					                #     # #####   ####   ####  ###### #####  #   #    ");
        System.out.println("					                #       #    # #    # #    # #      #    #  # #     ");
        System.out.println("					                #  #### #    # #    # #      #####  #    #   #      ");
        System.out.println("					                #     # #####  #    # #      #      #####    #      ");
        System.out.println("					                #     # #   #  #    # #    # #      #   #    #      ");
        System.out.println("					                 #####  #    #  ####   ####  ###### #    #   #      ");
        System.out.println("					                 #####                                              ");
        System.out.println("					                #     # ######  ####  ##### #  ####  #    #         ");
        System.out.println("					                #       #      #    #   #   # #    # ##   #         ");
        System.out.println("					                 #####  #####  #        #   # #    # # #  #         ");
        System.out.println("					                      # #      #        #   # #    # #  # #         ");
        System.out.println("					                #     # #      #    #   #   # #    # #   ##         ");
        System.out.println("					                 #####  ######  ####    #   #  ####  #    #         "+Col.reset);
        System.out.println();
        System.out.println();
        System.out.println(Col.skyblue+Col.bold+"                                           ---------"+Col.purple+" S.No "+Col.skyblue+"--------"+Col.purple+" Category "+Col.skyblue+"-------------"+Col.purple+" Offers "+Col.skyblue+"----------");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"1            RICE                   "+Col.red+Col.blink+"UP TO 21% OFF   "+Col.reset+Col.bold+Col.skyblue+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"2            SUGAR                  "+Col.red+Col.blink+"UP TO 13% OFF   "+Col.reset+Col.bold+Col.skyblue+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"3            DETERGENT              "+Col.red+Col.blink+"UP TO 15% OFF   "+Col.reset+Col.bold+Col.skyblue+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"4            OIL                    "+Col.red+Col.blink+"UP TO 18% OFF   "+Col.reset+Col.bold+Col.skyblue+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"5            TOOTH PASTE            "+Col.red+Col.blink+"UP TO 22% OFF   "+Col.reset+Col.bold+Col.skyblue+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           ----------------------------------------------------------------"+Col.reset);
        System.out.println();
        System.out.println(Col.bold+"Please Enter the Category you want"+Col.reset);
        int select=sc.nextInt();
        //Rice
        if(select == 1)
        {
            System.out.println(Col.green+Col.bold+"Available Rice Brands are \nSona Masori, Daawat, India Gate"+Col.reset);
            System.out.println();
            System.out.println(Col.purple+Col.bold+"				    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("				    !                                          !");
            System.out.println("				    !           1            Sona Masori       !");
            System.out.println("				    !                                          !");
            System.out.println("				    !           2            Daawat            !");
            System.out.println("				    !                                          !");
            System.out.println("				    !           3            India Gate        !");
            System.out.println("				    !                                          !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please Select the Brands you want"+Col.reset);
            int RiceSelection = sc.nextInt();
            Rice(RiceSelection);
        }
        //Sugar
        else if(select == 2)
        {
            System.out.println(Col.green+Col.bold+"Available  Sugar Brands are \nDalmia, CaneSugar"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+"				    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~");
            System.out.println("				    !                                          !");
            System.out.println("				    !           1              Dalmia          !");
            System.out.println("				    !                                          !");
            System.out.println("				    !           2              CaneSugar       !");
            System.out.println("				    !                                          !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please Select the Brands you want"+Col.reset);
            int SugarSelection = sc.nextInt();
            Sugar(SugarSelection);
        }
        //Detergent
        else if(select == 3)
        {
            System.out.println(Col.blue+Col.bold+"Available Detergent Brands are \nAriel, Surfexcel, Tide"+Col.reset);
            System.out.println();
            System.out.println(Col.green+"				    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("				    !                                           !");
            System.out.println("				    !           1             Ariel             !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           2             Surfexcel         !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           3             Tide              !");
            System.out.println("				    !                                           !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please Select the Brands you want"+Col.reset);
            int DetergentSelection = sc.nextInt();
            Detergent(DetergentSelection);
        }
        //Oil
        else if(select ==4)
        {
            System.out.println(Col.green+Col.bold+"Available Oil Brands are \nFortune, Sundrop"+Col.reset);
            System.out.println();
            System.out.println(Col.blue+Col.bold+"				    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("				    !                                           !");
            System.out.println("				    !           1              Fortune          !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           2              Sundrop          !");
            System.out.println("				    !                                           !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please Select the Brands you want"+Col.reset);
            int OilSelection = sc.nextInt();
            Oil(OilSelection);
        }
        //n5-ToothPaste
        else if(select == 5)
        {
            System.out.println(Col.green+Col.bold+"Available ToothPaste Brands are \nColgate, Close-up, Sensodyne"+Col.reset);
            System.out.println();
            System.out.println(Col.skyblue+"				    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("				    !                                           !");
            System.out.println("				    !           1             Colgate           !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           2             Close-up          !");
            System.out.println("				    !                                           !");
            System.out.println("				    !           3             Sensodyne         !");
            System.out.println("				    !                                           !");
            System.out.println("				    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please Select the Brands you want"+Col.reset);
            int ToothPaste_selection = sc.nextInt();
            ToothPaste(ToothPaste_selection);
        }
        else
        {
            System.out.println(Col.bold+Col.red+"YOU ENTERED INVALID INPUT!! "+Col.reset+Col.green+Col.under+"\nEnter correct input"+Col.reset);
            selection();
        }
    }
    public void Rice(int brand)
    {
        //SonaMasori Rice
        if(brand == 1)
        {
            System.out.println(Col.backyellowdark+Col.bold+"You selected brand is SonaMasori "+Col.reset);
	    System.out.println();
            System.out.println(Col.skyblue+"				 _____________________________________________________________________________________________________");
            System.out.println("					|S.no |  Varients             |       About this item                                |  Price         |");
            System.out.println("					|_____|_______________________|______________________________________________________|________________|");
            System.out.println("					! 1   | SonaMasori 1kg        |      After cooking, rice elongates twice             |    70/-        !");
            System.out.println("					!     |                       |      in size and becomes flavorful                   |                !");
            System.out.println("					!     |                       |      Long grained rice.                              |                !");
            System.out.println("					!     |                       |      Ideal for daily cooking                         |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					! 2   | SonaMasori 5kg        |      After cooking, rice elongates twice             |    350/-       !");
            System.out.println("					!     |                       |      in size and becomes flavorful                   |                !");
            System.out.println("					!     |                       |      Long grained rice.                              |                !");
            System.out.println("					!     |                       |      Ideal for daily cooking                         |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!  3  |  SonaMasori 25kg      |      After cooking, rice elongates twice             |    1750/-      !");
            System.out.println("					!     |                       |      in size and becomes flavorful                   |                !");
            System.out.println("					!     |                       |      Long grained rice.                              |                !");
            System.out.println("					!     |                       |      Ideal for daily cooking                         |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!     |                       |                                                      |                !");
            System.out.println("					!_____|_______________________|______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Brand  is SonaMasori 1kg \nprice is "+(70*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(70*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Brand  is SonaMasori 5kg \nprice is "+(350*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(350*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Brand is SonaMasori 25kg \nprice is "+(1750*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(1750*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //Daawat Rice 
        else if(brand == 2)
        {
            System.out.println(Col.backyellowdark+Col.bold+"You selected brand is Daawat"+Col.reset);
            System.out.println(Col.blue+Col.bold+"					 ____________________________________________________________________________________________________");
            System.out.println("					|S.no |  Varients          |      About this item                                 |    Price        |");
            System.out.println("					|_____|____________________|______________________________________________________|_________________|");
            System.out.println("					!  1  |  Daawat 1kg        |      Broken grain                                    |    60/-         !");
            System.out.println("					!     |                    |      material features:vegetarian                    |                 !");
            System.out.println("					!     |                    |      Included Component: Pack Of 1                   |                 !");
            System.out.println("					!     |                    |                                                      |                 !");
            System.out.println("					!     |                    |                                                      |                 !");
            System.out.println("					!     |                    |                                                      |                 !");
            System.out.println("					! 2   |   Daawat 5kg       |       Broken grain                                   |    300/-        !");
            System.out.println("					!     |                    |       material features:vegetarian                   |                 !");
            System.out.println("					!     |                    |       Included Component: Pack Of 1                  |                 !");
            System.out.println("					!     |                    |                                                      |                 !");
            System.out.println("					!     |                    |                                                      |                 !");
            System.out.println("					!     |                    |                                                      |                 !");
            System.out.println("					! 3   |    Daawat 25kg     |       Broken grain                                   |    1500/-       !");
            System.out.println("					!     |                    |       material features:vegetarian                   |                 !");
            System.out.println("					!     |                    |       Included Component: Pack Of 1                  |                 !");
            System.out.println("					!     |                    |                                                      |                 !");
            System.out.println("					!     |                    |                                                      |                 !");
            System.out.println("					!     |                    |                                                      |                 !");
            System.out.println("					!_____|____________________|______________________________________________________|_________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Daawat 1kg  \nprice is "+(60*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(60*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Daawat 5kg  \nprice is "+(300*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(300*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Daawat 25kg  \nprice is "+(1500*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(1500*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //IndiaGate Rice
        else if(brand ==3)
        {
            System.out.println(Col.backyellowdark+Col.bold+"You selected brand is IndiaGate"+Col.reset);
            System.out.println(Col.skyblue+Col.bold+"                          _____________________________________________________________________________________________________");
            System.out.println("                         |S.no |    Varients         |          About this item                            |      Price        |");
            System.out.println("			 |_____|_____________________|_____________________________________________________|___________________|");
            System.out.println("			 ! 1   |   IndiaGate 1kg     |         India gate basmati rice - rozana            |      80/-         !");
            System.out.println("	 		 !     |                     |         South                                       |                   !");
            System.out.println("			 !     |                     |         material features:vegetarian                |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 ! 2   |   IndiaGate 5kg     |         India gate basmati rice - rozana            |      400/-        !");
            System.out.println("			 !     |                     |         South                                       |                   !");
            System.out.println("			 !     |                     |         material features:vegetarian                |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 ! 3   |   IndiaGate 25kg    |        India gate basmati rice - rozana             |      2000/-       !");
            System.out.println("			 !     |                     |         South                                       |                   !");
            System.out.println("			 !     |                     |        material features:vegetarian                 |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !     |                     |                                                     |                   !");
            System.out.println("			 !_____|_____________________|_____________________________________________________|___________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is IndiaGate 1kg  \nprice is "+(80*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(80*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected quantity is IndiaGate 5kg \nprice is "+(400*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(400*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is IndiaGate 25kg  \nprice is "+(2000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(2000*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backblack+Col.red+Col.bold+" SORRY!, Invalid Selection"+Col.reset+Col.green+" \nPress '1' to re-select Your Grocery Items "+Col.red+"\nPress '2' to EXIT"+Col.reset);
            int opt = sc.nextInt();
            if(opt ==1)
            {
                selection();
            }
        }
    }
    public void Sugar(int brand)
    {
        //Dalmia Sugar
        if(brand ==1)
        {
            System.out.println(Col.green+"You selected brand is Dalmia"+Col.reset);
            System.out.println(Col.yellow+Col.bold+"                                 _____________________________________________________________________________________________________");
            System.out.println("                                |S.no |  Varients           |      About this item                                  |    Price        |");
            System.out.println("				|_____|_____________________|_______________________________________________________|_________________|");
            System.out.println("				! 1   |   Dalmia 250        |        TASTES JUST LIKE SUGAR:Contains zero           |    30/-         !");
            System.out.println("				!     |   grams             |        net carbs, zero calories,and is                |                 !");
            System.out.println("				!     |                     |        low-glycemic.Perfect for cookies,              |                 !");
            System.out.println("				!     |                     |        coffee, dessertsand other sweet,               |                 !");
            System.out.println("				!     |                     |        sugar-free treats.                             |                 !");
            System.out.println("				!     |                     |                                                       |                 !");
            System.out.println("				!     |                     |                                                       |                 !");
            System.out.println("				! 2   |   Dalmia 500        |        TASTES JUST LIKE SUGAR:Contains zero           |    60/-         !");
            System.out.println("				!     |   grams             |        net carbs, zero calories,and is                |                 !");
            System.out.println("				!     |                     |        low-glycemic.Perfect for cookies,              |                 !");
            System.out.println("				!     |                     |        coffee, dessertsand other sweet,               |                 !");
            System.out.println("				!     |                     |        sugar-free treats.                             |                 !");
            System.out.println("				!     |                     |                                                       |                 !");
            System.out.println("				!     |                     |                                                       |                 !");
            System.out.println("				! 3   |   Dalmia 1kg        |         TASTES JUST LIKE SUGAR:Contains zero          |    90/-         !");
            System.out.println("				!     |                     |         net carbs, zero calories,and is               |                 !");
            System.out.println("				!     |                     |         low-glycemic.Perfect for cookies,             |                 !");
            System.out.println("				!     |                     |         coffee, dessertsand other sweet,              |                 !");
            System.out.println("				!     |                     |         sugar-free treats.                            |                 !");
            System.out.println("				!     |                     |                                                       |                 !");
            System.out.println("				!     |                     |                                                       |                 !");
            System.out.println("				!_____|_____________________|_______________________________________________________|_________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+"you selected Quantity is Dalmia 250grams \nprice is "+(30*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(30*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+"you selected Quantity is Dalmia 500grams \nprice is "+(60*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(60*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+"you selected Quantity is Dalmia 1kg \nprice is "+(90*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(90*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //CaneSugars
        else if(brand ==2)
        {
            System.out.println(Col.green+Col.bold+"You selected brand is DELL"+Col.reset);
            System.out.println(Col.purple+Col.bold+"                                 ____________________________________________________________________________________________________");
            System.out.println("                                |S.no |  Varients           |         About this item                                |   Price       |");
            System.out.println("				|_____|_____________________|________________________________________________________|_______________|");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				! 1   |  CaneSugars 250     |         100% Natural, Organic, No Pesticides,          |   40/-        !");
            System.out.println("				!     |  grams              |         No Preservatives, No Artificial Colours        |               !");
            System.out.println("				!     |                     |         / Flavours, Chemical free You can add this     |               !");
            System.out.println("				!     |                     |         raw cane sugar or nattu sakkarai to tea,       |               !");
            System.out.println("				!     |                     |         coffee, Kheer, Payasam and juices Healthy      |               !");
            System.out.println("				!     |                     |         for white sugar                                |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				! 2   | CaneSugars 500      |         100% Natural, Organic, No Pesticides,          |   80/-        !");
            System.out.println("				!     | grams               |         No Preservatives, No Artificial Colours        |               !");
            System.out.println("				!     |                     |         / Flavours, Chemical free You can add this     |               !");
            System.out.println("				!     |                     |         raw cane sugar or nattu sakkarai to tea,       |               !");
            System.out.println("				!     |                     |         coffee, Kheer, Payasam and juices Healthy      |               !");
            System.out.println("				!     |                     |         for white sugar                                |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				! 3   | CaneSugars 1kg      |         100% Natural, Organic, No Pesticides,          |   160/-       !");
            System.out.println("				!     |                     |         No Preservatives, No Artificial Colours        |               !");
            System.out.println("				!     |                     |         / Flavours, Chemical free You can add this     |               !");
            System.out.println("				!     |                     |         raw cane sugar or nattu sakkarai to tea,       |               !");
            System.out.println("				!     |                     |         coffee, Kheer, Payasam and juices Healthy      |               !");
            System.out.println("				!     |                     |         for white sugar                                |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				!_____|_____________________|________________________________________________________|_______________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is CaneSugars 250 grams \nprice is "+(40*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(40*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is CaneSugars 500 grams \nprice is "+(80*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(80*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is CaneSugars 1kg \nprice is "+(160*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(160*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backblack+Col.red+Col.bold+" SORRY!, Invalid Selection"+Col.reset+Col.green+" \nPress '1' to re-select Your Grocery Items, "+Col.red+"\nPress any Digit to EXIT from Grocery Section"+Col.reset);
            int opt = sc.nextInt();
            if(opt ==1)
            {
                selection();
            }
        }
    }
    public void Detergent(int brand)
    {
        //Ariel Detergent
        if(brand ==1)
        {
            System.out.println(Col.green+"You selected brand is Ariel"+Col.reset);
            System.out.println(Col.yellow+"                                 ____________________________________________________________________________________________________");
            System.out.println("                                |S.no |  Varients           |         About this item                                |  Price        |");
            System.out.println("				|_____|_____________________|________________________________________________________|_______________|");
            System.out.println("				!  1  |  Ariel 1kg          |         It requires just 1 scoop for normal loads      |  200/-        !");
            System.out.println("				!     |                     |         and 1.5 scoops for heavy loads, providing      |               !");
            System.out.println("				!     |                     |         performance along with value.                  |               !");
            System.out.println("				!     |                     |         Ariel Matic’s cutting edge technology          |               !");
            System.out.println("				!     |                     |         provides impeccable cleaning for all your      |               !");                                                   	    System.out.println("				!     |                     |         clothes, and removes tough stains like juice,  |               !");
            System.out.println("				!     |                     |         tomato, and butter/ghee along with             |               !");
            System.out.println("				!     |                     |         maintaining the brightness of the clothes.     |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				! 2   |  Ariel 5kg          |         It requires just 1 scoop for normal loads      |  1000/-       !");
            System.out.println("				!     |                     |         and 1.5 scoops for heavy loads, providing      |               !");
            System.out.println("				!     |                     |         performance along with value.                  |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				! 3   |  Ariel 10kg         |         It requires just 1 scoop for normal loads      |  2000/-       !");
            System.out.println("				!     |                     |         and 1.5 scoops for heavy loads, providing      |               !");
            System.out.println("				!     |                     |         performance along with value.                  |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				!_____|_____________________|________________________________________________________|_______________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Ariel 1kg \nprice is "+(200*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(200*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Ariel 5kg \nprice is "+(1000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(1000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Ariel 10kg \nprice is "+(2000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(2000*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //Surfexcel Detergent
        else if (brand ==2)
        {
            System.out.println(Col.green+"You selected brand is Surfexcel"+Col.reset);
            System.out.println(Col.green+Col.bold+"                                 ____________________________________________________________________________________________________");
            System.out.println("                                |S.no |   Varients          |        About this item                                 |  Price        |");
            System.out.println("				|_____|_____________________|________________________________________________________|_______________|");
            System.out.println("				! 1   |  Surfexcel 1kg      |        India's premium detergent powder                |     250/-     !");
            System.out.println("				!     |                     |        For tough stains|| pre-soak the garment         |               !");
            System.out.println("				!     |                     |        in a solution of Surf excel Quick Wash          |               !");
            System.out.println("				!     |                     |        for 30 mins                                     |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				! 2   |   Surfexcel 5kg     |        India's premium detergent powder                |     1250/-    !");
            System.out.println("				!     |                     |        For tough stains|| pre-soak the garment         |               !");
            System.out.println("				!     |                     |        in a solution of Surf excel Quick Wash          |               !");
            System.out.println("				!     |                     |        for 30 mins                                     |               !");
            System.out.println("				!     |                     |                                                        |               !");  
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				! 3   |  Surfexcel 10kg     |        India's premium detergent powder                |     2500/-    !");
            System.out.println("				!     |                     |        For tough stains|| pre-soak the garment         |               !");
            System.out.println("				!     |                     |        in a solution of Surf excel Quick Was           |               !");
            System.out.println("				!     |                     |        for 30 mins                                     |               !");
            System.out.println("				!     |                     |                                                        |               !");
            System.out.println("				!_____|_____________________|________________________________________________________|_______________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Surfexcel 1kg \nprice is "+(250*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(250*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Surfexcel 5kg\nprice is "+(1250*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(1250*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Surfexcel 10kg \nprice is "+(2500*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(2500*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //Tide  Detergent
        else if (brand == 3)
        {
            System.out.println(Col.green+Col.under+"You selected brand is Tide"+Col.reset);
            System.out.println(Col.blue+Col.bold+"                                 ____________________________________________________________________________________________________");
            System.out.println("                                |S.no |   Varients          |        About this item                                |  Price         |");
            System.out.println("				|_____|_____________________|_______________________________________________________|________________|");
            System.out.println("				! 1   |  Tide 1kg           |        Tide Plus Double Power is suitable for         |  150/-         !");
            System.out.println("				!     |                     |        both whites and coloured clothes               |                !");
            System.out.println("				!     |                     |        The improved formulation and enzyme            |                !");
            System.out.println("				!     |                     |                                                       |                !");
            System.out.println("				!     |                     |                                                       |                !");
            System.out.println("				!     |                     |                                                       |                !");
            System.out.println("				! 2   |  Tide 5kg           |        Tide Plus Double Power is suitable for         |  750/-         !");
            System.out.println("				!     |                     |        both whites and coloured clothes               |                !");
            System.out.println("				!     |                     |        The improved formulation and enzyme            |                !");
            System.out.println("				!     |                     |                                                       |                !");
            System.out.println("				! 3   |  Tide 10kg          |        Tide Plus Double Power is suitable for         |  1500/-        !");
            System.out.println("				!     |                     |        both whites and coloured clothes               |                !");
            System.out.println("				!     |                     |        The improved formulation and enzyme            |                !");
            System.out.println("				!     |                     |                                                       |                !");
            System.out.println("				!     |                     |                                                       |                !");
            System.out.println("				!_____|_____________________|_______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Tide 1kg \nprice is "+(150*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(150*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Tide 5kg \nprice is "+(750*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(750*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Tide 10kg \nprice is "+(1500*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(1500*quantity);
            }
            else
            {
                System.out.println(Col.bold+Col.red+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backblack+Col.red+Col.bold+" SORRY!, Invalid Selection"+Col.reset+Col.green+" \nPress '1' to re-select Your Grocery Items, "+Col.red+"\nPress any Digit to EXIT from Grocery Section"+Col.reset);
            int opt = sc.nextInt();
            if(opt ==1)
            {
                selection();
            }
        }
    }
    public void Oil(int brand)
    {
        //Fortune Oil
        if(brand == 1)
        {
            System.out.println(Col.green+"You selected brand is Fortune "+Col.reset);
            System.out.println(Col.skyblue+Col.bold+"                                 ________________________________________________________________________________________________");
            System.out.println("				|S.No |    Varients          |        About this item                    |       Price           |");
            System.out.println("                                |_____|______________________|___________________________________________|_______________________|");
            System.out.println("				! 1   |   Fortune 1kg        |     Rich in Vitamins A, E and Beta        |       140/-           !");
            System.out.println("				!     |                      |     Carotene                              |                       !");
            System.out.println("				!     |                      |     Naturally Cholesterol Free            |                       !");
            System.out.println("				!     |                      |     High in Poly Unsaturated Fatty Acids  |                       !");
            System.out.println("				!     |                      |                                           |                       !");
            System.out.println("				! 2   |  Fortune 5kg         |     Rich in Vitamins A, E and Beta        |       700/-           !");
            System.out.println("				!     |                      |     Carotene                              |                       !");
            System.out.println("				!     |                      |     Naturally Cholesterol Free            |                       !");
            System.out.println("				!     |                      |     High in Poly Unsaturated Fatty Acids  |                       !");
            System.out.println("				!     |                      |                                           |                       !");
            System.out.println("				! 3   |  Fortune 15kg        |     Rich in Vitamins A, E and Beta        |       2100/-          !");
            System.out.println("				!     |                      |     Carotene                              |                       !");
            System.out.println("				!     |                      |     Naturally Cholesterol Free            |                       !");
            System.out.println("				!     |                      |     High in Poly Unsaturated Fatty Acids  |                       !");
            System.out.println("				!     |                      |                                           |                       !");
            System.out.println("				!_____|______________________|___________________________________________|_______________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Fortune 1kg\nprice is "+(140*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(140*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Fortune 5kg \nprice is "+(700*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(700*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Fortune 15kg \nprice is "+(2100*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(2100*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
            
        }
        //Sundrop Oil
        else if(brand == 2)
        {
            System.out.println(Col.under+Col.green+"You selected brand is Sundrop"+Col.reset);
            System.out.println(Col.purple+Col.bold+"                                 ________________________________________________________________________________________________");
            System.out.println("				|S.No |    Varients                |  About this item                       |       Price        |");
            System.out.println("				|_____|____________________________|________________________________________|____________________|");
            System.out.println("				! 1   |     Sundrop  1kg           |   Vitamin a, d and e                   |       120/-        !");
            System.out.println("				!     |                            |   Low absorb                           |                    !");
            System.out.println("				!     |                            |   Oils - sunflower                     |                    !");
            System.out.println("				!     |                            |                                        |                    !");
            System.out.println("				!     |                            |                                        |                    !");
            System.out.println("				! 2   |     Sundrop 5kg            |    Vitamin a, d and e                  |       600/-        !");
            System.out.println("				!     |                            |    Low absorb                          |                    !");
            System.out.println("				!     |                            |    Oils - sunflower                    |                    !");
            System.out.println("				!     |                            |                                        |                    !");
            System.out.println("				!     |                            |                                        |                    !");
            System.out.println("				!     |                            |                                        |       1950/-       !");
            System.out.println("				! 3   |     Sundrop 15kg           |    Vitamin a, d and e                  |                    !");
            System.out.println("				!     |                            |    Low absorb                          |                    !");
            System.out.println("				!     |                            |    Oils - sunflower                    |                    !");
            System.out.println("				!     |                            |                                        |                    !");
            System.out.println("				!     |                            |                                        |                    !");
            System.out.println("				!_____|____________________________|________________________________________|____________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Sundrop 1kg \nprice is "+(120*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(120*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Sundrop 5kg \nprice is "+(600*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(600*quantity);
            }
		    else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Sundrop 15kg \nprice is "+(1950*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(1950*quantity);
            }
	        else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backblack+Col.red+Col.bold+" SORRY!, Invalid Selection"+Col.reset+Col.green+" \nPress '1' to re-select Your Grocery Items, "+Col.red+"\nPress any Digit to EXIT from Grocery Section"+Col.reset);
            int opt = sc.nextInt();
            if(opt ==1)
            {
                selection();
            }
        }
    }
    public void ToothPaste(int brand)
    {
        //Colgate ToothPaste
        if(brand == 1)
        {
            System.out.println(Col.under+Col.green+"You selected brand is Colgate "+Col.reset);
            System.out.println(Col.skyblue+Col.bold+"                                 ________________________________________________________________________________________________");
            System.out.println("				|S.no |     Varients              |     About this item                     |     Price          |");
            System.out.println("				|_____|___________________________|_________________________________________|____________________|");
            System.out.println("				! 1   |     Colgate 100gram       |     It is a blue gel with cooling       |     150/-          !");
            System.out.println("				!     |                           |     crystrals  that provide intense     |                    !");
            System.out.println("				!     |                           |     freshness.                          |                    !");
            System.out.println("				!     |                           |                                         |                    !");
            System.out.println("				!     |                           |                                         |                    !");
            System.out.println("				!     |                           |                                         |                    !");
            System.out.println("				! 2   |     Colgate 250gram       |     It is a blue gel with cooling       |     320/-          !");
            System.out.println("				!     |                           |     crystrals  that provide intense     |                    !");
            System.out.println("				!     |                           |     freshness.                          |                    !");
            System.out.println("				!     |                           |                                         |                    !");
            System.out.println("				!     |                           |                                         |                    !");
            System.out.println("				! 3   |     Colgate 500gram       |     It is a blue gel with cooling       |     750/-          !");
            System.out.println("				!     |                           |     crystrals  that provide intense     |                    !");
            System.out.println("				!     |                           |     freshness.                          |                    !");
            System.out.println("				!     |                           |                                         |                    !");
            System.out.println("				!     |                           |                                         |                    !");
            System.out.println("				!     |                           |                                         |                    !");
            System.out.println("				!_____|___________________________|_________________________________________|____________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Colgate 100gram \nprice is "+(150*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(150*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Colgate 250gram \nprice is "+(320*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(320*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Colgate 500gram \nprice is "+(750*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(750*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //Close-up  ToothPaste
        else if(brand == 2)
        {
            System.out.println(Col.under+Col.green+"You selected brand is Close-up"+Col.reset);
            System.out.println(Col.yellow+"                                 ______________________________________________________________________________________________");
            System.out.println("				|S.no |  Varients             |          About this item                  |      Price         |");
            System.out.println("				|_____|_______________________|___________________________________________|____________________|");
            System.out.println("				! 1   |   Close-up 100gram    |         Upto 12 hrs fresh breath          |      200/-         !");
            System.out.println("				!     |                       |         # & new formula which gives       |                    !");
            System.out.println("				!     |                       |         28% better                        |                    !");
            System.out.println("				!     |                       |         Helps fight 5 oral care problems  |                    !");
            System.out.println("				!     |                       |                                           |                    !");
            System.out.println("				!     |                       |                                           |                    !");
            System.out.println("				! 2   |   Close-up 250gram    |         Upto 12 hrs fresh breath          |      450/-         !");
            System.out.println("				!     |                       |         # & new formula which gives       |                    !");
            System.out.println("				!     |                       |         28% better                        |                    !");
            System.out.println("				!     |                       |         Helps fight 5 oral care problems  |                    !");
            System.out.println("				!     |                       |                                           |                    !");
            System.out.println("				! 3   |  Close-up 500gram     |         Upto 12 hrs fresh breath          |      1000/-        !");
            System.out.println("				!     |                       |         # & new formula which gives       |                    !");
            System.out.println("				!     |                       |         28% better                        |                    !");
            System.out.println("				!     |                       |         Helps fight 5 oral care problem   |                    !");
            System.out.println("				!     |                       |                                           |                    !");
            System.out.println("				!     |                       |                                           |                    !");
            System.out.println("				!_____|_______________________|___________________________________________|____________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Close-up 100gram \nprice is "+(200*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(200*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Close-up 250gram \nprice is "+(450*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(450*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Close-up 500gram \nprice is "+(1000*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(1000*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        // Sensodyne ToothPaste
        else if(brand == 3)
        {
            System.out.println(Col.purple+Col.bold+"You selected brand is Sensodyne"+Col.reset);
            System.out.println(Col.green+Col.bold+"                                 __________________________________________________________________________________________________");
            System.out.println("				|S.No |    Varients                 |     About this item                        |       Price     |");
            System.out.println("				|_____|_____________________________|____________________________________________|_________________|");
            System.out.println("				! 1   |    Sensodyne 100gram        |     Repair and Protect toothpaste protects |       250/-     !");
            System.out.println("				!     |                             |     from sensitivity to help you enjoy     |                 !");
            System.out.println("				!     |                             |      life without worrying about sensitive |                 !");
            System.out.println("				!     |                             |      teeth                                 |                 !");
            System.out.println("				!     |                             |                                            |                 !");
            System.out.println("				! 2   |    Sensodyne 250gram        |      Repair and Protect toothpaste protects|       550/-     !");
            System.out.println("				!     |                             |      from sensitivity to help you enjoy    |                 !");
            System.out.println("				!     |                             |      life without worrying about sensitive |                 !");
            System.out.println("				!     |                             |      teeth                                 |                 !");
            System.out.println("				!     |                             |                                            |                 !");
            System.out.println("				! 3   |    Sensodyne 500gram        |      Repair and Protect toothpaste protects|       1150/-    !");
            System.out.println("				!     |                             |      from sensitivity to help you enjoy    |                 !");
            System.out.println("				!     |                             |      life without worrying about sensitive |                 !");
            System.out.println("				!     |                             |      teeth                                 |                 !");
            System.out.println("				!     |                             |                                            |                 !");
            System.out.println("				!_____|_____________________________|____________________________________________|_________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"Please select the Varients you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Sensodyne 100gram \nprice is "+(250*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(250*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Sensodyne 250gram \nprice is "+(550*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(550*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.green+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected Quantity is Sensodyne 500gram \nprice is "+(1150*quantity)+"/-"+Col.reset+Col.bold+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(1150*quantity);
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backblack+Col.red+Col.bold+" SORRY!, Invalid Selection"+Col.reset+Col.green+" \nPress '1' to re-select Your Grocery Items, "+Col.red+" Press any Digit to EXIT from Grocery Section"+Col.reset);
            int opt = sc.nextInt();
            if(opt ==1)
            {
                selection();
            }
        }
    }
}


interface KitchenAppliances_Main
{
    void kettles(int brand);
    void mixergrinders(int brand);
    void airfryers(int brand);
    void juicers(int brand);
}
class KitchenAppliances implements KitchenAppliances_Main
{
    static Scanner sc = new Scanner(System.in);
    static double bill =0;
    void selection()
    {
        
        System.out.println(Col.yellow+Col.bold+Col.blink+"				                 #    #                                                           ");
        System.out.println("				                 #   #  # #####  ####  #    # ###### #    #                       ");
        System.out.println("				                 #  #   #   #   #    # #    # #      ##   #                       ");
        System.out.println("				                 ###    #   #   #      ###### #####  # #  #                       ");
        System.out.println("				                 #  #   #   #   #      #    # #      #  # #                       ");
        System.out.println("				                 #   #  #   #   #    # #    # #      #   ##                       ");
        System.out.println("				                 #    # #   #    ####  #    # ###### #    #                       ");
        System.out.println("				                                                                                  ");
        System.out.println("				                   ##   #####  #####  #      #   ##   #    #  ####  ######  ####  ");
        System.out.println("				                  #  #  #    # #    # #      #  #  #  ##   # #    # #      #      ");
        System.out.println("				                 #    # #    # #    # #      # #    # # #  # #      #####   ####  ");
        System.out.println("				                 ###### #####  #####  #      # ###### #  # # #      #           # ");
        System.out.println("				                 #    # #      #      #      # #    # #   ## #    # #      #    # ");
        System.out.println("				                 #    # #      #      ###### # #    # #    #  ####  ######  ####  "+Col.reset);
        System.out.println();
        System.out.println();
        System.out.println(Col.skyblue+Col.bold+"                                           ---------"+Col.purple+" S.No "+Col.skyblue+"--------"+Col.purple+" Category "+Col.skyblue+"-------------"+Col.purple+" Offers "+Col.skyblue+"----------");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"1            KETTLES                "+Col.red+Col.blink+"UP TO 20% OFF   "+Col.reset+Col.bold+Col.skyblue+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"2            MIXER GRINDERS         "+Col.red+Col.blink+"UP TO 15% OFF   "+Col.reset+Col.bold+Col.skyblue+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"3            AIRFRYERS              "+Col.red+Col.blink+"UP TO 10% OFF   "+Col.reset+Col.bold+Col.skyblue+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"4            JUICERS                "+Col.red+Col.blink+"UP TO 10% OFF   "+Col.reset+Col.bold+Col.skyblue+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           ----------------------------------------------------------------"+Col.reset);
        System.out.println();
        System.out.println(Col.bold+"Please Select the Category you want"+Col.reset);
        int select=sc.nextInt();
        //kettles
        if(select==1)
        {
            System.out.println(Col.blue+Col.bold+"Available kettles Brands are \n Milton, Havells, prestige"+Col.reset);
            System.out.println();
            System.out.println(Col.purple+Col.bold+"					    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("					    !                                           !");
            System.out.println("					    !           1              Milton           !");
            System.out.println("					    !                                           !");
            System.out.println("					    !           2              Havells          !");
            System.out.println("					    !                                           !");
            System.out.println("					    !           3              prestige         !");
            System.out.println("					    !                                           !");
            System.out.println("					    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.red+"Select a Brand"+Col.reset);
            int kettleSelection = sc.nextInt();
            kettles(kettleSelection);
        }
        //mixergrinders
        else if(select == 2)
        {
            System.out.println(Col.blue+Col.bold+"Available mixergrinders Brands are \n philips, croma");
            System.out.println();
            System.out.println(Col.green+Col.bold+"					    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~");
            System.out.println("					    !                                          !");
            System.out.println("					    !           1               philips        !");
            System.out.println("					    !                                          !");
            System.out.println("					    !           2               croma          !");
            System.out.println("					    !                                          !");
            System.out.println("					    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.red+"Select a Brand"+Col.reset);
            int mixergrinderSelection = sc.nextInt();
            mixergrinders(mixergrinderSelection);
        }
        //airfryers
        else if(select == 3)
        {
            System.out.println(Col.blue+Col.bold+"Available airfryers Brands are \n philips, Ninja, LG"+Col.reset);
            System.out.println();
            System.out.println(Col.green+Col.bold+"					    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("					    !                                           !");
            System.out.println("					    !           1              philips          !");
            System.out.println("					    !                                           !");
            System.out.println("					    !           2              Ninja            !");
            System.out.println("					    !                                           !");
            System.out.println("					    !           3              pg               !");
            System.out.println("					    !                                           !");
            System.out.println("					    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.red+"Select a Brand"+Col.reset);
            int airfryerSelection = sc.nextInt();
            airfryers(airfryerSelection);
        }
        //juicers
        else if(select ==4)
        {
            System.out.println(Col.blue+Col.bold+"Available juicers Brands are \nphilips, pg"+Col.reset);
            System.out.println();
            System.out.println(Col.purple+Col.bold+"					    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("					    !                                           !");
            System.out.println("					    !           1              philips          !");
            System.out.println("					    !                                           !");
            System.out.println("					    !           2              pg               !");
            System.out.println("					    !                                           !");
            System.out.println("					    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.red+"Select a Brand"+Col.reset);
            int juicerSelection = sc.nextInt();
            juicers(juicerSelection);
        }
        else
        {
            System.out.println(Col.red+"INVALID!!"+Col.green+"\n enter correct input"+Col.reset);
            selection();
        }
    }
    public void kettles(int brand)
    {
        if(brand==1)
        {
            System.out.println(Col.skyblue+Col.bold+"you selected model  is  milton and its specifications are:"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+Col.bold+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             1.5 Ltrs                                 |   1599/-       !");
            System.out.println("				!  1  | milton(green)         |             1200 W power                             |                !");
            System.out.println("				!     |                       |             1 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | milton(blue)          |                                                      |                !");
            System.out.println("				!     |                       |             1.2 Ltrs                                 |   1299/-       !");
            System.out.println("				!     |                       |             1500 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!  3  | milton(white)         |             1.8 Ltrs                                 |   1799/-       !");
            System.out.println("				!     |                       |             1200 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.green+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is milton(green)\nprice is "+(1599*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1599*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is milton(blue) \nprice is "+(1299*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1299*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is milton(white) \nprice is "+(1799*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1799*quantity);
            }
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }
	    }
        else if(brand==2)
        {
            System.out.println(Col.skyblue+Col.bold+"you selected model is Havells and its specifications are:"+Col.reset);
            System.out.println();
            System.out.println(Col.bold+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             1.5 Ltrs                                 |   1399/-       !");
            System.out.println("				!  1  | Havells(green)        |             1200 W power                             |                !");
            System.out.println("				!     |                       |             1 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | Havells(blue)         |                                                      |                !");
            System.out.println("				!     |                       |             1.2 Ltrs                                 |   1299/-       !");
            System.out.println("				!     |                       |             1500 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!  3  | Havells(white)        |             1.8 Ltrs                                 |   1099/-       !");
            System.out.println("				!     |                       |             1200 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.blue+Col.bold+Col.under+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is Havells(green)  \nprice is "+(1399*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1399*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is Havells(blue) \nprice is "+(1299*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1299*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is  Havells(white) \nprice is "+(1099*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1099*quantity);
            }
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }
        }
        else if(brand==3)
        {
            System.out.println(Col.purple+Col.bold+"you selected model  is prestige  models&specifications are:"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+Col.bold+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             1.5 Ltrs                                 |   1899/-       !");
            System.out.println("				!  1  | prestige(green)       |             1200 W power                             |                !");
            System.out.println("				!     |                       |             1 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | prestige(blue)        |                                                      |                !");
            System.out.println("				!     |                       |             1.2 Ltrs                                 |   1699/-       !");
            System.out.println("				!     |                       |             1500 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!  3  | prestige(white)       |             1.8 Ltrs                                 |   1299/-       !");
            System.out.println("				!     |                       |             1200 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.blue+Col.bold+Col.under+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is prestige(green)  \nprice is "+(1899*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1899*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is prestige(blue) \nprice is "+(1699*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1699*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is  prestige(white) \nprice is "+(1299*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1299*quantity);
            }
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.red+Col.bold+"Sorry!! Invalid Selection \nTry Again"+Col.reset);
            selection();
        }
    }
    public void mixergrinders(int brand)
    {
        if(brand==1)
        {
            System.out.println(Col.skyblue+Col.bold+"you selected model  is philips  models&specifications are:");
            System.out.println();
            System.out.println(Col.yellow+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             5.4 kg                                   |   13499/-      !");
            System.out.println("				!  1  | philips(blue)         |             750 W power                              |                !");
            System.out.println("				!     |                       |             5 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | philips(green)        |                                                      |                !");
            System.out.println("				!     |                       |             6 kg                                     |   8499/-       !");
            System.out.println("				!     |                       |             750 w power                              |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.blue+Col.bold+Col.under+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is philips(blue)  \nprice is "+(13499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(13499*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is philips(green) \nprice is "+(8499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(8499*quantity);
            }
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }
        }
        else if(brand==2)
        {
            System.out.println(Col.red+"you selected model  is croma  models&specifications are:"+Col.reset);
            System.out.println();
            System.out.println(Col.green+Col.bold+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             5.4 kg                                   |   14499/-      !");
            System.out.println("				!  1  | croma(blue)           |             750 W power                              |                !");
            System.out.println("				!     |                       |             5 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | croma(green)          |                                                      |                !");
            System.out.println("				!     |                       |             6 kg                                     |   9499/-       !");
            System.out.println("				!     |                       |             750 w power                              |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.blue+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is croma(blue)  \nprice is "+(14499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(14499*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is croma(green) \nprice is "+(9499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(9499*quantity);
            }
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.red+Col.bold+"Sorry!! Invalid Selection \nTry Again"+Col.reset);
            selection();
        }
    }         
    public void airfryers(int brand)
    {
        if(brand==1)
        {
            System.out.println(Col.blue+Col.bold+"you selected model  is philips  models&specifications are:"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+Col.bold+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             5.7 Ltrs                                 |   10499/-      !");
            System.out.println("				!  1  | philips(white)        |             1750 W power                             |                !");
            System.out.println("				!     |                       |             5 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | philips(blue)         |                                                      |                !");
            System.out.println("				!     |                       |             6 Ltrs                                   |   8499/-       !");
            System.out.println("				!     |                       |             1250 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!  3  | philips(green)        |                                                      |                !");
            System.out.println("				!     |                       |             8 Ltrs                                   |   7999/-       !");
            System.out.println("				!     |                       |             1200 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);                                                                                 
            System.out.println();
            System.out.println(Col.bold+"Please select the model you want");
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.skyblue+Col.bold+"you selected model is philips(white)  \nprice is "+(10499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(10499*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.skyblue+Col.bold+"you selected model is philips(blue) \nprice is "+(8499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(8499*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.skyblue+Col.bold+"you selected model is philips(green)  \nprice is "+(7999*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully");
                bill = bill +(7999*quantity);
            }   
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }
        }
        else if(brand==2)
        {
            System.out.println(Col.red+Col.bold+"you selected model  is Ninja  models&specifications are:"+Col.reset);
            System.out.println(Col.skyblue+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             5.7 Ltrs                                 |   17499/-      !");
            System.out.println("				!  1  | Ninja(white)          |             1750 W power                             |                !");
            System.out.println("				!     |                       |             5 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | Ninja(blue)           |                                                      |                !");
            System.out.println("				!     |                       |             6 Ltrs                                   |   9499/-       !");
            System.out.println("				!     |                       |             1250 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!  3  | Ninja(green)          |                                                      |                !");
            System.out.println("				!     |                       |             8 Ltrs                                   |   8999/-       !");
            System.out.println("				!     |                       |             1200 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);  
	    System.out.println();                                                                               
            System.out.println(Col.under+Col.purple+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Ninja(white)  \nprice is "+Col.green+(17499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(17499*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Ninja(blue) \nprice is "+(9499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(9499*quantity);
            }
             else if(select == 3)
            {
                System.out.println(Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is Ninja(green)  \nprice is "+(8999*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(8999*quantity);
            }   
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }
        }
        else if(brand==3)
        {
            System.out.println(Col.bold+"you selected model  is pg  models&specifications are:");
            System.out.println(Col.yellow+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             5.7 Ltrs                                 |   16499/-      !");
            System.out.println("				!  1  | pg (white)            |             1750 W power                             |                !");
            System.out.println("				!     |                       |             5 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | pg (blue)             |                                                      |                !");
            System.out.println("				!     |                       |             6 Ltrs                                   |   8499/-       !");
            System.out.println("				!     |                       |             1250 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!  3  | pg (green)            |                                                      |                !");
            System.out.println("				!     |                       |             8 Ltrs                                   |   6999/-       !");
            System.out.println("				!     |                       |             1200 w power                             |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);                                                                                 
            System.out.println(Col.purple+Col.bold+"Please select the model you want");
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.skyblue+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.bold+Col.yellow+"you selected model is pg (white)  \nprice is "+(16499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(16499*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.skyblue+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is pg (blue) \nprice is "+(8499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(8499*quantity);
            }
             else if(select == 3)
            {
                System.out.println(Col.skyblue+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.yellow+Col.bold+"you selected model is pg (green)  \nprice is "+(6999*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(6999*quantity);
            }   
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }  
        }
        else
        {
            System.out.println(Col.red+Col.bold+"Sorry!! Invalid Selection \nTry Again");
            selection();
        }
    }
    public void juicers(int brand)
    {
        if(brand==1)
        {
            System.out.println(Col.skyblue+Col.bold+"you selected model  philips models&specifications are:");
            System.out.println(Col.green+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             5.4 kg                                   |   1499/-       !");
            System.out.println("				!  1  | philips(yellow)       |             750 W power                              |                !");
            System.out.println("				!     |                       |             5 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | philips(red)          |                                                      |                !");
            System.out.println("				!     |                       |             6 kg                                     |   899/-        !");
            System.out.println("				!     |                       |             750 w power                              |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);
	    System.out.println();
            System.out.println(Col.bold+"Please select the model you want");
            int select =sc.nextInt();
             if(select == 1)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is philips(yellow)  \nprice is "+(1499*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1499*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.blue+Col.bold+"you selected model is  philips(red) \nprice is "+(899*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully");
                bill = bill +(899*quantity);
            }
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }
	    }
        else if(brand==2)
        {
            System.out.println(Col.purple+Col.bold+"you selected model  pg models&specifications are:"+Col.reset);
            System.out.println(Col.yellow+"				 _____________________________________________________________________________________________________");
            System.out.println("				|S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("				|_____|_______________________|______________________________________________________|________________|");
            System.out.println("				!     |                       |             5.4 kg                                   |   1299/-       !");
            System.out.println("				!  1  | pg(yellow)            |             750 W power                              |                !");
            System.out.println("				!     |                       |             5 Year Warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				! 2   | pg(red)               |                                                      |                !");
            System.out.println("				!     |                       |             6 kg                                     |   699/-        !");
            System.out.println("				!     |                       |             750 w power                              |                !");
            System.out.println("				!     |                       |             2 year warranty                          |                !");
            System.out.println("				!     |                       |                                                      |                !");
            System.out.println("				!_____|_______________________|______________________________________________________|________________!"+Col.reset);
	    System.out.println();
            System.out.println(Col.bold+"Please select the model you want");
            int select =sc.nextInt();
             if(select == 1)
            {
                System.out.println(Col.blue+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.skyblue+"you selected model is pg(yellow)  \nprice is "+(1299*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(1299*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.blue+Col.bold+"enter quantity");
                int quantity = sc.nextInt();
                System.out.println(Col.skyblue+"you selected model is  pg(red) \nprice is "+(699*quantity)+Col.reset+Col.bold+Col.blink+"/- Item added to cart Successfully"+Col.reset);
                bill = bill +(699*quantity);
            }
            else
            {
                System.out.println(Col.red+"Item not found"+Col.reset);
            }
	    }
        else
        {
            System.out.println(Col.red+"Sorry!! Invalid Selection \nTry Again"+Col.reset);
            selection();
        } 
    }
    
}


interface Travels_Main
{
    double bus(int pass,int amount);
    double train(int pass,int amount);
    double flight(int pass,int amount);
}

class Travels implements Travels_Main
{
    static Scanner sc=new Scanner(System.in);
    static private String irtcusername="hello";
    static private String irtcpassword="hello@123";
    
    String irtcu()
    {
        return irtcusername;
    }
    
    String irtcp()
    {
        return irtcpassword;
    }
    
    public double bus(int pass,int amount)
    {
        return pass*amount;
    }
    public double train(int pass,int amount)
    {
        return pass*amount;
    }	
    public double flight(int pass,int amount)
    {
        return pass*amount;
    }
    void date1()
    {
        System.out.println(Col.yellow+Col.bold+Col.under+"Select date from the following dates"+Col.reset);
        LocalDate td=LocalDate.now();
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+"."+td.plusDays(i));
        }
        
    }
    void selection()
    {
		System.out.println(Col.skyblue+Col.blink+"					######## ########     ###    ##     ## ######## ##        ###### ");
		System.out.println("					   ##    ##     ##   ## ##   ##     ## ##       ##       ##    ##");
		System.out.println("					   ##    ##     ##  ##   ##  ##     ## ##       ##       ##      ");
		System.out.println("					   ##    ########  ##     ## ##     ## ######   ##        ###### ");
		System.out.println("					   ##    ##   ##   #########  ##   ##  ##       ##             ##");
		System.out.println("					   ##    ##    ##  ##     ##   ## ##   ##       ##       ##    ##");
		System.out.println("					   ##    ##     ## ##     ##    ###    ######## ########  ###### "+Col.reset);
		System.out.println();
        	System.out.println();
               
        LocalDate td=LocalDate.now();
        System.out.println(Col.bold+Col.yellow+"-------------------------> 1.Bus\n-------------------------> 2.Train"+Col.reset);
        System.out.println(Col.bold+Col.skyblue+"please select what do you want book");
        int sel=sc.nextInt();
        if(sel==1)
        {
            System.out.println(Col.green+"Thank you for selecting Bus Services"+Col.reset);
            date1();
            System.out.println(Col.green+Col.bold+"Please select a Date for Your Journey"+Col.reset);
            int selt=sc.nextInt();
            if(selt>=6)
            {
                System.out.println(Col.red+"Invalid Date Selection\nPlease select Correct Date"+Col.reset);
                System.out.println(Col.green+"1.for try Again\n2.EXIT");
                int s1=sc.nextInt();
                if(s1==1)
                {
                    selection();
                }
                else
                {
                    System.out.println(Col.red+"EXIT"+Col.reset);
                }
                    
            }
            else
            {
                System.out.println(Col.bold+"We have currently having bus available for following routes");
                System.out.println(Col.blue+"			----------------------------------------");
                System.out.println("			| S.NO      From                 To    |");
                System.out.println("			----------------------------------------");
                System.out.println("			|  1.      Hyderabad          Warangal |");
                System.out.println("			|  2.      Hyderabad          Bangalore|");
                System.out.println("			|  3.      Hyderabad          Vizag    |");
                System.out.println("			|  4.      Hyderabad          Chennai  |");
                System.out.println("			|  5.      Hyderabad          Kakinada |");
                System.out.println("			----------------------------------------"+Col.reset);
                
                
                
                System.out.println(Col.bold+"Please select the option");
                int select=sc.nextInt();
                if(select==1)
                {
                    System.out.println(Col.skyblue+"Your selected option is Hyderabd to Warangal\nTicket price for 1 Person:1000");
                    System.out.println(Col.purple+Col.bold+"Please how many tickets you want");
                    int tic=sc.nextInt();
                    System.out.println(Col.bold+"Your date of Journey is "+Col.reset+td.plusDays(selt));
                    System.out.println(Col.green+Col.bold+"Total amount for "+tic+" Passengers is "+bus(tic,1000)+Col.reset);
                    
                    
                }
                else if(select==2)
                {
                    System.out.println(Col.skyblue+"Your selected option is Hyderabd to Bangalore\nTicket price for 1 Person:2500");
                    System.out.println(Col.purple+Col.bold+"Please how many tickets you want");
                    int tic=sc.nextInt();
                    System.out.println(Col.bold+"Your date of Journey is "+Col.reset+td.plusDays(selt));
                    System.out.println(Col.green+Col.bold+"Total amount for "+tic+" Passengers is "+bus(tic,2500)+Col.reset);
                    
                }
                else if(select==3)
                {
                    System.out.println(Col.skyblue+"Your selected option is Hyderabd to Vizag\nTicket price for 1 Person:1500");
                    System.out.println(Col.purple+Col.bold+"Please how many tickets you want");
                    int tic=sc.nextInt();
                    System.out.println(Col.bold+"Your date of Journey is "+Col.reset+td.plusDays(selt));
                    System.out.println(Col.green+Col.bold+"Total amount for "+tic+" Passengers is "+bus(tic,1500)+Col.reset);
                    
                }
                else if(select==4)
                {
                    System.out.println(Col.skyblue+"Your selected option is Hyderabd to chennai\nTicket price for 1 Person:2000");
                    System.out.println(Col.purple+Col.bold+"Please how many tickets you want");
                    int tic=sc.nextInt();
                    System.out.println(Col.bold+"Your date of Journey is "+Col.reset+td.plusDays(selt));
                    System.out.println(Col.green+Col.bold+"Total amount for "+tic+" Passengers is "+bus(tic,2000)+Col.reset);
                
                }
                else if(select==5)
        	    {
        	        System.out.println(Col.skyblue+"Your selected option is Hyderabd to Kakinada\nTicket price for 1 Person:1200");
                    System.out.println(Col.purple+Col.bold+"Please how many tickets you want");
                    int tic=sc.nextInt();
                    System.out.println(Col.bold+"Your date of Journey is "+Col.reset+td.plusDays(selt));
                    System.out.println(Col.green+Col.bold+"Total amount for "+tic+" Passengers is "+bus(tic,1200)+Col.reset);
                    
        	    }
        	    else
        	    {
        	        System.out.println(Col.red+"Invalid Selection"+Col.reset);
        	        System.out.println(Col.bold+"Enter correct option"+Col.yellow+"\n1.Try Again\n2.Any Number to EXIT From Travels"+Col.reset);
        	        int opt1=sc.nextInt();
        	        if(opt1==1)
        	        selection();
        	    }
        	        
        	}
        }
        else if(sel==2)
        {
            System.out.println(Col.green+"Thank you for selecting Train Services");
            System.out.println(Col.bold+Col.blue+"Please enter your IRCTC Details for Booking");
            System.out.println(Col.purple+"Please Enter your Username"+Col.reset);
            String user=sc.next();
            System.out.println(Col.purple+Col.bold+"Please Enter your Password"+Col.reset);
            String pass=sc.next();
                
            if(irtcu().equals(user) && irtcp().equals(pass))
            {
                System.out.println(Col.green+Col.bold+"Successfully login into Your IRCTC Account"+Col.reset);
                System.out.println(Col.bold+"Please enter your Boarding station");
                String board1=sc.next();
                System.out.println(Col.bold+"Please enter yout Departure Station");
                String board2=sc.next();
                if(board1.equals("Sec") && board2.equals("Del"))
                {
                    date1();
                    System.out.println(Col.green+Col.bold+"Please select a Date for Your Journey"+Col.reset);
                    int selt=sc.nextInt();
                    if(selt>=6)
                    {
                        System.out.println(Col.red+"Invalid Date Selection\nPlease select Correct Date"+Col.reset);
                        System.out.println(Col.green+"1.for try Again\n2.EXIT");
                        int s1=sc.nextInt();
                        if(s1==1)
                        {
                            selection();
                        }
                        else
                        {
                            System.out.println(Col.red+"EXIT"+Col.reset);
                        }
                    
                    }
                    else
                    {
                        System.out.println(Col.skyblue+"These are following trains are available");
                        System.out.println(Col.yellow+Col.bold+"    		---------------------------------------------------------------------------------------");
                        System.out.println("    		|S.No. Train Number       Train Name          	Timings                Price(1 person)|");
                        System.out.println("    		|-------------------------------------------------------------------------------------|");
                        System.out.println("    		|1.      12723           Telangana Express     Boardingtime:6:25am       SL:700       |");
                        System.out.println("    		|                                              Departuretime:7:40Am      3A:1800      |");
                        System.out.println("    		|                                                                        2A:3500      |");
                        System.out.println("    		|                                                                        1A:4200      |");
                        System.out.println("    		|2.      12723           Nizamuddin            Boardingtime:6:25am       SL:1000      |");
                        System.out.println("    		|                                              Departuretime:7:40Am      3A:2500      |");
                        System.out.println("    		|                                                                        2A:3800      |");
                        System.out.println("    		|                                                                        1A:4800      |");
                        System.out.println("    		|3.      12723           Secundrabad Express   Boardingtime:6:25am       SL:600       |");
                        System.out.println("    		|                                              Departuretime:7:40Am      3A:1400      |");
                        System.out.println("    		|                                                                        2A:2200      |");
                        System.out.println("    		|                                                                        1A:3000      |");
                        System.out.println("    		|-------------------------------------------------------------------------------------|"+Col.reset);
			            System.out.println();
                		System.out.println(Col.bold+"Please select the train");
                		int n=sc.nextInt();
                		if(n==1)
                		{
                			
                    	    System.out.println(Col.under+Col.blue+Col.bold+"Coach Deatils"+Col.reset);
                    		System.out.println(Col.purple+Col.bold+"1.SL\n2.3A\n3.2A\n4.1A"+Col.reset);
                    		System.out.println(Col.bold+"Please select the category");
                    		int coach=sc.nextInt();
                    		if(coach==1)
                    		{
                    			System.out.println(Col.green+"You selected SL Coach and price 700(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers"+Col.reset);
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                                System.out.println(Col.green+Col.bold+"Total amount for "+pass1+"Passengers is "+train(pass1,700)+Col.reset);
                    		}
                    		else if(coach==2)
                    		{
                    	        System.out.println(Col.green+"You selected 3A Coach and price 1800(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers"+Col.reset);
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,1800)+Col.reset);
                    		}
                    		else if(coach==3)
                    		{
                    	        System.out.println(Col.green+"You selected 2A Coach and price 3500(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers"+Col.reset);
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    		    System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Pssengers is "+train(pass1,3500)+Col.reset);
                    		}
                    		else if(coach==4)
                    		{
                    	        System.out.println(Col.green+"You selected 1A Coach and price 4200(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers"+Col.reset);
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,4200)+Col.reset);
                    		}
                    		else
                    		{
                    		    System.out.println(Col.red+"Invalid Selection"+Col.reset);
                                System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                                int s1=sc.nextInt();
                                if(s1==1)
                                {
                                    selection();
                                }
                    		}
        			
                        }
                        else if(n==2)
                        {
                            System.out.println(Col.under+Col.blue+Col.bold+"Coach Deatils"+Col.reset);
                    		System.out.println(Col.purple+Col.bold+"1.SL\n2.3A\n3.2A\n4.1A"+Col.reset);
                    		System.out.println(Col.bold+"Please select the category");
                    		int coach=sc.nextInt();
                    		if(coach==1)
                    		{
                    			System.out.println(Col.green+"You selected SL Coach and price 1000(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+"Passengers is "+train(pass1,1000));
                    		}
                    		else if(coach==2)
                    		{
                    	        System.out.println(Col.green+"You selected 3A Coach and price 2500(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,2500)+Col.reset);
                    		}
                    		else if(coach==3)
                    		{
                    	        System.out.println(Col.green+"You selected 2A Coach and price 3800(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Pssengers is "+train(pass1,3800)+Col.reset);
                    		}
                    		else if(coach==4)
                    		{
                    	        System.out.println(Col.green+"You selected 1A Coach and price 4800(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.purple+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,4800)+Col.reset);
                    		}
                    		else
                    		{
                    	        System.out.println(Col.red+"Invalid Selection"+Col.reset);
                		        System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                                int s1=sc.nextInt();
                                if(s1==1)
                                {
                                    selection();
                                }
                    		}
                        }
                        else if(n==3)
                        {
                            System.out.println(Col.under+Col.blue+Col.bold+"Coach Deatils"+Col.reset);
                    		System.out.println(Col.purple+Col.bold+"1.SL\n2.3A\n3.2A\n4.1A");
                    		System.out.println(Col.bold+"Please select the category");
                    		int coach=sc.nextInt();
                    		if(coach==1)
                    		{
                    			System.out.println(Col.green+"You selected SL Coach and price 600(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+"Passengers is "+train(pass1,600)+Col.reset);
                    		}
                    		else if(coach==2)
                    		{
                    	        System.out.println(Col.green+"You selected 3A Coach and price 1400(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,1400)+Col.reset);
                    		}
                    		else if(coach==3)
                    		{
                    	        System.out.println(Col.green+"You selected 2A Coach and price 2200(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Pssengers is "+train(pass1,2200)+Col.reset);
                    		}
                    		else if(coach==4)
                    		{
                    	        System.out.println(Col.green+"You selected 1A Coach and price 3000(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,3000)+Col.reset);
                    		}
                    		else
                    		{
                    	        System.out.println(Col.red+"Invalid Selection"+Col.reset);
                    	        System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                                int s1=sc.nextInt();
                                if(s1==1)
                                {
                                    selection();
                                }
                    		}
                        }
                        else
                        {
                            System.out.println(Col.red+"Invalid Train Selection"+Col.reset);
                		    System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                            int s1=sc.nextInt();
                            if(s1==1)
                            {
                                selection();
                            }
                            
                        }
                    }
                }
                else if(board1.equals("Sec") && board2.equals("Tir"))
                {
                    date1();
                    System.out.println(Col.green+Col.bold+"Please select a Date for Your Journey"+Col.reset);
                    int selt=sc.nextInt();
                    if(selt>=6)
                    {
                        System.out.println(Col.red+"Invalid Date Selection\nPlease select Correct Date"+Col.reset);
                        System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                        int s1=sc.nextInt();
                        if(s1==1)
                        {
                            selection();
                        }
                        else
                        {
                            System.out.println(Col.red+"EXIT"+Col.reset);
                        }
                    }
                    else
                    {
                        System.out.println(Col.skyblue+"These are following trains are available");
                        System.out.println(Col.yellow+"		---------------------------------------------------------------------------------------");
                        System.out.println("		| S.No. Train Number       Train Name          	Timings                Price(1 person) |");
                        System.out.println("		---------------------------------------------------------------------------------------|");
                        System.out.println("		| 1.      17406           Krishna Express       Boardingtime:6:00am       SL:400       |");
                        System.out.println("		|                                               Departuretime:10:40pm     3A:1000      |");
                        System.out.println("		|                                                                         2A:2000      |");
                        System.out.println("		|                                                                         1A:2500      |");
                        System.out.println("		| 2.      12764           Padmavathi Exp     	Boardingtime:06:40pm      SL:450       |");
                        System.out.println("		|                                               Departuretime:06:55am     3A:1200      |");
                        System.out.println("		|                                                                         2A:2200      |");
                        System.out.println("		|                                                                         1A:2800      |");
                        System.out.println("		---------------------------------------------------------------------------------------- "+Col.reset);
                            
                	    int n=sc.nextInt();
                		if(n==1)
                		{
                		    System.out.println(Col.under+Col.blue+Col.bold+"Coach Deatils"+Col.reset);
                    		System.out.println(Col.purple+Col.bold+"1.SL\n2.3A\n3.2A\n4.1A");
                    		System.out.println(Col.bold+"Please select the category");
                    		int coach=sc.nextInt();
                    		if(coach==1)
                    		{
                    		    System.out.println(Col.green+"You selected SL Coach and price 400(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+"Passengers is "+train(pass1,400)+Col.reset);
                    		}
                    		else if(coach==2)
                    		{
                    	        System.out.println(Col.green+"You selected 3A Coach and price 1200(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    		    System.out.println(Col.purple+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,1000)+Col.reset);
                    		}
                    		else if(coach==3)
                    		{
                    	        System.out.println(Col.green+"You selected 2A Coach and price 2000(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    		    System.out.println(Col.purple+Col.bold+"Total amount for "+pass1+" Pssengers is "+train(pass1,2000)+Col.reset);
                    		}
                    		else if(coach==4)
                    		{
                    	        System.out.println(Col.green+"You selected 1A Coach and price 2600");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,2500)+Col.reset);
                    		}
                    		else
                    		{
                    		    System.out.println(Col.reset+"Invalid Selection");
                    		    System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                                int s1=sc.nextInt();
                                if(s1==1)
                                {
                                    selection();
                                }
                    		}
        			
                        }
                        else if(n==2)
                        {
                            System.out.println(Col.under+Col.blue+Col.bold+"Coach Deatils"+Col.reset);
                    		System.out.println(Col.purple+Col.bold+"1.SL\n2.3A\n3.2A\n4.1A");
                    		System.out.println(Col.bold+"Please select the category");
                    		int coach=sc.nextInt();
                    		if(coach==1)
                    		{
                    			System.out.println(Col.green+"You selected SL Coach and price 450(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                                System.out.println(Col.purple+Col.bold+"Total amount for "+pass1+"Passengers is "+train(pass1,450)+Col.reset);
                    		}
                    		else if(coach==2)
                    		{
                    	        System.out.println(Col.green+"You selected 3A Coach and price 1200(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,1200)+Col.reset);
                    		}
                    		else if(coach==3)
                    		{
                    		    System.out.println(Col.green+"You selected 2A Coach and price 2200(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    		    System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Pssengers is "+train(pass1,2200));
                    		}
                    		else if(coach==4)
                    		{
                    	        System.out.println(Col.green+"You selected 1A Coach and price 2800(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,2800)+Col.reset);
                    		}
                    		else
                    		{
                    			System.out.println(Col.red+"Invalid Selection"+Col.reset);
                    			System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                                int s1=sc.nextInt();
                                if(s1==1)
                                {
                                    selection();
                                }
                    		}
                        }
                        else
                		{
                		    System.out.println(Col.red+"Invalid Train Selection"+Col.reset);
                		    System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                            int s1=sc.nextInt();
                            if(s1==1)
                            {
                                selection();
                            }
                		}
                        
                    }
                }
                else if(board1.equals("Sec") && board2.equals("Chennai"))
                {
                    date1();
                    System.out.println(Col.green+Col.bold+"Please select a Date for Your Journey"+Col.reset);
                    int selt=sc.nextInt();
                    if(selt>=6)
                    {
                        System.out.println("Invalid Date Selection\nPlease select Correct Date");
                        System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                        int s1=sc.nextInt();
                        if(s1==1)
                        {
                            selection();
                        }
                        else
                        {
                            System.out.println(Col.red+"EXIT"+Col.reset);
                        }
                    }
                    else
                    {
                        System.out.println(Col.skyblue+"These are following trains are available");
                        System.out.println(Col.yellow+"		---------------------------------------------------------------------------------------");
                        System.out.println("		| S.No. Train Number       Train Name          	Timings                Price(1 person) |");
                        System.out.println("		|--------------------------------------------------------------------------------------|");
                        System.out.println("		| 1.      12604           ChennaiSF Exp         Boardingtime:06:30am      SL:450       |");
                        System.out.println("		|                                               Departuretime:05:40am     3A:1100      |");
                        System.out.println("		|                                                                         2A:1800      |");
                        System.out.println("		|                                                                         1A:2800      |");
                        System.out.println("		| 2.      12760           Charminar Exp     	  Boardingtime:06:40pm      SL:420     |");
                        System.out.println("		|                                               Departuretime:08:00am     3A:1000      |");
                        System.out.println("		|                                                                         2A:1600      |");
                        System.out.println("		|                                                                         1A:2500      |");
                        System.out.println("		|--------------------------------------------------------------------------------------|"+Col.yellow);
                            
                        int n=sc.nextInt();
                		if(n==1)
                		{
                			System.out.println(Col.under+Col.blue+Col.bold+"Coach Deatils"+Col.reset);
                    		System.out.println(Col.purple+Col.bold+"1.SL\n2.3A\n3.2A\n4.1A");
                    		System.out.println(Col.bold+"Please select the category");
                    		int coach=sc.nextInt();
                    		if(coach==1)
                    		{
                    			System.out.println(Col.green+"You selected SL Coach and price 450(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    		    System.out.println(Col.green+Col.bold+"Total amount for "+pass1+"Passengers is "+train(pass1,450)+Col.reset);
                    		}
                    		else if(coach==2)
                    		{
                    	        System.out.println(Col.green+"You selected 3A Coach and price 1100(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    		    System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,1100)+Col.reset);
                    		}
                    		else if(coach==3)
                    		{
                    	        System.out.println(Col.green+"You selected 2A Coach and price 1800(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    		    System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Pssengers is "+train(pass1,1800)+Col.reset);
                    		}
                    		else if(coach==4)
                    		{
                    	        System.out.println(Col.green+"You selected 1A Coach and price 2800(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.purple+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,2800)+Col.reset);
                    		}
                    		else
                    		{
                    	        System.out.println(Col.red+"Invalid Selection"+Col.reset+"\nSelect");
                    	        System.out.println(Col.green+"1.for Retry"+Col.red+"\n2.Exit");
                                int s1=sc.nextInt();
                                if(s1==1)
                                {
                                    selection();
                                }
                    		}   
                	    }
                		else if(n==2)
                		{
                		    System.out.println(Col.under+Col.blue+Col.bold+"Coach Deatils"+Col.reset);
                    		System.out.println(Col.purple+Col.bold+"1.SL\n2.3A\n3.2A\n4.1A");
                    		System.out.println(Col.bold+"Please select the category");
                    		int coach=sc.nextInt();
                    		if(coach==1)
                    		{
                    		    System.out.println(Col.green+"You selected SL Coach and price 420(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+"Passengers is "+train(pass1,420)+Col.reset);
                    		}
                    		else if(coach==2)
                    		{
                    	        System.out.println(Col.green+"You selected 3A Coach and price 1000(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,1000)+Col.reset);
                    		}
                    		else if(coach==3)
                    		{
                    	        System.out.println(Col.green+"You selected 2A Coach and price 1600(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Pssengers is "+train(pass1,1600));
                    		}
                    		else if(coach==4)
                    		{
                    	        System.out.println(Col.green+"You selected 1A Coach and price 2500(1 Person)");
                    			System.out.println(Col.purple+Col.bold+"Enter passengers");
                    			int pass1=sc.nextInt();
                    			System.out.println("Your date of Journey is "+td.plusDays(selt));
                    			System.out.println(Col.green+Col.bold+"Total amount for "+pass1+" Passengers is "+train(pass1,2500)+Col.reset);
                    		}
                    		else
                    		{
                    	        System.out.println(Col.red+"Invalid Selection"+Col.reset);
                    	        System.out.println(Col.green+"1.for Retry"+Col.red+"\nAny Digit to Exit");
                                int s1=sc.nextInt();
                                if(s1==1)
                                {
                                    selection();
                                }
                    		}
                	    }
                	    else
                		{
                		    System.out.println(Col.red+"Invalid Train Selection"+Col.reset);
                		    System.out.println(Col.green+"1.for Retry"+Col.red+"\nAny Digit to Exit"+Col.reset);
                            int s1=sc.nextInt();
                            if(s1==1)
                            {
                                selection();
                            }
                		}
                    }
                }
                else
                {
                    System.out.println(Col.red+"Invalid station selection"+Col.reset+Col.skyblue+"\nSelect Rouite"+Col.reset);
                    System.out.println(Col.bold+"Secundrabad to Delhi (Sec - Del) \nSecundrabad to Thirupati (Sec - Tir) \nSecundrabad to Chennai (Sec - Chennai)"+Col.reset);
                    System.out.println(Col.green+"1.For Retry"+Col.red+"\nAny Digit to Exit"+Col.reset);
                    int s1=sc.nextInt();
                    if(s1==1)
                    {
                        selection();
                    }
                }
            }
            else
            {
                System.out.println(Col.reset+"Invalid login details"+Col.reset);
                System.out.println(Col.skyblue+"Are you want Try Again or EXIT\n1.Try Again\n2.EXIT");
                int opt=sc.nextInt();
                if(opt==1)
                {
                    selection();
                }
            }
        }
        else
        {
            System.out.println(Col.white+Col.bold+Col.backred+"Invalid selection"+Col.reset+ Col.skyblue+"\nSelect Correct Input"+Col.reset);
            selection();
        }
    } 
}


interface Theaters
{
    void location();
}
class Movies implements Theaters
{
    static double bill;
    static Scanner sc=new Scanner(System.in);
    public void location()
    {
        //System.out.println("Select your location\n1.Hyderabad\n2.Bengaluru\n3.Chennai");
	System.out.println(Col.skyblue+Col.blink+"    						$$\\      $$\\                     $$\\                     ");
	System.out.println("						$$$\\    $$$ |                    \\__|                    ");
	System.out.println("						$$$$\\  $$$$ | $$$$$$\\ $$\\    $$\\ $$\\  $$$$$$\\   $$$$$$$\\ ");
	System.out.println("						$$\\$$\\$$ $$ |$$  __$$\\$$\\  $$  |$$ |$$  __$$\\ $$  _____|");
	System.out.println("						$$ \\$$$  $$ |$$ /  $$ |\\$$\\$$  / $$ |$$$$$$$$ |\\$$$$$$\\  ");
	System.out.println("						$$ |\\$  /$$ |$$ |  $$ | \\$$$  /  $$ |$$   ____| \\____$$\\ ");
	System.out.println("						$$ | \\_/ $$ |\\$$$$$$  |  \\$  /   $$ |\\$$$$$$$\\ $$$$$$$  |");
	System.out.println("						\\__|     \\__| \\______/    \\_/    \\__| \\_______|\\_______/ "+Col.reset);

        System.out.println(Col.green+Col.bold+"Select Your Location"+Col.blue+"\n-----------------------------> 1. HYDERABAD\n-----------------------------> 2. BENGALURU\n-----------------------------> 3. CHENNAI"+Col.reset);
        int n=sc.nextInt();
		if(n==1)
        {
            displayHyderabad();
        }
        else if(n==2)
        {
            displayBengaluru();
        }
        else if(n==3)
        {
            displayChennai();
        }
        else
        {
            System.out.println(Col.red+Col.bold+"Location Not Found please selct valid one"+Col.reset);
            location();
        }
    }
    void movieNames()
    {
        System.out.println(Col.yellow+Col.bold+"Recommended movies"+Col.reset);
        System.out.println(Col.skyblue+" ___________________________________________________________________________________________________________"+Col.reset);
        System.out.println(Col.skyblue+"|"+Col.reset+Col.purple+Col.bold+" Select option  "+Col.reset+Col.skyblue+"|"+Col.reset+Col.purple+Col.bold+"    Movie name           "+Col.reset+Col.skyblue+"|"+Col.reset+Col.purple+Col.bold+"    Ratings      "+Col.reset+Col.skyblue+"|"+Col.reset+Col.purple+Col.bold+"    Languages                                 "+Col.reset+Col.skyblue+"|"+Col.reset);
        System.out.println(Col.skyblue+"|________________|_________________________|_________________|______________________________________________|"+Col.reset);
        System.out.println(Col.skyblue+"!"+Col.reset+"       1        "+Col.skyblue+"|"+Col.reset+"    Leo                  "+Col.skyblue+"|"+Col.reset+"    8.4/10       "+Col.skyblue+"|"+Col.reset+"    Telugu, Tamil, Hindi, Kannada             "+Col.skyblue+"!"+Col.reset);
        System.out.println(Col.skyblue+"!                |                         |                 |                                              !"+Col.reset);
        System.out.println(Col.skyblue+"!"+Col.reset+"       2        "+Col.skyblue+"|"+Col.reset+"    Bhagavanth Kesari    "+Col.skyblue+"|"+Col.reset+"    8.8/10       "+Col.skyblue+"|"+Col.reset+"    Telugu                                    "+Col.skyblue+"!"+Col.reset);
        System.out.println(Col.skyblue+"!                |                         |                 |                                              !"+Col.reset);
        System.out.println(Col.skyblue+"!"+Col.reset+"       3        "+Col.skyblue+"|"+Col.reset+"    Tiger Nageswara Rao  "+Col.skyblue+"|"+Col.reset+"    8.5/10       "+Col.skyblue+"|"+Col.reset+"    Telugu, Hindi, Tamil, Malayalam, Kannada  "+Col.skyblue+"!"+Col.reset);
        System.out.println(Col.skyblue+"!                |                         |                 |                                              !"+Col.reset);
        System.out.println(Col.skyblue+"!"+Col.reset+"       4        "+Col.skyblue+"|"+Col.reset+"    MAD                  "+Col.skyblue+"|"+Col.reset+"    9.4/10       "+Col.skyblue+"|"+Col.reset+"    Telugu, English                           "+Col.skyblue+"!"+Col.reset);
        System.out.println(Col.skyblue+"!________________|_________________________|_________________|______________________________________________!"+Col.reset);
    }
    void LeoDetails()
    {
        System.out.println(Col.yellow+" ___________________________________________________________"+Col.reset);
		System.out.println(Col.yellow+"|"+Col.reset+Col.blue+Col.bold+"                     Movie Details                         "+Col.reset+Col.yellow+"|"+Col.reset);
		System.out.println(Col.yellow+"|___________________________________________________________|"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Movie name       "+Col.reset+Col.yellow+"|"+Col.reset+"     Leo                           "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                   !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Languages        "+Col.reset+Col.yellow+"|"+Col.reset+"     Telugu, Tamil, Hindi, Kannada "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                   !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Release date     "+Col.reset+Col.yellow+"|"+Col.reset+"     19 October 2023               "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                   !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Genre            "+Col.reset+Col.yellow+"|"+Col.reset+"     Action, Thriller              "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                   !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Time Duration    "+Col.reset+Col.yellow+"|"+Col.reset+"     2hr 44min                     "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!_______________________|___________________________________!"+Col.reset);
    }
    void Bdetails()
    {
        System.out.println(Col.yellow+" _________________________________________________________"+Col.reset);
		System.out.println(Col.yellow+"|"+Col.reset+Col.blue+Col.bold+"                     Movie Details                       "+Col.reset+Col.yellow+"|"+Col.reset);
		System.out.println(Col.yellow+"|_________________________________________________________|"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Movie name       "+Col.reset+Col.yellow+"|"+Col.reset+"      Bhagavanth Kesari          "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                 !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Languages        "+Col.reset+Col.yellow+"|"+Col.reset+"      Telugu                     "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                 !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Release date     "+Col.reset+Col.yellow+"|"+Col.reset+"      19 October 2023            "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                 !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Genre            "+Col.reset+Col.yellow+"|"+Col.reset+"      Action, Drama              "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                 !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Time Duration    "+Col.reset+Col.yellow+"|"+Col.reset+"      2hr 44min                  "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!_______________________|_________________________________!"+Col.reset);
	System.out.println();
try{
Thread.sleep(100);
System.out.println(Col.green+Col.bold+"											Wait One Second..."+Col.reset);
Thread.sleep(2000);
System.out.println(Col.bold+"++++++++++++++=====================+======================----------------::::::::::::::-:-----------------------======-----------------========+++++++++++++++***++++++++++++++++++++++++++***********+");
System.out.println("+++++++++++++=================================++**+++++++==---------------::::::::::::::-=====++=====-----------------------------------=========++++++++++*++******+++++++++++++++++++++++++***++++++==");
System.out.println("++++++++++++++==============================+**+==========---------------:::::::::::::-=###%##***###**#*=-------------------------------========+++++++++++*********+++**+++++++++++++++++=++++=========");
Thread.sleep(100);System.out.println("++++++++++++++++============================+**+===+======--------------:::::::::::::+##%##%%%%%%%##%%#****----------------------------==========++++++++++********++****+*++++++++++++=================");
System.out.println("++++++++++++++==============================+**+===========---------::::::::::::::::=*#%%%#%%%%%%%%%%%%###+=---------------:::----------=======+++++++++++***************+++++++++++++=======+=+++++===+");
System.out.println("++++++++++++++===========--=================++++==++========------::::::::::::::::-*#%*######%#%%%%####%%#%%%#-:-:---------::-------------=====++++++++++++************++++++++++++++++++++*********++++");
System.out.println("+++++++++++++=============-=================+*+++++*+=====---------:::::::::::::::*###*##%##%%%%%%%%%%%%%%%%%#*-::::----------------------=======++++=+++++*************++++++++++++++***#**************");
System.out.println("++++++++++++++++==========-===============++**+****++==---------------:::::::::::-######%%%%%%%%%%%%%%%%@@%%%##=::-------------------------========+++++++++++**********+*+++++++++++###*+**+***********");
System.out.println("+++++++++++++++=+==========-===========+******+***+=+=-----------------::::::::::+###%%@%@%%%%%%%%%%%@@@@%%%%%%*--------------------------=========+++++++++++++****+++++++++++++++++*##+++++++++**+++**");
System.out.println("++++++++++++++++++++=======--=========+*******+*+*+++=----------------::::::::::-*##%%%%%#*+++*%%%%%%%@@@@@%%%*+:::::::------------------===========++++++++++++***+*++++++++++++++++*##++++++++++++++++");
Thread.sleep(2000);System.out.println("++++++++++++++++++++=========-=======+********=++*+++=--------------:::::::::::::+*#*=+++-----==+**####%%@@@@%%*::::::::-:::::------------===========+==++++++++++++++++++++++++++++*###*+++++++++++++++");
System.out.println("+++++++++++++++++++=========--=======+********=+***++==-------------:::::::::::::-**+--=::::::--==+****+*%@@@@%+:::::::--:::::----------=============++++++++++++++++++++++++++++++++*##+++++++++++===--");
System.out.println("++++++++++++++++++++========-========++++*+++++++++=--=----------------::::--------++--=:::.:----=++++++*#%%%%#:::::::---:::---------=---===========++==+++++++++++++++++++++++++++++*##*++++++++++==---");
System.out.println("++++++++++++++++++++++=======-========++**+*++=++++=--=---------=======-----:--:----=-=+++***+=*####%%#***#%#+-::::::----------------================++++++++++++++++++++++++++++++++*##*++++====-------");
System.out.println("++++++++++++++++++++++=======--=======++****++=+++++=+=-------=+++++++++=--------------=+*#*=:-#%#+%%%%#**#*%#:::::------------------============++====+++++++++++++++++++++++++++++++**=++++===---==-==");
Thread.sleep(1000);System.out.println("++++++++++++++++++++===========--=====++++++++=+***+++=-------=++++++++++-----------=-::---:::-+#*****+==*++*=::::------------------==================++++++++++++++++++++++++++++===++*================");
System.out.println("++++++++++++++++=+=+=============---==++++++++=+***+===--------=++++++=+=-----------=--:::::::--++====+**#++=-----------------------===================+++++++++++++++++++++++++++===+++==========+++===");
Thread.sleep(100);System.out.println("+++++++++++++++====================--=++++++++=++++===---------=++++++++=-----------==-:::=-::-==#*==+**#***#=----------------------==================++++++++++++++++++++======+++==+++=======+++======");
Thread.sleep(80);System.out.println("+++++++++++++++=====================--++++++++=++++===------=--=++++++=+=--:-------------==+*#%%%#**++**+++#%+=------------------=====================+++++++++++====================+++=====+++**===+++");
System.out.println("+++++++++++++++=====================--=+++++++=++++===------=--=++++++++=----------=*---=*%%%%%%@%%%*===+++%#*++===-------------====================+++++++++++======================++++=+++++*##++++++");
System.out.println("+++++++++++++++++++=====================++++++=++++===------=--=++++++++=---=----+*%%+--*%%*=++*#%%%#+++++******+++++=::--------=====================++=+++++=====================++++**++++++*####+++++");
Thread.sleep(500);System.out.println("++++++++++++++++++====================++++++++=++++++==-----+==+++++++++===+=---=*%%%*-=--=--==++++*=++=+*++*###*+***+=-:::------=-===============+++++===++==-=========+++++++++++*+*##*++++***##****++");
System.out.println("++++++++*++****+++==========================++=+++*++++-----+==++++++++++====---=+#@%%%=::::-===---++*###*+******##+====++**+=------==============+==+=+++==========+++++++++++*+++++*##*++***+*##****++");
System.out.println("+++++++++****++*+========================+++++=++++===---===+++++++**+**++++=-::-++##%@@%=::-====**%%%%%##*+=-=##*+++*#%*-::::..::-====================++========+++++++++++++**+++++*##**+*+***##*****+");
Thread.sleep(60);System.out.println("++++++++********+=====================++=+++++=++++==-----====-+++++++++=---::::-=*+--+*#*===*#%%%%%%%%%%#+::===+*#%%**+-:::::::::::-================++++****#*****+*+++++++++********##********##******");
Thread.sleep(70);System.out.println("++++++++******+++=====================+====+++=+++++--------===+++++++++-.:::::---=###+=+++#%%%%%%@%#%%%#+==--+#%%*==-=+=:::::------##================+++*#####******+++++++++********##********##******");
System.out.println("++++++++*******++====================+++=+=+++=+++++---------==+++++++:::::::::::=*+%%##**##%%%%%%%**%%#****%%%*---:--++---::=--::-::-#==============+=++*#######**+*+++++++++********##********##******");
Thread.sleep(50);System.out.println("++++++++*****++*+++==================+++++++++=+++++------=+++=++++++:::::::::::-+-=*###**##*#%%##**%##%%*-=+=-====+==#+-:::==------::::===============++*####*******++++++++++*******##********##******");
System.out.println("++++++++*****+++=====================+++=+===+=+++++------=+=+=++++++::---::::::---=++##+==+=*####%%@@**==+**+********#=-::-=---===--::::-==============+**#*##******+++++++++++++****##********##******");
System.out.println("=+++++++**+***++==================++++++++++++=+++++=----==+********=:----:::::-::-==-=+***#***+==*#***+=*#**********##=::==-======--:::::-=============+**#####****++++++++++++++****##********##******");
Thread.sleep(40);System.out.println("=====++++++++++++===================++++=+++++=+++++===========+++++-:---::::::::::----=-*-----=+=--**+=*************#+--==-===-+===-=--:::========++===+**######**++++++++++++++++***##********##******");
System.out.println("=====+++++++++++=====================+++==++++=+++*+===========+++++----:::::::::::-------:::-=---++-++==++***********+=+=-==-===+=+=====::===========+++*#*#####**+++++++++++++++***###********##******");
System.out.println("=====+++++++++++=====================+++++++++=+++*+==========+++++=-=-::::-----::::-:----=-----+---=*+==++**********#*+==-=-===+=*+=+*==-:-======+++++++*#*#####**+*++++++++++++***####********##******");
System.out.println("=====+++++++++++=====================+++++++++++++**==========+++++=-----=---::::::----:-=+--=--::::-+====+**********#**+==+=+==+*++#+=*+=-:-==++++++++++*#*#######*+*++++++++++++****##********##******");
Thread.sleep(80);System.out.println("=====++++++++++++===================+++++++++++****+=========++++++====+=:::::::::-+----:::-::--:::--==---=++++==+++=#%%%##+=*=#**#*=###*+=--=++++***+**+*#**#####**+*++*+++++++**##########****##******");
System.out.println("=====+++*+++++++===================+++++++=+++++++++=========++++++-++**::::::::::#=----::------::::---:----==---====%%%%%%#+*#*#*+###++*--===++++++**+++***########**********++**###########***##******");
System.out.println("+====+++*+*++++++==================+++++++++++++++++=========++++++-=#*-:::=::::-%#=------======-::::-:.::----------=####%%%**##+#%#*+*=:==-:-+*********+***########*******++++++***#####*******##******");
System.out.println("++++++++*****++++++++==============+++++++++++++*+*+=========+++++=--**:::-=::-#@+==----====------=++=-::==+++*+*****%###%%@####%#*=*+-=**++---:******+*+***##########******++++****#######*#***##******");
System.out.println("++++++++*****++*++++++++++++==++===+++++++++++++++++=========+++++=-==#**%%*++++===-----=*+---------=*#==+**###%###*#%%%@@@@@%#%#*+#--=+++++=-::+*******+***#######*##*#**********################*#****");
Thread.sleep(90);System.out.println("++++++++********++++++++++++++++++++++++++++++===+++++++++++++++++=-=++##=======--------::-::-------=**=-+*##%%%%%###%####%%@%%#%*%+==+=+==+=:-=-*******+**###############*******##*##############******");
System.out.println("+++++****+*+*++*+++*+*++++++******++++++++++++=====++++++++++++++=-==+**#=-====-----:--:::----------=*++=+###%%%%%**%%#####%%%%%##%++**#***=:--::+****+++**##############***********#######**##########*");
System.out.println("++***********************+**+*****++*+++++++++++====+++++++++++++=+==+**#+==-----::::--::-----------=*+==+*##%%%%%**###****##%%%%%%#+++**=-:-=++*=+***+***###############***********########*##########*");
Thread.sleep(30);System.out.println("****************************+******+***+++++++++=+====++++=+=++++=**++*##*==-----:-:::----=---------=*+==+*#%%%%%*+*##****###%%@@%%#*+*+--+#%%###%#***++****#################****##########****#####****");
System.out.println("**************#*********+***+*++*++++++++++=++==+========+++=++++++*#*#%%#+====--=-----:::---------=+*+--+#%%%%%%*+#%#*****###%@@@%#**#%%#++##***+-+*#****######################**#########****######*#*");
System.out.println("*************###****************+**+++++++++++++++===+++++++++++++=+++#%%#*-======-----:-------==+++**+==*%%%%%%%*+#%#******##%%@@%@%#+***++++**+=--=#****#################################*#*#########*");
Thread.sleep(100);System.out.println("*************####***********+**++++++++++++=++=++++===+++++++++++=-=++*####+**++=-------------====+**=---+###%%%#=+*%#*******##%%@@%%%##*****+=+**##%#***#########################*#######****#######***");
System.out.println("**********#**###************+**++++++++++++=+=++++===+=++++++++++-=+***###%==++=-------===-====--==++-:-=+*#####+--=##********##%@@%##*******#%#**+==#***###########################%%%%#####*######****");
System.out.println("*******####**###************+*+*+++++++++=++++++++=+=====++++==+++*++**#%%%*==--------------------===::::-++**++-..-##*++++***##%%@%%#####%%*=====--=****########################%%%%%%%%%##########****");
System.out.println("*******##########***********+***++++++++++===++++++++====++=+++=++===*#%%%%======----------------==++---=+**###*+::=###********#%%%%@@%#***++=----===*#########################*#####%%######*######****");
System.out.println("********#########***********+*+++++++++============++++====+++++++=--=+*###=-=---=====---------====+++=+*#%%%%%%*=+*##**++*++******+**#*+++=-----==+++######################****#####%%%%%##**######****");
System.out.println("*******####*****##***********++++++++++++++==+====++++====++=+++++=-==++****==--==------------=====++***#%%%%%%%#**###*+++++***##**+****+===----=+++++######################*******####%%%##**######****");
Thread.sleep(50);System.out.println("********###****#*************++++===+++===========++======++=+++++====+++***-=====================+++***%%%%%%%%%**#%#**+++******#*+***#*++=---==+++++#########################****#########**#########*");
System.out.println("*##******#*******************+++====++++=========+++======+++++++*+=+++++***---====================++**#%%%%%%%%%**#%#*+++++*****##****#*++==--==+++++##########################***#########**######****");
System.out.println("**#*#***##*******************+++++==+++==========++++=====+++++++**==++++***=-====================+++**#%%%%%%%%%#*#%#***********#%****#*+==---==++++*#########################**###%%%#####***#######**");
System.out.println("*****#***#*******************+++++++++++=====+=+++++=++==+++++++*#*+=+******--==+++++==============++*#%%%%%%%%%%###%%#********##******#**+==--==++++*##########%%%%###%%%%%%#######%%%%%%############**");
System.out.println("***************************++++++++++++++====++===++++++++++++++*####%%####+===++++++++======++++++++*#%%%%%%%%%%###%%#**++********+******+=---==++++*##########%%%%%#%%%%%%%%#%****#######****######***");
Thread.sleep(40);System.out.println("***************************+*++++++++++++===+++=++++++++++++++++**+=+**#####==+**++++=============+++**#%%%%########%%#******++***********+==--==+**+###########%##%####%%%#%#%%#***#######***##########");
System.out.println("***************************++++++++++++=+===+++++++++++++++++++**++++*######=+*******+++=++=+++++++*==+****+++++++++#%#***++******#*******+==---+++**############%#######%#%%#%%#***######%*#######%%###");
System.out.println("**************+***********+++++++++++++++===+++++++++++++++++++**+=++*#####=+******+++++=++++++++++*=+=*+*##########%%#****++*++**********+===-=++***######################%%%%%#*###%######*#*#########");
Thread.sleep(10);System.out.println("*********************++++++++++++++++++++++++++++++++++++++++++**+==*#####*==+++++++++++++++++===+++*##*###%@%%%%%%%%##**++++++++**#******+=====++***################################%%%%%##############");
System.out.println("***********#*************+++++++++++++++++++++++++++++++++++++***+=+*#%%%#+++***++++++=++++====+====++***############***+======++****#*****==-==+*****#########################%#***########**#####%####"+Col.reset);
}
catch(Exception e){}

    }
    void TNRdetails()
    {
        System.out.println(Col.yellow+" _____________________________________________________________________"+Col.reset);
	    System.out.println(Col.yellow+"|"+Col.reset+Col.blue+Col.bold+"                     Movie Details                                   "+Col.reset+Col.yellow+"|"+Col.reset);
		System.out.println(Col.yellow+"|_____________________________________________________________________|"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Movie name       "+Col.reset+Col.yellow+"|"+Col.reset+"    Tiger Nageswara Rao                      "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                             !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Languages        "+Col.reset+Col.yellow+"|"+Col.reset+"    Telugu, Hindi, Tamil, Malayalam, Kannada "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                             !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Release date     "+Col.reset+Col.yellow+"|"+Col.reset+"    20 October 2023                          "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                             !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Genre            "+Col.reset+Col.yellow+"|"+Col.reset+"    Action, Crime, Thriller                  "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                                             !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Time Duration    "+Col.reset+Col.yellow+"|"+Col.reset+"    2hr 44min                                "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!_______________________|_____________________________________________!"+Col.reset);
    }
    void MADdetails()
    {
        System.out.println(Col.yellow+" ________________________________________________"+Col.reset);
		System.out.println(Col.yellow+"|"+Col.reset+Col.blue+Col.bold+"                     Movie Details              "+Col.reset+Col.yellow+"|"+Col.reset);
		System.out.println(Col.yellow+"|________________________________________________|"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Movie name       "+Col.reset+Col.yellow+"|"+Col.reset+"    MAD                 "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                        !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Languages        "+Col.reset+Col.yellow+"|"+Col.reset+"    Telugu              "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                        !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Release date     "+Col.reset+Col.yellow+"|"+Col.reset+"    06 October 2023     "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                        !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Genre            "+Col.reset+Col.yellow+"|"+Col.reset+"    Comedy, Drama       "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!                       |                        !"+Col.reset);
        System.out.println(Col.yellow+"!"+Col.reset+Col.skyblue+Col.bold+"      Time Duration    "+Col.reset+Col.yellow+"|"+Col.reset+"    2hr 7min            "+Col.yellow+"!"+Col.reset);
        System.out.println(Col.yellow+"!_______________________|________________________!"+Col.reset);
    }
    void booking()
    {
        System.out.println(Col.green+Col.bold+"Select date"+Col.reset);
        LocalDate td=LocalDate.now();
        while(true)
        {
            for(int i=1;i<=7;i++)
            {
                System.out.println(i+"."+td.plusDays(i));
            }
            int date=sc.nextInt();
            if(date>=1 && date<=7)
            {
                System.out.println(Col.green+Col.bold+"Select time"+Col.reset);
                while(true)
                {
                    System.out.println("1. 10:00 AM");
                    System.out.println("2. 01:10 PM");
                    System.out.println("3. 04:30 PM");
                    System.out.println("4. 07:50 PM");
                    System.out.println("5. 11:10 PM");
                    int time=sc.nextInt();
                    if(time>=1 && time<=5)
                    {
                        System.out.println(Col.blue+Col.bold+"How many Seats?"+Col.reset);
                        while(true)
                        {
                            for(int i=1;i<=6;i++)
                            {
                                System.out.println(i);
                            }
                            System.out.println(Col.green+Col.bold+"Select"+Col.reset);
                            int seats=sc.nextInt();
                            if(seats>=1 && seats<=6)
                            {
                                System.out.println(Col.skyblue+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+Col.reset);     
                                System.out.println(Col.skyblue+"^                                                      ^"+Col.reset);
                                System.out.println(Col.skyblue+"^------"+Col.reset+Col.blue+Col.bold+" ROWS "+Col.reset+Col.skyblue+"---------"+Col.reset+Col.blue+Col.bold+" SEATS "+Col.reset+Col.skyblue+"-------------"+Col.reset+Col.blue+Col.bold+" PRICE "+Col.reset+Col.skyblue+"------^"+Col.reset);
                                System.out.println(Col.skyblue+"^                                                      ^"+Col.reset);
                                System.out.println(Col.skyblue+"^"+Col.reset+"       A to M         CLASSIC             Rs.295      "+Col.skyblue+"^"+Col.reset);
                                System.out.println(Col.skyblue+"^                                                      ^"+Col.reset);
                                System.out.println(Col.skyblue+"^"+Col.reset+"       N-O            VIP                 Rs.350      "+Col.skyblue+"^"+Col.reset);
                                System.out.println(Col.skyblue+"^                                                      ^"+Col.reset);
                                System.out.println(Col.skyblue+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+Col.reset);
                                System.out.println();
                                //System.out.println("A to M rows are normal seats Rs.295 and N O rows are VIP seats Rs.350");
                                System.out.println(Col.green+Col.bold+"Select which your form A to O"+Col.reset);
                                while(true)
                                {
                                    for(char i='A';i<='O';i++)
                                    {
                                        System.out.print(i+" ");
                                    }
                                    System.out.println();
                                    char ch=sc.next().charAt(0);
                                    if(ch>='A' && ch<='O')
                                    {
                                        if(ch<='M')
                                        {
                                            bill=bill+amount(seats);
                                            System.out.println("Booking Date: "+td.plusDays(date));
                                            System.out.println("Your selected row "+ch);
                                            System.out.println("Pay Rs."+bill);
                                            System.out.println("Convenience fess Rs."+(33*seats));
                                            System.out.println("Amount payable Rs."+(bill+33*seats));
                                        }
                                        else
                                        {
                                            bill=bill+amount1(seats);
                                            System.out.println("Booking Date: "+td.plusDays(date));
                                            System.out.println("Your selected row "+ch);
                                            System.out.println("Pay Rs."+bill);
                                            System.out.println("Convenience fess Rs."+(33*seats));
                                            System.out.println("Amount payable Rs."+(bill+33*seats));
                                        }
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println(Col.red+Col.bold+"Invalid Selection please select available rows"+Col.reset);
                                    }
                                }
                                break;
                            }
                            else
                            {
                                System.out.println(Col.red+Col.bold+"Select only 1 to 6 seats at a time"+Col.reset);
                            }
                        }
                        break;
                    }
                    else
                    {
                        System.out.println(Col.red+Col.bold+"Invalid selection please select available timings"+Col.reset);
                    }
                }
                break;
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Date not found please select available dates"+Col.reset);
            }
        }
    }
    double amount(int s)
    {
        return s*295;
    }
    double amount1(int s)
    {
        return s*350;
    }
    void displayHyderabad()
    {
        movieNames();
        int n=sc.nextInt();
		if(n==1)
		{
		    LeoDetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                while(true)
                {
                    System.out.println (Col.blue+"    ___________________________________________ "+Col.reset);
                    System.out.println (Col.blue+"   |                                           |"+Col.reset);
        	        System.out.println (Col.blue+"   |"+Col.reset+Col.yellow+Col.bold+"               Select Language             "+Col.reset+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |-------------------------------------------|"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+Col.skyblue+Col.bold+"         SL.NO      "+Col.reset+Col.blue+"!"+Col.reset+Col.skyblue+Col.bold+"    Language          "+Col.reset+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |````````````````````!``````````````````````|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          1         "+Col.blue+"!"+Col.reset+"    Telugu            "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          2         "+Col.blue+"!"+Col.reset+"    Tamil             "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          3         "+Col.blue+"!"+Col.reset+"    Hindi             "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |____________________!______________________|"+Col.reset);
                	System.out.println();
                    
                    int b=sc.nextInt();
                    if(b==1)
                    {
                        theatresHyderabad();
                        break;
                    }
                    else if(b==2)
                    {
                        theatresHyderabad();
                        break;
                    }
                    else if(b==3)
                    {
                        theatresHyderabad();
                        break;
                    }
                    else
                    {
                        System.out.println(Col.red+Col.bold+"Language Not found please enter valid one"+Col.reset);
                    }
                }
            }
            else
            {
                displayHyderabad();
            }
		}
		else if(n==2)
		{
		    Bdetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking  or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                theatresHyderabad();
            }
            else
            {
                displayHyderabad();
            }
		}
		else if(n==3)
		{
		    TNRdetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking  or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                while(true)
                {
                    System.out.println (Col.blue+"    ___________________________________________ "+Col.reset);
                    System.out.println (Col.blue+"   |                                           |"+Col.reset);
        	        System.out.println (Col.blue+"   |"+Col.reset+Col.yellow+Col.bold+"               Select Language             "+Col.reset+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |-------------------------------------------|"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+Col.skyblue+Col.bold+"         SL.NO      "+Col.reset+Col.blue+"!"+Col.reset+Col.skyblue+Col.bold+"    Language          "+Col.reset+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |````````````````````!``````````````````````|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          1         "+Col.blue+"!"+Col.reset+"    Telugu            "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          2         "+Col.blue+"!"+Col.reset+"    Hindi             "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |____________________!______________________|"+Col.reset);
                	System.out.println();
                    
                    int b=sc.nextInt();
                    if(b==1)
                    {
                        theatresHyderabad();
                        break;
                    }
                    else if(b==2)
                    {
                        theatresHyderabad();
                        break;
                    }
                    else
                    {
                        System.out.println(Col.red+Col.bold+"Language Not found please enter valid one"+Col.reset);
                    }
                }
            }
            else
            {
                displayHyderabad();
            }
		}
		else if(n==4)
		{
		    MADdetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking  or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                theatresHyderabad();
            }
            else
            {
                displayHyderabad();
            }
		}
		else
		{
		    System.out.println(Col.red+Col.bold+"Movie Not Found select available movies"+Col.reset);
		    displayHyderabad();
		}
    }
    void theatresHyderabad()
    {
        while(true)
        {
            System.out.println(Col.yellow+Col.bold+"Select your near by areas"+Col.reset);
            System.out.println(Col.purple+" _________________________________________________________________________________"+Col.reset);
            System.out.println(Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+" Select option "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"  Theatre                 "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    Area                              "+Col.reset+Col.purple+"|"+Col.reset);
            System.out.println(Col.purple+"|_______________|__________________________|______________________________________|"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      1        "+Col.purple+"|"+Col.reset+"  Cinepolis               "+Col.purple+"|"+Col.reset+"    Lulu Mall, kphp, Hyderabad        "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!               |                          |                                      !"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      2        "+Col.purple+"|"+Col.reset+"  GPR Multiplex           "+Col.purple+"|"+Col.reset+"    Nizampet, Hyderabad               "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!               |                          |                                      !"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      3        "+Col.purple+"|"+Col.reset+"  AAA Cinemas             "+Col.purple+"|"+Col.reset+"    Ameerpet, Hyderabad               "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!               |                          |                                      !"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      4        "+Col.purple+"|"+Col.reset+"  PVR                     "+Col.purple+"|"+Col.reset+"    Nexus Mall Kukatpally, Hyderabad  "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!_______________|__________________________|______________________________________!"+Col.reset);
            int c=sc.nextInt();
            if(c==1)
            {
                booking();
                break;
            }
            else if(c==2)
            {
                booking();
                break;
            }
            else if(c==3)
            {
                booking();
                break;
            }
            else if(c==4)
            {
                booking();
                break;
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Invalid selection please enter valid one"+Col.reset);
            }
        }
    }
    void displayBengaluru()
    {
        movieNames();
        int n=sc.nextInt();
		if(n==1)
		{
		    LeoDetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                while(true)
                {
                    System.out.println (Col.blue+"    ___________________________________________ "+Col.reset);
                    System.out.println (Col.blue+"   |                                           |"+Col.reset);
        	        System.out.println (Col.blue+"   |"+Col.reset+Col.yellow+Col.bold+"               Select Language             "+Col.reset+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |-------------------------------------------|"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+Col.skyblue+Col.bold+"         SL.NO      "+Col.reset+Col.blue+"!"+Col.reset+Col.skyblue+Col.bold+"    Language          "+Col.reset+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |````````````````````!``````````````````````|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          1         "+Col.blue+"!"+Col.reset+"    Telugu            "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          2         "+Col.blue+"!"+Col.reset+"    Tamil             "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          3         "+Col.blue+"!"+Col.reset+"    Hindi             "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          4         "+Col.blue+"!"+Col.reset+"    Kannada           "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |____________________!______________________|"+Col.reset);
                	System.out.println();
                    
                    int b=sc.nextInt();
                    if(b==1)
                    {
                        theatresBengaluru();
                        break;
                    }
                    else if(b==2)
                    {
                        theatresBengaluru();
                        break;
                    }
                    else if(b==3)
                    {
                        theatresBengaluru();
                        break;
                    }
                    else if(b==4)
                    {
                        theatresBengaluru();
                        break;
                    }
                    else
                    {
                        System.out.println(Col.red+Col.bold+"Language Not found please enter valid one"+Col.reset);
                    }
                }
            }
            else
            {
                displayBengaluru();
            }
		}
		else if(n==2)
		{
		    Bdetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking  or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                theatresBengaluru();
            }
            else
            {
                displayBengaluru();
            }
		}
		else if(n==3)
		{
		    TNRdetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking  or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                theatresBengaluru();
            }
            else
            {
                displayBengaluru();
            }
		}
		else if(n==4)
		{
		    MADdetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking  or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                theatresBengaluru();
            }
            else
            {
                displayBengaluru();
            }
		}
		else
		{
		    System.out.println(Col.red+Col.bold+"Movie Not Found select available movies"+Col.reset);
		    displayBengaluru();
		}
    }
    void theatresBengaluru()
    {
        while(true)
        {
            System.out.println(Col.yellow+Col.bold+"Select your near by areas"+Col.reset);
            System.out.println(Col.purple+" _________________________________________________________________________________"+Col.reset);
            System.out.println(Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+" Select option "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"  Theatre                 "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    Area                              "+Col.reset+Col.purple+"|"+Col.reset);
            System.out.println(Col.purple+"|_______________|__________________________|______________________________________|"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      1        "+Col.purple+"|"+Col.reset+"  Cinepolis               "+Col.purple+"|"+Col.reset+"    Lulu Mall, Bengaluru              "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!               |                          |                                      !"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      2        "+Col.purple+"|"+Col.reset+"  INOX                    "+Col.purple+"|"+Col.reset+"    Brookefield Mall                  "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!               |                          |                                      !"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      3        "+Col.purple+"|"+Col.reset+"  Miraj Cinemas           "+Col.purple+"|"+Col.reset+"    TGN Lotus Elite, Magadi Road      "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!               |                          |                                      !"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      4        "+Col.purple+"|"+Col.reset+"  Cinepolis               "+Col.purple+"|"+Col.reset+"    Nexus Shantiniketan, Bengaluru    "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!_______________|__________________________|______________________________________!"+Col.reset);
            int c=sc.nextInt();
            if(c==1)
            {
                booking();
                break;
            }
            else if(c==2)
            {
                booking();
                break;
            }
            else if(c==3)
            {
                booking();
                break;
            }
            else if(c==4)
            {
                booking();
                break;
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Invalid selection please enter valid one"+Col.reset);
            }
        }
    }
    void displayChennai()
    {
        movieNames();
        int n=sc.nextInt();
		if(n==1)
		{
		    LeoDetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                while(true)
                {
                    System.out.println (Col.blue+"    ___________________________________________ "+Col.reset);
                    System.out.println (Col.blue+"   |                                           |"+Col.reset);
        	        System.out.println (Col.blue+"   |"+Col.reset+Col.yellow+Col.bold+"               Select Language             "+Col.reset+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |-------------------------------------------|"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+Col.skyblue+Col.bold+"         SL.NO      "+Col.reset+Col.blue+"!"+Col.reset+Col.skyblue+Col.bold+"    Language          "+Col.reset+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |````````````````````!``````````````````````|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          1         "+Col.blue+"!"+Col.reset+"    Telugu            "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |                    !                      |"+Col.reset);
                	System.out.println (Col.blue+"   |"+Col.reset+"          2         "+Col.blue+"!"+Col.reset+"    Tamil             "+Col.blue+"|"+Col.reset);
                	System.out.println (Col.blue+"   |____________________!______________________|"+Col.reset);
                	System.out.println();
                    
                    int b=sc.nextInt();
                    if(b==1)
                    {
                        theatresChennai();
                        break;
                    }
                    else if(b==2)
                    {
                        theatresChennai();
                        break;
                    }
                    else
                    {
                        System.out.println(Col.red+Col.bold+"Language Not found please enter valid one"+Col.reset);
                    }
                }
            }
            else
            {
                displayChennai();
            }
		}
		else if(n==2)
		{
		    Bdetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking  or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                theatresChennai();
            }
            else
            {
                displayChennai();
            }
		}
		else if(n==3)
		{
		    TNRdetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking  or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                theatresChennai();
            }
            else
            {
                displayChennai();
            }
		}
		else if(n==4)
		{
		    MADdetails();
            System.out.println();
            System.out.println(Col.green+Col.bold+"Press 1 for ticket booking  or any other digit to go back"+Col.reset);
            int a=sc.nextInt();
            if(a==1)
            {
                theatresChennai();
            }
            else
            {
                displayChennai();
            }
		}
		else
		{
		    System.out.println(Col.red+Col.bold+"Movie Not Found select available movies"+Col.reset);
		    displayChennai();
		}
    }
    void theatresChennai()
    {
        while(true)
        {
            System.out.println(Col.yellow+Col.bold+"Select your near by areas"+Col.reset);
            System.out.println(Col.purple+" ____________________________________________________________________________________"+Col.reset);
            System.out.println(Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+" Select option "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"  Theatre                 "+Col.reset+Col.purple+"|"+Col.reset+Col.skyblue+Col.bold+"    Area                                 "+Col.reset+Col.purple+"|"+Col.reset);
            System.out.println(Col.purple+"|_______________|__________________________|_________________________________________|"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      1        "+Col.purple+"|"+Col.reset+"  MAYAJAAL Multiplex      "+Col.purple+"|"+Col.reset+"    ECR, Chennai                         "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!               |                          |                                         !"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      2        "+Col.purple+"|"+Col.reset+"  AGS Cinemas             "+Col.purple+"|"+Col.reset+"    Maduravoyal                          "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!               |                          |                                         !"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      3        "+Col.purple+"|"+Col.reset+"  EVP Cinemas             "+Col.purple+"|"+Col.reset+"    Chennai                              "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!               |                          |                                         !"+Col.reset);
            System.out.println(Col.purple+"!"+Col.reset+"      4        "+Col.purple+"|"+Col.reset+"  PVR                     "+Col.purple+"|"+Col.reset+"    SKLS Galaxy Mall, Red Hills Chennai  "+Col.purple+"!"+Col.reset);
            System.out.println(Col.purple+"!_______________|__________________________|_________________________________________!"+Col.reset);
            int c=sc.nextInt();
            if(c==1)
            {
                booking();
                break;
            }
            else if(c==2)
            {
                booking();
                break;
            }
            else if(c==3)
            {
                booking();
                break;
            }
            else if(c==4)
            {
                booking();
                break;
            }
            else
            {
                System.out.println(Col.red+Col.bold+"Invalid selection please enter valid one"+Col.reset);
            }
        }
    }
}


//import java.util.*;
interface Electronics_Main
{
    void mobiles(int brand);
    void laptops(int brand);
    void tv(int brand);
    void washing_machine(int brand);
    void refrigerator(int brand);
}
class Electronics implements Electronics_Main
{
    static Scanner sc = new Scanner(System.in);
    static double bill =0;
    static double billing(double bill)
    {
        System.out.println("bill amount is: "+bill);
        double gst = bill*0.10;
        System.out.println("GST:\t"+gst);
        System.out.println("your total bill is including all taxes: "+(bill+gst));
        return bill;
    }
    void selection()
    {
        System.out.println(Col.yellow+Col.bold+Col.blink+"                			    #######                                                                     ");
        System.out.println("                			    #       #      ######  ####  ##### #####   ####  #    # #  ####   ####      ");
        System.out.println("                			    #       #      #      #    #   #   #    # #    # ##   # # #    # #          "); 
        System.out.println("                			    #####   #      #####  #        #   #    # #    # # #  # # #       ####      "); 
        System.out.println("                			    #       #      #      #        #   #####  #    # #  # # # #           #     "); 
        System.out.println("                			    #       #      #      #    #   #   #   #  #    # #   ## # #    # #    #     "); 
        System.out.println("                			    ####### ###### ######  ####    #   #    #  ####  #    # #  ####   ####      ");
        System.out.println();
        System.out.println("                			                ####  ######  ####  ##### #  ####  #    # ");     
        System.out.println("                			                #     #      #    #   #   # #    # ##   # ");
        System.out.println("                			                ####  #####  #        #   # #    # # #  # ");  
        System.out.println("                			                    # #      #        #   # #    # #  # # ");  
        System.out.println("                			                #   # #      #    #   #   # #    # #   ## ");  
        System.out.println("                			                ####  ######  ####    #   #  ####  #    # "+Col.reset);  
        System.out.println();
        System.out.println();
        //System.out.println("1-Mobiles \n2-Laptops \n3-Tv's \n4-Washing Machines \n5-Refrigerator");
        System.out.println(Col.green+Col.bold+"                                           ---------"+Col.skyblue+" S.No "+Col.green+"--------"+Col.skyblue+" Category "+Col.green+"-------------"+Col.skyblue+" Offers "+Col.green+"----------");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"1            MOBILES                "+Col.purple+Col.blink+"UP TO 20% OFF   "+Col.reset+Col.bold+Col.green+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"2            LAPTOPS                "+Col.purple+Col.blink+"UP TO 15% OFF   "+Col.reset+Col.bold+Col.green+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"3            TV's                   "+Col.purple+Col.blink+"UP TO 10% OFF   "+Col.reset+Col.bold+Col.green+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"4            WASHING MACHINE's      "+Col.purple+Col.blink+"UP TO 10% OFF   "+Col.reset+Col.bold+Col.green+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |          "+Col.white+"5            REFRIGERATOR's         "+Col.purple+Col.blink+"UP TO 15% OFF   "+Col.reset+Col.bold+Col.green+"|");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           |                                                              |");
        System.out.println("                                           ----------------------------------------------------------------");
        //int select = Integer.parseInt(sc.nextLine());
        int select=sc.nextInt();
        //mobiles
        if(select == 1)
        {
            //System.out.println("1-Samsung \n2-Apple \n3-Oppo");
            System.out.println(Col.blue+"                                 ```````````````````````````````````````````````````````````````");
            System.out.println("                                 ``          __  __  ___  ____ ___ _     _____ ____           ``");
            System.out.println("                                 ``         |  \\/  |/ _ \\| __ )_ _| |   | ____/ ___|          ``");
            System.out.println("                                 ``         | |\\/| | | | |  _ \\| || |   |  _| \\___ \\          ``");
            System.out.println("                                 ``         | |  | | |_| | |_) | || |___| |___ ___) |         ``");
            System.out.println("                                 ``         |_|  |_|\\___/|____/___|_____|_____|____/          ``");
            System.out.println("                                 ``                                                           ``");
            System.out.println("                                 ```````````````````````````````````````````````````````````````"+Col.reset);
            System.out.println();
            System.out.println(Col.red+Col.bold+"Available Mobile Brands are \nSamsung, Apple, Oppo"+Col.reset);
            System.out.println();
            System.out.println(Col.purple+Col.bold+"                                    ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("                                    !                                           !");
            System.out.println("                                    !           1              SAMSUNG          !");
            System.out.println("                                    !                                           !");
            System.out.println("                                    !           2              APPLE            !");
            System.out.println("                                    !                                           !");
            System.out.println("                                    !           3              OPPO             !");
            System.out.println("                                    !                                           !");
            System.out.println("                                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            System.out.println();
            System.out.println(Col.green+"Select the brand"+Col.reset);
            //int mobileSelection = Integer.parseInt(sc.nextLine());
            int mobileSelection = sc.nextInt();
            mobiles(mobileSelection);
        }
        //laptops
        else if(select == 2)
        {
            System.out.println(Col.yellow+"                                #####################################################################");
            System.out.println("                                #'||'          |     '||''|.  |''||''|  ..|''||   '||''|.   .|'''.| #");
            System.out.println("                                # ||          |||     ||   ||    ||    .|'    ||   ||   ||  ||..  ' #");
            System.out.println("                                # ||         |  ||    ||...|'    ||    ||      ||  ||...|'   ''|||. #");
            System.out.println("                                # ||        .''''|.   ||         ||    '|.     ||  ||      .     '||#");
            System.out.println("                                #.||.....| .|.  .||. .||.       .||.    ''|...|'  .||.     |'....|' #");
            System.out.println("                                #####################################################################"+Col.reset);
            System.out.println();
            System.out.println(Col.red+Col.bold+"Available Laptop Brands are \nHP, DELL"+Col.reset);
            System.out.println();
            //System.out.println("1-HP \n2-DELL");
            System.out.println(Col.bold+"                                ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~");
            System.out.println("                                !                                          !");
            System.out.println("                                !           1               HP             !");
            System.out.println("                                !                                          !");
            System.out.println("                                !           2               DELL           !");
            System.out.println("                                !                                          !");
            System.out.println("                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            //int LaptopSelection = Integer.parseInt(sc.nextLine());
            int LaptopSelection = sc.nextInt();
            laptops(LaptopSelection);
        }
        //TV's
        else if(select == 3)
        {
            System.out.println(Col.purple+Col.bold+"                                >>======================================<<");
            System.out.println("                                ||ooooooooooo ooooo  oooo 888           ||");
            System.out.println("                                ||88  888  88  888    88  888 oooooooo8 ||");
            System.out.println("                                ||    888       888  88  o88 888ooooooo ||");
            System.out.println("                                ||    888        88888               888||");
            System.out.println("                                ||   o888o        888        88oooooo88 ||");
            System.out.println("                                >>======================================<<"+Col.reset);
            
            System.out.println(Col.red+Col.bold+"Available TV Brands are \nSamsung, Sony, LG"+Col.reset);
            System.out.println();
            //System.out.println("1-Samsung \n2-Sony \n3-LG");
            System.out.println(Col.bold+"                                ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("                                !                                           !");
            System.out.println("                                !           1              SAMSUNG          !");
            System.out.println("                                !                                           !");
            System.out.println("                                !           2              SONY             !");
            System.out.println("                                !                                           !");
            System.out.println("                                !           3              LG               !");
            System.out.println("                                !                                           !");
            System.out.println("                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            //int TvSelection = Integer.parseInt(sc.nextLine());
            int TvSelection = sc.nextInt();
            tv(TvSelection);
        }
        //washing machine's
        else if(select ==4)
        {   System.out.println(Col.skyblue+Col.bold+"       ```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
            System.out.println("        `   Yb        dP    db    .dP'Y8 88  88 88 88b 88  dP''b8     8b    d8    db     dP''b8 88  88 88 88b 88 888888  .o. .dP'Y8   `");
            System.out.println("        `    Yb  db  dP    dPYb   `Ybo.' 88  88 88 88Yb88 dP   `'     88b  d88   dPYb   dP   `' 88  88 88 88Yb88 88__   ,dP' `Ybo.'   `");
            System.out.println("        `     YbdPYbdP    dP__Yb  o.`Y8b 888888 88 88 Y88 Yb  '88     88YbdP88  dP__Yb  Yb      888888 88 88 Y88 88''        o.`Y8b   `");
            System.out.println("        `      YP  YP    dP''''Yb 8bodP' 88  88 88 88  Y8  YboodP     88 YY 88 dP''''Yb  YboodP 88  88 88 88  Y8 888888      8bodP'   `");
            System.out.println("        ```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````"+Col.reset);
            System.out.println();
            System.out.println(Col.red+Col.bold+"Available washing machine's Brands are \nSamsung, IFB"+Col.reset);
            System.out.println();
            //System.out.println("1-Samsung \n2-IFB");
            System.out.println(Col.bold+"                                ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("                                !                                           !");
            System.out.println("                                !           1              SAMSUNG          !");
            System.out.println("                                !                                           !");
            System.out.println("                                !           2              IFB              !");
            System.out.println("                                !                                           !");
            System.out.println("                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            //int washing_machineSelection = Integer.parseInt(sc.nextLine());
            int washing_machineSelection = sc.nextInt();
            washing_machine(washing_machineSelection);
        }
        //n5-Refrigerator's
        else if(select == 5)
        {
            System.out.println(Col.green+Col.bold+"                                ////////////////////////////////////////////////////////////////////////////////");
            System.out.println("                                //`OooOOo.        .oOo                                                        //");
            System.out.println("                                // o     `o       O           o                                               //");
            System.out.println("                                // O      O       o                                          O                //");
            System.out.println("                                // o     .O       OoO                                       oOo               //");
            System.out.println("                                // OOooOO'  .oOo. o    `OoOo. O  .oOoO .oOo. `OoOo. .oOoO'   o   .oOo. `OoOo. //");
            System.out.println("                                // o    o   OooO' O     o     o  o   O OooO'  o     O   o    O   O   o  o     //");
            System.out.println("                                // O     O  O     o     O     O  O   o O      O     o   O    o   o   O  O     //");
            System.out.println("                                // O      o `OoO' O'    o     o' `OoOo `OoO'  o     `OoO'o   `oO `OoO'  o     //");
            System.out.println("                                //                                   O                                        //");
            System.out.println("                                //                                OoO'                                        //");
            System.out.println("                                ////////////////////////////////////////////////////////////////////////////////"+Col.reset);
            System.out.println();
            System.out.println(Col.red+Col.bold+"Available Refrigerator's Brands are \nSamsung, LG, Whirpool"+Col.reset);
            System.out.println();
            //System.out.println("1-Samsung \n2-LG \n3-Whirlpool");
            System.out.println(Col.bold+"                                ~~~~~~~~~~ S.NO ~~~~~~~~~~ BRANDS ~~~~~~~~~~");
            System.out.println("                                !                                           !");
            System.out.println("                                !           1              SAMSUNG          !");
            System.out.println("                                !                                           !");
            System.out.println("                                !           2              LG               !");
            System.out.println("                                !                                           !");
            System.out.println("                                !           3              WHIRLPOOL        !");
            System.out.println("                                !                                           !");
            System.out.println("                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
            int refrigerator_selection = sc.nextInt();
            refrigerator(refrigerator_selection);
        }
        else
        {
            System.out.println(Col.backred+Col.white+Col.bold+Col.blink+"INVALID!! enter correct input"+Col.reset);
            selection();
        }
        //user selection for go to billing or exit
        //System.out.println("1.billing \n2-Shop more on Electronics category \n3-exit");
        //int opt = sc.nextInt();
        //if(opt==1)
        //{
        //    User.billing(bill);
        //}
        //else if(opt==2)
        //{
        //    selection();
        //}
    }
    public void mobiles(int brand)
    {
        //samsung mobiles
        if(brand == 1)
        {
            System.out.println(Col.blue+Col.bold+"You selected brand is Samsung ");
            System.out.println(Col.green+"                             _____________________________________________________________________________________________________");
            System.out.println("                            |S.no |  Model                |       Specifications                                 |  Price         |");
            System.out.println("                            |_____|_______________________|______________________________________________________|________________|");
            System.out.println("                            ! 1   | Samsung Galaxy        |      ROM:128GB,RAM:4GB                               |  15,000/-      !");
            System.out.println("                            !     | F14 5G(Purple)        |      Processor:Exynos 1330|Octa Core                 |                !");
            System.out.println("                            !     |                       |      Camera:rear-->50MP+2MP                          |                !");
            System.out.println("                            !     |                       |      Display:6.6 inch Full HD                        |                !");
            System.out.println("                            !     |                       |      Camera:rear-->12+12MP                           |                !");
            System.out.println("                            !     |                       |      1 Year Warranty                                 |                !");
            System.out.println("                            !     |                       |      Battery;6000mAh                                 |                !");
            System.out.println("                            !     |                       |                                                      |                !");
            System.out.println("                            ! 2   | Samsung Galaxy        |      ROM:128GB,RAM:8GB                               |  42,000/-      !");
            System.out.println("                            !     | S21 5G(Olive Green)   |      Processor:Octa core                             |                !");
            System.out.println("                            !     |                       |      Camera:rear-->12+12MP                           |                !");
            System.out.println("                            !     |                       |      Display:6.4 inch Dynamic AMOLED 2X              |                !");
            System.out.println("                            !     |                       |      Camera:Front-->32MP                             |                !");
            System.out.println("                            !     |                       |      1 Year Warranty                                 |                !");
            System.out.println("                            !     |                       |      Battery:4500mAh                                 |                !");
            System.out.println("                            !     |                       |                                                      |                !");
            System.out.println("                            !  3  |  Samsung Galaxy       |      ROM:256GB,RAM:8GB                               |  99,000/-      !");
            System.out.println("                            !     |  Z Flip5(Mint)        |      Processor:Snapdragon 8Gen                       |                !");
            System.out.println("                            !     |                       |      Camera:rear-->12+12MP                           |                !");
            System.out.println("                            !     |                       |      Display:6.1 inch Super retina XDR Display       |                !");
            System.out.println("                            !     |                       |      Camera:Front--> 10MP                            |                !");
            System.out.println("                            !     |                       |      1 Year Warranty                                 |                !");
            System.out.println("                            !     |                       |      Battery:3700mAh                                 |                !");
            System.out.println("                            !     |                       |                                                      |                !");
            System.out.println("                            !_____|_______________________|______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung Galaxy F14 5G(Purple) \nprice is "+(15000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(15000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung Galaxy S21 5G(Olive Green) \nprice is "+(42000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(42000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung Galaxy Z Flip5(Mint) \nprice is "+(99000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(99000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //apple mobiles
        else if(brand == 2)
        {
            System.out.println(Col.blue+Col.bold+"You selected brand is Apple");
            System.out.println(Col.skyblue+"                             _____________________________________________________________________________________________________");
            System.out.println("                            |S.no |  Model             |     Specifications                                     |    Price        |");
            System.out.println("                            |_____|____________________|________________________________________________________|_________________|");
            System.out.println("                            !  1  |  iphone 14         |     ROM:256GB                                          |    70,000/-     !");
            System.out.println("                            !     |  (Purple)          |     Processor:A15 Bionic Chip                          |                 !");
            System.out.println("                            !     |                    |     Camera:rear-->12+12MP                              |                 !");
            System.out.println("                            !     |                    |     Display:6.1 inch Super retina XDR Display          |                 !");
            System.out.println("                            !     |                    |     Camera:rear-->12+12MP                              |                 !");
            System.out.println("                            !     |                    |     1 Year Warranty                                    |                 !");
            System.out.println("                            !     |                    |     Camera:rear-->12+12MP                              |                 !");
            System.out.println("                            !     |                    |                                                        |                 !");
            System.out.println("                            ! 2   |  iphone 12         |     ROM:64                                             |    42,000/-     !");
            System.out.println("                            !     |  (Blue)            |     Processor:A14 Bionic Chip                          |                 !");
            System.out.println("                            !     |                    |     Camera:rear-->12+12MP                              |                 !");
            System.out.println("                            !     |                    |     Display:6.1 inch Super retina XDR Display          |                 !");
            System.out.println("                            !     |                    |     Camera:rear-->12+12MP                              |                 !");
            System.out.println("                            !     |                    |     1 Year Warranty                                    |                 !");
            System.out.println("                            !     |                    |     Battery:2815mAh                                    |                 !");
            System.out.println("                            !     |                    |                                                        |                 !");
            System.out.println("                            ! 3   |  iphone 13         |     ROM:256GB                                          |    60,000/-     !");
            System.out.println("                            !     | (Starlight)        |     Processor:A15 Bionic Chip|Hexa Core                |                 !");
            System.out.println("                            !     |                    |     Camera:rear-->12+12MP                              |                 !");
            System.out.println("                            !     |                    |     Display:6.1 inch Super retina XDR Display          |                 !");
            System.out.println("                            !     |                    |     Camera:rear-->12+12MP                              |                 !");
            System.out.println("                            !     |                    |     1 Year Warranty                                    |                 !");
            System.out.println("                            !     |                    |     Battery:3240mAh                                    |                 !");
            System.out.println("                            !     |                    |                                                        |                 !");
            System.out.println("                            !_____|____________________|________________________________________________________|_________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is iphone 14(Purple) \nprice is "+(70000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(70000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.purple+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is iphone 12(Blue) \nprice is "+(42000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(42000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.bold+Col.purple+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is iphone 13(Starlight) \nprice is "+(60000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(60000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //Oppo mobiles
        else if(brand ==3)
        {
            System.out.println(Col.blue+Col.bold+"You selected brand is Oppo");
            System.out.println(Col.yellow+"                             _____________________________________________________________________________________________________");
            System.out.println("                            |S.no |    Model            |          Specifications                             |      Price        |");
            System.out.println("                            |_____|_____________________|_____________________________________________________|___________________|");
            System.out.println("                            ! 1   |   Oppo Reno10 5G    |         ROM:256GB,RAM:8GB                           |      32,000/-     !");
            System.out.println("                            !     |   (Silver Grey)     |         Processor:Dimensity|Octa Core               |                   !");
            System.out.println("                            !     |                     |         Camera:Front--> 32MP                        |                   !");
            System.out.println("                            !     |                     |         Display:6.7 inch Full HD                    |                   !");
            System.out.println("                            !     |                     |         Camera:rear-->64MP                          |                   !");
            System.out.println("                            !     |                     |         1 Year Warranty                             |                   !");
            System.out.println("                            !     |                     |         Battery;5000mAh                             |                   !");
            System.out.println("                            !     |                     |                                                     |                   !");
            System.out.println("                            ! 2   |   Oppo A78 G5       |         ROM:128GB,RAM:8GB                           |      20,000/-     !");
            System.out.println("                            !     |   (Olive Green)     |         Processor:6833 Octa core                    |                   !");
            System.out.println("                            !     |                     |         Camera:rear-->50MP+2MP                      |                   !");
            System.out.println("                            !     |                     |         Display:6.56 inch LCD Display               |                   !");
            System.out.println("                            !     |                     |         Camera:Front-->8MP                          |                   !");
            System.out.println("                            !     |                     |         1 Year Warranty                             |                   !");
            System.out.println("                            !     |                     |         Battery:5000mAh                             |                   !");
            System.out.println("                            !     |                     |                                                     |                   !");
            System.out.println("                            ! 3   |   Oppo A18          |         ROM:128GB,RAM:4GB                           |      99,000/-     !");
            System.out.println("                            !     |   (Glowing Blue)    |         Processor:Helio G85                         |                   !");
            System.out.println("                            !     |                     |         Camera:rear-->8MP+2MP                       |                   !");
            System.out.println("                            !     |                     |         Display:6.56 inch HD                        |                   !");
            System.out.println("                            !     |                     |         Camera:Front-->  10MP                       |                   !");
            System.out.println("                            !     |                     |         1 Year Warranty                             |                   !");
            System.out.println("                            !     |                     |         Battery:5000mAh                             |                   !");
            System.out.println("                            !     |                     |                                                     |                   !");
            System.out.println("                            !_____|_____________________|_____________________________________________________|___________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.purple+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.yellow+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Oppo Reno10 5G(Silver Grey) \nprice is "+(32000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(32000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.yellow+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is oppo A78 G5(Olive Green) \nprice is "+(20000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(20000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.yellow+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Oppo A18(Glowing Blue) \nprice is "+(99000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(99000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backwhite+Col.red+Col.bold+"Sorry!! Invalid Selection Try Again"+Col.reset);
            selection();
        }
    }
    public void laptops(int brand)
    {
        //HP laptops
        if(brand ==1)
        {
            System.out.println(Col.blue+Col.bold+"You selected brand is HP"+Col.reset);
            System.out.println(Col.purple+"                             _____________________________________________________________________________________________________");
            System.out.println("                            |S.no |  Model              |          Specifications & Highlights                  |    Price        |");
            System.out.println("                            |_____|_____________________|_______________________________________________________|_________________|");
            System.out.println("                            ! 1   |  HP 15s             |         AMD Ryzen 7 5700U,                            |    50,000/-     !");
            System.out.println("                            !     |  ey2001AU           |         15.6-inch (39.6 cm), FHD, 16GB DDR4           |                 !");
            System.out.println("                            !     |                     |         512GB SSD, AMD Radeon Graphics,               |                 !");
            System.out.println("                            !     |                     |         Backlit KB, Thin & Light, Dual Speakers       |                 !");
            System.out.println("                            !     |                     |         (Win 11, MSO 2021, Silver, 1.69 kg)           |                 !");
            System.out.println("                            !     |                     |         1 Year Warranty                               |                 !");
            System.out.println("                            !     |                     |                                                       |                 !");
            System.out.println("                            ! 2   | HP Laptop 15s       |         12th Gen Intel Core i7-1255U                  |    64,000/-     !");
            System.out.println("                            !     | fq5190TU            |         15.6-inch (39.6 cm), FHD, 16GB DDR4           |                 !");
            System.out.println("                            !     |                     |         512GB SSD, Intel Iris Xe Graphics,            |                 !");
            System.out.println("                            !     |                     |         Backlit KB, Thin & Light                      |                 !");
            System.out.println("                            !     |                     |         (Win 11, MSO 2021, Silver, 1.69 kg)           |                 !");
            System.out.println("                            !     |                     |         1 Year Warranty                               |                 !");
            System.out.println("                            !     |                     |                                                       |                 !");
            System.out.println("                            ! 3   | HP Laptop           |         15.6 inch Touchscreen HD WLED Laptop          |    1,50,000/-   !");
            System.out.println("                            !     | 15t-dw400           |         12th Gen (Intel i7-1255U 10-Core              |                 !");
            System.out.println("                            !     |                     |         1.70GHz, 16GB RAM, 1TB PCIe SSD,              |                 !");
            System.out.println("                            !     |                     |         Intel Iris Xe, Backlit KYB,Fingerprint,       |                 !");
            System.out.println("                            !     |                     |         WiFi 6, BT 5.2, RJ-45, Win 11 Pro)            |                 !");
            System.out.println("                            !     |                     |         1 Year Warranty                               |                 !");
            System.out.println("                            !     |                     |                                                       |                 !");
            System.out.println("                            !_____|_____________________|_______________________________________________________|_________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.green+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.yellow+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is HP 15s ey2001AU \nprice is "+(50000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(50000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.yellow+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is HP 15s fq5190TU \nprice is "+(64000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(64000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.yellow+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is HP 15t-dw400 \nprice is "+(150000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(150000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //DELL laptops
        else if(brand ==2)
        {
            System.out.println(Col.blue+Col.bold+"You selected brand is DELL"+Col.reset);
            System.out.println(Col.skyblue+Col.bold+"                             ____________________________________________________________________________________________________");
            System.out.println("                            |S.no |  Model              |         Specifications & Highlights                    |   Price       |");
            System.out.println("                            |_____|_____________________|________________________________________________________|_______________|");
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            ! 1   |  Dell 15            |         Intel Core i3-1115G4 Processor/                |   35,000/-    !");
            System.out.println("                            !     |  Vostro 3520        |         8GB DDR4/512GB SSD/15.6 inches(39.62cm)        |               !");
            System.out.println("                            !     |                     |         FHD Anti-Glare 120Hz Refresh Rate              |               !");
            System.out.println("                            !     |                     |         250 nits Narrow Border Display/Win 11,         |               !");
            System.out.println("                            !     |                     |         MSO'21/15 Month McAfee/Carbon Black/1.66 kg    |               !");
            System.out.println("                            !     |                     |         1 Year Warranty                                |               !");
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            ! 2   | Dell Inspiron       |         Intel Core i5-11320H Processor, 8GB/           |   67,000/-    !");
            System.out.println("                            !     | 5518                |         512GB SSD/Win 11 + MSO'21/ NVIDIA MX450        |               !");
            System.out.println("                            !     |                     |         2GB GDDR5/ 15.6 inches(39.62cm) FHD WVA AG     |               !");
            System.out.println("                            !     |                     |         250 nits/ Backlit KB & FPR,                    |               !");
            System.out.println("                            !     |                     |         Platinum Silver/ 1.64kg                        |               !");
            System.out.println("                            !     |                     |         1 Year Warranty                                |               !");
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            ! 3   | Dell G15 5520       |         Intel i5-12500H/16GB DDR5/1TB SSD/ 15.6 inch   |   78,000/-    !");
            System.out.println("                            !     | Gaming Laptop       |         (39.62cm) FHD WVA AG 120Hz 250 nits/           |               !");
            System.out.println("                            !     |                     |         NVIDIA RTX 3050, 4 GB GDDR6/Win 11 + MSO'21/   |               !");
            System.out.println("                            !     |                     |         15 Months McAfee/Backlit KB/Dark               |               !");
            System.out.println("                            !     |                     |         Shadow Grey/2.81kg                             |               !");
            System.out.println("                            !     |                     |         1 Year Warranty                                |               !");
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            !_____|_____________________|________________________________________________________|_______________!"+Col.reset);
            System.out.println();
            System.out.println(Col.purple+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.yellow+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Dell 15 Vostro 3520 \nprice is "+(35000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(35000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.yellow+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Dell Inspiron 5518 \nprice is "+(67000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(67000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.yellow+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Dell G15 5520 \nprice is "+(78000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(78000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backwhite+Col.red+Col.bold+"Sorry!! Invalid Selection Try Again"+Col.reset);
            selection();
        }
    }
    public void tv(int brand)
    {
        //Samsung TV's
        if(brand ==1)
        {
            System.out.println(Col.yellow+"You selected brand is Samsung"+Col.reset);
            System.out.println(Col.blue+Col.bold+"                             ____________________________________________________________________________________________________");
            System.out.println("                            |S.no |  Model              |         Highlights & Supported Apps                    |  Price        |");
            System.out.println("                            |_____|_____________________|________________________________________________________|_______________|");
            System.out.println("                            !  1  |  Samsung 32inch     |         bezel free design Netflix,Youtube,Hotstar      |  25,000/-     !");
            System.out.println("                            !     |  HD TV              |         40W Dolby Audio Amazon Prime,ZEE               |               !");
            System.out.println("                            !     |                     |         Chromaboost in-built                           |               !");
            System.out.println("                            !     |                     |         Resolution:1366*768 Pixels                     |               !");
            System.out.println("                            !     |                     |         Refreh Rate:50Hz                               |               !");
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            ! 2   |  Samsung 43inch     |         bezel free design Netflix,Youtube,Hotstar      |  30,000/-     !");
            System.out.println("                            !     |  FullHD TV          |         Dolby Digital Plus Amazon Prime                |               !");
            System.out.println("                            !     |                     |         Ultra Clean View                               |               !");
            System.out.println("                            !     |                     |         Resolution:1920*1080 Pixels                    |               !");
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            ! 3   |  Samsung 55inch     |         Crystal Processor 4K Netflix,Youtube,Hotstar   |  50,000/-     !");
            System.out.println("                            !     |  4K TV              |         40W Dolby Audio Amazon Prime,ZE                |               !");
            System.out.println("                            !     |                     |         Chromaboost in-built                           |               !");
            System.out.println("                            !     |                     |         Resolution:3840*2160 Pixels                    |               !");
            System.out.println("                            !     |                     |         Operating System:Tizen                         |               !");
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            !_____|_____________________|________________________________________________________|_______________!"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung 32inch HD TV \nprice is "+(25000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(25000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung 43inch FullHD TV \nprice is "+(30000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(30000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung 55inch 4K TV \nprice is "+(50000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(50000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //sony tv's
        else if (brand ==2)
        {
            System.out.println(Col.yellow+Col.bold+"You selected brand is Sony"+Col.reset);
            System.out.println(Col.blue+"                             ____________________________________________________________________________________________________");
            System.out.println("                            |S.no |   Model             |         Highlights & Supported Apps                    |  Price        |");
            System.out.println("                            |_____|_____________________|________________________________________________________|_______________|");
            System.out.println("                            ! 1   |  Sony Bravia43inch  |        X-Reality pro   Netflix,Youtube,Hotstar         |  40,000/-     !");
            System.out.println("                            !     |  HD TV              |        40W Dolby Audio Amazon Prime                    |               !");
            System.out.println("                            !     |                     |        Chromaboost in-built                            |               !");
            System.out.println("                            !     |                     |        Resolution:1366*768 Pixels                      |               !");
            System.out.println("                            !     |                     |        Operating System:Google TV                      |               !");
            System.out.println("                            !     |                     |        Refreh Rate:50Hz                                |               !");
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            ! 2   |  SonyX75L 65inch    |        bezel free design Netflix,Youtube,Hotstar       |  90,000/-     !");
            System.out.println("                            !     |  4K TV              |        40W Dolby Audio Amazon Prime                    |               !");
            System.out.println("                            !     |                     |        Chromaboost in-built                            |               !");
            System.out.println("                            !     |                     |        Resolution:3840*2160 Pixels                     |               !");
            System.out.println("                            !     |                     |        Operating System:Google TV                      |               !");  
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            ! 3   |  SonyX82L 55inch    |        X1 4K HDR Processor Netflix,Youtube,Hotstar     |  81,000/-     !");
            System.out.println("                            !     |  4K TV              |        40W Dolby Audio Amazon Prime,ZEE                |               !");
            System.out.println("                            !     |                     |        Chromaboost in-built                            |               !");
            System.out.println("                            !     |                     |        Resolution:3840*2160 Pixels                     |               !");
            System.out.println("                            !     |                     |                                                        |               !");
            System.out.println("                            !_____|_____________________|________________________________________________________|_______________!"+Col.reset);
            System.out.println();
            System.out.println(Col.purple+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Sony Bravia43inch HD TV \nprice is "+(40000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(40000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is SonyX75L 65inch 4K TV \nprice is "+(90000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(90000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is SonyX82L 55inch 4K TV \nprice is "+(81000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(81000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //LG tv's
        else if (brand == 3)
        {
            System.out.println(Col.skyblue+Col.bold+"You selected brand is LG"+Col.reset);
            System.out.println(Col.yellow+Col.bold+"                             ____________________________________________________________________________________________________");
            System.out.println("                            |S.no |   Model             |        Highlights & Supported Apps                    |  Price         |");
            System.out.println("                            |_____|_____________________|_______________________________________________________|________________|");
            System.out.println("                            ! 1   |  LG 32inch          |        LG WebOS  Netflix,Youtube,Hotstar              |  25,000/-      !");
            System.out.println("                            !     |  HD TV              |        DTS Virtual:X Amazon Prime,ZE                  |                !");
            System.out.println("                            !     |                     |        Active HDR                                     |                !");
            System.out.println("                            !     |                     |        Resolution:1366*768 Pixels                     |                !");
            System.out.println("                            !     |                     |        Refreh Rate:50Hz                               |                !");
            System.out.println("                            !     |                     |                                                       |                !");
            System.out.println("                            ! 2   |  LG 32inch          |        bezel free design Netflix,Youtube,Hotstar      |  30,000/-      !");
            System.out.println("                            !     |  Smart TV           |        40W Dolby Audio Amazon Prime,ZE                |                !");
            System.out.println("                            !     |                     |        Chromaboost in-built                           |                !");
            System.out.println("                            !     |                     |        Resolution:1366*768 Pixels                     |                !");
            System.out.println("                            ! 3   |  LG UR7500 42inch   |        AI-powered Processor Netflix,Youtube,Hotstar   |  40,000/-      !");
            System.out.println("                            !     |  4K TV              |        40W Dolby Audio Amazon Prime,ZE                |                !");
            System.out.println("                            !     |                     |        Chromaboost in-built                           |                !");
            System.out.println("                            !     |                     |        Resolution:3840*2160 Pixels                    |                !");
            System.out.println("                            !     |                     |                                                       |                !");
            System.out.println("                            !_____|_____________________|_______________________________________________________|________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.purple+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is LG 32inch HD TV \nprice is "+(25000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(25000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is LG 32inch Smart TV \nprice is "+(30000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(30000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is LG UR7500 42inch 4K TV \nprice is "+(40000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(40000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backwhite+Col.red+Col.bold+"Sorry!! Invalid Selection Try Again"+Col.reset);
            selection();
        }
    }
    public void washing_machine(int brand)
    {
        //Samsung washing machine
        if(brand == 1)
        {
            System.out.println(Col.skyblue+Col.bold+"You selected brand is Samsung ");
            System.out.println(Col.blue+"                             ________________________________________________________________________________________________");
            System.out.println("                            |S.No |    Model             |       Highlights                          |       Price           |");
            System.out.println("                            |_____|______________________|___________________________________________|_______________________|");
            System.out.println("                            ! 1   |   SAMSUNG 8kg        |      Fullyautomatic                       |       20,000/-        !");
            System.out.println("                            !     |   Softclosing 5star  |      700rpm                               |                       !");
            System.out.println("                            !     |   (Sapphire Mulia)   |      Higher spin speed                    |                       !");
            System.out.println("                            !     |                      |      provide great wash quality           |                       !");
            System.out.println("                            !     |                      |                                           |                       !");
            System.out.println("                            ! 2   |  SAMSUNG 7kg         |      AI, Wi-Fi Enabled                    |       32,000/-        !");
            System.out.println("                            !     |  with stream 5Star   |      Digital Inverter                     |                       !");
            System.out.println("                            !     |  (Blue)              |      In-built Heater Silver               |                       !");
            System.out.println("                            !     |                      |      1200 rpm                             |                       !");
            System.out.println("                            !     |                      |                                           |                       !");
            System.out.println("                            ! 3   | SAMSUNG 6.5kg        |     Wobble technology                     |       15,000/-        !");
            System.out.println("                            !     |  Fully Automatic     |      Inverter Compressor                  |                       !");
            System.out.println("                            !     |  (Grey)              |      Higher spin speed                    |                       !");
            System.out.println("                            !     |                      |      700rpm                               |                       !");
            System.out.println("                            !     |                      |                                           |                       !");
            System.out.println("                            !_____|______________________|___________________________________________|_______________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.purple+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung 8Kg Softclosing \nprice is "+(20000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(20000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung 7kg with stream \nprice is "+(32000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(32000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung 6.5kg Fully Automatic \nprice is "+(15000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(50000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
            
        }
        //IFB washing machine
        else if(brand == 2)
        {
            System.out.println(Col.skyblue+Col.bold+"You selected brand is IFB"+Col.reset);
            System.out.println(Col.purple+Col.bold+"                             ________________________________________________________________________________________________");
            System.out.println("                            |S.No |    Model                   |   Highlights                           |       Price        |");
            System.out.println("                            |_____|____________________________|________________________________________|____________________|");
            System.out.println("                            ! 1   |   IFB 8kg Powered by AI    |   Steam Refresh                        |       40,000/-     !");
            System.out.println("                            !     |   5star*****               |   1400rpm                              |                    !");
            System.out.println("                            !     |   (Grey)                   |   senator WSS steam                    |                    !");
            System.out.println("                            !     |                            |   4 years Comprehensive Warranty       |                    !");
            System.out.println("                            !     |                            |                                        |                    !");
            System.out.println("                            ! 2   |   IFB 7kg 5Star*****       |   AI, Wi-Fi Enabled                    |       18,000/-     !");
            System.out.println("                            !     |   Aqua Conserve HardWater  |   provide great wash quality           |                    !");
            System.out.println("                            !     |   wash(Blue)               |   Number of wash programs - 8          |                    !");
            System.out.println("                            !     |                            |   720 rpm                              |                    !");
            System.out.println("                            !     |                            |                                        |                    !");
            System.out.println("                            !_____|____________________________|________________________________________|____________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is IFB 8Kg Powered by AI \nprice is "+(40000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(40000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is IFB 7kg 5Star \nprice is "+(18000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(18000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backwhite+Col.red+Col.bold+"Sorry!! Invalid Selection Try Again"+Col.reset);
            selection();
        }
    }
    public void refrigerator(int brand)
    {
        //Samsung refrigerator
        if(brand == 1)
        {
            System.out.println(Col.skyblue+Col.bold+"You selected brand is Samsung "+Col.reset);
            System.out.println(Col.purple+"                             ________________________________________________________________________________________________");
            System.out.println("                            |S.no |  Model                    |     Highlights                          |     Price          |");
            System.out.println("                            |_____|___________________________|_________________________________________|____________________|");
            System.out.println("                            ! 1   |  Samsung 236LFrostFree    |     Digital                             |     25,000/-       !");
            System.out.println("                            !     |  3 Star***                |     Inverter Compresssor                |                    !");
            System.out.println("                            !     |  (Blue colour)            |     Frost free                          |                    !");
            System.out.println("                            !     |                           |     Energy Savings upto35%              |                    !");
            System.out.println("                            !     |                           |     1 Year Comapny Warranty             |                    !");
            System.out.println("                            !     |                           |                                         |                    !");
            System.out.println("                            ! 2   |  Samsung 385L FrostFree   |                                         |     40,000/-       !");
            System.out.println("                            !     |  Double Door 2 Star**     |     Digital Inverter Compresssor        |                    !");
            System.out.println("                            !     |                           |     Savings upto 20%                    |                    !");
            System.out.println("                            !     |                           |     Convertible                         |                    !");
            System.out.println("                            !     |                           |                                         |                    !");
            System.out.println("                            ! 3   |  Samsung 183L Directcool  |                                         |     50,000/-       !");
            System.out.println("                            !     |  2 Star**                 |     Direct Cool                         |                    !");
            System.out.println("                            !     |  (Gray Silver Colour)     |     Digital Inverter Compresssor        |                    !");
            System.out.println("                            !     |                           |     Consumesless Electricity            |                    !");
            System.out.println("                            !     |                           |     1 year Comapny Warranty             |                    !");
            System.out.println("                            !     |                           |                                         |                    !");
            System.out.println("                            !_____|___________________________|_________________________________________|____________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung 236L FrostFree 3***Star varient \nprice is "+(25000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(25000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung 385L FrostFree Double door 2**Star varient \nprice is "+(40000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(40000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Samsung 183L Directcool 2**Star varient \nprice is "+(50000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(50000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //LG refrigerator's
        else if(brand == 2)
        {
            System.out.println(Col.skyblue+Col.bold+"You selected brand is LG"+Col.reset);
            System.out.println(Col.yellow+"                             ______________________________________________________________________________________________");
            System.out.println("                            |S.no |  Model                |         Highlights                        |      Price         |");
            System.out.println("                            |_____|_______________________|___________________________________________|____________________|");
            System.out.println("                            ! 1   |  LG 185L Directcool   |         236L                              |      15,000/-      !");
            System.out.println("                            !     |  4 Star****           |         Smart Inverter Compresssor        |                    !");
            System.out.println("                            !     |  (Blue Euphoria)      |         Energy Savings upto 45%           |                    !");
            System.out.println("                            !     |                       |         Base Stand Drawer                 |                    !");
            System.out.println("                            !     |                       |         1 Year Comapny Warranty           |                    !");
            System.out.println("                            !     |                       |                                           |                    !");
            System.out.println("                            ! 2   |  LG 186L Directcool   |                                           |      40,000/-      !");
            System.out.println("                            !     |  SingleDoor           |         Smart Inverter Compresssor        |                    !");
            System.out.println("                            !     |  5 Star*****          |         Savings upto 55%                  |                    !");
            System.out.println("                            !     |                       |         Fast Ice making                   |                    !");
            System.out.println("                            !     |                       |                                           |                    !");
            System.out.println("                            ! 3   |  LG 240L FrostFree    |                                           |      50,000/-      !");
            System.out.println("                            !     |  Double Door          |         Direct Cool                       |                    !");
            System.out.println("                            !     |  2 STAR**             |         Smart Inverter Compresssor        |                    !");
            System.out.println("                            !     |  (Dazzle Steel)       |         Energy Savings upto 20%           |                    !");
            System.out.println("                            !     |                       |         1 year Comapny Warranty           |                    !");
            System.out.println("                            !     |                       |                                           |                    !");
            System.out.println("                            !_____|_______________________|___________________________________________|____________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is LG 185L Directcool 4****Star varient \nprice is "+(15000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(15000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is LG 186L Directcool 5*****Star varient \nprice is "+(40000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(40000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is LG 240L FrostFree 2**Star varient \nprice is "+(50000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(50000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        //Whirpool refrigerator's
        else if(brand == 3)
        {
            System.out.println(Col.skyblue+Col.bold+"You selected brand is Whirpool"+Col.reset);
            System.out.println(Col.skyblue+"                             _____________________________________________________________________________________________");
            System.out.println("                            |S.No |    Model                    |   Highlights                          |       Price     |");
            System.out.println("                            |_____|_____________________________|_______________________________________|_________________|");
            System.out.println("                            ! 1   |    Whirlpool 207L           |   207L(good for couple)               |       20,000/-  !");
            System.out.println("                            !     |    3Star ***                |   Non Inverter Compressor             |                 !");
            System.out.println("                            !     |    (Sapphire Mulia)         |   Energy saving upto 35%              |                 !");
            System.out.println("                            !     |                             |   Economical,manual defrosting        |                 !");
            System.out.println("                            !     |                             |                                       |                 !");
            System.out.println("                            ! 2   |    Whirlpool 192L           |   192L(good for couple)               |       18,000/-  !");
            System.out.println("                            !     |    4Star ****               |   intelliSense Inverter Compressor    |                 !");
            System.out.println("                            !     |    (Blue)                   |   Energy saving upto 35%              |                 !");
            System.out.println("                            !     |                             |   Bse stand with Drawer               |                 !");
            System.out.println("                            !     |                             |                                       |                 !");
            System.out.println("                            ! 3   |    Whirlpool 231L           |   231L(good for couple)               |       25,000/-  !");
            System.out.println("                            !     |    Frostfree Doubledoor     |   Inverter Compressor                 |                 !");
            System.out.println("                            !     |    (Grey)                   |   Energy saving upto 20%              |                 !");
            System.out.println("                            !     |                             |   Frost Free                          |                 !");
            System.out.println("                            !     |                             |                                       |                 !");
            System.out.println("                            !_____|_____________________________|_______________________________________|_________________!"+Col.reset);
            System.out.println();
            System.out.println(Col.yellow+Col.bold+"Please select the model you want"+Col.reset);
            int select =sc.nextInt();
            if(select == 1)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Whirlpool 207L 3***Star varient \nprice is "+(20000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(20000*quantity);
            }
            else if(select == 2)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Whirlpool 192L 4****Star(Blue) varient \nprice is "+(18000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(18000*quantity);
            }
            else if(select == 3)
            {
                System.out.println(Col.green+Col.bold+"enter quantity"+Col.reset);
                int quantity = sc.nextInt();
                System.out.println(Col.bold+"you selected model is Whirlpool 231L Frostfree Doubledoor(Grey) varient \nprice is "+(25000*quantity)+"/-"+Col.yellow+Col.blink+" Item added to cart Successfully"+Col.reset);
                bill = bill +(25000*quantity);
            }
            else
            {
                System.out.println(Col.backwhite+Col.red+Col.bold+"Item not found"+Col.reset);
            }
        }
        else
        {
            System.out.println(Col.backwhite+Col.red+Col.bold+"Sorry!! Invalid Selection Try Again"+Col.reset);
            selection();
        }
    }
}

class Billingsystem
{
    static double totalbill = Electronics.bill  + Grocery.bill + Clothes.bill + Furniture.bill + KitchenAppliances.bill;
    static void pay()
    {
        System.out.println(Col.bold+"						Total Bill is "+Col.yellow+totalbill+Col.reset+Col.bold+" Rs."+Col.reset);
        System.out.println(Col.purple+Col.bold+"select the below option for payment "+Col.white+"\n---> 1-UPI \n---> 2-Internet banking \n---> 3-Cash on delivery"+Col.reset);
        int opt = PaymentGateway.sc.nextInt();
        PaymentGateway obj = new PaymentGateway();
        if(opt ==1)
            obj.upi();
        else if(opt ==2)
            obj.internetbanking();
        else if(opt ==3)
            obj.cashondelivery();
    }
    static void transactionid()
    {
	Random ran = new Random();
	int r = (int)(ran.nextDouble() * 1000000000);
	System.out.println(r);
    }
    static void date()
    {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	System.out.println(sdf.format(date));
    }
}
class PaymentGateway
{
    static Scanner sc = new Scanner(System.in);
    static int pin = 1234;
    static String username ="hello";
    static String password = "hello@123";
    static void orderplaced()
    {
	System.out.println();
	System.out.println(Col.bold+Col.under+Col.yellow+"Order Details"+Col.reset);
	System.out.println();
	System.out.println(Col.bold+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.print("Order ID: ");
	Billingsystem.transactionid();
	System.out.println();
	System.out.print("Order date: ");
	Billingsystem.date();
	System.out.println();
	System.out.println("Order total: "+Billingsystem.totalbill);
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+Col.reset);
    }
    void upi()
    {
        System.out.println(Col.purple+Col.bold+"select "+Col.white+"\n---> 1-Google pay \n---> 2-Phone pay \n---> 3-AmaZepay"+Col.reset);
        int option = sc.nextInt();
        if(option > 0 && option < 4)
	{
        while(true)
        {
            System.out.println(Col.green+Col.bold+"Enter your UPI pin"+Col.reset);
            int pin = sc.nextInt();
            if(this.pin == pin)
            {
                System.out.println(Col.green+Col.bold+Col.blink+"Transaction Successful"+Col.reset);
		orderplaced();
                //System.out.println(Col.skyblue+Col.bold+"Thank you have a nice day"+Col.reset);
                break;
            }
            else
            {
                System.out.println(Col.backred+Col.bold+"Invalid pin!!"+Col.reset);
                System.out.println(Col.yellow+Col.bold+"1 - Re-enter the pin \n2 - Change payment Method \n3 - exit"+Col.reset);
                int sel = sc.nextInt();
                if(sel ==1)
                {
                }
                if(sel==2)
                {
                    Billingsystem.pay();
                    break;
                }
                else if(sel ==3)
                {
                    break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Sorry, Invalid option"+Col.reset);
                    break;
                }
            }
        }
	}
	else
	{
	    System.out.println(Col.blink+Col.backred+Col.white+Col.bold+"Enter correct Input"+Col.reset);
	    upi();
	}
    }
    void internetbanking()
    {
        System.out.println(Col.green+Col.bold+"select your bank "+Col.reset+Col.bold+"\n---> 1-state bank of india(SBI) \n---> 2-Union bank \n---> 2-HDFC bank \n---> 3-ICICI bank"+Col.reset);
        int option = sc.nextInt();
    if(option > 0 && option < 4)
    {
        while(true)
        {
            System.out.println(Col.yellow+"Enter username"+Col.reset);
            String username = sc.next();
            System.out.println(Col.yellow+"Enter password"+Col.reset);
            String password = sc.next();
            if(this.username.equals(username) && this.password.equals(password))
            {
                System.out.println(Col.green+Col.bold+Col.blink+"Transaction Successful"+Col.reset);
		orderplaced();
                //System.out.println(Col.skyblue+Col.bold+"Thank You have a nice day"+Col.reset);
		break;
            }
            else
            {
                System.out.println(Col.backred+Col.bold+"Invalid Username / Password"+Col.reset);
                System.out.println(Col.yellow+Col.bold+"1- Re-enter Your credintials \n2- Change payment Method \n3 - exit"+Col.reset);
                int sel = sc.nextInt();
                if(sel == 1)
                {
                }
                else if(sel == 2)
                {
                    Billingsystem.pay();
                    break;
                }
                else if(sel == 3)
                {
                    break;
                }
                else
                {
                    System.out.println(Col.red+Col.bold+"Sorry, Invalid option"+Col.reset);
                    break;
                }
            }
        }
    }
    else
    {
	System.out.println(Col.backred+Col.white+Col.bold+"Enter correct Input"+Col.reset);
	internetbanking();
    }
    }
    void cashondelivery()
    {
        orderplaced();
	System.out.println(Col.skyblue+"You can Pay the Amount on the Time of Delivering the Product"+Col.reset);
        System.out.println();
    }
}

class Address
{
	Scanner sc = new Scanner(System.in);
	static int pincode;
	static String state;
	static String district;
	void selection()
	{
		System.out.println(Col.white+Col.bold+"Enter Your State"+Col.reset);
		state = sc.nextLine();
		System.out.println(Col.white+Col.bold+"Enter your District"+Col.reset);
		district = sc.nextLine();
		System.out.println(Col.white+"Enter your PinCode"+Col.reset);
		pincode = sc.nextInt();
		System.out.println();
		System.out.println(Col.skyblue+"				~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.red+Col.bold+" ADDRESS "+Col.reset+Col.skyblue+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("				 										  ");
		System.out.println("				 		 COUNTRY   -----------------------------> INDIA 		  ");
		System.out.println("				 										  ");
		System.out.println("				 		 STATE     -----------------------------> "+state+"	   ");
		System.out.println("				 										  ");
		System.out.println("				 		 DISTRICT  -----------------------------> "+district+"		  ");
		System.out.println("				 										  ");
		System.out.println("				 		 PINCODE   -----------------------------> "+pincode+"		  ");
		System.out.println("				 										  ");
		System.out.println("				~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+Col.reset);
		System.out.println();
		System.out.println(Col.green+Col.bold+Col.blink+"					    We will Deliver your Order within 2 Days \nHAPPY SHOPPING:)"+Col.reset);
	}
}

class User
{
	static void billing(double bill)
	{
	    System.out.println("This is final bill "+bill);
	}
	public static void main(String[] args)
	{
	    System.out.println(Col.bold+Col.yellow+"                                                                                                                                                           bbbbbbbb             ");
        System.out.println("                    AAA                                                         ZZZZZZZZZZZZZZZZZZZ                   hhhhhhh                              b::::::b             ");
        System.out.println("                   A:::A                                                        Z:::::::::::::::::Z                   h:::::h                              b::::::b             ");
        System.out.println("                  A:::::A                                                       Z:::::::::::::::::Z                   h:::::h                              b::::::b             ");
        System.out.println("                 A:::::::A                                                      Z:::ZZZZZZZZ:::::Z                    h:::::h                               b:::::b             ");
        System.out.println("                A:::::::::A              mmmmmmm    mmmmmmm     aaaaaaaaaaaaa   ZZZZZ     Z:::::Z      eeeeeeeeeeee    h::::h hhhhh       uuuuuu    uuuuuu  b:::::bbbbbbbbb     ");
        System.out.println("               A:::::A:::::A           mm:::::::m  m:::::::mm   a::::::::::::a          Z:::::Z      ee::::::::::::ee  h::::hh:::::hhh    u::::u    u::::u  b::::::::::::::bb   ");
        System.out.println("              A:::::A A:::::A         m::::::::::mm::::::::::m  aaaaaaaaa:::::a        Z:::::Z      e::::::eeeee:::::eeh::::::::::::::hh  u::::u    u::::u  b::::::::::::::::b  ");
        System.out.println("             A:::::A   A:::::A        m::::::::::::::::::::::m           a::::a       Z:::::Z      e::::::e     e:::::eh:::::::hhh::::::h u::::u    u::::u  b:::::bbbbb:::::::b ");
        System.out.println("            A:::::A     A:::::A       m:::::mmm::::::mmm:::::m    aaaaaaa:::::a      Z:::::Z       e:::::::eeeee::::::eh::::::h   h::::::hu::::u    u::::u  b:::::b    b::::::b ");
        System.out.println("           A:::::AAAAAAAAA:::::A      m::::m   m::::m   m::::m  aa::::::::::::a     Z:::::Z        e:::::::::::::::::e h:::::h     h:::::hu::::u    u::::u  b:::::b     b:::::b ");
        System.out.println("          A:::::::::::::::::::::A     m::::m   m::::m   m::::m a::::aaaa::::::a    Z:::::Z         e::::::eeeeeeeeeee  h:::::h     h:::::hu::::u    u::::u  b:::::b     b:::::b ");
        System.out.println("         A:::::AAAAAAAAAAAAA:::::A    m::::m   m::::m   m::::ma::::a    a:::::a ZZZ:::::Z     ZZZZZe:::::::e           h:::::h     h:::::hu:::::uuuu:::::u  b:::::b     b:::::b ");
        System.out.println("        A:::::A             A:::::A   m::::m   m::::m   m::::ma::::a    a:::::a Z::::::ZZZZZZZZ:::Ze::::::::e          h:::::h     h:::::hu:::::::::::::::uub:::::bbbbbb::::::b ");
        System.out.println("       A:::::A               A:::::A  m::::m   m::::m   m::::ma:::::aaaa::::::a Z:::::::::::::::::Z e::::::::eeeeeeee  h:::::h     h:::::h u:::::::::::::::ub::::::::::::::::b  ");
        System.out.println("      A:::::A                 A:::::A m::::m   m::::m   m::::m a::::::::::aa:::aZ:::::::::::::::::Z  ee:::::::::::::e  h:::::h     h:::::h  uu::::::::uu:::ub:::::::::::::::b   ");
        System.out.println("     AAAAAAA                   AAAAAAAmmmmmm   mmmmmm   mmmmmm  aaaaaaaaaa  aaaaZZZZZZZZZZZZZZZZZZZ    eeeeeeeeeeeeee  hhhhhhh     hhhhhhh    uuuuuuuu  uuuubbbbbbbbbbbbbbbb    "+Col.reset);
        System.out.println(Col.yellow+Col.blink+"                       							  			");     
        System.out.println("			    %@@+						 #@@@%##%%@@@@+		");     
        System.out.println("			      *@@@@# 						        =@+@@%=		");     
        System.out.println("				-+%@@@@@#*=-				         =#%@@@@+  @@*		");     
        System.out.println("				    +%@@@@@@@@%*++=			 =++*%@@@@@@@#=   @@#		");     
        System.out.println("                		       *@@@@@@@@@@@@@@@@@@%%%%%%%@@@@@@@@@@@@@@@@@+      %@#		");     
        System.out.println("                			   +%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*+		+#=	      	");     
        System.out.println("                				=*#%%@@@@@@@@@@@@@@@@%%#+=-				");     
        System.out.println("                										"+Col.reset);
	

	    System.out.println(Col.skyblue+"Welcome to AmaZehub"+Col.reset);
            //System.out.println("please Signup / Register");
	    System.out.println(Col.yellow+"------------------ Existing User? ------------------> Please Login"+Col.reset);
	    System.out.println();
	    System.out.println(Col.purple+Col.bold+".................. New to Amazehub? ..................> Create your Amazehub account/signup"+Col.reset);
            System.out.println();
	    Login x1=new Login();
	    x1.select();
	    if(Billingsystem.totalbill > 0)
	    {
		System.out.println(Col.yellow+"Before Proceding Payment Please Add Your Address"+Col.reset);
		Address x = new Address();
		x.selection();
		System.out.println();
		System.out.print(" ");
		for(int i=1;i<=180;i++)
		{
			try{
				Thread.sleep(5);
			}
			catch(Exception e){}
			System.out.print("=");
		}
		System.out.println();
		System.out.println();
		System.out.println(Col.bold+"							******************");
	        System.out.println("							$"+Col.skyblue+Col.bold+Col.blink+" Go for payment "+Col.reset+Col.bold+"$");
		System.out.println("							******************"+Col.reset);
		System.out.println();
		/*for(int i=1;i<=150;i++)
		{
			try{
				Thread.sleep(10);
			}
			catch(Exception e){}
			System.out.print("=");
		}
		System.out.println();*/
		System.out.println(Col.yellow+Col.bold+"						PLEASE WAIT 5 SECONDS");
		System.out.print(Col.skyblue+Col.bold+"		 				LOADING");
		for(int i=1;i<=15;i++)
		{
			try
			{
				Thread.sleep(600);
			}
			catch(Exception e){}
			System.out.print(".");
		}
		System.out.println(Col.green+"Completed"+Col.reset);
	        Billingsystem.pay();
	    }
	    else if(Billingsystem.totalbill < 1 && Login.check != 0)
	    {
		System.out.println("Order Must be 1 Rupee or Above"); 
	    }
	    try{
	    System.out.println();
	    System.out.println();
	    Thread.sleep(05);System.out.println(Col.yellow+"                                 ,ggggggggggggggg                                                ");
	    Thread.sleep(20);System.out.println("                                dP''''''88''''''' ,dPYb,                               ,dPYb,    ");
	    Thread.sleep(99);System.out.println("                                Yb,_    88        IP'`Yb                               IP'`Yb    ");
	    Thread.sleep(30);System.out.println("                                 `''    88        I8  8I                               I8  8I    ");
	    Thread.sleep(70);System.out.println("                                        88        I8  8'                               I8  8bgg, ");
	    Thread.sleep(05);System.out.println("                                        88        I8 dPgg,     ,gggg,gg   ,ggg,,ggg,   I8 dP' '8 ");
	    Thread.sleep(80);System.out.println("                                        88        I8dP' '8I   dP'  'Y8I  ,8' '8P' '8,  I8d8bggP' "+Col.reset);
	    Thread.sleep(99);System.out.println(Col.bold+"                                  gg,   88        I8P    I8  i8'    ,8I  I8   8I   8I  I8P' 'Yb, ");
	    Thread.sleep(50);System.out.println("                                   'Yb,,8P       ,d8     I8,,d8,   ,d8b,,dP   8I   Yb,,d8    `Yb,");
	    Thread.sleep(25);System.out.println("                                     'Y8P'       88P     `Y8P'Y8888P'`Y88P'   8I   `Y888P      Y8");
	    Thread.sleep(1000);System.out.println();                                                                 
	    Thread.sleep(60);System.out.println("                                             gg     gg    ,ggggg,    gg      gg  ");                            
	    Thread.sleep(99);System.out.println("                                             I8     8I   dP'  'Y8ggg I8      8I  ");                         
	    Thread.sleep(70);System.out.println("                                             I8,   ,8I  i8'    ,8I   I8,    ,8I  "+Col.reset);                         
	    Thread.sleep(05);System.out.println(Col.green+Col.bold+"                                            ,d8b, ,d8I ,d8,   ,d8'  ,d8b,  ,d8b, ");                         
	    Thread.sleep(80);System.out.println("                                            P''Y88P'888P'Y8888P'    8P''Y88P'`Y8 ");                         
	    Thread.sleep(99);System.out.println("                                                  ,d8I'                          ");                         
	    Thread.sleep(50);System.out.println("                                                ,dP'8I                           ");                         
	    Thread.sleep(80);System.out.println("                                               ,8'  8I                           ");                         
	    Thread.sleep(10);System.out.println("                                               I8   8I                           ");                         
	    Thread.sleep(99);System.out.println("                                               `8, ,8I                           ");                         
	    Thread.sleep(55);System.out.println("                                                `Y8P'                            "+Col.reset);
	    }
	    catch(Exception e){}
	    System.out.println(Col.skyblue+Col.bold+Col.blink+"THANK YOU, HAVE A NICE DAY"+Col.reset);
	}
}