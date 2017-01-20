package hello;

public class Server {
    private final int id;
    private final String name;
    private final boolean status;
    
    public Server(int id, String name, boolean status){
        this.id = id;
        this.name = name;
        this.status = status;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean getStatus()
    {
        return status;
    }
    
}
