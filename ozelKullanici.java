public class ozelKullanici extends Kullanici {
    
    private double dolar;
    public double getDolar() {
        return dolar;
    }
    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public ozelKullanici(String isimim, String soyisimim, String numaram,double tlm , double dolarim) {
        super(isimim, soyisimim, numaram,tlm);
        setDolar(dolarim);
    }

    public void goster()
    {
        System.out.println("Dolar :" + this.getDolar() + " Tl :" + this.getTl());
    }


}
