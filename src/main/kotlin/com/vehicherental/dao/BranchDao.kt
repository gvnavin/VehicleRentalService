package com.vehicherental.dao

import com.vehicherental.db.DB
import com.vehicherental.db.TableName
import com.vehicherental.dbmodels.Branch

class BranchDao(private val db: DB) : CRUDDao<Branch> {
    override fun save(e: Branch) {
        db.save(TableName.Branch ,e)
    }

    override fun getByField(key: String, value: String): Branch {
        return Branch("")
    }

}
