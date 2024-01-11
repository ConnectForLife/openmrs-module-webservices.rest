/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.webservices.rest.web.v1_0.resource.openmrs2_4;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.type.TypeReference;
import org.openmrs.annotation.Handler;
import org.openmrs.annotation.OpenmrsProfile;
import org.openmrs.module.webservices.rest.SimpleObject;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.api.Converter;
import org.openmrs.module.webservices.rest.web.response.ConversionException;

import java.util.Map;

@Handler(supports = ObjectNode.class)
@OpenmrsProfile(openmrsPlatformVersion = "2.4.* - 9.*")
public class CodehausObjectNodeConverter implements Converter<ObjectNode> {

  @Override
  public ObjectNode newInstance(String type) {
    return null;
  }

  @Override
  public ObjectNode getByUniqueId(String string) {
    return null;
  }

  @Override
  public SimpleObject asRepresentation(ObjectNode instance, Representation rep) throws ConversionException {
    final Map<String, Object> simpleMap =
        new ObjectMapper().convertValue(instance, new TypeReference<Map<String, Object>>() {
        });

    final SimpleObject representation = new SimpleObject();
    simpleMap.forEach(representation::add);
    return representation;
  }

  @Override
  public Object getProperty(ObjectNode instance, String propertyName) throws ConversionException {
    return null;
  }

  @Override
  public void setProperty(Object instance, String propertyName, Object value) throws ConversionException {

  }
}
