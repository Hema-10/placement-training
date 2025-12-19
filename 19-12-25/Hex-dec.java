import java.io.*;
class Geeks
{
    static int hexaToDec(String n)
    {
    
        int l = n.length();
        int base = 1;
        int dec_val = 0;

        for (int i = l - 1; i >= 0; i--) {

          
            if (n.charAt(i) >= '0'
                && n.charAt(i) <= '9') {
                dec_val += (n.charAt(i) - 48) * base;
                base = base * 16;
            }

    
            else if (n.charAt(i) >= 'A'
                     && n.charAt(i) <= 'F') {
                dec_val += (n.charAt(i) - 55) * base;

      
                base = base * 16;
            }
        }

        return dec_val;
    }
    public static void main(String[] args)
  {
        String n = "1A";
        System.out.println(hexaToDec(n));
    }
}
