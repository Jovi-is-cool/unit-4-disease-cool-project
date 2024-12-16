public class main{
public static void main(String[] args){
    Malaria john = new Malaria("john", 43, "fever and abdominal pain");
    System.out.println(john.getDiagnoses());
    System.out.println(john);
    Malaria jack = new Malaria("jack", 22, "fever");
    System.out.println(jack);
    System.out.println(jack.getDiagnoses());
    jack.addSymptom("fever and also abdominal pain");
    System.out.println(jack);
}}