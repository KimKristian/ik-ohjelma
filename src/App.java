public class App {
    public static void main(String[] args) throws Exception {
        int ika = 100 ;
       if(ika >= 0 && ika < 18){
            System.out.println("Olet alaikäinen");
            if(ika >= 15){
                System.out.println("Saat ajaa mopoa.");
                if(ika >= 16){
                    System.out.println("Saat ajaa kevaria.");
                }
            }           
        }
        if(ika == 18){
            System.out.println("Olet täysi ikäinen");
        }
        if(ika == 100){
            System.out.println("Onnea");
            System.out.println("Teille");
            System.out.println("Paljon!");
        }
        else if(ika % 10 == 0){
            System.out.println("Onnea tasavuosista!"); 
            if(ika >= 39 && ika < 51);
        }
        else if(ika >= 58 && ika < 65){
            System.out.println("Voit mennä varhaiseläkkeelle siitä."); 
        }
        else if(ika >= 65 && ika < 100){ 
            System.out.println("Olet eläkeläinen.");
            if(ika == 65){
                System.out.println("Hyvää eläkettä!");
            }
        }
        else{
            System.out.println("Olet aikuinen");
       }           
    }
}
