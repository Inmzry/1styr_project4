import java.text.*;
public class Employee {
	DecimalFormat df = new DecimalFormat("0.00");
	
	private String eLast;
	private String eFirst;
	private int empID;
	private char EMi;
	private char EStatus; 
	private char EmpStatus;
	private double wrhrs;
	private double T;
	private double R;
	private double GP;
	private double OT;
	private double BP;
	private double SSS;
	private double PH;
	private double PI;
	private double NP;
	private double TD;
	
	
	public Employee(int empID, String eLast, String eFirst, char EMi, char EStatus, char EmpStatus, double wrhrs) {
		this.empID = empID;
		this.eLast = eLast;
		this.eFirst = eFirst;
		this.EMi = EMi;
		this.EStatus = EStatus;
		this.EmpStatus = EmpStatus;
		this.wrhrs = wrhrs;
		}
	
	public Employee(int[] empID2, String[] eLast2, String[] eFirst2, char[] eMi2, char[] eStatus2, char[] empStatus2,
			double[] wrhrs2) {
		// TODO Auto-generated constructor stub
	}
public Employee() {
		
	}
	public void setempID(int empID) {
		this.empID = empID;
	}
	public void setElast(String eLast) {
		this.eLast = eLast;
	}
	public void setEfirst(String eFirst) {
		this.eFirst = eFirst;
	}
	public void setEMi(char EMi) {
		this.EMi = EMi;
	}
	public void setEStatus(char EStatus) {
		this.EStatus = EStatus;
	}
	public void setEmpStatus(char EmpStatus) {
		this.EmpStatus = EmpStatus;
	}
	public void setEHrs(double wrhrs) {
		this.wrhrs = wrhrs;
	}
	//method
	public int getEmpno() {
		return empID;
	}
	public String getEmpLast() {
		return eLast;
	}
	public String getEMfirst() {
		return eFirst;
	}
	public char getEmpmi() {
		return EMi;
	}
	public char getEmpstatus() {
		return EStatus;
	}
	public char getempstatus() {
		return EmpStatus;
	}
	public double getEmpHrs() {
		return wrhrs;
	}
	
	public double StatRate() {
		switch(EmpStatus) {
		case 'R':
		case 'r':
			R=590.88;
			break;
		case 'C':
		case 'c':
			R=488.56;
			break;
		case 'T':
		case 't':
			R=525.38;
			break;
		case 'P':
		case 'p':
			R=415.10;
			break;
		default:
			R=0;
			break;
		}
		return R;
	}
	public double oT() {
		if(wrhrs>104) {
			OT=(wrhrs-104)*((R/8)*1.5);
		}
		else {
			OT=0;
		}
		return  OT;
	}
	public double BPay() {
		if(wrhrs>=104) {
			BP=(104/8)*R;
		}
		else {
			BP=(wrhrs/8)*R;
		}
		return BP;
	}
	public double GPay() {
		GP=BP+OT;
		return GP;
	}
	public double StatusTax() {
		switch(EStatus) {
		case 'S':
		case 's':
			T=GP*.1575;
			break;
		case 'M':
		case 'm':
			T=GP*.1235;
			break;
		case 'W':
		case 'w':
			T=GP*.1260;
			break;
			default:
				T=0;
				break;
		}
		return T;
		}
	public double sSS() {
		if(GP>=12000) {
			SSS=GP* .0115;
		}
		else if(GP<12000 && GP>=9500) {
			SSS=GP* .0105;
		}
		else if(GP<9500) {
			SSS=GP* .0916;
		}
		return SSS;
	}
	public double PHealth() {
		if(GP>=12000) {
			PH=420;
		}
		else if(GP<12000 && GP>=9500) {
			PH=290;
		}
		else if(GP<9500) {
			PH=380;
		}
		return PH;
	}
	public double PagIbig(){
		switch(EStatus){
			case 'S':
			case 's':
			PI=GP* .0275;
			break;
			
			case 'M':
			case 'm':
			PI=GP* .0375;
			break;

			case 'W':
			case 'w':
			PI=GP* .0255;
			break;

			default:
			PI=0;
			break;
		}
		return PI;
		}
	public double tD(){
		TD=T+SSS+PH+PI;
		return TD;
	}
	public double Net(){
		NP=GP-TD;
		return NP;
	}
  	  	
	//to string
	
	
	public String toString(){
		
	

		return empID+"  \t\t"+eLast+"\t\t\t"+eFirst+"\t\t\t"+EMi+"\t\t\t\t"+EStatus+"\t\t\t"+EmpStatus+"\t\t\t"+wrhrs+"\t\t"+df.format(GP)+"\t\t"+df.format(TD)+"\t\t\t"+df.format(NP)+"\t\t"+df.format(OT)+"\t\t"+df.format(R)+"\t\t"+df.format(T)+"\t\t"+df.format(SSS)+"\t\t"+df.format(PH)+"\t\t\t"+df.format(PI)+"\n\n";
	}
	}

