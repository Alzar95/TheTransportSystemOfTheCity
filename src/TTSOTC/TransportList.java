package TTSOTC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.09.2015.
 */
public class TransportList {
    private List transport;

    public TransportList() {
        transport = new ArrayList();
        transport.add("BusA1");
        transport.add("BusA2");
        transport.add("BusB1");
        transport.add("BusB2");
        transport.add("TrolleybusOne");
        transport.add("TrolleybusTwo");
    }

    public List getTransport() {
        return transport;
    }
}
