/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rummydemo;


import com.shephertz.app42.server.AppWarpServer;

/**
 * @author DHRUV CHOPRA
 */

public class Main {

    public static void main(String[] args) throws Exception {
	String appconfigPath = System.getProperty("user.dir")+System.getProperty("file.separator")+"AppConfig.json";
	boolean started = AppWarpServer.start(new RummyServerExtension(), appconfigPath);
        if(!started){
            throw new Exception("AppWarpServer did not start. See logs for details.");
        }
    }

}
