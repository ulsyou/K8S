package com.github.two.controller;

import com.github.two.ServiceTwoApplication;
import com.github.two.model.AllNameValueTO;
import com.github.two.model.NameValueTO;
import com.github.two.service.NameValueService;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameValueController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private NameValueService nameValueService;

    private Logger logger = Logger.getLogger(ServiceTwoApplication.class);

    @GetMapping(value = "/")
    @ApiOperation(value = "Get name and value", notes = "Get service name and its corresponding values for all the services", response = NameValueTO.class)
    public AllNameValueTO getAllNameValue() {
        logger.info("Inside " + applicationName + " controller's getAllNameValue() method");
        return nameValueService.getAllNameValues(applicationName);
    }

}
