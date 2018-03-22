package ip;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class IDE {

  public List<Document> document = new ArrayList<Document>();
  static IDE singleIDE = new IDE();
    /**
   * 
   * @element-type Document
   */

  private void IDE() {
    System.out.println("Am instantiat IDE-ul");
   }
  
  static IDE getInstance()
  {
      return singleIDE;
  }
  
  public void OpenDocument(String path) {
      Document doc = new Document(path);
      document.add(doc);
  }

  public void ChangeFocus(Document doc) {
  }

  public void saveAll() {
  }

  public void ExecuteCommand(String comand) {
  }

  public void AddDoc(String Path) {
  }

  public List<Error> ValidateText() {
  return null;
  }

  public void HighLight() {
  }

}