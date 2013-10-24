package kr.co.lining.device.service;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 실제 업무에서 Stub는 자동으로 생성됨? 수작업으로 만들어야 됨?
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
