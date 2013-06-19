/*
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, B3log Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.latke.ioc.point;


import java.lang.reflect.Field;
import javax.enterprise.inject.spi.AnnotatedField;
import javax.enterprise.inject.spi.Bean;


/**
 * Field injection point.
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.1.1, Nov 16, 2009
 */
public class FieldInjectionPoint extends AbstractInjectionPoint {

    /**
     * Constructs a field injection point.
     * 
     * @param ownerBean the specified owner bean
     * @param annotatedField the specified annotated field
     */
    public FieldInjectionPoint(final Bean<?> ownerBean, final AnnotatedField<?> annotatedField) {
        super(ownerBean, annotatedField);
    }

    @Override
    public Field getMember() {
        return getAnnotated().getJavaMember();
    }

    @Override
    public AnnotatedField<?> getAnnotated() {
        return (AnnotatedField<?>) super.getAnnotated();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", OwnerBean[name=" + getBean().getName() + ", AnnotatedField: " + getAnnotated() + "]";
    }
}