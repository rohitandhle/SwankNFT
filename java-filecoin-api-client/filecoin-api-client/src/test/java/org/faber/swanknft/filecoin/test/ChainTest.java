package org.faber.swanknft.filecoin.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author rda
 */
public class ChainTest extends BaseTester {

	@Test
	public void chainHead()
	{
		String cid = filecoin.chainHead();
		System.out.println(cid);
		Assert.assertNotNull(cid);
	}
}
