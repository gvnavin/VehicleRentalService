package com.vehicherental.dao

interface CRUDDao<E> {
    fun save(e:E)
    fun getByField(key: String, value: String): E

}
