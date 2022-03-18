package org.faber.swanknft.filecoin.vo.res;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author rda
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Cid {

	@JsonProperty("/")
	private String root;

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}
}
