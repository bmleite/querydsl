/*
 * Copyright 2011, Mysema Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.querydsl.core.types.dsl;

import java.lang.reflect.AnnotatedElement;

import com.querydsl.core.types.*;

/**
 * {@code StringPath} represents String typed paths
 *
 * @author tiwe
 *
 */
public class StringPath extends StringExpression implements Path<String> {

    private static final long serialVersionUID = 7983490925756833429L;

    private final PathImpl<String> pathMixin;

    protected StringPath(Path<?> parent, String property) {
        this(PathMetadataFactory.forProperty(parent, property));
    }

    protected StringPath(PathMetadata metadata) {
        super(ExpressionUtils.path(String.class, metadata));
        this.pathMixin = (PathImpl<String>)mixin;
    }

    protected StringPath(String var) {
        this(PathMetadataFactory.forVariable(var));
    }
    
    @Override
    public final <R,C> R accept(Visitor<R,C> v, C context) {
        return v.visit(pathMixin, context);
    }

    @Override
    public PathMetadata getMetadata() {
        return pathMixin.getMetadata();
    }

    @Override
    public Path<?> getRoot() {
        return pathMixin.getRoot();
    }
    
    @Override
    public AnnotatedElement getAnnotatedElement() {
        return pathMixin.getAnnotatedElement();
    }
}