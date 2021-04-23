package hu.bce.harmadikbeadando;

public class Coder {
    private String content;

    public Coder(String content) {
        this.content = content;
    }

    public void reverseContent() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.content);
        sb.reverse();

        this.content = sb.toString();
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
