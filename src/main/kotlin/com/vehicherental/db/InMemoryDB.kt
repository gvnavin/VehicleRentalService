package com.vehicherental.db

class InMemoryDB(): DB {
    private val vehicleTable: HashSet<Any> = HashSet()
    private val branchTable: HashSet<Any> = HashSet()
    private val priceTable: HashSet<Any> = HashSet()
    private val bookingTable: HashSet<Any> = HashSet()

    private val tableMap:HashMap<TableName, HashSet<Any>> = HashMap()

    init {
        tableMap.put(TableName.Vehicle, vehicleTable)
        tableMap.put(TableName.Branch, branchTable)
        tableMap.put(TableName.RentalPrice, priceTable)
        tableMap.put(TableName.Booking, bookingTable)

    }

    override fun save(tableName: TableName, e:Any) {
        tableMap.get(tableName)!!.add(e)
        println("tableMap = ${tableMap}")
    }

}
