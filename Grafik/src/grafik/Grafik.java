package grafik;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class Grafik extends JFrame {

    static ArrayList<Point> noktalar;
    static public  String g1;
    static public String g2;
    static public String input;
    

    public Grafik(String g1Is, String g2Is, String inputT) {

        g1 = g1Is;
        g2 = g2Is;
        input = inputT;
        
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

  

    

    public static void main(String a[]) {

        


        noktalar = new ArrayList<>();
        doldur();

        NewJFrame nf = new NewJFrame();
        nf.setVisible(true);
       

    }

    public void paint(Graphics g) {
        
        System.out.println("deneme-"+g1);
        String []ust = ustDegerler(input);
   
        
        g.setColor(Color.black);
        g.drawString("Kırmızı: 0 girişi Mavi:: 1 girişi", 800, 500);
        g.setColor(Color.yellow);
        try {
            g.drawString("g1[ ]" + g1, 150, 50);
            g.drawString("g2[ ]" + g2, 200, 50);
        } catch (Exception e) {
            System.out.println("hata:" + e);
        }
        
        g.drawLine(noktalar.get(0).x, noktalar.get(0).y, noktalar.get(5).x, noktalar.get(5).y);
        g.drawLine(noktalar.get(0).x, noktalar.get(0).y + 100, noktalar.get(5).x, noktalar.get(5).y + 100);
        g.drawLine(noktalar.get(0).x, noktalar.get(0).y + 200, noktalar.get(5).x, noktalar.get(5).y + 200);
        g.drawLine(noktalar.get(0).x, noktalar.get(0).y + 300, noktalar.get(5).x, noktalar.get(5).y + 300);
        
        g.drawLine(noktalar.get(5).x, noktalar.get(5).y, noktalar.get(18).x, noktalar.get(18).y);
        g.drawLine(noktalar.get(5).x - 150, noktalar.get(5).y, noktalar.get(18).x - 150, noktalar.get(18).y);
        g.drawLine(noktalar.get(5).x - 300, noktalar.get(5).y, noktalar.get(18).x - 300, noktalar.get(18).y);
        g.drawLine(noktalar.get(5).x - 450, noktalar.get(5).y, noktalar.get(18).x - 450, noktalar.get(18).y);
        g.drawLine(noktalar.get(5).x - 600, noktalar.get(5).y, noktalar.get(18).x - 600, noktalar.get(18).y);
        g.drawLine(noktalar.get(5).x - 750, noktalar.get(5).y, noktalar.get(18).x - 750, noktalar.get(18).y);
        
        g.setColor(Color.black);
        g.drawString("00", 20, noktalar.get(0).y + 15);
        g.drawString("10", 20, noktalar.get(6).y + 15);
        g.drawString("01", 20, noktalar.get(13).y + 15);
        g.drawString("11", 20, noktalar.get(18).y + 15);
        
         
         
       
         g.setColor(Color.blue);
         
        g.drawString(bul(g1, g2, ust[0]), 150, 80);
        g.drawString(bul(g1, g2, ust[1]), 300, 80);
        g.drawString(bul(g1, g2, ust[2]), 450, 80);
        g.drawString(bul(g1, g2, ust[3]), 600, 80);
        g.drawString(bul(g1, g2, ust[4]), 750, 80);
        g.drawString(bul(g1, g2, ust[5]), 900, 80);
        
        System.out.println("deneme34-"+bul(g1, g2, ust[0]));
        
//        g.drawString(g1[0]+","+g1[1]+","+g1[2], 150 ,50)";
        
        // red->0  blue->1



        g.setColor(Color.red);
        g.drawLine(noktalar.get(0).x, noktalar.get(0).y, noktalar.get(5).x, noktalar.get(5).y);
        g.drawLine(noktalar.get(6).x, noktalar.get(6).y, noktalar.get(11).x, noktalar.get(11).y);
        g.drawLine(noktalar.get(7).x, noktalar.get(7).y, noktalar.get(12).x, noktalar.get(12).y);
        g.drawLine(noktalar.get(8).x, noktalar.get(8).y, noktalar.get(13).x, noktalar.get(13).y);
        g.drawLine(noktalar.get(9).x, noktalar.get(9).y, noktalar.get(14).x, noktalar.get(14).y);
        g.drawLine(noktalar.get(11).x, noktalar.get(11).y, noktalar.get(3).x, noktalar.get(3).y);
        g.drawLine(noktalar.get(13).x, noktalar.get(13).y, noktalar.get(5).x, noktalar.get(5).y);
        g.drawLine(noktalar.get(12).x, noktalar.get(12).y, noktalar.get(15).x, noktalar.get(15).y);
        g.drawLine(noktalar.get(13).x, noktalar.get(13).y, noktalar.get(16).x, noktalar.get(16).y);
        g.drawLine(noktalar.get(14).x, noktalar.get(14).y, noktalar.get(17).x, noktalar.get(17).y);
        g.drawLine(noktalar.get(12).x, noktalar.get(12).y, noktalar.get(4).x, noktalar.get(4).y);
        
        g.setColor(Color.blue);
        g.drawLine(noktalar.get(0).x, noktalar.get(0).y, noktalar.get(6).x, noktalar.get(6).y);
        g.drawLine(noktalar.get(1).x, noktalar.get(1).y, noktalar.get(7).x, noktalar.get(7).y);
        g.drawLine(noktalar.get(2).x, noktalar.get(2).y, noktalar.get(8).x, noktalar.get(8).y);
        g.drawLine(noktalar.get(3).x, noktalar.get(3).y, noktalar.get(9).x, noktalar.get(9).y);
        g.drawLine(noktalar.get(4).x, noktalar.get(4).y, noktalar.get(10).x, noktalar.get(10).y);   
        g.drawLine(noktalar.get(6).x, noktalar.get(6).y, noktalar.get(15).x, noktalar.get(15).y);
        g.drawLine(noktalar.get(7).x, noktalar.get(7).y, noktalar.get(16).x, noktalar.get(16).y);
        g.drawLine(noktalar.get(8).x, noktalar.get(8).y, noktalar.get(17).x, noktalar.get(17).y);
        g.drawLine(noktalar.get(9).x, noktalar.get(9).y, noktalar.get(18).x, noktalar.get(18).y);
        g.drawLine(noktalar.get(15).x, noktalar.get(15).y, noktalar.get(18).x, noktalar.get(18).y);
        g.drawLine(noktalar.get(8).x, noktalar.get(8).y, noktalar.get(11).x, noktalar.get(11).y);
        g.drawLine(noktalar.get(9).x, noktalar.get(9).y, noktalar.get(12).x, noktalar.get(12).y);
        g.drawLine(noktalar.get(10).x, noktalar.get(10).y, noktalar.get(13).x, noktalar.get(13).y);
        
        
        
        
        for (int i = 0; i < noktalar.size(); i++) {

            g.drawOval(noktalar.get(i).x, noktalar.get(i).y, 5, 5);
            g.setColor(Color.red);
            g.drawString(noktalar.get(i).giris0, noktalar.get(i).x + 5, noktalar.get(i).y - 5);
            g.setColor(Color.blue);
            g.drawString(noktalar.get(i).giris1, noktalar.get(i).x + 5, noktalar.get(i).y + 15);
            g.setColor(Color.yellow);
         //   g.drawString("M="+bul(g1, g2, noktalar.get(i).giris0,"0")[0],noktalar.get(i).x+10,noktalar.get(i).y);
            
            if (i == 0) {
                noktalar.get(i).maliyet0 = maliyetBul(bul(g1, g2, ust[0]), noktalar.get(i).giris0);
                noktalar.get(i).maliyet1 = maliyetBul(bul(g1, g2, ust[0]), noktalar.get(i).giris1);
            } else if (i == 1 || i == 6) {
                noktalar.get(i).maliyet0 = maliyetBul(bul(g1, g2, ust[1]), noktalar.get(i).giris0);
                noktalar.get(i).maliyet1 = maliyetBul(bul(g1, g2, ust[1]), noktalar.get(i).giris1);
            } else if (i == 2 || i == 7 || i == 11 || i == 15) {
                noktalar.get(i).maliyet0 = maliyetBul(bul(g1, g2, ust[2]), noktalar.get(i).giris0);
                noktalar.get(i).maliyet1 = maliyetBul(bul(g1, g2, ust[2]), noktalar.get(i).giris1);
            } else if (i == 3 || i == 8 || i == 12 || i == 16) {
                noktalar.get(i).maliyet0 = maliyetBul(bul(g1, g2, ust[3]), noktalar.get(i).giris0);
                noktalar.get(i).maliyet1 = maliyetBul(bul(g1, g2, ust[3]), noktalar.get(i).giris1);
            } else if (i == 4 || i == 9 || i == 13 || i == 17) {
                noktalar.get(i).maliyet0 = maliyetBul(bul(g1, g2, ust[4]), noktalar.get(i).giris0);
                noktalar.get(i).maliyet1 = maliyetBul(bul(g1, g2, ust[4]), noktalar.get(i).giris1);
            } else {
                noktalar.get(i).maliyet0 = "0";
                noktalar.get(i).maliyet1 = "0";
            }
            
            System.out.println("deneme5--"+noktalar.get(0).maliyet0);
            g.setColor(Color.red);
            g.drawString(noktalar.get(i).maliyet0,noktalar.get(i).x+20 , noktalar.get(i).y+5);
            g.setColor(Color.blue);
            g.drawString(noktalar.get(i).maliyet1,noktalar.get(i).x+30 , noktalar.get(i).y+10);
        }
    }

    private static void doldur() {

        noktalar.add(new Point(100, 100, "00", "11"));
        noktalar.add(new Point(250, 100, "00", "11"));
        noktalar.add(new Point(400, 100, "00", "11"));
        noktalar.add(new Point(550, 100, "00", "11"));
        noktalar.add(new Point(700, 100, "00", "11"));
        noktalar.add(new Point(850, 100, "", ""));

        noktalar.add(new Point(250, 200, "10", "01"));
        noktalar.add(new Point(400, 200, "10", "01"));
        noktalar.add(new Point(550, 200, "10", "01"));
        noktalar.add(new Point(700, 200, "10", "01"));
        noktalar.add(new Point(850, 200, "", ""));

        noktalar.add(new Point(400, 300, "11", "00"));
        noktalar.add(new Point(550, 300, "11", "00"));
        noktalar.add(new Point(700, 300, "11", "00"));
        noktalar.add(new Point(850, 300, "", ""));

        noktalar.add(new Point(400, 400, "01", "11"));
        noktalar.add(new Point(550, 400, "01", "11"));
        noktalar.add(new Point(700, 400, "01", "11"));
        noktalar.add(new Point(850, 400, "", ""));




    }

    private static String bul(String g1, String g2, String giris) {
        int sonuc[] = new int[2];
        String son;
        String input =  giris;
        sonuc[0] = ((int) input.charAt(0) * (int)g1.charAt(0)
                + (int) input.charAt(1) * (int)g1.charAt(1)
                + (int) input.charAt(2) * (int)g1.charAt(2)) % 2;
        sonuc[1] = ((int) input.charAt(0) * (int)g2.charAt(0)
                + (int) input.charAt(1) * (int)g2.charAt(1)
                + (int) input.charAt(2) * (int)g2.charAt(2)) % 2;
        son =sonuc[0]+""+sonuc[1];
        return  ""+son;
    }
    
    private static String[] ustDegerler (String inp){
        
        String s1=inp.charAt(0)+"0"+"0"; //x00
        String s2=inp.charAt(1)+""+s1.charAt(0)+""+s1.charAt(1); //yx0
        String s3=inp.charAt(2)+""+s2.charAt(0)+""+s2.charAt(1);
        String s4=inp.charAt(3)+""+s3.charAt(0)+""+s3.charAt(1);
        String s5=inp.charAt(4)+""+s4.charAt(0)+""+s4.charAt(1);
        String s6=inp.charAt(5)+""+s5.charAt(0)+""+s5.charAt(1);
        
        String []sonuc = {s1,s2,s3,s4,s5,s6};
        return sonuc;
    }
    
    private static String maliyetBul(String ustDeger, String girisNo){
        String sonuc = null;
        if (ustDeger.equals(girisNo)) {
            sonuc="0";
        }else if(ustDeger.equals("00") && girisNo.equals("11") || ustDeger.equals("11") && girisNo.equals("00")  ){
            sonuc="2";
        }else if(ustDeger.equals("01") && girisNo.equals("10") || ustDeger.equals("10") && girisNo.equals("01") ) {
            sonuc="2";
        }else{
            sonuc="1";
        }
        
        return sonuc;
    }
    
}
class Point {

    int x, y;
    String giris0, giris1;
    String maliyet0, maliyet1;

    public Point(int x, int y, String giris0, String giris1) {
        this.x = x;
        this.y = y;
        this.giris0 = giris0;
        this.giris1 = giris1;
    }
}