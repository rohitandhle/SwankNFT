package org.faber.swanknft.filecoin.starter;


import org.faber.swanknft.filecoin.rpc.Filecoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author rda
 * */
@Configuration
@ConditionalOnMissingBean(Filecoin.class)
@EnableConfigurationProperties(FilecoinProperties.class)
public class FilecoinAutoConfiguration {

	@Autowired
	private FilecoinProperties filecoinProperties;

	@Bean
	public Filecoin filecoin()
	{
		return new Filecoin(filecoinProperties.getApiBaseUrl(), filecoinProperties.isLogDebug());
	}
}
