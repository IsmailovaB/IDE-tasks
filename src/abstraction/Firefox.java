package abstraction;

import abstraction.Browser;

public class Firefox extends Browser {

    @Override
    public void launch(){
        System.out.println("Firefox is launching");
    }
    @Override
    public void browse(String url){

        System.out.println("Firefox is browsing: "+url);
    }
}
