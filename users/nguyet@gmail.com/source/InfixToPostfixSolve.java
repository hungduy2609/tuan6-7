import java.util.Stack;

//Sinh vien khong chinh sua bat ky dong lenh nao ben tren dong comment "Phan bai lam cua sinh vien", duoc phep them thu vien khi can thiet

public class InfixToPostfixSolve implements Requirement1_OutputGetter {
	private String inputString;
	private String outputString;
	
	public InfixToPostfixSolve(){ //Phuong thuc khong duoc chinh sua
		this.inputString = "";
		this.outputString = "";
	}
	
	public InfixToPostfixSolve(String inputString){ //Phuong thuc khong duoc chinh sua
		this.inputString = inputString;
		this.outputString = "";
	}
		
	public void setInputString(String inputString){ //Phuong thuc khong duoc chinh sua
		this.inputString = inputString;
	}
	
	 public String getOutputString() { //Phuong thuc khong duoc chinh sua
    	this.outputString = infixToPostfix();
		return outputString;
	}	
	
	// Phan bai lam cua sinh vien
	
	private String infixToPostfix(){
		String postfix = "";
        // code here
		return postfix;
	}
	
	private String[] stringTokenizer(String str){
        // code here
		String[] tokens = null;
		return tokens;
	}
	    
	private boolean isNum(String c) {
    	return c.matches("0|([1-9][0-9]*)");
    }
	
	private int priorityOfOperator(String op){
        // code here
    	return 0;
    }   
}
