package org.faber.swanknft.filecoin.vo.res;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import org.faber.swanknft.filecoin.vo.req.KeyInfo;

/**
 * export wallet response VO
 * @author rda
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WalletExportRes {

	@JsonProperty("KeyInfo")
	private List<KeyInfo> keyInfo;

	public List<KeyInfo> getKeyInfo() {
		return keyInfo;
	}

	public void setKeyInfo(List<KeyInfo> keyInfo) {
		this.keyInfo = keyInfo;
	}
}
