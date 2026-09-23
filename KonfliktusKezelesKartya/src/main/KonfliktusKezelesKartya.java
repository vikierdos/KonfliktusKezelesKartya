package main;


public class KonfliktusKezelesKartya {

    
    public static void main(String[] args) {
        
    }
    
    private static void kever(int oszlop) {
        switch (oszlop) {
            case 2->{
                for (int i = 0; i < 7; i++) {
                    ujPakli[i]= pakli[19-(i-1)*3];
                    ujPakli[i+7]= pakli[20-(i-1)*3];
                    ujPakli[i+14]= pakli[21-(i-1)*3];
                }
            }
            case 3->{
                for (int i = 0; i < 7; i++) {
                    ujPakli[i]= pakli[19-(i-1)*3];
                    ujPakli[i+7]= pakli[21-(i-1)*3];
                    ujPakli[i+14]= pakli[20-(i-1)*3];
                }
            }
        }
    }
    
}
