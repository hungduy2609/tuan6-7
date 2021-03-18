import java.util.Stack;

//Sinh vien khong chinh sua bat ky dong lenh nao ben tren dong comment "Phan bai lam cua sinh vien", duoc phep them thu vien khi can thiet

public class CalculatePostfixSolve implements Requirement2_OutputGetter{
	private String inputString;
	private double resultOfExpression;
	
	public CalculatePostfixSolve(){ //Phuong thuc khong duoc chinh sua
		this.inputString = "";
		this.resultOfExpression = 0;
	}
	
	public CalculatePostfixSolve(String inputString){ //Phuong thuc khong duoc chinh sua
		this.inputString = inputString;
		this.resultOfExpression = 0;
	}
	
	public void setInputString(String inputString){ //Phuong thuc khong duoc chinh sua
		this.inputString = inputString;
	}	
	
	public double getResultOfExpression(){ //Phuong thuc khong duoc chinh sua
		this.resultOfExpression = calculatePostfix();
		return this.resultOfExpression;
	}	
	
	// Phan bai lam cua sinh vien
	
	private double calculatePostfix(){
        // code here
		return 0;
	}
	
	private String[] stringTokenizer(String str){
        // code here
		String[] tokens = null;
		return tokens;
	}
	
	private boolean isNum(String c) {
    	return c.matches("0|([1-9][0-9]*)");
    }
}
