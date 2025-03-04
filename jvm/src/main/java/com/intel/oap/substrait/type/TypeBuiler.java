/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intel.oap.substrait.type;

import java.util.ArrayList;

public class TypeBuiler {
    private TypeBuiler() {}

    public static TypeNode makeFP64(Boolean nullable) {
        return new FP64TypeNode(nullable);
    }

    public static TypeNode makeBoolean(Boolean nullable) {
        return new BooleanTypeNode(nullable);
    }

    public static TypeNode makeStruct(ArrayList<TypeNode> types) {
        return new StructNode(types);
    }

    public static TypeNode makeString(Boolean nullable) {
        return new StringTypeNode(nullable);
    }

    public static TypeNode makeI32(Boolean nullable) {
        return new I32TypeNode(nullable);
    }

    public static TypeNode makeI64(Boolean nullable) {
        return new I64TypeNode(nullable);
    }

    public static TypeNode makeDate(Boolean nullable) {
        return new DateTypeNode(nullable);
    }
}
