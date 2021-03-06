/*
 *  Copyright (c) 2021-2021 ForteScarlet <https://github.com/ForteScarlet>
 *
 *  根据 Apache License 2.0 获得许可；
 *  除非遵守许可，否则您不得使用此文件。
 *  您可以在以下网址获取许可证副本：
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *   有关许可证下的权限和限制的具体语言，请参见许可证。
 */
package love.forte.annotationtool.core

import kotlin.reflect.KClass

/**
 * Convert instance type.
 *
 * @author ForteScarlet
 */
public interface Converters {
    /**
     * Convert an instance type.
     *
     * @throws ConvertException if it cannot be converted.
     */
    public fun <FROM : Any, TO : Any> convert(from: KClass<FROM>? = null, instance: FROM, to: KClass<TO>): TO

}

/**
 * @see NonConverters
 */
public fun nonConverters(): Converters = NonConverters