package com.vehicherental.db

interface DB {
    fun save(table: TableName, e:Any)
}
