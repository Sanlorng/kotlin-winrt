package com.github.knk190001.winrtbinding.runtime.abi

import kotlin.reflect.KType

interface IParameterizedABI<Managed, Native> : IBaseABI<Managed, Native> {
    fun fromNative(kType: KType, obj: Native): Managed

    fun getType(obj: Managed): KType
}