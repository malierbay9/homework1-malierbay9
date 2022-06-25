package abstract_sample;

public class SolarPowerPlant extends PowerPlant{

    public SolarPowerPlant() {
        super("Güneş Enerjisi Santrali", "Güneş Enerjisi");

        //super() anahtar sözcüğü üst sınıfın constructor metodunun yerine geçer.

    }

    @Override
    public void produceElectricity() {
        System.out.println(this.getUsedEnergyType()+" ile Elektrik Üretiliyor .");
    }
}
