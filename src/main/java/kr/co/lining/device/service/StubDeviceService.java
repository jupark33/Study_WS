package kr.co.lining.device.service;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * ���� �������� Stub�� �ڵ����� ������? ���۾����� ������ ��?
 * @author jupark
 *
 */
public class StubDeviceService implements DeviceService {

	private static final Log logger = LogFactory.getLog(StubDeviceService.class);
	
	public void requestDevices() {
		logger.info("Request Device");
	}

	public void requestDevices(Date startDate, Date endDate, String type) {
		logger.info("Request Device startDate : " + startDate + ", endDate : " + endDate + ", type : " + type);
	}

}
