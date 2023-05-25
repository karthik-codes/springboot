package CohesiveClasses;
/*
 * Cohesion is the degree to which the elements inside a module belong together. 
 * Low Cohesion means bad prgmng practice High Cohesion is good to understand.
 * A module is said to have low cohesion if it contains unrelated elements. 
 * Basically it means it shd target on single specific task rather than performing all task.
 */

public class UserDatabase {
//LOW COHESIVE
	public void connectDB() {/*provide implementation*/}
	public void setName() {/*provide implementation*/}
	public void setEmailAddress() {/*provide implementation*/}
	public void userInfo() {/*provide implementation*/}
	/*un-relatable*/ public void createEvents() {/*provide implementation*/} 
	
	
	
	
	public static void main(String[] args) {
		//LOW COHESIVE
	//call all above low cohesive one by one to execute in one single class.
		
       //HIGH COHESIVE
//		connectDB c=new connectDB();
//		setName s=new setName();
//		setEmailAddress se=new setEmailAddress();
//		userInfo u=new userInfo();
		/*we have seperate clasess and we can maintain and change code easily. 
		 * we removed userInfo() method which is not valid to this module  */
		
	}

}
