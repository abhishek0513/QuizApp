import java.util.Objects;
import java.util.Scanner;

public class QuestionService {
    Question[]questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Rome", "Paris", "Paris");
        questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Saturn", "Mars");
        questions[2] = new Question(3, "Who wrote 'Hamlet'?", "Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain", "William Shakespeare");
        questions[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic", "Indian", "Arctic", "Pacific", "Pacific");
        questions[4] = new Question(5, "Which element has the chemical symbol 'O'?", "Gold", "Oxygen", "Osmium", "Oganesson", "Oxygen");
    }
    public int playQuestion(){
        int i = 0;
        int marks = 0;
        for(Question question : questions)
        {
            System.out.println("Question no : " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOp1());
            System.out.println(question.getOp2());
            System.out.println(question.getOp3());
            System.out.println(question.getOp4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            if(Objects.equals(selection[i], question.getAns())){
                marks += 10;
            }
            i++;
        }
        for(String s : selection){
            System.out.println(s);
        }
        return marks;
    }
}
