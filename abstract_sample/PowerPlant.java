package abstract_sample;

public abstract class PowerPlant {

    private String name;
    private String usedEnergyType;

    public PowerPlant(String name, String usedEnergyType) {
        this.name = name;
        this.usedEnergyType = usedEnergyType;
    }

    public abstract void produceElectricity();

    public String getName() {
        return name;
    }

    public String getUsedEnergyType() {
        return usedEnergyType;
    }

}
