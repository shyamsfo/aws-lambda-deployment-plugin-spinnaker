/*
 * Copyright 2018 Amazon.com, Inc. or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.amazon.aws.spinnaker.plugin.lambda.upsert.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class LambdaDeploymentInput {
    private static Logger logger = LoggerFactory.getLogger(LambdaDeploymentInput.class);
    private String account, region, functionName, runtime, s3bucket, s3key, handler, role, credentials, description, appName;
    int memorySize;
    int timeout;
    Boolean publish;

    HashMap<String, String> envVariables;
    HashMap<String, String> tags;
    HashMap<String, String> deadLetterConfig;
    HashMap<String, String> tracingConfig;
    List<String> subnetIds;
    List<String> securityGroupIds;
    List<String> layers;

    String targetGroups;
    String kmskeyArn;
}
