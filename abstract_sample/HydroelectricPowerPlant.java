package abstract_sample;

public class HydroelectricPowerPlant extends PowerPlant {

    public HydroelectricPowerPlant() {
        super("Hidroelektrik Enerji Santrali","Hidroelektrik Enerji" );
    }

    @Override
    public void produceElectricity() {
        System.out.println(this.getUsedEnergyType()+" ile Elektrik Üretiliyor .");
    }
}
