import java.util.Vector;

public class Document {

  public String buffer;
  public String tempbuffer;
  public String language;
  public Integer cursorPosition;
  public String path;

    public Document() {
        
    }

    public Document(String path) {
        this.path = path;
        tempbuffer = "";
        language = "Default";
        cursorPosition = 0;
        System.out.println("Am instantiat un document!");
    }
    
  

  public void moveCursor(int offs) {
      cursorPosition = cursorPosition + offs;
  }

  public void addCharacter() {
  }

  public void Save() {
  }

  public void RemoveChar() {
  }

}