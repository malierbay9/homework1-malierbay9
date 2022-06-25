package abstract_sample;

public class NuclearPowerPlant extends PowerPlant {

    public NuclearPowerPlant() {
        super("Nükleer Enerji Santrali", "Nükleer Enerji");
    }

    @Override
    public void produceElectricity() {
        System.out.println(this.getUsedEnergyType()+" ile Elektrik Üretiliyor .");
    }
}
