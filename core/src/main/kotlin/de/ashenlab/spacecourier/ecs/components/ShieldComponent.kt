package de.ashenlab.spacecourier.ecs.components

import com.badlogic.ashley.core.Component
import com.badlogic.gdx.utils.Pool
import ktx.ashley.mapperFor

/**
 * Indicates that the entity has a shield and thus higher ranking in the collision handling.
 *
 * @since 0.1
 * @author Cpt-Ash (Ahmad Haidari)
 */
class ShieldComponent : Component, Pool.Poolable {

    var shieldCooldown = SHIELD_COOLDOWN
    var shieldActiveTime = SHIELD_ACTIVE_TIME

    override fun reset() {
        shieldCooldown = SHIELD_COOLDOWN
        shieldActiveTime = SHIELD_ACTIVE_TIME
    }

    fun isActive() = shieldActiveTime > 0.0f

    companion object {
        val mapper = mapperFor<ShieldComponent>()

        const val SHIELD_COOLDOWN = 5f
        const val SHIELD_ACTIVE_TIME = 1f
    }
}