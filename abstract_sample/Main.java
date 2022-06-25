package abstract_sample;

public class Main {

    public static void main(String[] args) {

        new SolarPowerPlant().produceElectricity();
        new HydroelectricPowerPlant().produceElectricity();
        new NuclearPowerPlant().produceElectricity();

        /*  PowerPlant sınıfı genel bir sınıftır. Onu nesne üretmek için değil
        kalıtım yapmak ve şablon oluşturmak için kullanırız. Bu yüzden PowerPlant sınıfını abstract tanımlarız.

        PowerPlant sınıfını kalıtım yapan bütün sınıflar produceElectricity() metodunu içermelidir. Bu metodu abstract
        tanımlayıp alt sınıflarda kendilerine göre override ederiz.

         Alt sınıflardan nesne üretip produceElectricity() metodunu çalıştırdığımızda çıktılarının kendilerine göre
         olduğunu görebiliriz.  */

    }
}
