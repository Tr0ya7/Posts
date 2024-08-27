import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(dateFormat.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I going to visit this wonderfull country!", 12);
        post.addComment(new Comment("Have a nice trip!"));
        post.addComment(new Comment("Wow that's awesome!"));

        System.out.println(post);

        Post post1 = new Post(dateFormat.parse("28/07/2018 23:14:19"), "Good night guys", "See u tomorrow", 5);
        post1.addComment(new Comment("Good night guys"));
        post1.addComment(new Comment("May the force be with u"));

        System.out.println(post1);

        input.close();
    }
}