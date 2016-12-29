package org.cups4j.test;

import org.cups4j.CupsClient;
import org.cups4j.CupsPrinter;

import java.util.List;

/**
 * cups4j org.cups4j.test
 * 描述：
 * 时间：2016-12-28 21:06.
 */

public class Test {

    public static void main(String[] args) throws Exception {

        CupsClient client = new CupsClient("192.168.1.177", 631);
        List<CupsPrinter> printers = client.getPrinters();
        System.out.println(printers.size());
        for(CupsPrinter p : printers) {
            System.out.println(p);
        }

    }

}
