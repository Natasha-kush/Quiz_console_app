package quiz_app;
import java.util.*;
public class QuestionService {
  
	Question[] questions = new Question[5];
	String selection[] = new String[5];
	public QuestionService() {
		questions[0] = new Question(1, "what is java", "java","cpp","python","c", "java");
		questions[1] = new Question(2, "Which of the following is the correct way to declare a variable in Java?", "java","cpp","python","int x = 5;", "int x = 5;");
		questions[2] = new Question(3, "Which of the following is NOT a valid Java data type?", "java","string ","python","c", "string");
		questions[3] = new Question(4, "Which of the following methods is used to find the length of a string in Java?", "java","cpp","length()","c", "length()");
		questions[4] = new Question(5, "What is the default value of a boolean variable in Java?", "false","cpp","python","c", "false");
		
	}
	//method
	public void playQuiz() {
		int i =0;
		for(Question g : questions) {
		System.out.println("Question no. : "+g.getId());
		System.out.println(g.getQuestion());
		System.out.println(g.getOpt1());
		System.out.println(g.getOpt2());
		System.out.println(g.getOpt3());
		System.out.println(g.getOpt4());
		
		System.out.println("write your answer :");
		Scanner sc = new Scanner(System.in);
		selection[i]=sc.nextLine();
		
		i++;
		System.out.println("----------------------------------");
		}
		//user score
		System.out.println("your selected options");
		for(String s : selection) {
			System.out.println(s);
		}
		
	}
		
	//this method will show score	
	public void printScore() {
		int score = 0;
		for(int i=0; i<questions.length; i++) {
			Question que = questions[i];
			String actualanswer = que.getAnswer();
			String useranswer = selection[i];
			
			if(actualanswer.equals(useranswer)) {
				score++;
				
			}
		}
		System.out.println("---------------your score----------------");
		System.out.println("your score: " + score);
		
	}	
	
}
