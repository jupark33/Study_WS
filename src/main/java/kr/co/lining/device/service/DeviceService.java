package kr.co.lining.device.service;

import java.util.Date;

public interface DeviceService {
	void requestDevices();
	void requestDevices(Date startDate, Date endDate, String type);
}
