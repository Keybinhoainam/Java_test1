/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DaThuc {
    private String[] thuaSo;

    public DaThuc(String[] thuaSo) {
        this.thuaSo = thuaSo;
    }

    public DaThuc(String daThuc) {
        this.thuaSo = daThuc.trim().replaceAll("\\+", " + ").split("\\s+\\+\\s+");
    }

    public DaThuc cong(DaThuc q) {
        int m = this.thuaSo.length, n = q.thuaSo.length, i = 0, j = 0;
        String[] dt1 = this.thuaSo, dt2 = q.thuaSo;
        List<String> dathuc = new ArrayList<String>();

        while (i < m && j < n) {
            Integer bac1 = Integer.parseInt(dt1[i].split("\\^")[1]);
            Integer bac2 = Integer.parseInt(dt2[j].split("\\^")[1]);
            Integer heso1 = Integer.parseInt(dt1[i].split("\\*")[0]);
            Integer heso2 = Integer.parseInt(dt2[j].split("\\*")[0]);

            if (bac1 > bac2) {
                String tmp = heso1 + "*x^" + bac1;
                dathuc.add(tmp);
                i++;
            }
            else if (bac1 < bac2) {
                String tmp = heso2 + "*x^" + bac2;
                dathuc.add(tmp);
                j++;
            }
            else {
                String tmp = (heso1 + heso2) + "*x^" + bac1;
                dathuc.add(tmp);
                i++; j++;
            }
        }

        while (i < m) {
            dathuc.add(dt1[i]);
            i++;
        }
        while (j < n) {
            dathuc.add(dt2[j]);
            j++;
        }

        String[] thuaSo = new String[dathuc.size()];
        thuaSo = dathuc.toArray(thuaSo);
        return new DaThuc(thuaSo);
    }
    
    public String toString() {
        String res = ""; 
        int l = thuaSo.length;

        for (int i = 0; i < l - 1; i++) {
            res += thuaSo[i] + " + ";
        }
        return res + thuaSo[l - 1];
    }
    
    public void getDaThuc(){
        System.out.println(this.toString());
    }
}