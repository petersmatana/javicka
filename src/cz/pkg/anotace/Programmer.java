package cz.pkg.anotace;

@MojeAnotace(metoda = "nevim?")
public class Programmer extends Employee {

    @Override
    public void sayHello() {
        System.out.println("class Programmer");
    }

    @MojeAnotace(metoda = "hafo")
    public void anotovanaMetoda() {

    }
}
