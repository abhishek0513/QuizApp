public class Main {
    public static void main(String[] args) {
        QuestionService service =  new QuestionService();
        int marks = service.playQuestion();
        System.out.println("You Scored " + marks + " out of 50");
        System.out.println("Author abhishek");
    }
}