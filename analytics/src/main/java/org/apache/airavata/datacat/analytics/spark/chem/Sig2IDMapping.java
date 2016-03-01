/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/
package org.apache.airavata.datacat.analytics.spark.chem;

import java.io.Serializable;
import java.util.AbstractMap;

/**
 * Sig2ID_Mapping = (Signature, Signature ID), Where Signature ID is the unique ID that
 * corresponds to this unique signature (in this universe of Signatures, might exist several!)
 */
public class Sig2IDMapping extends AbstractMap.SimpleEntry<String, Long> implements Serializable{
    public Sig2IDMapping(String _1, Long _2) {
        super(_1, _2);
    }
}