package hello;

public class Entity {

    private final Long id;
    private final String content;
    private final boolean status;

    public Entity(Long id, String content, boolean status) {
        this.id = id;
        this.content = content;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public boolean getStatus() {
        return status;
    }
}
