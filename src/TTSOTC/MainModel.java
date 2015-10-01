package TTSOTC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.09.2015.
 */
public class MainModel {
    private List transport;

    public MainModel() {
        transport = new ArrayList();
        transport.add("BusA");
        transport.add("BusB");
        transport.add("BusC");
        transport.add("BusD");
        transport.add("TrolleybusOne");
        transport.add("TrolleybusTwo");
}

    public List getTransportList() {
        return transport;
    }
}
