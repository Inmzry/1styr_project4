import java.util.Scanner;



import java.util.ArrayList;
import java.util.Random;

public class Test1{
	private static ArrayList<Employee> employee;	
  public static void main(String[]args){
   
Scanner sc = new Scanner(System.in);
  

   System.out.print("How many employee? ");
       int size = sc.nextInt();
       employee = new ArrayList<>(size);
      
      Employee employeeA[] = new Employee[size];
      
      int empID[] = new int[size];
      String ELast[] = new String[size];
      String EFirst[] = new String[size];
      char EMi[] = new char[size];
      char EStatus[] = new char[size];
      char EmpStatus[] = new char[size];
      double wrhrs[] = new double[size];
      int menu;
      int tempInt;
      String tempString;
      char tempChar;
      double tempDouble;
     
      
      
  do{
   System.out.print("1.Create\n"+"2.View\n"+"3.Sort\n"+"4.Search\n"+"5.Delete\n"+"6.Quit\n");
   System.out.println("--------------------");
   System.out.print("Input Choices: ");
   menu = sc.nextInt();
    
   //create
   if(menu==1) {
   if(size != employee.size()) {
	   boolean checked = false;
	   do {
		   //random employee ID
			   for(int c=0;c<employeeA.length;c++){
	  Random randomNumGenerator = new Random();
		  for (int id = 1; id <= 1; ++id){
	        empID [c] = randomNumGenerator.nextInt(99999999)+1;
	      System.out.println("Employee ID number = "+empID [c]);
		  }
		  
		  sc = new Scanner(System.in);
   System.out.print("Enter Employee Last Name: ");
   ELast [c] = sc.nextLine();
   System.out.print("Enter Employee First name: ");
   EFirst [c] = sc.nextLine();
   System.out.print("Enter Employee Middle Initial: ");
   EMi [c] = sc.nextLine().charAt(0);
   EStatus [c] = ' ';
   while( EStatus [c] != 'S' && EStatus [c] != 's' && EStatus [c] != 'M' && EStatus [c] != 'm' && EStatus [c] != 'W' && EStatus [c] != 'w'){
   System.out.println("Enter Employee Status: ");
   System.out.println("Single S/s");
   System.out.println("Married M/m");
   System.out.println("Widow W/w");
   EStatus [c] = sc.nextLine().charAt(0);
   }
   EmpStatus [c] = ' ';
   while( EmpStatus [c]!= 'R' && EmpStatus [c] != 'r' && EmpStatus [c]!= 'P' && EmpStatus [c] != 'p' && EmpStatus [c] != 'C' && EmpStatus [c] != 'c' && EmpStatus [c] != 'T' && EmpStatus [c] != 't'){
   System.out.println("Enter Employment Status: ");
   System.out.println("Regular R/r");
   System.out.println("Probitionary P/p");
   System.out.println("Casual C/c");
   System.out.println("Part-time T/t");
   EmpStatus [c] = sc.nextLine().charAt(0);
   }
   System.out.print("Enter Employee Hours Work: ");
   wrhrs [c] = sc.nextInt();
   while(wrhrs [c]<0){
   System.out.print("Enter Employee Hours Work: ");
   wrhrs [c] = sc.nextInt();
   }
   employee.add(new Employee( empID, ELast, EFirst, EMi, EStatus, EmpStatus, wrhrs));
   
   System.out.println("Employee Created!");

   if (size != employee.size()) {
		   System.out.println("\nCreate Employee Again?\n(1)Yes\n(0)No");
		   
			int menus = sc.nextInt();

		      if (menus == 1) {
		   	   checked = false;
		         
		          }
		      else {
		         checked = true;
		      
		      	break;}
		   }
			  
		   else {
System.out.println("\n Data is full\n");
checked = true;
break;
}
			  }
   }while (!checked);
	   } 
   else {
       System.out.println(" FULL");
   		}
   }
   //view
   else if(menu==2) {
	   asd();
    	  System.out.println("--------------------");
      for(int c=0;c<employeeA.length;c++){
   employeeA[c] = new Employee();
   employeeA[c].setempID(empID[c]);
   employeeA[c].setElast(ELast[c]);
   employeeA[c].setEfirst(EFirst[c]);
   employeeA[c].setEMi(EMi[c]);
   employeeA[c].setEStatus(EStatus[c]);
   employeeA[c].setEmpStatus(EmpStatus[c]);
   employeeA[c].setEHrs(wrhrs[c]);
   employeeA[c].StatRate();
   employeeA[c].oT();
   employeeA[c].BPay();
   employeeA[c].GPay();
   employeeA[c].StatusTax();
   employeeA[c].sSS();
   employeeA[c].PHealth();
   employeeA[c].PagIbig();
   employeeA[c].tD();
   employeeA[c].Net();
   }
      
    for(int c2=0;c2<employeeA.length;c2++){
    		System.out.print(employeeA[c2]);
         }
}
   //Sort
  else if(menu==3){
	  		asd();
    	  System.out.println("(1.)Ascending (2.)Descending");
    	  int cend = sc.nextInt();
    	  if(cend==1) {
      for(int c=0;c<employeeA.length;c++){
         for(int c2=c+1;c2<employeeA.length;c2++){
         if(empID[c]>empID[c2]){
            tempInt = empID[c];
            empID[c] = empID[c2];
            empID[c2] = tempInt;
            
            tempString = ELast[c];
            ELast[c] = ELast[c2];
            ELast[c2] = tempString;
            
            tempString = EFirst[c];
            EFirst[c] = EFirst[c2];
            EFirst[c2] = tempString;
            
            tempChar = EMi[c];
            EMi[c] = EMi[c2];
            EMi[c2] = tempChar;
            
            tempChar = EStatus[c];
            EStatus[c] = EStatus[c2];
            EStatus[c2] = tempChar;
            
            tempChar = EmpStatus[c];
            EmpStatus[c] = EmpStatus[c2];
            EmpStatus[c2] = tempChar;
            
            tempDouble = wrhrs[c];
            wrhrs[c] = wrhrs[c2];
            wrhrs[c2] = tempDouble;
         }
}
         }
      }
       for(int c=0;c<employeeA.length;c++){
   employeeA [c] = new Employee();
   employeeA[c].setempID(empID[c]);
   employeeA[c].setElast(ELast[c]);
   employeeA[c].setEfirst(EFirst[c]);
   employeeA[c].setEMi(EMi[c]);
   employeeA[c].setEStatus(EStatus[c]);
   employeeA[c].setEmpStatus(EmpStatus[c]);
   employeeA[c].setEHrs(wrhrs[c]);
   employeeA[c].StatRate();
   employeeA[c].oT();
   employeeA[c].BPay();
   employeeA[c].GPay();
   employeeA[c].StatusTax();
   employeeA[c].sSS();
   employeeA[c].PHealth();
   employeeA[c].PagIbig();
   employeeA[c].tD();
   employeeA[c].Net();
       }
      /* for(int c2=0;c2<employeeA.length;c2++){
         
    	   System.out.println("--------------------");
            System.out.print(employeeA[c2]);
          }*/
}
   //Search
else if(menu==4){
	 int flag=0;
	System.out.print("Enter ID number you want to search: ");
    int x = sc.nextInt();
    for(int i = 0; i < employeeA.length; i++){
        if(empID[i] == x){
            flag = 1;
            break;
        }
        else{
            flag = 0;
        }
    }
    if(flag == 1){
        System.out.println("Identified");
        asd();
        
        System.out.println("--------------------");
        for (int e = 0; e < employeeA.length; e++) {
        	if (x == empID[e])
                System.out.println(employeeA[e]);
         }
        
    }
else{
        System.out.println("Not found !!!");
    }
}
   //Delete
    else if(menu == 5) {
    	System.out.print("Enter ID number to be Delete : ");
        int count=0;
        int del = sc.nextInt();
        for(int i=0; i<size; i++){
            if(empID[i] == del){
                for(int j=i; j<(size-1); j++){
                	employeeA[j] = employeeA[j+1];
                }
                count++;
                break;
                
            }
        }
        if(count==0){
            System.out.print("Element Not Found..!!");
        }
        else{
            System.out.println("Data Deleted Successfully..!!");
            System.out.print("Remaining data\n--------------------");
            asd();
            for(int i=0; i<(size-1); i++){
                System.out.print(employeeA[i]+ " \n");
                
            }
        }
    }
    }
        while(menu>0 && menu<6);
  		if(menu>6) {
	  System.out.println("Wrong choice re-run !!!");
  		} 
  	}
  		public static void asd() {
  			System.out.println("\nEmployee Number:\tEmployee Last Name:\tEmployee First Name:\tEmployee Middle Initial:\tEMployee Status:"
  					+ "\tEmployment Status:\tHours Work:\tGross Pay:\tTotal Deduction:\tnet Earnings:\tOver Time Pay:\tRate:\t\tTax:\t\tSSS deduction:\t"
  					+ "Phil-Health deduction:\tPag-Ibig deduction:\t");
  }
  		
  
}
  
  
