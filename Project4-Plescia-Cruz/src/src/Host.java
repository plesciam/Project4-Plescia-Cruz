package src;

import java.io.InvalidObjectException;
import java.util.Scanner;
import merrimackutil.json.JSONSerializable;
import merrimackutil.json.types.JSONType;

 public class Host<Addr, FindValue, SrcAddr, SrcPort, TargetUid, Uid, Port, FindNode, Store> implements JSONSerializable  
 {
   
        private Addr addr;
        private Port port; 
        private SrcAddr srcaddr;
        private SrcPort srcport;
        private TargetUid targetuid;   
        private Scanner scanner;
        

        public Host(Addr addr, Port port, Uid uid, SrcAddr srcaddr, SrcPort srcport, TargetUid targetUid, Scanner scanner) {
        this.addr = addr;
        this.port = port;
        this.srcaddr = srcaddr;
        this.srcport = srcport;
        this.targetuid = targetUid;
        this.scanner = scanner;
    }
       
    public Addr getAddr() {
        return addr;
    }
    public void setAddr(Addr addr) {
        this.addr = addr;
    }
    public SrcAddr getSrcaddr() {
            return srcaddr;
    }
    public void setSrcaddr(SrcAddr srcaddr) {
            this.srcaddr = srcaddr;
    }
    public SrcPort getSrcport() {
            return srcport;
    }
    public void setSrcport(SrcPort srcport) {
            this.srcport = srcport;
    }
    public TargetUid getTargetuid() {
        return targetuid;
    }
    public void setTargetuid(TargetUid targetuid) {
            this.targetuid = targetuid;
    }
    public void getUid() {
        return;
    }

    public Scanner getScanner() {
            return scanner;
    }
    public void setScanner(Scanner scanner) {
            this.scanner = scanner;
    }
    
  
    public Port getPort() {
        return port;
    }
    public void setPort(Port port) {
        this.port = port;
    }
   
    
    
    @Override
    public void deserialize(JSONType arg0) throws InvalidObjectException {
        throw new UnsupportedOperationException("Unimplemented method 'deserialize'");
    }
    @Override
    public String serialize() {
        throw new UnsupportedOperationException("Unimplemented method 'serialize'");
    }
    @Override
    public JSONType toJSONType() {
        throw new UnsupportedOperationException("Unimplemented method 'toJSONType'");
    }
}  
 
