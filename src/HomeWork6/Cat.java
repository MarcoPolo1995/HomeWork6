package HomeWork6;

public class Cat extends Animals {

    protected boolean swim;

    public Cat(String name, int run, boolean swim) {
        this.name = name;
        this.run = run;
    }

    public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Swim:" + swim);
}


}





