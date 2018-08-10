public class SportStore {

//create private static instance member
    public static  final SportStore sportInstance = new SportStore();
 //craete private constructor
    private  SportStore(){

    }

    public static SportStore getSportInstance(){
        return  sportInstance;
    }

    public void  getCricket(){

        sport cricketAction = new cricket();
        cricketAction.play();
    }

    public void getFootball(){
        sport footballAction = new football();
        footballAction.play();
    }

}
