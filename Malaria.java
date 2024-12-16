public class Malaria {
    private Boolean infected = false;
    private String input = "";
    private Boolean fever = false;
    private Boolean cough = false;
    private Boolean abdominalPain = false;
    private String name = "";
    private int age = 0;

    public Malaria(String n, int a, String input){
        name = n;
        age = a;
        this.input = input;
    }
    public void addSymptom(String input){
        this.input = input;
    }
    public Boolean getDiagnoses(){
        if(input.indexOf("fever") > -1){
            fever = true;
        }
        if(input.indexOf("cough") > -1){
            cough = true;
        }
        if(input.indexOf("abdominal pain") > -1){
            abdominalPain = true;
        }
        if(fever == true && cough == false && abdominalPain == true){
            infected = true;
        }
        return infected;
    }
    @Override
    public String toString(){
        this.getDiagnoses();
        if(infected == true){
            return name + " is " + age + " years old and due to the symptoms of " + input + " most likely has malaria";
        }
        else if(infected == false){
            return name + " is " + age + " years old and due to the symptoms of " + input + " most likely does not have malaria";
        }
        else{
            return "skibid toilet";
        }
    }
}