package emailApp;

import java.util.Map;
import java.util.Scanner;

public class Email {
   private String firstname;
   private String lastname;
   private String password;
   private String department;
   private String email;
   private int mailboxCapacity=500;
   private  int defaultPasswordLength=10;
   private String alternateEmail;
   private  String companySuffix="xyzcompany.com";


//constructr to recieve firstname and lastname

    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
//        System.out.println("email created "+this.firstname+" "+this.lastname);

        //call a method for asking for departmet -return department
        this.department=setDepartment();
//        System.out.println("Department= "+this.department);

        //call a method that returns a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password is= "+this.password);

        //combine elements to generate email
        email=firstname.toLowerCase()+ "."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
//        System.out.println("email is "+ email);
    }


//ask for the deaprtment
    private String setDepartment(){
        System.out.print("Enter the department\n 1.Sales \n2.Development\n3.Accounting\n0.None");
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();

        if(temp==1){return "sales";}
        if(temp==2){return "development";}
        if(temp==3){return "accounting";}
        else{return "";}


    }


//Generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCSDEFGHIJKLMNOPQRSTUVXYZ0123456789!@#$%";
        char [] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

//Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    public void  changePassword(String password){
        this.password=password;
    }
    public int getMailboxCapacity(){return mailboxCapacity;}

    public String getAlternateEmail() {return alternateEmail;}

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getDefaultPasswordLength() {
        return defaultPasswordLength;
    }

    public String getCompanySuffix() {
        return companySuffix;
    }


    public String showInfo(){
        return "DISPLAY NAME: "+firstname+" "+ lastname+
                "\nCOMPANY EMAIL: "+email+
                "\nMAILBOX CAPACITY: "+ mailboxCapacity+ " mb";
    }
//set the alternate email

//change the password
}
