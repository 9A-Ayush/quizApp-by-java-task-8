import java.util.*;

class Question {
    String question, optionA, optionB, optionC, optionD;
    char correctAnswer;

    Question(String question, String a, String b, String c, String d, char correct) {
        this.question = question;
        this.optionA = a;
        this.optionB = b;
        this.optionC = c;
        this.optionD = d;
        this.correctAnswer = correct;
    }

    boolean checkAnswer(char answer) {
        return Character.toLowerCase(answer) == Character.toLowerCase(correctAnswer);
    }

    void display() {
        System.out.println("\n" + question);
        System.out.println("A) " + optionA);
        System.out.println("B) " + optionB);
        System.out.println("C) " + optionC);
        System.out.println("D) " + optionD);
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> quiz = new ArrayList<>();
        quiz.add(new Question("Which language runs in a web browser?", "Java", "C", "Python", "JavaScript", 'D'));
        quiz.add(new Question("What does HTML stand for?", "Hyper Text Markup Language", "Home Tool Markup Language", "Hyperlinks and Text Markup Language", "Hyper Tool Multi Language", 'A'));
        quiz.add(new Question("What year was Java released?", "1996", "1995", "1990", "2000", 'B'));
        quiz.add(new Question("Who is the founder of Microsoft?", "Steve Jobs", "Bill Gates", "Mark Zuckerberg", "Larry Page", 'B'));
        quiz.add(new Question("Which company developed the Java language?", "Google", "Microsoft", "Sun Microsystems", "Apple", 'C'));
        quiz.add(new Question("Which one is not a programming language?", "HTML", "Python", "Java", "C++", 'A'));
        quiz.add(new Question("Which keyword is used to create a subclass in Java?", "super", "this", "class", "extends", 'D'));
        quiz.add(new Question("Which data type is used to store true/false values in Java?", "int", "boolean", "char", "String", 'B'));
        quiz.add(new Question("What is JVM in Java?", "Java Variable Method", "Java Virtual Machine", "Java Vendor Machine", "Java Virtual Mode", 'B'));
        quiz.add(new Question("Which loop is guaranteed to execute at least once?", "for loop", "while loop", "do-while loop", "none", 'C'));

        int score = 0;

        System.out.println("Welcome to the Online Quiz App!");
        System.out.println("Choose the correct option (A/B/C/D)\n");

        for (Question q : quiz) {
            q.display();
            System.out.print("Your Answer: ");
            char answer = scanner.next().charAt(0);

            if (q.checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer was: " + q.correctAnswer);
            }
        }

        System.out.println("\n Quiz Completed! Your Score: " + score + " out of " + quiz.size());
        scanner.close();
    }
}
