/**
 * 
 */
package net.onrc.openvirtex.elements.datapath;

import net.onrc.openvirtex.elements.OVXMap;
import net.onrc.openvirtex.elements.port.PhysicalPort;

/**
 * @author gerola
 * 
 */
public class PhysicalSwitch extends Switch<PhysicalPort> {

    /**
     * 
     */
    public PhysicalSwitch() {
	super();
    }

    /**
     * @param switchName
     * @param switchId
     * @param map
     */
    public PhysicalSwitch(final String switchName, final long switchId,
	    final OVXMap map) {
	super(switchName, switchId, map);
    }

    @Override
    public PhysicalPort getPort(final short portNumber) {
	return this.portMap.get(portNumber).getCopy();
    }

    @Override
    public boolean addPort(final PhysicalPort port) {
	if (this.portMap.containsKey(port.getPortNumber())) {
	    return false;
	} else {
	    this.portMap.put(port.getPortNumber(), port);
	    return true;
	}
    }

    @Override
    public boolean updatePort(final PhysicalPort port) {
	if (!this.portMap.containsKey(port.getPortNumber())) {
	    return false;
	} else {
	    this.portMap.put(port.getPortNumber(), port);
	    return true;
	}
    }

    @Override
    public boolean removePort(final short portNumber) {
	if (!this.portMap.containsKey(portNumber)) {
	    return false;
	} else {
	    this.portMap.remove(portNumber);
	    return true;
	}
    }

    @Override
    public boolean initialize() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean sendMsg() {
	// TODO Auto-generated method stub
	return false;
    }

}
