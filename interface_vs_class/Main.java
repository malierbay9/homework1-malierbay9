package interface_vs_class;

public class Main {

    public static void main(String[] args) {
	    Child child = new Child();

        //System.out.println(child.test);

        child.testMethod();

        /*  Child sınıfı IParent interface'ini implement , Parent sınıfını extend eder durumdadır. Üst sınıf ve
        interface 'test' adında bir attribute içerir.

           Child sınıfından nesne oluşturup, bu nesneden 'test' attribute'unun sonucunu yazdırmak istediğimizde
        'test is ambiguous' hatasını alıyoruz.

           Yine üst sınıfta ve interface'te aynı adlı bulunan testMethod() adlı metodu çağırdığımızda ise üst
        sınıftan kalıttığımız metodun runtime'da önce çalıştığını görüyoruz.    */

    }
}
