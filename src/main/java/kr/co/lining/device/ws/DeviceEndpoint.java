package kr.co.lining.device.ws;

import java.text.SimpleDateFormat;
import java.util.Date;

import kr.co.lining.device.service.DeviceService;

import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.xpath.XPath;
import org.springframework.ws.server.endpoint.AbstractJDomPayloadEndpoint;

public class DeviceEndpoint extends AbstractJDomPayloadEndpoint {

	private XPath startDateExpression;
	private DeviceService deviceService;
	private XPath typeExpression;
	private XPath endDateExpression;
	
	public DeviceEndpoint(DeviceService deviceService) throws JDOMException {
		this.deviceService = deviceService;
		
		Namespace namespace = Namespace.getNamespace("device", "http://localhost/device/schemas");
		startDateExpression = XPath.newInstance("//device:StartDate");
		startDateExpression.addNamespace(namespace);
		endDateExpression = XPath.newInstance("//device:EndDate");
		endDateExpression.addNamespace(namespace);
		typeExpression = XPath.newInstance("//device:Type");
		typeExpression.addNamespace(namespace);
		
	}

	protected Element invokeInternal(Element deviceRequest) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = dateFormat.parse(startDateExpression.valueOf(deviceRequest));
		Date endDate = dateFormat.parse(endDateExpression.valueOf(deviceRequest));
		String type = typeExpression.valueOf(deviceRequest);
		
		deviceService.requestDevices(startDate, endDate, type);
		return null;
	}
}
