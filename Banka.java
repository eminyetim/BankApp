public abstract class Banka {
    public void havale(Kullanici alanHesap , Kullanici gonderenHesap , double miktar )
    {
        alanHesap.setTl((alanHesap.getTl()+miktar));
        gonderenHesap.setTl((gonderenHesap.getTl()-miktar));
    }

    public void Eft(Kullanici alanHesap , Kullanici gonderenHesap , double miktar)
    {
       double hesapla = (miktar * 5)/100;
       double masraf = 20;
       if(hesapla > 20)
       {
            masraf = hesapla;
       }

       alanHesap.setTl((alanHesap.getTl()+miktar));
       gonderenHesap.setTl((gonderenHesap.getTl()-(miktar+masraf)));
    }

    public void Swift(ozelKullanici alanHesap , ozelKullanici gonderenHesap , double miktar)
    {
        alanHesap.setDolar((alanHesap.getDolar()+miktar));
        gonderenHesap.setDolar((gonderenHesap.getDolar()-miktar));
        gonderenHesap.setTl(gonderenHesap.getTl()-500);
    }  
    public void goster()
    {
        
    }
}
