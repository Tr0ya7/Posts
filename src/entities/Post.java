package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post() {}

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(); // serve justamente para quando se tem várias somas em conjunto dentro de uma variável String, para diminuir o peso da aplicação
        stringBuilder.append(title + "\n");
        stringBuilder.append(likes);
        stringBuilder.append(" likes - ");
        stringBuilder.append(dateFormat.format(moment) + "\n");
        stringBuilder.append(content + "\n");
        stringBuilder.append("Comments:\n");

        for (Comment comment : comments) {
            stringBuilder.append(comment.getText() + "\n");
        }

        return stringBuilder.toString();

        /* String allComments = "";

        for (Comment comment : comments) {
            allComments += "\n" + comment.getText();    isso iria consumir muita memória por sempre somar a uma String um novo comentário
        }

        return "title: " + title + "\ncontent: " + content + "\nlikes: " + likes + "\ncomments: " + allComments + "\nmoment: "+ moment; */
    }
}