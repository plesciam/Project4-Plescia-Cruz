package src;

import org.w3c.dom.NodeList;

/**
 * Host
 * 
 */
 public class Host<Addr, FindValue, SrcAddr, SrcPort, TargetUid, Port, FindNode, Store> implements JSONSerializable  
 {
    
        private Addr addr;
        private FindValue findvalue;
        private SrcAddr srcaddr;
        private SrcPort srcport;
        private TargetUid targetuid;   
        private Port port; 
        private Uid uid;

        FindValue findValue = new FindValue();
        FindNode findnode = new FindNode();
        Store store = new Store();
        NodeList nodeList = new NodeList();

    
    public Addr getAddr() {
        return addr;
    }
    public void setAddr(Addr addr) {
        this.addr = addr;
    }
    private Port port; 
    public Port getPort() {
        return port;
    }
    public void setPort(Port port) {
        this.port = port;
    }
   
    public Host(Addr addr, Port port, Uid uid) {
        this.addr = addr;
        this.port = port;
        this.uid = uid;
    }
    public Uid getUid() {
        return uid;
    }
    public void setUid(Uid uid) {
        this.uid = uid;
    }
    }  
 }
