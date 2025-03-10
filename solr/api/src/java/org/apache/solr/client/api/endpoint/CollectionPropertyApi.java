/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.solr.client.api.endpoint;

import io.swagger.v3.oas.annotations.Operation;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.apache.solr.client.api.model.SolrJerseyResponse;
import org.apache.solr.client.api.model.UpdateCollectionPropertyRequestBody;

/** V2 API definitions for modifying collection-level properties. */
@Path("/collections/{collName}/properties/{propName}")
public interface CollectionPropertyApi {
  @PUT
  @Operation(
      summary = "Create or update a collection property",
      tags = {"collection-properties"})
  SolrJerseyResponse createOrUpdateCollectionProperty(
      @PathParam("collName") String collName,
      @PathParam("propName") String propName,
      UpdateCollectionPropertyRequestBody requestBody)
      throws Exception;

  @DELETE
  @Operation(
      summary = "Delete the specified collection property from the collection",
      tags = {"collection-properties"})
  SolrJerseyResponse deleteCollectionProperty(
      @PathParam("collName") String collName, @PathParam("propName") String propName)
      throws Exception;
}
