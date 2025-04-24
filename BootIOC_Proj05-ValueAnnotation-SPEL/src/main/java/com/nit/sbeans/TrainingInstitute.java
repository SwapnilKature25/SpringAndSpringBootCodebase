package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component("inst")
//@Data  // or  @ToString
@ToString
public class TrainingInstitute {
	// injecting random value
	@Value("#{T(java.lang.Math).round(T(java.lang.Math).random() * 99)}")   // generate random number
	private Integer id;
	
	// injecting the values collected from the properties file
	@Value("${inst.name}")
	private String name;
	@Value("${inst.addrs}")
	private String addrs;
	@Value("${inst.phone}")
	private Long contact;
	@Value("${inst.email}")
	private String email;
	@Value("${inst.category}")
	private String category;
	
	// injecting the har coded value
	@Value("500043")
	private String pinCode;
	
	// injecting the system property values
	@Value("${os.name}")
	private String osName;
	@Value("${os.version}")
	private String osVersion;
	
	// injecting the values collected from the Environment variable
	@Value("${Path}")
	private String pathData;
	
	// injecting the values through SPEL
	@Value("#{cc.cjavaPrice + cc.ajavaPrice + cc.spbmsPrice + cc.oraclePrice + cc.awsPrice + cc.devopsPrice + cc.angularPrice + cc.testingPrice}")
	private Double fsJavaPrice;		// full stack java price
	
	@Value("#{cc.spbmsPrice > 10000}")
	private boolean isSpbmsFeeCostly;
	
	
	
}
