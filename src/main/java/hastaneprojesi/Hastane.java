package hastaneprojesi;

public class Hastane extends VeriBankasi{
    Doktor doktor =new Doktor();
    Hasta hasta = new Hasta();



    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }

    public  void ekle(){
    }
    public void listele(){

    }
    public void bulma(){}
    public  void silme(){}
}
