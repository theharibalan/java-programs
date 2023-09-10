public class Basic {
    private String name;
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Basic b = new Basic();
        b.setName("Hari");
        System.out.println(b.getName());
    }

}
