/**
 * 
 */
package ds2.taskerville.business.inject;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

import ds2.taskerville.api.TimeAmountPrefs;
import ds2.taskerville.api.svc.TimeAmountService;
import ds2.taskerville.api.util.ConverterService;
import ds2.taskerville.business.impl.ConverterImpl;
import ds2.taskerville.business.impl.TimeAmountPrefsPropertiesLoader;
import ds2.taskerville.business.impl.TimeAmountServiceImpl;

/**
 * The injection plan.
 * 
 * @author kaeto23
 * @version 1.0
 */
public class InjectionPlan implements Module {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void configure(Binder binder) {
		binder.bind(TimeAmountService.class).to(TimeAmountServiceImpl.class);
		binder.bindConstant().annotatedWith(Names.named("propFile")).to(
				"/ds2/taskerville/taskerville-default.properties");
		binder.bind(TimeAmountPrefs.class).to(
				TimeAmountPrefsPropertiesLoader.class);
		binder.bind(ConverterService.class).to(ConverterImpl.class);
	}

}
