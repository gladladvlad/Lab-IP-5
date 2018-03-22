// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IP.java

package li5;


// Referenced classes of package li5:
//            IDE

public class IP
{

    public IP()
    {
    }

    public static void main(String args[])
    {
        IDE testIDE = IDE.getInstance();
        testIDE.OpenDocument("test path");
    }
}
