package net.onnlab.crru

class BudgetYear {
	Integer yearID
	Date	startDate
	Date 	endDate

    static constraints = {
    	yearID blank: false , unique: true ,min:2558,max:2600
    	startDate blank:false
    	endDate validator: { value, season ->
            return value && value > season.startDate
        }
    }

    String toString() {yearID}
}
