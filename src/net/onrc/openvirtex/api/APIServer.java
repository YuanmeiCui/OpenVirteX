package net.onrc.openvirtex.api;

import java.util.List;

import org.apache.thrift.TException;

public class APIServer implements TenantServer.Iface {
    APITenantManager tenantManager;
    public APIServer () {
	tenantManager = new APITenantManager();
    }

    @Override
    public int createVirtualNetwork(int tenantId, String protocol,
            String controllerAddress, short controllerPort,
            String networkAddress, short mask) throws TException {
	// TODO Auto-generated method stub
	return tenantManager.createOVXNetwork(tenantId, protocol, controllerAddress, controllerPort, networkAddress, mask);
    }

    @Override
    public int createVirtualSwitch(int tenantId, List<String> dpids)
            throws TException {
	// TODO Auto-generated method stub
	return this.createVirtualSwitch(tenantId, dpids);
    }

    @Override
    public int createHost(int tenantId, String dpid, short portNumber)
            throws TException {
	// TODO Auto-generated method stub
	return this.tenantManager.createEdgePort(tenantId, dpid, portNumber);
    }

    @Override
    public int createVirtualLink(int tenantId, String pathString)
            throws TException {
	// TODO Auto-generated method stub
	return this.tenantManager.createOVXLink(tenantId, pathString);
    }

    @Override
    public boolean startNetwork(int tenantId) throws TException {
	// TODO Auto-generated method stub
	return this.tenantManager.createNetwork(tenantId);
    }
}
