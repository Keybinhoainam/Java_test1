package De9;

import java.util.Scanner;

public class VanBan {
    private Scanner sc = new Scanner(System.in);
    private String s;
    
    public VanBan(){
        
    }
    
    public void nhap(){
        System.out.println("Nhap doan van ban:");
        s = sc.nextLine().trim();
        System.out.println("Doan van ban vua nhap la:");
        System.out.println(s);
    }
    
    public void demSoCau(){
        String[] cau = s.split("[\\.\\?\\!]");
        int dem = 0;
        for(int i = 0; i < cau.length; i++)
            if(cau[i].length() != 0)
                dem++;
        
        System.out.println(dem + " cau");
    }
    
    public void chuanHoa(){
        s = s.replaceAll("\\,", "\\, ");
        s = s.replaceAll("\\.", "\\. ");
        s = s.replaceAll("\\?", "\\? ");
        s = s.replaceAll("\\;", "\\; ");
        s = s.replaceAll("\\:", "\\: ");
        s = s.replaceAll("\\!", "\\! ");
        s = s.replaceAll("\\s+", " ");
        s = s.replaceAll("\\s\\,", "\\,");
        s = s.replaceAll("\\s\\.", "\\.");
        s = s.replaceAll("\\s\\?", "\\?");
        s = s.replaceAll("\\s\\;", "\\;");
        s = s.replaceAll("\\s\\:", "\\:");
        s = s.replaceAll("\\s\\!", "\\!");
        System.out.println("Van ban sau khi chuan hoa:");
        System.out.println(s);
    }
    
}
