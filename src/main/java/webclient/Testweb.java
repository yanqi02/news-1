package webclient;

import client.Function;
import client.FunctionService;
import client.TransWords;

public class Testweb {
    public static void main(String[] args) {
        FunctionService functionService=new FunctionService ();
        Function function=functionService.getFunctionPort ();
       String str= function.transWords ("aa");
        System.out.println (str);

    }
}
