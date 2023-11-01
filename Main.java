public class Main
{
    public static void main(String[] args)
    {
        Kullanici k = new Kullanici("emin", "yetim", "250", 500);
        ozelKullanici o = new ozelKullanici("ramazan", "simsir", "250", 500, 1000);
        ozelKullanici o1 = new ozelKullanici("ramazan1", "simsir1", "250", 500, 1000);

        Banka a = new Banka() {
            
        };
        
        //a.havale(k, o, 100);
        //a.Eft(k, o, 300);
        a.Swift(o, o1, 100);
        k.goster();
        o.goster(); 
        o1.goster();
    }
}