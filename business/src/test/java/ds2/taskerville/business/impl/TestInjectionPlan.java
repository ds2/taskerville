/*
 * TaskerVille - issue and project management
 * Copyright (C) 2012  Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
