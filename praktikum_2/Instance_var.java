public class Instance_var {
    public String geek; 
    public Instance_var(){
        this.geek = "Subhan Jain";
    }
    public static void main(String[] args){
        Instance_var name = new Instance_var();
        System.out.println("Geek name is: " + name.geek);
    }
}
