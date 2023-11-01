public class Kullanici {
    private String isim;
    private String soyisim;
    private String numara;
    private double tl; 

    public Kullanici(String isimim , String soyisimim , String numaram , double tlm)
    {
        setIsim(isimim);
        setSoyisim(soyisimim);
        setSoyisim(numaram);
        setTl(tlm);
    }

    public void goster()
    {
        System.out.println("Tl :"+this.getTl());
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getSoyisim() {
        return soyisim;
    }
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
    
    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public double getTl() {
        return tl;
    }

    public void setTl(double tl) {
        this.tl = tl;
    }
}
