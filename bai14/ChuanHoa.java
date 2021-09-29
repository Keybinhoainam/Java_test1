package bai14;

import java.util.Scanner;

public class ChuanHoa {
    private String s;
    private Scanner sc=new Scanner(System.in);
    public void nhap()
    {
        s=sc.nextLine();
    }
    public void Cau2()
    {
        String s1=s.toLowerCase(),kq="";
        String a[]=s1.trim().split("[^a-z]");
        for(int i=0;i<a.length;i++)
        {
            
            kq+= Character.toUpperCase(a[i].charAt(0))+a[i].substring(1)+" ";
        }
        System.out.println(kq);
    }
    public void Cau3()
    {
        String s1=s.toLowerCase(),kq="";
        String a[]=s1.trim().split("[^a-z]");
        int i;
        for(i=1;i<a.length-1;i++)
        {
            
            kq+= Character.toUpperCase(a[i].charAt(0))+a[i].substring(1)+" ";
        }
        kq+= Character.toUpperCase(a[i].charAt(0))+a[i].substring(1)+", ";
        i++;
        kq+=a[0].toUpperCase();
        System.out.println(kq);
    }
    public void Cau4()
    {
        String s1=s.toLowerCase(),kq="";
        String a[]=s1.trim().split("[^a-z]");
        int i;
        kq+=a[0];
        for(i=1;i<a.length;i++)
        {
            
            kq+= a[i].charAt(0);
        }
        kq+="@ptit.edu.vn";
        System.out.println(kq);
    }
    public int kt(char ch)
    {
        if(ch>='a'&&ch<='z')return 1;
        return 0;
    }
    public void Cau5()
    {
        String s1=s.toLowerCase(),kq="";
        s1.trim();
        s1=s1.replaceAll("\\s+\\?\\s+", "? ");
        s1=s1.replaceAll("\\s+\\!\\s+", "! ");
        s1=s1.replaceAll("\\s+\\.\\s+", ". ");
        s1=s1.replaceAll("\\s+\\,\\s+", ", ");
        String a[]=s1.split("[^a-z!?.,]");
        int i;
        kq+=Character.toUpperCase(a[0].charAt(0))+a[0].substring(1);
        for(i=1;i<a.length-1;i++)
        {
            
            // if(kt(a[i].charAt(0))==1)
            // // {
                // System.out.println(a[i]+"  "+kq.charAt(kq.length()-1)+"  "+kt(kq.charAt(kq.length()-1)));
                if(kq.charAt(kq.length()-1)==','||kt(kq.charAt(kq.length()-1))==1)kq+=" "+a[i];
                else kq+=" "+Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);
            // }
            // else kq+=a[i];
        }
        if(a[i].charAt(a[i].length()-1)  != '.')kq+=" "+a[i]+'.';
        else kq+=" "+a[i];
        System.out.println(kq);
    }
    
}
