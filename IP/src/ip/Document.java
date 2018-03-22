import java.util.Vector;

public class Document {

  public String buffer;
  public String tempbuffer;
  public String language;
  public Integer cursorPosition;
  public String path;

<<<<<<< HEAD:Document.java
  public Integer newAttr;

  public String Compiler_Path;

  public Vector<String> CompilerOptions;

    public Vector  myIDE;
=======
    public Document() {
        
    }

    public Document(String path) {
        this.path = path;
        tempbuffer = "";
        language = "Default";
        cursorPosition = 0;
        System.out.println("Am instantiat un document!");
    }
    
  
>>>>>>> f535956a3a812764eeaf268998cdaae5753fbc5c:IP/src/ip/Document.java

  public void moveCursor(int offs) {
      cursorPosition = cursorPosition + offs;
  }

  public void addCharacter() {
  }

  public void Save() {
  }

  public void RemoveChar() {
  }

  public void Compile() {
  }

  public void Run() {
  }

}