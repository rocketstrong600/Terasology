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

package org.terasology.logic.inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterMode;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.registry.Share;

/**
 * System providing inventory related functionality
 *
 * @author Immortius <immortius@gmail.com>
 */
@RegisterSystem(RegisterMode.ALWAYS)
@Share(InventoryManager.class)
public class CoreInventoryManager extends BaseComponentSystem implements InventoryManager {
    private static final Logger logger = LoggerFactory.getLogger(CoreInventoryManager.class);

    @Override
    public boolean canStackTogether(EntityRef itemA, EntityRef itemB) {
        return InventoryUtils.canStackInto(itemA, itemB);
    }

    @Override
    public int getStackSize(EntityRef item) {
        return InventoryUtils.getStackCount(item);
    }

    @Override
    public EntityRef getItemInSlot(EntityRef inventoryEntity, int slot) {
        return InventoryUtils.getItemAt(inventoryEntity, slot);
    }

    @Override
    public int findSlotWithItem(EntityRef inventoryEntity, EntityRef item) {
        return InventoryUtils.getSlotWithItem(inventoryEntity, item);
    }

    @Override
    public int getNumSlots(EntityRef inventoryEntity) {
        return InventoryUtils.getSlotCount(inventoryEntity);
    }
}
