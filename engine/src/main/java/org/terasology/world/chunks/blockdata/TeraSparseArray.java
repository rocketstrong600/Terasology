/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.world.chunks.blockdata;


/**
 * TeraSparseArray is the base class used to implement sparse arrays.
 *
 * @author Manuel Brotz <manu.brotz@gmx.ch>
 */
public abstract class TeraSparseArray extends TeraArray {

    protected TeraSparseArray() {
        super();
    }

    protected TeraSparseArray(int sizeX, int sizeY, int sizeZ, boolean initialize) {
        super(sizeX, sizeY, sizeZ, initialize);
    }

    @Override
    public final boolean isSparse() {
        return true;
    }
}
