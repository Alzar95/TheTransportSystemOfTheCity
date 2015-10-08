package TTSOTC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.09.2015.
 */
public class MainModel {
    private List transport;
    private List listRB;
    private List listTime;

    public MainModel() {
        transport = new ArrayList();
        listRB = new ArrayList();
        listTime = new ArrayList();
        transport.add("BusA");
        transport.add("BusB");
        transport.add("BusC");
        transport.add("BusD");
}

    public List getTransportList() {
        return transport;
    }

    public List getListRB() {
        return listRB;
    }

    public List getListTime() {
        return listTime;
    }
}
