//
// MessagePack for Java
//
//    Licensed under the Apache License, Version 2.0 (the "License");
//    you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//    Unless required by applicable law or agreed to in writing, software
//    distributed under the License is distributed on an "AS IS" BASIS,
//    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//    See the License for the specific language governing permissions and
//    limitations under the License.
//
package org.msgpack.value;

import java.io.Serializable;

public interface ImmutableValue extends Value {
    @Override
    public ImmutableNilValue asNilValue();

    @Override
    public ImmutableBooleanValue asBooleanValue();

    @Override
    public ImmutableIntegerValue asIntegerValue();

    @Override
    public ImmutableFloatValue asFloatValue();

    @Override
    public ImmutableArrayValue asArrayValue();

    @Override
    public ImmutableMapValue asMapValue();

    @Override
    public ImmutableRawValue asRawValue();

    @Override
    public ImmutableBinaryValue asBinaryValue();

    @Override
    public ImmutableStringValue asStringValue();
}
