
public class MustBeAllLettersException extends Exception {
	private String name;
	
	public MustBeAllLettersException(String name){
		this.name = name;
	}
	public String getMustBeAllLetters() {
		return name;}
		
	public String toString(){
		return "Your name can not contain any numbers or special characters";
	}
}
