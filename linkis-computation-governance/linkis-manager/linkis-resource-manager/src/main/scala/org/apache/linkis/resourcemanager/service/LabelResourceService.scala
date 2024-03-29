/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package org.apache.linkis.resourcemanager.service

import java.util

import org.apache.linkis.manager.common.entity.persistence.PersistenceResource
import org.apache.linkis.manager.common.entity.resource.NodeResource
import org.apache.linkis.manager.label.entity.Label
import org.apache.linkis.resourcemanager.domain.RMLabelContainer

abstract class LabelResourceService {

  def getLabelResource(label: Label[_]): NodeResource

  def setLabelResource(label: Label[_], nodeResource: NodeResource, source: String) : Unit

  /**
   * this function is the same to setLabelResource
   * @param label
   * @param nodeResource
   */
  def setEngineConnLabelResource(label: Label[_], nodeResource: NodeResource, source: String) : Unit

  def getResourcesByUser(user: String) : Array[NodeResource]

  def enrichLabels(labels: util.List[Label[_]]) : RMLabelContainer

  def removeResourceByLabel(label: Label[_]): Unit

  def getLabelsByResource(resource: PersistenceResource): Array[Label[_]]

  def getPersistenceResource(label: Label[_]): PersistenceResource

}