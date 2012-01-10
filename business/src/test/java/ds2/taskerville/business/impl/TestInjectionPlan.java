/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.business.impl;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import ds2.taskerville.api.TimeAmountPrefs;
import ds2.taskerville.api.svc.TimeAmountService;
import ds2.taskerville.api.util.ConverterService;

/**
 *
 * @author kaeto23
 */
public class TestInjectionPlan extends AbstractModule {

  @Override
  protected void configure() {
    bind(TimeAmountService.class).to(TimeAmountServiceImpl.class);
    bind(TimeAmountPrefs.class).to(TimeAmountPrefsPropertiesLoader.class);
    bindConstant().annotatedWith(Names.named("propFile")).to("/ds2/taskerville/taskerville-default.properties");
    bind(ConverterService.class).to(ConverterImpl.class);
  }
}
