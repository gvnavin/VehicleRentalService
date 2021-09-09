import com.vehicherental.Delegator
import com.vehicherental.dao.BookingDao
import com.vehicherental.dao.BranchDao
import com.vehicherental.dao.RentalPriceDao
import com.vehicherental.dao.VehicleDao
import com.vehicherental.db.DB
import com.vehicherental.db.InMemoryDB
import com.vehicherental.dbmodels.VehicleType
import com.vehicherental.managers.BookingManager
import com.vehicherental.managers.BranchManager
import com.vehicherental.managers.RentalPriceManager
import com.vehicherental.managers.VehicleManager
import java.time.LocalDateTime

fun main(args: Array<String>) {

    val db: DB = InMemoryDB()

    val branchDao = BranchDao(db)
    val rentalPriceDao = RentalPriceDao(db)
    val vehicleDao = VehicleDao(db)
    val bookingDao = BookingDao(db)

    val branchManager = BranchManager(branchDao)
    val rentalPriceManager = RentalPriceManager(rentalPriceDao)
    val vehicleManager = VehicleManager(vehicleDao)
    val bookingManager = BookingManager(bookingDao)

    val delegator = Delegator(branchManager, rentalPriceManager, vehicleManager, bookingManager)

    delegator.addBranch("Vasanth Vihar")
    delegator.addBranch("Cyber City")
    delegator.allocatePrice("Vasanth Vihar", VehicleType.Sedan, 100)
    delegator.allocatePrice("Vasanth Vihar", VehicleType.Hatchback, 80)
    delegator.allocatePrice("Cyber City", VehicleType.Sedan, 200)
    delegator.allocatePrice("Cyber City", VehicleType.Hatchback, 50)
    delegator.addVehicle("DL 01 MR 9310", VehicleType.Sedan, "Vasanth Vihar")
    delegator.addVehicle("DL 01 MR 9311", VehicleType.Sedan, "Cyber City")
    delegator.addVehicle("DL 01 MR 9312", VehicleType.Hatchback, "Cyber City")
    delegator.bookVehicle(VehicleType.Sedan,
//        LocalDateTime.parse("29-02-2020 10:00 AM"),
//        LocalDateTime.parse("29-02-2020 01:00 PM")
        LocalDateTime.now(),
        LocalDateTime.now()
    )
}
