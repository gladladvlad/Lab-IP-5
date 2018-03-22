// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IDE.java

package li5;

import java.io.PrintStream;
import java.util.List;

// Referenced classes of package li5:
//            Document

public class IDE
{

    public IDE()
    {
        throw new RuntimeException("Uncompilable source code - Erroneous tree type: li5.Document");
    }

    private void IDE()
    {
        System.out.println("Am instantiat IDE-ul");
    }

    static IDE getInstance()
    {
        return singleIDE;
    }

    public void OpenDocument(String path)
    {
        throw new RuntimeException("Uncompilable source code - Erroneous tree type: li5.Document");
    }

    public void ChangeFocus(Document doc)
    {
        throw new RuntimeException("Uncompilable source code - Erroneous tree type: li5.Document");
    }

    public void saveAll()
    {
    }

    public void ExecuteCommand(String s)
    {
    }

    public void AddDoc(String s)
    {
    }

    public List ValidateText()
    {
        return null;
    }

    public void HighLight()
    {
    }

    public List document;
    static IDE singleIDE = new IDE();

}
