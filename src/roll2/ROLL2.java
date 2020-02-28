package roll2;

abstract class Suclu{
    public abstract boolean Sorgula();
    int cezayil;
}
class Sebepler extends Suclu{

    @Override
    public boolean Sorgula() {
      if(cezayil==15){
          return true;
      }
      else if(cezayil==30){
          return true;
      }
      else if(cezayil==7){
          return true; 
      }
      else
          return true;
    }
    
    public void Agirlastirici(){
        if (Sorgula()) {
            System.out.println("Kasten Adam Oldurme:");
        }
        else if(Sorgula()){
            System.out.println("Organize olma +30yil");
        }
        else if(Sorgula()){
            System.out.println("Bicakla yaralama +7yil");
        }
        else if(Sorgula()){
            System.out.println("Digerleri +5yil");
        }
    }
    public int Hafifletici(){
        System.out.println("Tahrik etme sucundan: "+(cezayil-3)+" Yil hapis.");
        System.out.println("Akli denge bozuk: "+(cezayil-4)+"Yil hapis.");
        return cezayil;
    }
}


class Yas extends Suclu{

    @Override
    public int Sorgula() {
        if (cezayil>10) {
            System.out.println("Cezaya %10 arttırıldı.");
           return cezayil=cezayil+(cezayil*10)/100;
        }
        else{
            System.out.println("Cezaya %5 arttırıldı.");
          return cezayil=cezayil+(cezayil*5)/100;
        }
    }
    public int  cocukDurum(){
        return cezayil=cezayil-(cezayil*50)/100;
    }   
}
class Atama{
 int SucluID=12345;
 Suclu suclukisi;
 Yas yassorgu;
}
public class ROLL2 {

    public static void main(String[] args) {
        Atama suclu=new Atama();
      suclu.suclukisi.cezayil=15;
      suclu.yassorgu.Sorgula();
    }
    
}
