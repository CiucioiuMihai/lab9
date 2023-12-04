
public class Flori {
    private String nume;

    private int varsta;

    private int nrPetale;

    public Flori(String nume,int varsta,int nrPetale)
    {
        this.nume=nume;
        this.varsta=varsta;
        this.nrPetale=nrPetale;
    }
    public void afiseazaFlorile(){
        System.out.println("Numele:" + nume);
        System.out.println("Varsta:" + varsta);
        System.out.println("Numarul de petale:" + nrPetale);
    }

    public static void main(String[] args) {
        Flori floare1= new Flori("Orhidee",5,0);
        Flori floare2= new Flori("Petunie",7,1);
        Flori floare3= new Flori("Trandafir",2,14);
    }
}
