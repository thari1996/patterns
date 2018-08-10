public class sportExecutor {

    public static void main(String[] args) {
        SportStore sportInstance1 = SportStore.getSportInstance();
        System.out.println("Sport Instance 1" +System.identityHashCode(sportInstance1));
        sportInstance1.getCricket();
        sportInstance1.getFootball();


        SportStore sportInstance2 = SportStore.getSportInstance();
        System.out.println("\nSport Instance 2: "+System.identityHashCode(sportInstance2));
        sportInstance2.getFootball();


    }
}
