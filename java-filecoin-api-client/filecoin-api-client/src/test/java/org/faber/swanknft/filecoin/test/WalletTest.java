package org.faber.swanknft.filecoin.test;

import org.junit.Assert;
import org.junit.Test;
import org.faber.swanknft.filecoin.vo.res.KeyInfo;

import java.math.BigDecimal;

/**
 * @author rda
 */
public class WalletTest extends BaseTester {


	@Test
	public void walletExport()
	{
		String address = "t1b3keswmeuk4tipp5egjbk3aoag56g5zd3cle2va";
		KeyInfo keyInfo = filecoin.walletExport(address);
		logger.info(keyInfo);
	}

	@Test
	public void walletImport()
	{
		String privateKey = "pdHwTOrJXnAGvQ0861k66xRsiT7N3Ms8IGte3nT837E=";
		String address = filecoin.walletImport(privateKey);
		Assert.assertNotNull(address);
		if (address != null) {
			logger.info("wallet import successfully, Address : " + address);
		} else {
			logger.info("wallet import fail");
		}
	}

	@Test
	public void  getBalance()
	{
		String address = "t1esjjrygs7adcfbjnodbpdjzulzobznnln4tmsxq";
		BigDecimal balance = filecoin.getBalance(address);
		logger.info(balance);
	}


}
