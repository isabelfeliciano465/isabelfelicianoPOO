import java.util.*;

public class TV{
    private int channel;
    private int volumenLevel;
    private boolean on;


    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (on && newChannel>=1 && newChannel<=120)
        channel = newChannel;
    }

    public int getChannel(){
        return channel;
    }

    public int getVolumenLevel(){
        return volumenLevel;
    }

    public boolean getOn(){
        return on;
    }

    public void setVolumen(int newVolumenLevel){
        if (on && newVolumenLevel>=1 && newVolumenLevel<=7)
        volumenLevel = newVolumenLevel;
    }

    public void volumenUp(){
        if (on && volumenLevel<=7){

        }
        volumenLevel ++;
    }

    public void volumenDown(){
        if (on && volumenLevel>=1){
        volumenLevel--;
        }
    }

    public void channelUP(){
        if (on && channel<=120){
            channel++;
        }
    }

    public void channelDown(){
        if (on && channel>=1){
        channel--;
        }
    } 
    public static void main(String[] args) {
        TV sony = new TV();
        sony.turnOn();
        sony.setChannel(112);
        sony.setVolumen(7);

        System.out.println("ENCENDIDO "+sony.getOn());
        System.out.println("CANAL "+sony.getChannel());
        System.out.println("VOLUMEN "+sony.getVolumenLevel());
        sony.volumenDown();
        System.out.println("VOLUMEN : "+sony.getVolumenLevel());
        sony.volumenDown();
        System.out.println("VOLUMEN : "+sony.getVolumenLevel());
        sony.volumenDown();
        System.out.println("VOLUMEN : "+sony.getVolumenLevel());
        sony.volumenDown();
        System.out.println("VOLUMEN : "+sony.getVolumenLevel());
        sony.volumenDown();
        System.out.println("VOLUMEN : "+sony.getVolumenLevel());
        sony.volumenDown();
        System.out.println("VOLUMEN : "+sony.getVolumenLevel());

    }


}